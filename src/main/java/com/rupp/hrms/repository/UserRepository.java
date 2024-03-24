package com.rupp.hrms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rupp.hrms.entity.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity,Long>{

    UserEntity findByEmail(String email);

    
}
