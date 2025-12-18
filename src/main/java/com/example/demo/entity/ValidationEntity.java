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
          @Size(min = 2 , max = 10, message = "must be 2 to 10 character")
          @NotNull(message = "Password is mandatory")
          private String password;
          @Max(30)
          @Positive(message = "Age must be a positive number")
          private Integer age;



public Long getId(){
    return id;
}

public void setId(Long id){
    this.id=id;
}
public String getusername(){
    return username;
}
public void setusername(String username){
    this.username=name;
}
public String getEmail(){
    return email;
}
public void setEmail(String email){
    this.email=email;
}
public String getPassword(){
    return password;
}
public void setPassword(String Password){
    this.password=password;
}
public String getage(){
    return age;
}
public void setage(Integer age){
    this.age=age;
}
public ValidationEntity(Long id,
          @NotNul @Size(min = 2, max = 10, message = "must be 2 to 10 character") String username,
          @Email(message = "Email is not valid") String email,
          @Size(min = 2 , max = 10, message = "must be 2 to 10 character") @NotNull(message = "Password is mandatory") String password,
          @Max(30) @Positive(message = "Age must be a positive number") Integer age
          );{
    this.id=id;
    this.username=username;
    this.email=email;
    this.password=password;
    this.age = age;
          }
          public class ValidationEntity{
          }
}
