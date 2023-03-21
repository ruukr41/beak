package com.example.beak.Appp.팩토리패턴;

public interface DB{
    public int execute(String sql);

    public void setUrl(String url);
}
