package com.example.beak.Appp.프록시패턴;

public class ManProxy {
    private Man man;

    public ManProxy(Man man){
        this.man=man;
    }


    public void block(Animal ani){
        System.out.println("꺼져");
        man.block(ani);
    }
}
