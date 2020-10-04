import com.rocket.phase1.log.LogService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Simulator {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationAop.xml");
        LogService log = applicationContext.getBean("logService", LogService.class);

        log.add();


    }
}
