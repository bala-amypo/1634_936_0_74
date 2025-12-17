package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.StudentService;

@RestController
public class StudentController {
@Autowired StudentService ser;

@PostMapping("/post")
public StudentEntity sendData(@RequestBody studentEntity stu){
    return ser.postData(stu);
}
}