package com.market.manage.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("m_employee")
public class Employee {
    private Integer id;
    private String name;
    private String sex;
    private String numbering;
    private String office;
    private Double wages;
    private String payrollCards;

}
