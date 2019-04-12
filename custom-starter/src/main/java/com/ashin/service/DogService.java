package com.ashin.service;

/**
 * Created by Ashin Liang on 2018/9/7.
 */

public class DogService {

    private String name;

    private String color;

    public DogService(String name,String color){
        this.name = name;
        this.color = color;
    }

    public String getDogInfo(){
        return "dog info is name="+this.name+" color="+this.color;
    }
}
