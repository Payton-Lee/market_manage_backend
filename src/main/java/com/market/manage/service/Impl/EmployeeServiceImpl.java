package com.market.manage.service.Impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.market.manage.entity.Employee;
import com.market.manage.mapper.EmployeeMapper;
import com.market.manage.service.EmployeeService;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl extends ServiceImpl<EmployeeMapper, Employee> implements EmployeeService {
}
