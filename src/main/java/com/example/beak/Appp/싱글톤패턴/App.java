package com.example.beak.Appp.싱글톤패턴;

public class App{

    public static void main(String[] args){
        Man man=Man.getMan();
        Dog dog = new Dog();
        Cat cat = new Cat();

        man.block(dog);
        man.block(cat);
    }//Man은 원래 무한정 만들어 낼 수 있지만 싱글턴 패턴으로 만들면 하나의 Man으로만 쓴다.
}
