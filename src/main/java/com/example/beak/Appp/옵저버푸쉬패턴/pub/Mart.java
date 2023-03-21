package com.example.beak.Appp.옵저버푸쉬패턴.pub;

import com.example.beak.Appp.옵저버푸쉬패턴.sub.Customer;

public interface Mart{

    void add(Customer customer);

    void remove(Customer customer);

    void received();

    void notifyChange(String msg);

}
