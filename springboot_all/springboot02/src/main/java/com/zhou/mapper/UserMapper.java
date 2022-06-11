package com.zhou.mapper;

import com.zhou.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Auther: xiao zhou student
 * @Date: 2022/1/22 - 01 - 22 - 18:13
 * @Description: com.zhou.mapper
 * @version: 1.0
 */
@Mapper
public interface UserMapper {
    List<User> selectAll();
}
