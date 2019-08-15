package com.uu.a_proxy.static_proxy;

/**
 * @author liuph
 * @desc
 * @date 2019/08/14 23:14
 */
public class UserServiceImplProxy implements IUserService {

    private UserServiceImpl userService;

    public UserServiceImplProxy(UserServiceImpl userService) {
        this.userService = userService;
    }

    @Override
    public void eat() {
        System.out.println("------洗手-----");
        userService.eat();
        System.out.println("------洗碗-----");
    }
}
