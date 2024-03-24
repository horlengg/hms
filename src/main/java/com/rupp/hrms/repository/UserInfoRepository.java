package com.rupp.hrms.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rupp.hrms.entity.UserInfo;

public interface UserInfoRepository extends JpaRepository<UserInfo,Long> {
    List<UserInfo> findByUserType(String userType);
}
