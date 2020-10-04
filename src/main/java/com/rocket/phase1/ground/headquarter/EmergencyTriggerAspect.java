package com.rocket.phase1.ground.headquarter;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class EmergencyTriggerAspect {

    @Before("execution(* com.rocket.phase1.ground.headquarter.EmergencyOrder.*(..))")
    public void triggerEmergencyLight(){
        System.out.println("Turning on the emergency light due to the emergency order..");
    }

    @Around("execution(* com.rocket.phase1.ground.headquarter.EmergencyOrder.*(..))")
    public void runningEmergencyLight(){
        System.out.println("Turning on the emergency light due to the emergency order..");
    }

    @After("execution(* com.rocket.phase1.ground.headquarter.EmergencyOrder.*(..))")
    public void afterEmergencyLight(){
        System.out.println("Turning on the emergency light due to the emergency order..");
    }
}
