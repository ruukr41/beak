package com.example.beak.Appp.옵저버폴링패턴;

public class App{
    public static void main(String[] args){

        IUCon iucon = new IUCon();

        Customer1 customer1=new Customer1();
        Customer2 customer2=new Customer2();


        new Thread(()->{
            iucon.recived();
        }).start();

        while(true){
        try{
            System.out.println("아직인가요?");
            Thread.sleep(1000);

        }catch(Exception e){
            System.out.println(e.getMessage());
        }

            if (iucon.getTicket() != null){
                customer1.update(iucon.getTicket()+"입니다.");
                customer2.update(iucon.getTicket()+"입니다.");
                break;
            }else {
                System.out.println("아직~");
            }
        }
    }
    }

