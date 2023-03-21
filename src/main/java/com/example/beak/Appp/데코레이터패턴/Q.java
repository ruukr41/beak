package com.example.beak.Appp.데코레이터패턴;

public class Q implements Initiating{

    private Initiating initiating;

    private Q q;
    public Q(Initiating initiating) {
        this.initiating=initiating;
    }

    public Q(){
    }

    @Override
    public void a(){
        if(initiating!=null){
            initiating.a();
        }
        System.out.println("술통 굴리기");
    }

}
