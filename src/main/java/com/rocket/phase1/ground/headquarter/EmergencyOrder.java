package com.rocket.phase1.ground.headquarter;


public class EmergencyOrder implements Order {
    int id;
    public EmergencyOrder() {
        this.id = 0;
    }
    public EmergencyOrder(int id) {
        this.id = id;
    }

    @Override
    public void send(int time) throws InterruptedException {
        Thread.sleep(time * 100);
        System.out.println("Emergency order issued!");
    }

    @Override
    public boolean received() {
        return false;
    }
}
