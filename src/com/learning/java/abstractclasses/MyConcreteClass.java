package com.learning.java.abstractclasses;

public class MyConcreteClass extends MyAbstractClass {

    public void sayHello() {
        System.out.println("Hello There!");
    }

    @Override
    public void doSomethingWithNumber() {
        System.out.println("The number is: " + someNumber);
    }
}
