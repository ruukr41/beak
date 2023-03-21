package com.example.beak.Appp.템플릿메서드;

import com.example.beak.Appp.템플릿메서드.job.FireWizard;
import com.example.beak.Appp.템플릿메서드.job.WaterWizard;

public class App{

    public static void R(FireWizard r){
        r.hit();
    }
//동적으로, 부모의 메서드가 무효화 되고 자식의 R메서드가 실행 되면서 동적 바인딩이 된다. 이걸 템플릿 메서드라 한다.
    public static void main(String[] args){
//        Wizard w= new Wizard();
        FireWizard fireWizard = new FireWizard();
        R(fireWizard);

        WaterWizard waterWizrd = new WaterWizard();
        waterWizrd.hit();
    }
}
