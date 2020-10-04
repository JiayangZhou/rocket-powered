package com.rocket.phase1.ground.headquarter;


public class EmergencyOrder implements OrderForm{
    int id;

    public EmergencyOrder() {
        this.id = 0;
    }
    public EmergencyOrder(int id) {
        this.id = id;
    }

    @Override
    public void lag(int time) {
        System.out.println("Lagging as little as possible!");
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
