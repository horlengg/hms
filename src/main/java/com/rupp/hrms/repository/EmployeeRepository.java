package com.rupp.hrms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rupp.hrms.entity.EmployeeEntity;

public interface EmployeeRepository extends JpaRepository<EmployeeEntity,Long> {
    
}
