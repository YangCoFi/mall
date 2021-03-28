package com.yang.extra;

import java.time.LocalDateTime;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * @ClassName Main
 * @Description TODO
 * @Author YangC
 * @Date 2021/3/7 14:16
 **/
public class Main {

    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        ReentrantReadWriteLock rrw = new ReentrantReadWriteLock();
    }
}
