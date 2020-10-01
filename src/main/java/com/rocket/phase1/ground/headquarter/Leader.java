package com.rocket.phase1.ground.headquarter;

import com.rocket.phase1.materials.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

// this is like to create a beans.xml file
@Configuration
public class Leader {
    @Bean
    public Person head(){
        return new Person();
    }
}
