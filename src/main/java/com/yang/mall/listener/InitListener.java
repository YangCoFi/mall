package com.yang.mall.listener;

import com.yang.mall.request.Request;
import com.yang.mall.thread.RequestProcessorThreadPool;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * @ClassName InitListener
 * @Description TODO
 * @Author YangC
 * @Date 2021/4/18 14:42
 **/
public class InitListener implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("-------------------------系统初始化");
        RequestProcessorThreadPool.init();

    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {

    }
}
