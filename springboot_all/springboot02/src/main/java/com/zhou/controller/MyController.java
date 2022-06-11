package com.zhou.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Auther: xiao zhou student
 * @Date: 2022/1/21 - 01 - 21 - 21:15
 * @Description: com.zhou.controller
 * @version: 1.0
 */
@Controller
public class MyController {
    @ResponseBody
    @RequestMapping("/secondController")
    public String secondController(){
        return "hello springboot02";
    }
}
