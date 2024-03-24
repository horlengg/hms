package com.rupp.hrms.dto.response;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;

public class CustomUserDetails extends User{
    private String adminName;
    public CustomUserDetails(String username, String password, Collection<? extends GrantedAuthority> authorities,String adminName) {
        super(username, password, authorities);
        this.adminName = adminName;
    }
    public String getAdminName() {
        return adminName;
    }
    public void setAdminName(String adminName) {
        this.adminName = adminName;
    }

    
    
    
}
