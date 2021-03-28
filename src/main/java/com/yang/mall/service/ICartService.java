package com.yang.mall.service;

import com.yang.mall.form.CartAddForm;
import com.yang.mall.form.CartUpdateForm;
import com.yang.mall.pojo.Cart;
import com.yang.mall.vo.CartVo;
import com.yang.mall.vo.ResponseVo;

import java.util.List;

/**
 * @ClassName ICartService
 * @Description TODO
 * @Author YangC
 * @Date 2021/3/27 13:59
 **/
public interface ICartService {

    ResponseVo<CartVo> add(Integer uid, CartAddForm form);

    ResponseVo<CartVo> list(Integer uid);

    ResponseVo<CartVo> update(Integer uid, Integer productId, CartUpdateForm form);

    ResponseVo<CartVo> delete(Integer uid, Integer productId);

    ResponseVo<CartVo> selectAll(Integer uid);

    ResponseVo<CartVo> unSelectAll(Integer uid);

    ResponseVo<Integer> sum(Integer uid);

    List<Cart> listForCart(Integer uid);
}
