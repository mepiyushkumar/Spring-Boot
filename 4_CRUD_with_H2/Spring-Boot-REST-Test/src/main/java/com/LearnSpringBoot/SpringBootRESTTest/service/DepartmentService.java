package com.LearnSpringBoot.SpringBootRESTTest.service;

import com.LearnSpringBoot.SpringBootRESTTest.entity.Department;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DepartmentService {
    Department saveDepartment(Department department);

    List<Department> getDepartment();

    Department getDepartmentById(Long departmentId);

    void deleteDepatmentById(Long departmentId);

    Department updateDepartmentById(Long departmentId, Department department);
}
