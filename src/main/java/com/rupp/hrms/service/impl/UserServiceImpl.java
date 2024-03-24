package com.rupp.hrms.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.rupp.hrms.dto.request.UserRequestDTO;
import com.rupp.hrms.dto.response.UserReponseDTO;
import com.rupp.hrms.entity.UserEntity;
import com.rupp.hrms.entity.UserInfo;
import com.rupp.hrms.repository.UserInfoRepository;
import com.rupp.hrms.repository.UserRepository;
import com.rupp.hrms.service.UserService;

@Service
public class UserServiceImpl implements UserService {
    
    // @Value("${hms.defaultPassword}")
    // private String password;

    private PasswordEncoder passwordEncoder;
    @Autowired
    UserRepository userRepository;
    @Autowired
    UserInfoRepository userInfoRepository;

    UserServiceImpl(PasswordEncoder passwordEncoder) {
        this.passwordEncoder = passwordEncoder;
    }

    @Override
    public void createUser(UserRequestDTO req) {
        // UserInfo userInfo = new UserInfo();
        // userInfo.getFullName(req.getFirstName());
        // UserInfo userInfoSaved = userInfoRepository.save(userInfo);

        // if (userInfoSaved != null) {
        //     UserEntity userEntity = new UserEntity();
        //     userEntity.setEmail(req.getEmail());
        //     userEntity.setPassword(passwordEncoder.encode("hms@0101"));
        //     userEntity.setDetails(userInfoSaved);
        //     userEntity.setIsDeleted(false);
        //     userRepository.save(userEntity);

        // }

    }

    @Override
    public String getUser() {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        if (!(authentication instanceof AnonymousAuthenticationToken)) {
            String currentUserName = authentication.getName();
            return currentUserName;
        }
        return null;
    }

    @Override
    public List<UserReponseDTO> retrieveAllUser() {
        List<UserEntity> users = new ArrayList<>();
        List<UserReponseDTO> listUsers = new ArrayList<>();
        users = userRepository.findAll();
        for(UserEntity user : users) {
            listUsers.add(new UserReponseDTO(user.getId(),user.getEmail(),user.getPassword(),user.getDetails().getFullName()));
        }
        return listUsers;
    }

    

}
