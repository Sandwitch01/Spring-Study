package com.xiao.pojo;

public class User {
    private String name;

    public User(String name) {
        this.name = name;
        System.out.println("User:"+name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void show(){
        System.out.println(name);
    }
}
