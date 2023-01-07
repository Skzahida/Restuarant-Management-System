/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import javax.swing.JOptionPane;

/**
 * 
 * @author HP
 */
public class table {
    public static void main (String[] args){
            try{
                
                String userTable = "create table user (id int AUTO_INCREMENT primary key,name varchar(200), email varchar(200),mobileno varchar(10), address varchar(200), password varchar(200),securityQuestion varchar(200),answer varchar(200),status varchar(20),UNIQUE(email))";
                String adminDetails = "insert into user (name,email,mobileno,address,password,securityquestion,answer,status) values('Admin','admin@gmail.com','1234567890','India','admin','What primary school did you attend?','ABC','true')";
                String CategoryTable = "create table category(id int AUTO_INCREMENT primary key,name varchar(200))";
                String productTable = "create table product(id int AUTO_INCREMENT primary key,name varchar(200),category varchar(200),price varchar(200))";
                String BillTable = "create table Bill(id int primary key,name varchar(200),mobileno varchar(200),email varchar(200),date varchar(50),total varchar(200),createdBy varchar(200))";
               dboperations.setDataorDelete(userTable,"User Table Created Successfully");
               dboperations.setDataorDelete(adminDetails,"Admin Details Added Successfully");
               dboperations.setDataorDelete(CategoryTable,"Category Table Created Successfully");
               dboperations.setDataorDelete(productTable,"Product Table Created Successfully");
                dboperations.setDataorDelete(BillTable,"Bill Table Created Successfully");
                
            }
    catch(Exception e){
    JOptionPane.showMessageDialog(null, e);
}
            
            
}
}