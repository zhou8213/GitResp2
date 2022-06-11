package com.zhou.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @Auther: xiao zhou student
 * @Date: 2022/1/22 - 01 - 22 - 18:04
 * @Description: com.zhou.pojo
 * @version: 1.0
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class User implements Serializable {
        private Integer uid;
        private String  uname;
        private String  password;

}
