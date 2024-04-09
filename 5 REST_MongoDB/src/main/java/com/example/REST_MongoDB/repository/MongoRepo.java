package com.example.REST_MongoDB.repository;

import com.example.REST_MongoDB.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MongoRepo extends MongoRepository<Employee,Long> {

}
