package com.example.demo.Entity;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.;



@Entity
public class ValidationEntity{
    @Id
    @GeneratedValue(strategy = GenrationType.IDENTITY)
          private Long id;
          @NotNul
          private String username;
          private String email;
          private String password;
          private Integer age;

}