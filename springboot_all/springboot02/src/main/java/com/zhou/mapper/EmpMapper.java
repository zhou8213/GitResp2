package com.zhou.mapper;

import com.zhou.pojo.Emp;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Auther: xiao zhou student
 * @Date: 2022/1/22 - 01 - 22 - 20:14
 * @Description: com.zhou.mapper
 * @version: 1.0
 */
@Mapper
public interface EmpMapper {

    List<Emp> findAll();
}
