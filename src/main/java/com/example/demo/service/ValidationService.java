package com.example.demo.service;
import java.util.List;
import com.example.demo.entity.ValidationEntity;
public interface ValidationService{
    
    ValidationEntity postData(ValidationEntity stu);
    List<ValidationEntity>getAllData();
    String DeleteData(int id);
    ValidationEntity getData(int id);
    ValidationEntity updateData(int id,ValidationEntity entity);
}
