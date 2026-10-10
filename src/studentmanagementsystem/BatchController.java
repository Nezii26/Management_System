/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package studentmanagementsystem;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author wwwpa
 */
public class BatchController {
    
   public boolean checkBatchStatus(int batchTNo) throws SQLException, ClassNotFoundException{
       String SQL = "SELECT batchTNo FROM batch batchTNo = '"+ batchTNo +"'";
       Statement stm  = DBConnection.getInstance().getConnection().createStatement();
       ResultSet rst = stm.executeQuery(SQL);
       if(rst.next()){
           return true;
       }
       return false;
   }
       
       
       
    
}
