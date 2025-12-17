package com.example.demo.sevice.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.service.StudentEntity;
import com.example.demo.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService{
@Autowired StudentRepo student;
//save()
//findAll()
//findById()
//deleteById();
//existById();

  public StudentEntity postData(StudentEntity.stu){
    return student.save(stu);
  }
}