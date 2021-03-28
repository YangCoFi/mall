package com.yang.mall.enums;

/**
 * @ClassName ProductStatusEnum
 * @Description TODO
 * @Author YangC
 * @Date 2021/3/27 13:50
 **/


import lombok.Getter;

/**
 * 商品状态.1-在售 2-下架 3-删除
 */
@Getter
public enum ProductStatusEnum {

    ON_SALE(1),

    OFF_SALE(2),

    DELETE(3);

    Integer code;

    ProductStatusEnum(Integer code) {
        this.code = code;
    }
}
