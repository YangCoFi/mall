package com.yang.mall.form;

import lombok.Data;

/**
 * @ClassName CartUpdateForm
 * @Description TODO
 * @Author YangC
 * @Date 2021/3/27 14:00
 **/
@Data
public class CartUpdateForm {

    private Integer quantity;

    private Boolean selected;
}
