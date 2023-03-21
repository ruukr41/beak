package com.example.beak.Appp.팩토리패턴;



//DIP를 지킨 팩토리 패턴이다.
public class App{
    public static void main(String[] args){

        //싱글톤
        DBFactory dbFactory = DBFactory.getInstance();

        //내가 마리아 객체를 알 필요가 없고
        //setUrl 부터 해야 할지, execute 부터 해야 할 지 생각할 필요가 없다.
        //단지 문자열만 넣어서 db를 생성하면 됨(내가 의존할 건 DBFactory 밖에 없음
        DB mariadb=dbFactory.create("maria");
        mariadb.execute("select");

        DB oracledb=dbFactory.create("oracle");
        oracledb.execute("select");

        DB mysqldb=dbFactory.create("mysql");
        mysqldb.execute("select");

    }
}
