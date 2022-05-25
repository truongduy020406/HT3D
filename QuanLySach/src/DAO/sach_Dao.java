/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Model.sach;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author admin
 */
public class sach_Dao {
        public static List<sach> findAll() {
        List<sach> sachList = new ArrayList<>();
        
        Connection connection = null;
        Statement statement = null;
        
        try {
          
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/quanlysach", "root", "");
            
            String sql = "select * from sach";
            statement = connection.createStatement();
            
            ResultSet resultSet = statement.executeQuery(sql);
            
            while (resultSet.next()) {                
                sach s = new sach(resultSet.getInt("masach"), resultSet.getString("tensach"), 
                        resultSet.getString("tentheloai"), resultSet.getString("tendanhmuc")
                        , resultSet.getString("tacgia"), resultSet.getString("nhaxuatban"),
                        resultSet.getString("ngayxuatban"), resultSet.getString("tomtat"));
                sachList.add(s);
            }
        } catch (SQLException ex) {
            Logger.getLogger(sach_Dao.class.getName()).log(Level.SEVERE, null, ex);
        } finally {

            }
        
        
        return sachList;
    }
        public static void insert(sach s) {
        Connection connection = null;
        PreparedStatement statement = null;
        
        try {

            
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/quanlysach", "root", "");
            
            //query
            String sql = "insert into sach(tensach,tentheloai,tendanhmuc,tacgia,nhaxuatban,ngayxuatban,tomtat) values(?,?,?,?,?,?,?)";
            statement = connection.prepareCall(sql);
            
            
            statement.setString(1, s.getTensach_53());
            statement.setString(2, s.getTentheloai_53());
            statement.setString(3, s.getTendanhmuc_53());
            statement.setString(4, s.getTacgia_53());
            statement.setString(5, s.getNhaxuatban_53());
            statement.setString(6, s.getNgayxuatban_53());
            statement.setString(7, s.getTomtat_53());
            
            
            statement.execute();
        } catch (SQLException ex) {
            Logger.getLogger(sach_Dao.class.getName()).log(Level.SEVERE, null, ex);
        } finally {    }

    }
            public static void delete(int masach_53) {
        Connection connection = null;
        PreparedStatement statement = null;
        
        try {
            //lay tat ca danh sach sinh vien
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/quanlysach", "root", "");
            
            //query
            String sql = "delete from sach where masach = ?";
            statement = connection.prepareCall(sql);
            
            statement.setInt(1, masach_53);
            
            statement.execute();
        } catch (SQLException ex) {
            Logger.getLogger(sach_Dao.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
        }

    }
        public static List<sach> findByFullname(String tensach) {
        List<sach> sachList = new ArrayList<>();
        
        Connection connection = null;
        PreparedStatement statement = null;
        
        try {
            
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/quanlysach", "root", "");

            String sql = "select * from sach where tensach like ?";
            statement = connection.prepareCall(sql);
            statement.setString(1, "%"+tensach+"%");
            
            ResultSet resultSet = statement.executeQuery();
            
            while (resultSet.next()) {                
                sach s = new sach(resultSet.getInt("masach"), resultSet.getString("tensach"), 
                        resultSet.getString("tentheloai"), resultSet.getString("tendanhmuc")
                        , resultSet.getString("tacgia"), resultSet.getString("nhaxuatban"),
                        resultSet.getString("ngayxuatban"), resultSet.getString("tomtat"));
                sachList.add(s);
            }
        } catch (SQLException ex) {
            Logger.getLogger(sach_Dao.class.getName()).log(Level.SEVERE, null, ex);
        } finally {

            }
        
        return sachList;
    }
}
