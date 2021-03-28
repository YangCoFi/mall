package com.yang.mall.pojo;

import lombok.Data;

import java.util.Date;

/**
 * @ClassName Shipping
 * @Description TODO
 * @Author YangC
 * @Date 2021/3/27 14:14
 **/
@Data
public class Shipping {

    private Integer id;

    private Integer userId;

    private String receiverName;

    private String receiverPhone;

    private String receiverMobile;

    private String receiverProvince;

    private String receiverCity;

    private String receiverDistrict;

    private String receiverAddress;

    private String receiverZip;

    private Date createTime;

    private Date updateTime;
}
