package com.market.manage.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.market.manage.entity.Employee;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface EmployeeMapper extends BaseMapper<Employee> {
}
