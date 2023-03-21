package com.example.beak.Appp.옵저버푸쉬패턴.pub;

import com.example.beak.Appp.옵저버푸쉬패턴.sub.Customer;

import java.util.ArrayList;
import java.util.List;

public class Gs implements Mart{

    private List<Customer> GscustomerList =new ArrayList<>();


    @Override
    public void add(Customer customer){
        GscustomerList.add(customer);
    }

    @Override
    public void remove(Customer customer){
        GscustomerList.remove(customer);
    }

    @Override
    public void received(){
        try{
            for(int i=0;i<3;i++){

            System.out.println("GS꺼 언제옴?");
            Thread.sleep(1000);
            }

            notifyChange("쥐에스 상품이 입고됨");
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void notifyChange(String msg){
        GscustomerList.forEach((c)->
            c.update(msg));

    }
}
//
//            for(int i=0;i<5;i++){
//        System.out.println("언제옴?");
//        Thread.sleep(1000);
//        }
//        notifyChange("롯ㅈ데리아 상품입고됨.");
//        }catch(Exception e){
//        System.out.println(e.getMessage());
//        }