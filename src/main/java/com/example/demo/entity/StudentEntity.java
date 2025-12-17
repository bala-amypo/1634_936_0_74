package com.example.demo.entity;
//@Entity
public class StudentEntity{

private String name;
private Integer id;
private String email;
private String password;
private Date created;
public Date getCreated {
    return created;
}
public void setCreated(Date created) {
    this.created=created;
}
public void getId() {
    return id;
}
public void setId(Integer id){
    this.id=id;
}
public String getname() {
    return name;
}
public void setName(String name) {
    this.name=name;
}
public String getEmail(){
    return email;
}


