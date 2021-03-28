package com.yang.mall;

import com.yang.mall.dao.CategoryMapper;
import com.yang.mall.pojo.Category;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


/**
 * @ClassName MallApplicationTests
 * @Description TODO
 * @Author YangC
 * @Date 2021/2/24 20:45
 **/
@RunWith(SpringRunner.class)
@SpringBootTest
public class MallApplicationTests {

    @Autowired
    private CategoryMapper categoryMapper;

}
