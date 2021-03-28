package com.yang.mall.service;

import com.github.pagehelper.PageInfo;
import com.yang.mall.form.ShippingForm;
import com.yang.mall.vo.ResponseVo;

import java.util.Map;

/**
 * @InterfaceName IShippingService
 * @Description TODO
 * @Author YangC
 * @Date 2021/3/27 14:21
 **/
public interface IShippingService {

    ResponseVo<Map<String, Integer>> add(Integer uid, ShippingForm form);

    ResponseVo delete(Integer uid, Integer shippingId);

    ResponseVo update(Integer uid, Integer shippingId, ShippingForm form);

    ResponseVo<PageInfo> list(Integer uid, Integer pageNum, Integer pageSize);
}