package com.example.beak.Appp.옵저버푸쉬패턴.sub;

public class Cus2 implements Customer{
    @Override
    public void update(String msg){
        System.out.println("손님 2이 받은 알람 : "+msg);

    }
}
