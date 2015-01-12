package com.learning.java.interfaces;

public class MyClass implements MyInterface {

    public void methodA() {
        System.out.println("Method A called!");
    }

    public int methodB() {
        return 42;
    }

    public String methodC(double x, double y) {
        return "x = " + x + ", y = " + y;
    }
}
