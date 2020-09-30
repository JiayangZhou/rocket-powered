package com.rocket.phase1;

import com.rocket.phase1.crew.CrewMember;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Launch {
    @Test
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("trainedCrew.xml");
        CrewMember crew = (CrewMember) applicationContext.getBean("crew");


    }
}
