package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Cat cat = new Cat();
        Animal ca = cat::live;
        Animal dog = Dog::live;
        ca.method();
        dog.method();
    }
}