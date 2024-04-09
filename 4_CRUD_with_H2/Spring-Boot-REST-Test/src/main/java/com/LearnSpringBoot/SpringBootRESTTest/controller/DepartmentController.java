package com.LearnSpringBoot.SpringBootRESTTest.controller;

import com.LearnSpringBoot.SpringBootRESTTest.entity.Department;
import com.LearnSpringBoot.SpringBootRESTTest.service.DepartmentService;
import com.LearnSpringBoot.SpringBootRESTTest.service.DepartmentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @PostMapping("/departments")
    public Department saveDepartment(@RequestBody Department department){
        return departmentService.saveDepartment(department);

    }

    @GetMapping("/getdepartments")
    public List<Department> getDepartment(){
        return departmentService.getDepartment();
    }

    @GetMapping("/getdepartments/{id}")
    public Department getDepartementById(@PathVariable("id") Long departmentId){
        return departmentService.getDepartmentById(departmentId);
    }

    @DeleteMapping("/deletedepartment/{Id}")
    public String deleteDepartmentById(@PathVariable("Id") Long departmentId){
        departmentService.deleteDepatmentById(departmentId);
        return "Department deleted sucussfully!!";
    }

    @PutMapping("/departments/{Id}")
    public Department updateDepartment(@PathVariable("Id") Long departmentId,@RequestBody Department department){
        return departmentService.updateDepartmentById(departmentId, department);
    }
}
