package com.example.baithi.entity;

import java.time.LocalDateTime;
import java.util.HashMap;

public class Employee {
    private int Id;
    private String FullName;
    private String Birthday;
    private String Address;
    private String Position;
    private String Department;



    public Employee() {
    }

    public HashMap<String, String> getErrors() {
        return errors;
    }

    public void setErrors(HashMap<String, String> errors) {
        this.errors = errors;
    }

    private HashMap<String, String> errors = new HashMap<>();

    public boolean isValid() {
        checkValid();
        return errors.size() == 0;
    }
    private void checkValid() {
        if (FullName == null || FullName.length() == 0) {
            errors.put("fullName", "Please enter full name");
        }
    }

    public Employee(int id, String fullName, String birthday, String address, String position, String department) {
        Id = id;
        FullName = fullName;
        Birthday = birthday;
        Address = address;
        Position = position;
        Department = department;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getFullName() {
        return FullName;
    }

    public void setFullName(String fullName) {
        FullName = fullName;
    }

    public String getBirthday() {
        return Birthday;
    }

    public void setBirthday(String birthday) {
        Birthday = birthday;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getPosition() {
        return Position;
    }

    public void setPosition(String position) {
        Position = position;
    }

    public String getDepartment() {
        return Department;
    }

    public void setDepartment(String department) {
        Department = department;
    }

    public static final class EmployeeBuilder {
        private int Id;
        private String FullName;
        private String Birthday;
        private String Address;
        private String Position;
        private String Department;
        private HashMap<String, String> errors = new HashMap<>();

        private EmployeeBuilder() {
        }

        public static EmployeeBuilder anEmployee() {
            return new EmployeeBuilder();
        }

        public EmployeeBuilder Id(int Id) {
            this.Id = Id;
            return this;
        }

        public EmployeeBuilder FullName(String FullName) {
            this.FullName = FullName;
            return this;
        }

        public EmployeeBuilder Birthday(String Birthday) {
            this.Birthday = Birthday;
            return this;
        }

        public EmployeeBuilder Address(String Address) {
            this.Address = Address;
            return this;
        }

        public EmployeeBuilder Position(String Position) {
            this.Position = Position;
            return this;
        }

        public EmployeeBuilder Department(String Department) {
            this.Department = Department;
            return this;
        }

        public EmployeeBuilder errors(HashMap<String, String> errors) {
            this.errors = errors;
            return this;
        }

        public Employee build() {
            Employee employee = new Employee();
            employee.setId(Id);
            employee.setFullName(FullName);
            employee.setBirthday(Birthday);
            employee.setAddress(Address);
            employee.setPosition(Position);
            employee.setDepartment(Department);
            employee.setErrors(errors);
            return employee;
        }
    }
}
