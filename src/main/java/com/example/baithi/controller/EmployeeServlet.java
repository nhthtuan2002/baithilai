package com.example.baithi.controller;

import com.example.baithi.model.EmployeeModel;
import com.example.baithi.model.MySqlEmployeeModel;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "EmployeeServlet", value = "/EmployeeServlet")
public class EmployeeServlet extends HttpServlet {
    private EmployeeModel employeeModel;

    public EmployeeServlet() {
        this.employeeModel = new MySqlEmployeeModel();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("employees", employeeModel.findAll());
        request.getRequestDispatcher("/list.jsp").forward(request, response);
    }
}
