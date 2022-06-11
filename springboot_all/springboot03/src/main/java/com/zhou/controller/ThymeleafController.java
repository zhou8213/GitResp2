package com.zhou.controller;

import com.zhou.pojo.Emp;
import com.zhou.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Map;

/**
 * @Auther: xiao zhou student
 * @Date: 2022/1/23 - 01 - 23 - 12:12
 * @Description: com.zhou.controller
 * @version: 1.0
 */
@Controller
public class ThymeleafController {
    @Autowired
    private EmpService empService;
    @RequestMapping("/showIndex")
    public String showIndex(Map<String,Object> map){
        map.put("msg","textMessage");
        return "index";
    }

    @RequestMapping("/removeEmp")
    public String removeEmp(Integer empno,String ename){
        boolean success=empService.removeEmp(empno,ename);

        return "redirect:showAllEmp";
    }

    @RequestMapping("/showAllEmp")
    public String showEmp(Map<String,Object> map){
        List<Emp> list = empService.findAll();
        map.put("empList",list);
        map.put("emp",list.get(0));
        return "showEmp";

    }
}
