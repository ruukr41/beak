package com.example.beak.Appp.옵저버푸쉬패턴.pub;

import com.example.beak.Appp.옵저버푸쉬패턴.sub.Customer;

import java.util.ArrayList;
import java.util.List;

public class lotte implements Mart{

    private List<Customer> lottecustomerList = new ArrayList<>();
    @Override
    public void add(Customer customer){
        lottecustomerList.add(customer);
    }
    @Override
    public void remove(Customer customer){
        lottecustomerList.remove(customer);
    }
    @Override
    public void received(){
        try{
            for(int i=0;i<5;i++){
                System.out.println("롯데꺼 언제옴?");
                Thread.sleep(1000);
            }
            notifyChange("롯좃ㅈ데리아 상품입고됨.");
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    //모든 고객중에 등록 된 손님에게 알림을 보내야 함.
    @Override
    public void notifyChange(String msg){
        lottecustomerList.forEach((c)->{
            c.update(msg);
        });

    }
}
