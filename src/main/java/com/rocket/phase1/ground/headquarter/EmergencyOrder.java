package com.rocket.phase1.ground.headquarter;

public class EmergencyOrder implements OrderForm{
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
