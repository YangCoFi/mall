package com.yang.mall.form;

import lombok.Data;

import javax.validation.constraints.NotNull;

/**
 * @ClassName OrderCreateForm
 * @Description TODO
 * @Author YangC
 * @Date 2021/3/27 14:29
 **/
@Data
public class OrderCreateForm {

    @NotNull
    private Integer shippingId;
}

