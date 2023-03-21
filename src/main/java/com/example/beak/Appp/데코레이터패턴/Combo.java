package com.example.beak.Appp.데코레이터패턴;

public class Combo{
    public static void main(String[] args){




        Initiating q =new Q();
        q.a();
        Initiating w=new W();
        w.a();
        System.out.println("--end");
        Initiating wq = new W(new Q());
        wq.a();
//        Initiating initiating = new E();
//        initiating.a();
//
//        Initiating initiating2 = new Q(new E());
//        initiating2.a();
//
//        Initiating initiating3 = new W(new E());
//        initiating3.a();
//
//        Initiating All = new W(new Q(new E()));
//        All.a();
//
//        Initiating All2 = new Q(new W(new E()));
//        All2.a();

//        Initiating e =new E();
//        e.a();
//
//
//        Initiating eq = new Q(new E());
//        eq.a();
//
//        Initiating wq = new W(new E());
//        wq.a();

    }
}
