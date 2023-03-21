package com.example.beak.Appp.템플릿메서드.job;

public class WaterWizard extends Wizard{



    //동적 바인딩(C#에선 이걸 동적결함이라고 부름) 템플릿 메서드의 핵심은 부모가 가지고 있는걸 두고 고정적이지 않은 것만 자식이 재정의 해서 구현함
    void magic(){
        System.out.println("WATER PUNCH!!!!!");
    }
}
