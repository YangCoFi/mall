package com.yang.mall.form;

import lombok.Data;

import javax.validation.constraints.NotNull;

/**
 * @ClassName CartAddForm
 * @Description TODO
 * @Author YangC
 * @Date 2021/3/27 13:45
 **/
@Data
public class CartAddForm {

    @NotNull
    private Integer productId;

    private Boolean selected = true;
}

