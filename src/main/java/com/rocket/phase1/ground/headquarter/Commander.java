package com.rocket.phase1.ground.headquarter;

import com.rocket.phase1.ground.service.Request;
import com.rocket.phase1.materials.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

// this is like to create a beans.xml file
@Configuration
@ComponentScan("com.rocket.phase1.materials")
public class Commander implements Request {
    OrdersProxy ordersProxy;
    @Bean
    public Person head(){
        return new Person();
    }

    public OrdersProxy sendOrder(){
        return new OrdersProxy();
    }

    @Override
    public void requestContent() {
        System.out.println("Commander: Hold on, crew members need a good meal before their boarding!");
    }
}
