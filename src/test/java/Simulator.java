import com.rocket.phase1.ground.audience.AudienceMapper;
import com.rocket.phase1.log.LogService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class Simulator {
    public static void main(String[] args) throws IOException {
        // testing log here
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationAop.xml");
        LogService log = applicationContext.getBean("logService", LogService.class);
        log.add();
    }
}
