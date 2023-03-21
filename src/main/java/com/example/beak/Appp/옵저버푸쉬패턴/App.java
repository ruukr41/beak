package com.example.beak.Appp.옵저버푸쉬패턴;


import com.example.beak.Appp.옵저버푸쉬패턴.pub.Gs;
import com.example.beak.Appp.옵저버푸쉬패턴.pub.Mart;
import com.example.beak.Appp.옵저버푸쉬패턴.pub.lotte;
import com.example.beak.Appp.옵저버푸쉬패턴.sub.Cus1;
import com.example.beak.Appp.옵저버푸쉬패턴.sub.Cus2;
import com.example.beak.Appp.옵저버푸쉬패턴.sub.Cus3;
import com.example.beak.Appp.옵저버푸쉬패턴.sub.Customer;

/*
* 옵저버 패턴이며 (PUSH) 방식!
* */
public class App{
    //
    public static void main(String[] args){
        Mart lotte=new lotte();
        Mart Gs=new Gs();
        Customer cus1=new Cus1();
        Customer cus2=new Cus2();
        Customer cus3=new Cus3();
        //롯데 마트에 등록
        lotte.add(cus1);
        lotte.add(cus2);
        lotte.add(cus3);
        //gs 마트에 등록
        Gs.add(cus2);
        //탈퇴
        lotte.remove(cus2);


        //롯데마트:상품아 빨리 도착해~!

        new Thread(()->{
            lotte.received();
        }).start();


        //쥐에스마트:상품아 빨리 도착해~!

        new Thread(()->{
            Gs.received();
        }).start();
        }


}



