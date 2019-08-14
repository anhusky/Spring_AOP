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
    public void save() {
        System.out.println("------开始事物-----");
        userService.save();
        System.out.println("------提交事物-----");
    }
}
