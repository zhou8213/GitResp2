package com.zhou;

import com.zhou.config.MyConfig;
import com.zhou.pojo.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
/*@SpringBootConfiguration
@EnableAutoConfiguration
@ComponentScan("com.zhou")*/
public class SpringbootAnnoApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(SpringbootAnnoApplication.class, args);

    }

}
