package com.zhou.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Auther: xiao zhou student
 * @Date: 2022/1/23 - 01 - 23 - 22:12
 * @Description: com.zhou.controller
 * @version: 1.0
 */
@Controller
public class MyController {

    @ResponseBody
    @RequestMapping("/hello")
    public String hello(){
        return "hello";
    }
}
