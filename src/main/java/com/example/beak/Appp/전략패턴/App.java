package com.example.beak.Appp.전략패턴;

public class App{

    public static void main(String[] args){

        Dog dog = new Dog();
        Cat cat = new Cat();
        Man man = new Man();

        man.block(dog);
        man.block(cat);
    }
}
