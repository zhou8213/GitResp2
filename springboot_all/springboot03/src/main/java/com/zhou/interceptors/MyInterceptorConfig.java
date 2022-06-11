package com.zhou.interceptors;

import com.mysql.cj.xdevapi.AddResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @Auther: xiao zhou student
 * @Date: 2022/1/23 - 01 - 23 - 21:51
 * @Description: com.zhou.interceptors
 * @version: 1.0
 */
@Configuration
public class MyInterceptorConfig implements WebMvcConfigurer {
    @Autowired
    private  MyInterceptor myInterceptor;
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        InterceptorRegistration interceptorRegistration = registry.addInterceptor(myInterceptor);
        InterceptorRegistration interceptorRegistration1 = interceptorRegistration.addPathPatterns("/**");
        InterceptorRegistration interceptorRegistration2 = interceptorRegistration1.excludePathPatterns("/login");

    }
}
