package com.rupp.hrms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
@RequestMapping("/patient")
public class PatientController {
    
    @GetMapping
    public String patientManagement() {
        return "pages/patient-management";
    }
    
    
}
