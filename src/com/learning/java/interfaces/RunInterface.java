package com.learning.java.interfaces;

public class RunInterface {

    public static void main(String[] args) {
        MyInterface myTest = new MyClass();
        myTest.methodA();

        OneMethodInterface omiObject = new ClassA();
        omiObject.oneMethod();

        omiObject = new ClassB();
        omiObject.oneMethod();
    }
}
