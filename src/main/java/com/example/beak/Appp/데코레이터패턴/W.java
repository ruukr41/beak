package com.example.beak.Appp.데코레이터패턴;

public class W implements Initiating{

    private Initiating initiating;

    private W w;
    public W(Initiating initiating){
        this.initiating=initiating;
    }

    public W(){
    }

    @Override
    public void a(){
        if(initiating!=null){
           initiating.a();
        }
        System.out.println("취중분노");
    }
}
