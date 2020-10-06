package com.rocket.phase1.ground.headquarter;

public class NormalOrder implements Order {
    int id;
    public NormalOrder() {
        this.id = 5;
    }
    public NormalOrder(int id) {
        this.id = id;
    }

    @Override
    public void send(int time) throws InterruptedException {
        Thread.sleep(time * 200);
    }

    @Override
    public boolean received() {
        return false;
    }
}
