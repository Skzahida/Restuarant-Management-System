/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;
import java.sql.*;
public class connectionprovider {
    public static Connection getCon(){
         try{
             Class.forName("com.mysql.cj.jdbc.Driver");
             Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cms?allowPublicKeyRetrieval=true&useSSL=false","root","Sadaf@786");
         return con;
         }
          catch(Exception e){
              System.out.print(e);
            return null;                    
        
        }
    
    }

    
}