/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package studentmanagementsystem;

import java.sql.*;
/**
 *
 * @author wwwpa
 */
public class DBConnection {
    private static DBConnection dbconnection;
    private Connection connection;
    private DBConnection() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1/student_Management_system","root","1234"); 
    }
    public static DBConnection getInstance() throws SQLException, ClassNotFoundException{
        if(dbconnection==null){
            dbconnection = new DBConnection();
        }
        return dbconnection;
    }
    
    public Connection getConnection() throws ClassNotFoundException, SQLException{
        return connection;
    }
}
