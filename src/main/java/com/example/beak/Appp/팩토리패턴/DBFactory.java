package com.example.beak.Appp.팩토리패턴;

public class DBFactory{

    private static DBFactory dbFactory= new DBFactory();
    //싱글톤
    private DBFactory() {}
    public static DBFactory getInstance(){
        return dbFactory;
    }


    //OCP를 위배함.
    //OCP를 위배한다해서 프로그램을 잘못만들었다는건 아님.
    //패턴은 우리가 코드를 짤 때, 편하게 협업하기 좋고 클린한 코드를 짜게 해주는 것일 뿐. 예외는 있음.
    //DB회사가 매일매일 변경 된다거나 새로운 Driver 가 금방금방 나온다던가 하진 않음.
    //몇년에 한 번 나오는데 그 때 마다 수정하면 됨. 별 수 있나.
    public DB create(String protocol){
        if(protocol.equals("maria")){
            DB mariaDB = new MariaDB();
            mariaDB.setUrl("jdbc:mariadb://");
            return mariaDB;
        }
        else if(protocol.equals("oracle")){
            DB oracleDB =new OracleDB();
            oracleDB.setUrl("jdbc:oracledb://");
            return oracleDB;
        }
        else if(protocol.equals("mysql")){
            DB mysqlDB =new MySqlDB();
            mysqlDB.setUrl("jdbc:mysqldb://");
            return mysqlDB;
        }else{
            throw new NullPointerException("db driver is not found expection");
        }
    }

}

