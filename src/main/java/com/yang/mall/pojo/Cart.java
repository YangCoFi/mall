package com.yang.mall.pojo;

import lombok.Data;

/**
 * @ClassName Cart
 * @Description TODO
 * @Author YangC
 * @Date 2021/3/27 14:01
 **/
@Data
public class Cart {

    private Integer productId;

    private Integer quantity;

    private Boolean productSelected;

    public Cart() {
    }

    public Cart(Integer productId, Integer quantity, Boolean productSelected) {
        this.productId = productId;
        this.quantity = quantity;
        this.productSelected = productSelected;
    }
}
