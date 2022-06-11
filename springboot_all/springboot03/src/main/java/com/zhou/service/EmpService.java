package com.zhou.service;

import com.zhou.pojo.Emp;

import java.util.List;

/**
 * @Auther: xiao zhou student
 * @Date: 2022/1/22 - 01 - 22 - 20:14
 * @Description: com.zhou.service
 * @version: 1.0
 */
public interface EmpService {
    List<Emp> findAll();

    boolean removeEmp(Integer empno, String ename);
}
