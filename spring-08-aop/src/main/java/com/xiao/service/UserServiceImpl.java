package com.xiao.service;

public class UserServiceImpl implements UserService {
    public int add(String name) {
        System.out.println("使用了增加方法");
        return 1;
    }

    public void delete() {
        System.out.println("使用了删除方法");
    }

    public void update() {
        System.out.println("使用了修改方法");
    }

    public void query() {
        System.out.println("使用了查询方法");
    }
}
