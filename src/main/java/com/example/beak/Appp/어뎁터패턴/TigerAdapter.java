package com.example.beak.Appp.어뎁터패턴;

public class TigerAdapter extends Animal{
//    @Override
//    public String getName(){
//        return null;
//    }
    private Tiger tiger; //컴포지션
     public TigerAdapter(Tiger tiger){
        this.tiger=tiger;
    }

    @Override
    public String getName(){
        return tiger.getFullName();
    }
//    getname을 오버라이드로 getfullName라고 재정의.  어뎁터로하는거.
}
