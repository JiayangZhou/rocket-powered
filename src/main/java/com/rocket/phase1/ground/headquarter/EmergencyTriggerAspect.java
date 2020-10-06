package com.rocket.phase1.ground.headquarter;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class EmergencyTriggerAspect {

    @Before("execution(* com.rocket.phase1.ground.headquarter.EmergencyOrder.*(..))")
    public void triggerEmergencyLight(){
        // this will be executed before
    }

    @After("execution(* com.rocket.phase1.ground.headquarter.EmergencyOrder.*(..))")
    public void afterEmergencyLight(){
        // this will be executed after
    }

    @Around("execution(* com.rocket.phase1.ground.headquarter.EmergencyOrder.*(..))")
    public void runningEmergencyLight(ProceedingJoinPoint proceedingJoinPoint) throws Throwable{
        System.out.println("Turning on the emergency light..");
        Object proceed = proceedingJoinPoint.proceed(); // execute the override method
        System.out.println("Turning off the emergency light..");
        Thread.sleep(2000);
    }


}
