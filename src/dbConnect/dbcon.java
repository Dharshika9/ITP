/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbConnect;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Dharshika
 */
public class dbcon {
 public static Connection connect(){
    Connection conn = null;
        
        try{
            
            Class.forName("com.mysql.jdbc.Driver");
            conn = (com.mysql.jdbc.Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/itp", "Dharshika", "indumathi9@");
            
        }
        catch (Exception e) {
            
            System.out.println(e);
        }
        
        
        
        return conn;
    
 }
}
