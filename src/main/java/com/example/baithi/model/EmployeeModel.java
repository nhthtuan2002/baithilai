package com.example.baithi.model;

import com.example.baithi.entity.Employee;

import java.util.List;

public interface EmployeeModel {
    boolean save(Employee obj);
    List<Employee> findAll();
}