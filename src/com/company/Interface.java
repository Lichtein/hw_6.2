package com.company;

public interface Interface<T> {
    abstract void racer(Object distance, Number speed);

    public interface Runnable<T, S> {
        public void racer(T distance, S speed);

    }
}
