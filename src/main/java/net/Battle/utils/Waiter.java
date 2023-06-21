package net.Battle.utils;

public class Waiter {

    public void sleep() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw  new RuntimeException();
        }

    }
}
