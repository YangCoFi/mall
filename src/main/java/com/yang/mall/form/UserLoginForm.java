package com.yang.mall.form;

import lombok.Data;

import javax.validation.constraints.NotBlank;

/**
 * @ClassName UserLoginForm
 * @Description TODO
 * @Author YangC
 * @Date 2021/3/27 13:45
 **/
@Data
public class UserLoginForm {

    @NotBlank
    private String username;

    @NotBlank
    private String password;
}
