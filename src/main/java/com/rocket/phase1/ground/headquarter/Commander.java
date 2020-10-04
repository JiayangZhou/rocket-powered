package com.rocket.phase1.ground.headquarter;

import com.rocket.phase1.ground.service.Request;
import com.rocket.phase1.materials.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

// this is like to create a beans.xml file
@Configuration
@EnableAspectJAutoProxy
@ComponentScan("com.rocket.phase1.materials")
public class Commander implements Request {
    OrdersProxy ordersProxy;
    Person person;
    EmergencyOrder emergencyOrder;
    EmergencyTriggerAspect emergencyTrigger;

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

    @Bean
    public EmergencyTriggerAspect emergencyTrigger(){
        return new EmergencyTriggerAspect();
    }

    @Bean
    public OrderForm orderForm() {
        return new EmergencyOrder();
    }

    public OrdersProxy getOrdersProxy(){
        return this.ordersProxy;
    }
    @Override
    public void requestContent() {
        System.out.println("Commander: Hold on, crew members need a good meal before their boarding!");
    }
}
