package com.yang.mall.service;

import com.github.pagehelper.PageInfo;
import com.yang.mall.vo.ProductDetailVo;
import com.yang.mall.vo.ProductVo;
import com.yang.mall.vo.ResponseVo;

import java.util.List;

/**
 * @InterfaceName IProductService
 * @Description TODO
 * @Author YangC
 * @Date 2021/3/26 12:59
 **/
public interface IProductService {
    ResponseVo<PageInfo> list(Integer categoryId, Integer pageNum, Integer pageSize);

    ResponseVo<ProductDetailVo> detail(Integer productId);
}
