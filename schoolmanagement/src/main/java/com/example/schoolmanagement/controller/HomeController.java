package com.example.schoolmanagement.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/home")
    public String home(){
        return "home";
    }

    @GetMapping("/job_openings")
    public String job_openings(){
        return "job_openings";
    }

    @GetMapping("/testimonials")
    public String testimonials(){
        return "testamonials";
    }

    @GetMapping("/learn_more")
    public String learn_more(){
        return "learn_more";
    }

    @GetMapping("/student_body")
    public String student_body(){
        return "student_body";
    }

    @GetMapping("/teacher_body")
    public String teacher_body(){
        return "teacher_body";
    }
}
