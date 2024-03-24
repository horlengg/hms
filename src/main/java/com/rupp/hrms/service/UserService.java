package com.rupp.hrms.service;



import java.util.List;

import com.rupp.hrms.dto.request.UserRequestDTO;
import com.rupp.hrms.dto.response.UserReponseDTO;


public interface UserService {

    public void createUser(UserRequestDTO req);
    public String getUser();
    public List<UserReponseDTO> retrieveAllUser();
    
}
