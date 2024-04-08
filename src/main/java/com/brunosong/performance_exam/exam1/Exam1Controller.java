package com.brunosong.performance_exam.exam1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/exam1")
public class Exam1Controller {


    @GetMapping("/sample1")
    public String sample1(){
        return "Hello";
    }
}
