package com.rocket.phase1.ground.headquarter;

public class OrdersProxy implements OrderForm{

    private EmergencyOrder emergencyOrder;
    private NormalOrder normalOrder;

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
