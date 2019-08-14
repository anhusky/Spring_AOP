package com.uu.a_proxy.static_proxy;

/**
 * @author liuph
 * @desc
 * @date 2019/08/14 23:13
 */
public class UserServiceImpl implements IUserService {
    @Override
    public void save() {
         System.out.println("----已经保存数据!----");
    }
}
