package com.yang.mall;

import com.yang.mall.listener.InitListener;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.context.annotation.Bean;

/**
 * @ClassName MainApplication
 * @Description TODO
 * @Author YangC
 * @Date 2021/2/24 19:56
 **/

@SpringBootApplication
public class MallApplication {

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Bean
    public ServletListenerRegistrationBean servletListenerRegistrationBean() {
        ServletListenerRegistrationBean servletListenerRegistrationBean =
                new ServletListenerRegistrationBean();
        servletListenerRegistrationBean.setListener(new InitListener());
        return servletListenerRegistrationBean;
    }

    public static void main(String[] args) {
        SpringApplication.run(MallApplication.class, args);
    }
}
