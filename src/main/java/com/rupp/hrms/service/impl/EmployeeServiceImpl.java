package com.rupp.hrms.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rupp.hrms.dto.response.UserDetailReponseDTO;
import com.rupp.hrms.entity.UserInfo;
import com.rupp.hrms.enums.UserType;
import com.rupp.hrms.repository.UserInfoRepository;
import com.rupp.hrms.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired UserInfoRepository userInfoRepository;

    @Override
    public List<UserDetailReponseDTO> retrieveEmployees() {
        List<UserInfo> employees =  userInfoRepository.findByUserType(UserType.EMPLOYEE.toString());
        List<UserDetailReponseDTO> responses = new ArrayList<>();
        for(UserInfo emp : employees) {
            UserDetailReponseDTO response = new UserDetailReponseDTO();
            response.setFullName(emp.getFullName());
            response.setDob(emp.getDob());
            response.setPhone(emp.getPhone());
            response.setGender(emp.getGender());
            response.setMaritalStatus(emp.getMaritalStatus());
            response.setProfileImage(emp.getProfileImage());
            response.setUserType(emp.getUserType());
            response.setJointDate(emp.getEmployee().getJointDate());
            response.setContractEndDate(emp.getEmployee().getContractEndDate());
            response.setPossition(emp.getEmployee().getPossition());
            responses.add((response));
        }
        return responses;
    }
    
}
