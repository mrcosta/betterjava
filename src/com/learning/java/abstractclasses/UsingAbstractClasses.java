package com.learning.java.abstractclasses;

public class UsingAbstractClasses {

    public static void main(String[] args) {
        MyAbstractClass myObject = new MyConcreteClass();
        myObject.increment();
        myObject.doSomethingWithNumber();
    }
}
