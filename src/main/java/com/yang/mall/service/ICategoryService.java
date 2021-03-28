package com.yang.mall.service;

import com.yang.mall.vo.CategoryVo;
import com.yang.mall.vo.ResponseVo;
import java.util.List;
import java.util.Set;

/**
 * @ClassName ICategoryService
 * @Description TODO
 * @Author YangC
 * @Date 2021/3/23 15:18
 **/
public interface ICategoryService {
    ResponseVo<List<CategoryVo>> selectAll();

    void findSubCategoryId(Integer id, Set<Integer> resultSet);
}
