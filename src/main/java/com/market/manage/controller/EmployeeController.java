package com.market.manage.controller;

import com.market.manage.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
    private EmployeeService employeeService;

    @Autowired
    protected void setEmployeeService(EmployeeService employeeService){
        this.employeeService = employeeService;
    }
    @GetMapping("/employeelist")
    public Object employeeList() {
        return employeeService.list();
    }
}
