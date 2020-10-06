package com.rocket.phase1.ground.headquarter;

public class OrdersProxy implements Order {

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
    public void send(int time) throws InterruptedException {
        Thread.sleep(time);
    }

    @Override
    public boolean received() {
        return false;
    }
}
