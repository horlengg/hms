package com.rupp.hrms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
@RequestMapping("/disease")
public class DiseaseController {
    
    @GetMapping
    public String diseaseManagement() {
        return "pages/disease-management";
    }
    
    
}
