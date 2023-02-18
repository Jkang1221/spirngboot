package com.example.config;

import com.baomidou.mybatisplus.extension.plugins.MybatisPlusInterceptor;
import com.baomidou.mybatisplus.extension.plugins.inner.PaginationInnerInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
//
@Configuration
public class MPConfig {
    // 分页的拦截器
    @Bean
    public MybatisPlusInterceptor mybatisPlusInterceptor(){
        // interceptor 拦截器的壳
        MybatisPlusInterceptor interceptor = new MybatisPlusInterceptor();
        // 放入分页的拦截器
        interceptor.addInnerInterceptor(new PaginationInnerInterceptor());
        return interceptor;
    }
}
