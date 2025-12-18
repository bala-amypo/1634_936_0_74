package com.example.demo.controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;
import java.util.List;
@RestController
public class ValidationController{
    @Autowired ValidationService ser;
    @PostMapping("/post")
    public ValidationEntity sendData(@Valid@RequestBody ValidationEntity stu){
        return ser.postData(stu);


    }

}
