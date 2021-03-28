package com.yang.mall.form;

/**
 * @ClassName UserRegisterForm
 * @Description TODO
 * @Author YangC
 * @Date 2021/3/27 13:44
 **/
import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
public class UserRegisterForm {

    //@NotBlank 用于 String 判断空格
    //@NotEmpty 用于集合
    //@NotNull
    @NotBlank
    private String username;

    @NotBlank
    private String password;

    @NotBlank
    private String email;
}

