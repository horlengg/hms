package com.rupp.hrms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
@RequestMapping("/room")
public class RoomController {
    
    @GetMapping
    public String roomManagement() {
        return "pages/room-management";
    }
    
    
}
