package com.rocket.phase1.ground.headquarter;

public interface Order {
    void send (int time) throws InterruptedException;
    boolean received ();
}
