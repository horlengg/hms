package com.rupp.hrms.service;

import java.util.List;

import com.rupp.hrms.dto.response.UserDetailReponseDTO;

public interface EmployeeService {
    List<UserDetailReponseDTO> retrieveEmployees();
}
