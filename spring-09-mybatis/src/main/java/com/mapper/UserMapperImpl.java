package com.mapper;

import com.pojo.User;
import org.mybatis.spring.SqlSessionTemplate;

import java.util.List;

public class UserMapperImpl implements UserMapper{

    private SqlSessionTemplate sessionTemplate;

    public void setSessionTemplate(SqlSessionTemplate sessionTemplate) {
        this.sessionTemplate = sessionTemplate;
    }

    public List<User> queryUser() {
        UserMapper mapper = sessionTemplate.getMapper(UserMapper.class);
        return mapper.queryUser();
    }

    public int addUser(User user) {
        return sessionTemplate.getMapper(UserMapper.class).addUser(user);
    }

    public int deleteUser(int id) {
        return sessionTemplate.getMapper(UserMapper.class).deleteUser(id);
    }

}
