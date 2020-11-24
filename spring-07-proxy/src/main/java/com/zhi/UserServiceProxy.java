package com.zhi;

public class UserServiceProxy implements UserService {
    private UserServiceImpl userService;

    public void setUserService(UserServiceImpl userService) {
        this.userService = userService;
    }

    public void add() {
        logg("增加");
        userService.add();
    }

    public void delate() {
        logg("删除");
        userService.delate();
    }

    public void update() {
        logg("修改");
        userService.update();
    }

    public void query() {
        logg("查询");
        userService.query();
    }
    public void logg(String msg){
        System.out.println("调用了"+msg+"方法");
    }
}
