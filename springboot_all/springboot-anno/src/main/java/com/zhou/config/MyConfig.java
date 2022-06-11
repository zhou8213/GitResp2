package com.zhou.config;

import com.zhou.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @Auther: xiao zhou student
 * @Date: 2022/1/23 - 01 - 23 - 22:21
 * @Description: com.zhou.config
 * @version: 1.0
 */
@Configuration
@Import(User.class)
public class MyConfig {

}
