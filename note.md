### 常用依赖
        <dependency>
            <groupId>junit</groupId>
            <artifactId>junit</artifactId>
            <version>4.13</version>
        </dependency>

        <dependency>
            <groupId>org.springframework</groupId>
            <artifactId>spring-webmvc</artifactId>
            <version>5.2.8.RELEASE</version>
        </dependency>
### Spring骨架
<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
    xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
    xsi:schemaLocation="http://www.springframework.org/schema/beans
        https://www.springframework.org/schema/beans/spring-beans.xsd">

    <bean id="..." class="...">  
        <!-- collaborators and configuration for this bean go here -->
    </bean>

    <bean id="..." class="...">
        <!-- collaborators and configuration for this bean go here -->
    </bean>

    <!-- more bean definitions go here -->

</beans>

### 注解说明
@Autowired和@Resource
都是用来自动装配的，都可以放在属性字段上
@Autowired通过byType的方式实现，而且必须要求这个对象存在
@Resource默认通过byname的方式实现，如果找不到名字，则通过byType的方式
@Nullable 字段标记了这个注解，说明这个字段可以为null；
@Qualifier(value=“xxxx”)通常和Autowired配合使用，value为ioc容器中的beanid
@Component组件，等价于<bean id="" class="">
@Value相当于<property name="" value="">
@Component衍生注解
​	dao：@Repository  
​	service:   @Service
​	controller:	@Controller
这四个注解功能是一样的，都是代表将某个类注册到spring中，自动装配
小结：xml更加万能，适用于任何场合，且维护简单
​			注解 不是自己类使用不了，维护相对复杂
xml与注解最佳实践：
​    xml用来管理bean；
    注解只负责完成属性的注入；
    使用时需要注意的就是；让注解生效，就需要开启注解支持
