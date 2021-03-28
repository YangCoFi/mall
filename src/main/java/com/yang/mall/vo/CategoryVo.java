package com.yang.mall.vo;

import lombok.Data;

import java.util.List;

/**
 * @ClassName CategoryVo
 * @Description TODO
 * @Author YangC
 * @Date 2021/3/23 15:15
 **/
@Data
public class CategoryVo {

    private Integer id;

    private Integer parentId;

    private String name;

    private List<CategoryVo> subCategories;

    private Integer sortOrder;

}
