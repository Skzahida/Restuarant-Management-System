/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import javax.swing.JOptionPane;
import java.sql.*;
import java.util.ArrayList;
import model.Bill;

/**
 *
 * @author HP
 */
public class BillDao {
    
    public static String getId(){
    int id = 1;
    try{
    ResultSet rs = dboperations.getData("select max(id) from bill");
    if(rs.next()){
    id = rs.getInt(1);
    id = id + 1;
    
    }
    }
    catch(Exception e){
    JOptionPane.showMessageDialog(null, e);
    }
    return String.valueOf(id);
    
    }
    public static void save(Bill bill){
        
        
    String query = "insert into bill values('"+bill.getId()+"','"+bill.getName()+"','"+bill.getMobileno()+"','"+bill.getEmail()+"','"+bill.getDate()+"','"+bill.getTotal()+"','"+bill.getCreatedBy()+"')";
    
    dboperations.setDataorDelete(query, "Bill Details Added Successfully");
        }
       
     public static ArrayList<Bill> getALLRecordsByInc(String date){
     ArrayList<Bill> arrayList = new ArrayList<>();
     
     try{
     ResultSet rs = dboperations.getData("select * from bill where date like '"+date+"'");
     while(rs.next()){
     Bill bill = new Bill();
     bill.setId(rs.getInt("id"));
     bill.setName(rs.getString("name"));
     bill.setMobileno(rs.getString("mobileno"));
     bill.setEmail(rs.getString("email"));
     bill.setDate(rs.getString("date"));
     bill.setTotal(rs.getString("total"));
     bill.setCreatedBy(rs.getString("createdBy"));
     arrayList.add(bill);
    
     }
     }
     catch(Exception e){
     JOptionPane.showMessageDialog(null, e);
     }
        return arrayList;
     
     }
     
     public static ArrayList<Bill> getALLRecordsByDesc(String date){
     ArrayList<Bill> arrayList = new ArrayList<>();
     try{
     ResultSet rs = dboperations.getData("select * from bill where date like '%"+date+"%' order By id DESC");
     while(rs.next()){
     Bill bill = new Bill();
     bill.setId(rs.getInt("id"));
     bill.setName(rs.getString("name"));
     bill.setMobileno(rs.getString("mobileno"));
     bill.setEmail(rs.getString("email"));
     bill.setDate(rs.getString("date"));
     bill.setTotal(rs.getString("total"));
     bill.setCreatedBy(rs.getString("createdBy"));
     arrayList.add(bill);
     }
     }
     catch(Exception e){
     JOptionPane.showMessageDialog(null, e);
     }
        return arrayList;
     
     }
     
    }
    
