package com.zhou.service.impl;


import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zhou.mapper.EmpMapper;
import com.zhou.pojo.Emp;
import com.zhou.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Auther: xiao zhou student
 * @Date: 2022/1/22 - 01 - 22 - 20:14
 * @Description: com.zhou.service.impl
 * @version: 1.0
 */
@Service
public class EmpServiceImpl implements EmpService {
    @Autowired
     private EmpMapper empMapper;
    @Override
    public List<Emp> findAll() {
       return empMapper.findAll();
    }

    @Override
    public boolean removeEmp(Integer empno, String ename) {
        return empMapper.removeEmp(empno,ename)>0;
    }

}
