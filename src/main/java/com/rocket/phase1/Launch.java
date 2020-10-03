package com.rocket.phase1;

import com.rocket.phase1.crew.CrewMember;
import com.rocket.phase1.ground.headquarter.Leader;
import com.rocket.phase1.ground.service.Request;
import com.rocket.phase1.ground.service.ServiceProxy;
import com.rocket.phase1.ground.service.ServiceTeam;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Scope;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Launch {
    @Test
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("trainedCrew.xml","applicationContext.xml");
        CrewMember crew = (CrewMember) applicationContext.getBean("crew");
        ServiceTeam serviceTeam = (ServiceTeam) applicationContext.getBean("serviceTeam");

        Leader leader = new Leader();

        ServiceProxy serviceProxy = new ServiceProxy();
        serviceProxy.setRequest(crew);
        Request crewRequest = (Request) serviceProxy.getProxy();
        crewRequest.requestContent();

    }
}
