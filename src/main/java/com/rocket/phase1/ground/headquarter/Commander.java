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
    Person person;
    EmergencyOrder emergencyOrder;

    @Bean
    public Person head(){
        return new Person();
    }

    @Bean
    public EmergencyOrder emergencyOrder(){
        return new EmergencyOrder(10);
    }

    @Bean
    public OrdersProxy ordersProxy(){
        OrdersProxy ordersProxy = new OrdersProxy(this.emergencyOrder);
        return ordersProxy;
    }

    public OrdersProxy getOrdersProxy(){
        return this.ordersProxy;
    }
    @Override
    public void requestContent() {
        System.out.println("Commander: Hold on, crew members need a good meal before their boarding!");
    }
}
