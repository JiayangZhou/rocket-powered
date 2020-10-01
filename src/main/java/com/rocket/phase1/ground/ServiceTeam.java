package com.rocket.phase1.ground;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

// this is equal to write: <bean id="serviceTeam" class="com.rocket.phase1.ground.ServiceTeam"/>
@Component
public class ServiceTeam {
    // this is equal to write: <property name="name" value="ForYourSafe"/>
    @Value("ForYourSafe")
    String name;
}
