package com.rocket.phase1.ground.headquarter;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class EmergencyTrigger {

    @Before("execution(* com.rocket.phase1.ground.headquarter.EmergencyOrder.*(..))")
    public void triggerEmergencyLight(){
        System.out.println("Turning on the emergency light due to the emergency order..");
    }
}
