package com.example.demo.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import jakarta.validation.constraints.NotNull;

@Entity
public class ValidationEntity{
    @Id
    @GeneratedValue(strategy = GenrationType.IDENTITY)
          private Long id;
          @NotNul
          @Size(min = 2, max = 10, message = "must be 2 to 10 character")
          private String username;
          @Email(message = "Email is not valid")
          private String email;
          @Size(min = 2 , max = 0, message)
          @NotNull(message = "Password is mandatory")
          private String password;
          @Max(30)
          @Positive(message = "Age must be a positive number")
          private Integer age;

}