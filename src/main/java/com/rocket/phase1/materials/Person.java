package com.rocket.phase1.materials;

import lombok.Data;
import org.springframework.context.annotation.Scope;

@Data
@Scope("prototype")
public class Person {
    String name;
    int age;
}
