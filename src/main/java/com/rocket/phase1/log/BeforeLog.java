package com.rocket.phase1.log;

import org.springframework.aop.MethodBeforeAdvice;
import java.lang.reflect.Method;

public class BeforeLog implements MethodBeforeAdvice {

    @Override
    public void before(Method method, Object[] objects, Object o) throws Throwable {
        System.out.println("Log started..");
    }

}
