package com.example.REST_MongoDB.service;

import com.example.REST_MongoDB.entity.Employee;
import com.example.REST_MongoDB.repository.MongoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceEmployee {

    @Autowired
    private MongoRepo mongoRepo;

    public Employee createEmployee(Employee employee) {
        return mongoRepo.save(employee);
    }
}
