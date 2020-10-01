package com.rocket.phase1.materials;

import org.springframework.context.annotation.Scope;

@Scope("prototype")
public class Person {
    String name;
    int age;
}
