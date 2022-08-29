 package com.example.SearchEngine.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;




@Entity
@Table(name="employee") //------------
public class Employee {
	@Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
   private Long id;
   private String ename;
   private int mobile;
   private int salary;
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public String getEname() {
	return ename;
}
public void setEname(String ename) {
	this.ename = ename;
}
public int getMobile() {
	return mobile;
}
public void setMobile(int mobile) {
	this.mobile = mobile;
}
public int getSalary() {
	return salary;
}
public void setSalary(int salary) {
	this.salary = salary;
}
   
   
}

