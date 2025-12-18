package com.example.demo.service.Impl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.entity.Validation.Entity;
import com.example.demo.repository.ValidationRepo;
import com.example.demo.service.ValidationService;
import java.util.List;
@Service
public class ValidationServiceImpl implements ValidationService {
    @Autowired ValidationRepo student;
    //save()
    //findAll()
    //findById()
    //deleteById();
    //existByid();
        public ValidationEntity postData(ValidationEntity stu){
            return student.save(stu);
        }   
        @Override 
        public List<ValidationEntity>getAllData(){
            return student.findAll();
        }   
        @Override
        public String DeleteData(int id){
                    student.deleteById(id);
                    return "Deleted Successfully";
        }
        @Override
        public ValidationEntity getData(int id){
            return student.findById(id).orElse(null);
        }
        @Override
        public ValidationEntity updateData(int id,ValidationEntity entity){
            if (student.existsById(id)){
                entity.setId(id);
                 return student.save(entity);
            }
            return null;
           
        }
}
