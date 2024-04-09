package com.example.REST_MongoDB.controller;

import com.example.REST_MongoDB.entity.Employee;
import com.example.REST_MongoDB.service.ServiceEmployee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

    @Autowired
    private ServiceEmployee serviceEmployee;

    @PostMapping("emp")
    public Employee createEmployee(@RequestBody Employee employee){
        return serviceEmployee.createEmployee(employee);
    }
}
