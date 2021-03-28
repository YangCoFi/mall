package com.yang.mall.service.impl;

import com.yang.mall.MallApplicationTests;
import com.yang.mall.enums.RoleEnum;
import com.yang.mall.pojo.User;
import com.yang.mall.service.IUserService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public class UserServiceImplTest extends MallApplicationTests {

    @Autowired
    private IUserService userService;

    @Test
    public void register() {
        User user = new User("huyy", "123456", "huyy@qq.com", RoleEnum.CUSTOMER.getCode());
        userService.register(user);
    }
}