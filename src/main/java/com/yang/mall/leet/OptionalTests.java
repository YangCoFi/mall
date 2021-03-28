package com.yang.mall.leet;

import java.util.Optional;

/**
 * @ClassName OptionalTests
 * @Description TODO
 * @Author YangC
 * @Date 2021/3/20 15:08
 **/
public class OptionalTests {
    public static void main(String[] args) {
        OptionalTests optionalTests = new OptionalTests();
        Integer value1 = null;
        Integer value2 = new Integer(10);
        Optional<Integer> a = Optional.ofNullable(value1);
        Optional<Integer> b = Optional.of(value2);
        System.out.println(optionalTests.sum(a, b));
    }

    private Integer sum(Optional<Integer> a, Optional<Integer> b) {
        System.out.println("first" + a.isPresent());
        System.out.println("sec" + b.isPresent());
        Integer value1 = a.orElse(new Integer(0));
        Integer value2 = b.get();
        return value1 + value2;
    }
}
