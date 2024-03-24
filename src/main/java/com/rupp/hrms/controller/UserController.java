package com.rupp.hrms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.rupp.hrms.dto.request.UserRequestDTO;
import com.rupp.hrms.dto.response.CustomUserDetails;
import com.rupp.hrms.service.UserService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired UserService userService;
    
    @GetMapping
    public String userManagement(Model model,@AuthenticationPrincipal CustomUserDetails user) {
        model.addAttribute("users",userService.retrieveAllUser());
        model.addAttribute("name", userService.getUser());
        return "pages/user-management";
    }
    
    @PostMapping("/create")
    public String createUserForm(@ModelAttribute("userDTO") UserRequestDTO userDTO) {
        System.out.println(userDTO.getEmail());
        System.out.println(userDTO.getFirstName());
        System.out.println(userDTO.getLastName());
        System.out.println(userDTO.getPhoneNumber());
        return "redirect:/user";
    }

    
    
}
