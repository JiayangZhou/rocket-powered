import com.rocket.phase1.ground.audience.AudienceMapper;
import com.rocket.phase1.materials.Person;
import java.util.List;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.Resource;

import java.io.IOException;
import java.io.InputStream;

public class AudienceTest {
    @Test
    public void test() throws IOException {
        // only works when there is a database connection and in its connected database there is
        // a table called person that has some rows of data
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-dao.xml");
        AudienceMapper audienceMapper = applicationContext.getBean("audienceMapper",AudienceMapper.class);
        for (Person person: audienceMapper.selectAudience()
             ) {
            System.out.println(person);
        }
    }
}
