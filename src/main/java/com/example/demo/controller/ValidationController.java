package com.example.demo.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PathVariable;
import com.example.demo.entity.ValidationController;
import com.example.demo.service.ValidationService;
import java.util.List;
@RestController
public class ValidationController{

    @Autowired ValidationService service;



    @PostMapping("/post")
    public ValidationController sendData(@RequestBody ValidationController stu){
        return service.postData(stu);
    }
    @GetMapping("/get")
    public List<ValidationController> getval(){
        return service.getAllData();
    }
     @DeleteMapping("/delete/{id}")
     public String deleteval(@PathVariable int id){
        return service.DeleteData(id);
     }
     @GetMapping("/getid/{id}")
     public ValidationController getdataid(@PathVariable int id){
        return service.getData(id);
     }
     @PutMapping("/put/{id}")
     public ValidationController putval(@PathVariable int id,@RequestBody ValidationController entity){
           return service.updateData(id,entity);
     }
        
}