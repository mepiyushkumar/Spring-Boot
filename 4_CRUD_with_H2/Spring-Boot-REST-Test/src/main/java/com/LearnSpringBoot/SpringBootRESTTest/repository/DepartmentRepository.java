package com.LearnSpringBoot.SpringBootRESTTest.repository;

import com.LearnSpringBoot.SpringBootRESTTest.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<Department,Long> {
}
