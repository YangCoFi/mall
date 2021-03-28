package com.yang.mall.service;

import com.yang.mall.pojo.User;
import com.yang.mall.vo.ResponseVo;

/**
 * @InterfaceName IUserService
 * @Description TODO
 * @Author YangC
 * @Date 2021/3/2 21:32
 **/
public interface IUserService {

    /**
     * 注册
     */
    ResponseVo<User> register(User user);

    /**
     * 登录
     */
    ResponseVo<User> login(String username, String password);
}
