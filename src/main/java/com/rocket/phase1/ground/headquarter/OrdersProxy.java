package com.rocket.phase1.ground.headquarter;

import org.springframework.context.annotation.Bean;

public class OrdersProxy implements OrderForm{


    public EmergencyOrder emergencyOrder;
    public NormalOrder normalOrder;

    public OrdersProxy(EmergencyOrder emergencyOrder) {
        this.emergencyOrder = emergencyOrder;
    }

    public void setEmergencyOrder(EmergencyOrder emergencyOrder) {
        this.emergencyOrder = emergencyOrder;
    }

    public void setNormalOrder(NormalOrder normalOrder) {
        this.normalOrder = normalOrder;
    }

    @Override
    public void lag(int time) {
    }

    @Override
    public boolean sent() {
        return false;
    }

    @Override
    public boolean received() {
        return false;
    }
}
