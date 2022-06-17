package com.example.baithi.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionHelper {
    private static final String DATABASE_URL = "jdbc:mysql://localhost:3306/employee";
    private static final String DATABASE_USERNAME = "root";
    private static final String DATABASE_PASSWORD = "";
    private static Connection connection;
    public static Connection getConnection(){
        try {
            if(connection == null || connection.isClosed()){
                Class.forName("com.mysql.cj.jdbc.Driver");
                connection = DriverManager.getConnection(DATABASE_URL,DATABASE_USERNAME,DATABASE_PASSWORD);
                System.out.println("Connected :" + connection);
            }
        }catch (SQLException | ClassNotFoundException exception){
            exception.printStackTrace();
        }
        return connection;
    };

}
