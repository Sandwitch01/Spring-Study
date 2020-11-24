package com.mapper;

import com.pojo.User;


import java.util.List;

public interface UserMapper {
    List<User> queryUser();
    int addUser(User user);
    int deleteUser(int id);
}
