package com.company;

public class Race<T,S extends Number>   implements  Interface{
    private T distance;
    private S speed;

    public Race(T distance, S speed) {
        this.speed = speed;
        this.distance = distance;
    }

    public T getDistance() {
        return distance;
    }

    public S getSpeed() {
        return speed;
    }


    @Override
    public void racer(Object distance, Number speed) {


    }
}
