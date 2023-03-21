package com.example.beak.Appp.템플릿메서드.job;

public abstract class Wizard{
    private void kick(){System.out.println("발차기!"); }
    private void punch(){ System.out.println("펀치!"); }

    //오버라이드 뜻: 재정의 하다로 알고있는데 정확하게는 부모의 메서드를 무효화 하다임
    abstract void magic();
    public void hit(){
    kick();
    punch();
    magic();
    }
}
