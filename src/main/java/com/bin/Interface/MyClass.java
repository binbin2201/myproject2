package com.bin.Interface;

public class MyClass implements MyInterface{
    public void print(){
        System.out.println("hello");
    }

    @Override
    public int number(int a, int b) {
        return 2;
    }
}
