package com.zhou.controller;

import com.sun.org.apache.bcel.internal.generic.NEW;
import com.zhou.pojo.Emp;
import com.zhou.service.EmpService;
import org.omg.CORBA.PUBLIC_MEMBER;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Auther: xiao zhou student
 * @Date: 2022/1/22 - 01 - 22 - 22:21
 * @Description: com.zhou.controller
 * @version: 1.0
 */

@Controller
public class FreemarkerController {
    @Autowired
    private EmpService empService;

    @RequestMapping("/show")
    public  String freemarker(Map<String,Object>map){
        map.put("name","刘能");
        return "show";
    }

    //查询全部的员工信息展示
    @RequestMapping("/showEmp")
    public ModelAndView testList(){
        ModelAndView mv = new ModelAndView();
        List<Emp> emps = empService.findAll();
        mv.addObject("empList",emps);
        mv.setViewName("showEmp");
        return mv;
    }
    //查询全部的员工信息展示
    @RequestMapping("/showEmpMap")
    public ModelAndView testMap(){
        ModelAndView mv = new ModelAndView();
        List<Emp> emps = empService.findAll();
        Map<String,Emp> empMap=new HashMap();
        for (Emp emp : emps) {
            String string = emp.getEmpno().toString();
            empMap.put(string,emp);
        }
        mv.addObject("empMap",empMap);
        mv.setViewName("showEmpMap");
        return mv;
    }
}
