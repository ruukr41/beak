package com.example.beak.Appp.프록시패턴;

public class App{


    //익스텐즈가 아니라 컴퍼지션 한거임.
    public static void main(String[] args){

        Dog dog = new Dog();
        Cat cat = new Cat();
        ManProxy man = new ManProxy(new Man());

        man.block(dog);
        man.block(cat);
    }
}
