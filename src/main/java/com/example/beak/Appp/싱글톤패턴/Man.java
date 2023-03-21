package com.example.beak.Appp.싱글톤패턴;

public class Man{

    //자바에서 static은 main 메서드를 호출하기 전에 jvm이 읽어서 메모리에 올라오는 타입
    private static Man man= new Man();

    public static Man getMan(){ // 스테틱이 안붙었으니 힙이 관리하는 메서드
        return man;
    }
    public void block(Animal ani){
        System.out.println(ani.getName()+" 차단");

    }

}
