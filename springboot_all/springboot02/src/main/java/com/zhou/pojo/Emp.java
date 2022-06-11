package com.zhou.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

/**
 * @Auther: xiao zhou student
 * @Date: 2022/1/22 - 01 - 22 - 20:05
 * @Description: com.zhou.pojo
 * @version: 1.0
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Emp implements Serializable {
        private Integer empno;
        private String  ename;
        private String  job;
        private Integer mgr;
        private Date    hiredate;
        private Double  sal;
        private Double  comm;
        private Integer deptno;
}
