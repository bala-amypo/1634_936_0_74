package com.example.demo.service.Impl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.entity.ValidationEntity;
import com.example.demo.repository.ValidationRepo;
import com.example.demo.service.ValidationService;
import java.util.List;
@Service
public class ValidationServiceImpl implements ValidationService {
    @Autowired ValidationRepo student;
    //existByid();
        public ValidationEntity postData(ValidationEntity stu){
            return student.save(stu);
        }   
       
           
        
}
