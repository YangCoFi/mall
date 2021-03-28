package com.yang.mall.controller;

import com.yang.mall.consts.MallConst;
import com.yang.mall.enums.ResponseEnum;
import com.yang.mall.form.UserForm;
import com.yang.mall.form.UserLoginForm;
import com.yang.mall.form.UserRegisterForm;
import com.yang.mall.pojo.User;
import com.yang.mall.service.IUserService;
import com.yang.mall.vo.ResponseVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

/**
 * @ClassName UserController
 * @Description TODO
 * @Author YangC
 * @Date 2021/3/3 10:48
 **/
@RestController
@Slf4j
public class UserController {

    @Autowired
    private IUserService userService;

    @PostMapping("/user/register")
    public ResponseVo<User> register(@Valid @RequestBody UserRegisterForm userForm) {
        User user = new User();
        BeanUtils.copyProperties(userForm, user);
        //dto
        return userService.register(user);
    }

    @PostMapping("/user/login")
    public ResponseVo<User> login(@Valid @RequestBody UserLoginForm userLoginForm,
                                  HttpSession session) {
        ResponseVo<User> userResponseVo = userService.login(userLoginForm.getUsername(), userLoginForm.getPassword());

        //设置Session
        session.setAttribute(MallConst.CURRENT_USER, userResponseVo.getData());
        log.info("/login sessionId={}", session.getId());

        return userResponseVo;
    }

    //session保存在内存里，改进版：token+redis
    @GetMapping("/user")
    public ResponseVo<User> userInfo(HttpSession session) {
        log.info("/user sessionId={}", session.getId());
        User user = (User) session.getAttribute(MallConst.CURRENT_USER);
        return ResponseVo.success(user);
    }

    /**
     * {@link TomcatServletWebServerFactory} getSessionTimeoutInMinutes
     */
    @PostMapping("/user/logout")
    public ResponseVo logout(HttpSession session) {
        log.info("/user/logout sessionId={}", session.getId());
        session.removeAttribute(MallConst.CURRENT_USER);
        return ResponseVo.success();
    }
}
