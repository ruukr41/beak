package com.example.beak.Appp.어뎁터패턴;


/*
어댑터 패턴:
1.외부 요소를 기존 시스템에 재사용하고 싶지만 아직 만들어지지 않은 경우(직접해보기  = tiger가 아직 만들어지지 않음)
2.외부 요소를 기존 시스템에 재사용하고 싶지만 호환되지 않는 경우 (실습하기)
*/

public class App{

    public static void main(String[] args){
        Man man = new Man();



        Dog dog = new Dog();
        Cat cat = new Cat();
      Animal tiger = new FakeTiger();
//      TigerAdapter tiger = new TigerAdapter(new Tiger());


        man.block(dog);
        man.block(cat);
//        man.block(tiger);
        man.block(tiger);


    }
}
