/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package jframe;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Python
 */
public class DBConnection {
    static Connection conn=null;
    public static Connection getConnection(){
         try {
          Class.forName("com.mysql.jdbc.Driver");
         conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/isim_db","root","");
       
       }catch(Exception e) {
            e.printStackTrace();  
      
       }
          return conn;
    
    
    }
     
    
}
