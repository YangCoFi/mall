package com.yang.mall.enums;

import lombok.Getter;

/**
 * @ClassName PaymentTypeEnum
 * @Description TODO
 * @Author YangC
 * @Date 2021/3/27 14:25
 **/
@Getter
public enum PaymentTypeEnum {

    PAY_ONLINE(1),
    ;

    Integer code;

    PaymentTypeEnum(Integer code) {
        this.code = code;
    }
}
