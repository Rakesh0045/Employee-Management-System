/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

/**
 *
 * @author rakes
 */
import java.sql.*;
public class DeleteService {
    public static boolean deleteData(String name, String password){
        try{
            Connection cn = repository.ConnectionDB.getConnectiondb();
            Statement st = cn.createStatement();
            st.executeUpdate("delete from user_table where name='"+name+"' and password='"+password+"'");
            return true;
        } catch(Exception ee){
            ee.printStackTrace();
        }
        return false;
    } 
}
