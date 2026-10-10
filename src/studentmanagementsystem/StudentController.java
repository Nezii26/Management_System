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
public class StudentController {
    
     public boolean addNewStudent(Student student) throws SQLException, ClassNotFoundException {
       String SQL = "INSERT INTO student VALUES('"+student.getstudentId()+"', '"+student.getstudentName()+"', '"+student.getstudentNic()+"', "+student.getprfMarks()+", "+student.getdbmsMarks()+")";
       Statement stm = DBConnection.getInstance().getConnection().createStatement();
       int rst = stm.executeUpdate(SQL);
       return rst > 0;
    }
     
     public boolean checkNicExists(String nic) throws SQLException, ClassNotFoundException {
       String SQL = "SELECT nic FROM student WHERE nic = '" + nic + "'";
       Statement stm = DBConnection.getInstance().getConnection().createStatement();
       ResultSet rst = stm.executeQuery(SQL);
       if(rst.next()){
           return true;
       }
       return false;
    }
     
     
     
     
     
     
     

    int genarateStudentId(String batchNo, String mode) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}