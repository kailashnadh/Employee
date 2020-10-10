package com.example.employee.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
    @GetMapping("/get")
    public String getEmployeeName(){
        return "kailash";
    }
    @GetMapping("/post")
    public String postEmployeeName(){
        return "kailashpost";
    }
}
