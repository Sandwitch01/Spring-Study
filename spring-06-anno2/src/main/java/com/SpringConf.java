package com;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;


@Configuration
@ComponentScan("com")//包扫描，扫描后可使用user
@Import(SpringConf2.class)//导入Spring其他配置类即application.xml
public class SpringConf {

    //相当于<bean id="gUser" class=""com.User/>
    @Bean
    public User gUser(){
        return new User();
    }
}
