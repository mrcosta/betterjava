package com.learning.java.abstractclasses;

public abstract class MyAbstractClass {

    protected int someNumber = 0;

    protected void increment() {
        someNumber++;
    }

    public abstract void doSomethingWithNumber();
}
