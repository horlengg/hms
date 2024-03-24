package com.rupp.hrms.security;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.rupp.hrms.dto.response.CustomUserDetails;
import com.rupp.hrms.entity.UserEntity;
import com.rupp.hrms.repository.UserRepository;

import java.util.HashSet;


@Service
public class CustomUserDetailsService implements  UserDetailsService {

    private UserRepository userRepository;

    public CustomUserDetailsService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        UserEntity user = userRepository.findByEmail(email);
        if(user == null) throw new UsernameNotFoundException("Invalid username or password");
        else {
            return  new CustomUserDetails(
                user.getEmail(),
                user.getPassword(), 
                new HashSet<>(),
                user.getDetails().getFullName()
            );
        }

    }
    
}
