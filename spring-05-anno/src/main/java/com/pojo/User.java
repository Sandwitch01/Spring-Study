package com.pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class User {
    @Autowired(required = false)
    @Value("xiao")
    private String name;

    public String getName() {
        return name;
    }

}
