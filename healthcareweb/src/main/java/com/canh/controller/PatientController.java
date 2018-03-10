package com.canh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PatientController {
	@GetMapping("/patient")
    public String home1() {
        return "/patient";
    }
}
