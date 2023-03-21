package com.example.beak.Appp.옵저버폴링패턴;

public class IUCon{

    private String ticket = null;

    public String getTicket() {
        return ticket;
    }

    public void recived() {

        try {
            for(int i=0;i<5;i++){
                Thread.sleep(1000);
            }
            ticket="티켓";
        }catch(Exception e){
            System.out.println(e.getMessage() + "구입가능!");
        }
    }
}
