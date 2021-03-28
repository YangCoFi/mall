package com.yang.mall.form;

import lombok.Data;

import javax.validation.constraints.NotBlank;

/**
 * @ClassName ShippingForm
 * @Description TODO
 * @Author YangC
 * @Date 2021/3/27 14:17
 **/
@Data
public class ShippingForm {

    @NotBlank
    private String receiverName;

    @NotBlank
    private String receiverPhone;

    @NotBlank
    private String receiverMobile;

    @NotBlank
    private String receiverProvince;

    @NotBlank
    private String receiverCity;

    @NotBlank
    private String receiverDistrict;

    @NotBlank
    private String receiverAddress;

    @NotBlank
    private String receiverZip;
}
