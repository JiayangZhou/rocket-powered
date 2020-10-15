package com.rocket.phase1.materials;

import lombok.Data;
import org.springframework.context.annotation.Scope;

@Data
@Scope("prototype")
public class Person {
    private int id;
    private String name;
    private int age;
}
