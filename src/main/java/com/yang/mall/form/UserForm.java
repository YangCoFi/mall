package com.yang.mall.form;

import lombok.Data;

import javax.validation.constraints.NotBlank;

/**
 * @ClassName UserForm
 * @Description TODO
 * @Author YangC
 * @Date 2021/3/3 11:43
 **/
@Data
public class UserForm {

    @NotBlank
    private String username;

    @NotBlank
    private String password;

    @NotBlank
    private String email;
}
