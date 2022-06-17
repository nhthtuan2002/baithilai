package com.example.baithi.model.constant;

public class SqlConstant {
    //PRODUCT SQL COMMAND
    public static final String EMPLOYEE_FIELD_ID = "id";
    public static final String EMPLOYEE_FIELD_FULL_NAME = "fullName";
    public static final String EMPLOYEE_FIELD_BIRTHDAY = "birthday";
    public static final String EMPLOYEE_FIELD_ADDRESS = "address";
    public static final String EMPLOYEE_FIELD_POSITION = "position";
    public static final String EMPLOYEE_FIELD_DEPARTMENT = "department";


    public static final String EMPLOYEE_INSERT = "INSERT INTO employee (fullName, birthday, address, position, department) VALUES (?, ?, ?, ?, ?);";
    public static final String EMPLOYEE_FIND_ALL = "SELECT * FROM employee;";

}
