/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Model.docgia;
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
public class docgia_Dao {
        public static List<docgia> findAll() {
        List<docgia> docgiaList = new ArrayList<>();
        
        Connection connection = null;
        Statement statement = null;
        
        try {
          
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/quanlysach", "root", "");
            
            String sql = "select * from docgia";
            statement = connection.createStatement();
            
            ResultSet resultSet = statement.executeQuery(sql);
            
            while (resultSet.next()) {                
                docgia dg = new docgia(resultSet.getInt("madocgia"), resultSet.getString("tendocgia"), 
                        resultSet.getString("sdt"), resultSet.getString("email")
                        , resultSet.getString("diachi"));
                docgiaList.add(dg);
            }
        } catch (SQLException ex) {
            Logger.getLogger(docgia_Dao.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if(statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(docgia_Dao.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(docgia_Dao.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        //ket thuc.
        
        return docgiaList;
    }
        public static void insert(docgia dg) {
        Connection connection = null;
        PreparedStatement statement = null;
        
        try {

            
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/quanlysach", "root", "");
            
            //query
            String sql = "insert into docgia(tendocgia,sdt,email,diachi) values(?,?,?,?)";
            statement = connection.prepareCall(sql);
            
            
            statement.setString(1, dg.getTendocgia());
            statement.setString(2, dg.getSdt());
            statement.setString(3, dg.getEmail());
            statement.setString(4, dg.getDiachi());

            
            
            statement.execute();
        } catch (SQLException ex) {
            Logger.getLogger(docgia_Dao.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if(statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(docgia_Dao.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(docgia_Dao.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        //ket thuc.
    }
            public static void delete(int madocgia) {
        Connection connection = null;
        PreparedStatement statement = null;
        
        try {
            //lay tat ca danh sach sinh vien
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/quanlysach", "root", "");
            
            //query
            String sql = "delete from docgia where madocgia = ?";
            statement = connection.prepareCall(sql);
            
            statement.setInt(1, madocgia);
            
            statement.execute();
        } catch (SQLException ex) {
            Logger.getLogger(docgia_Dao.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if(statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(docgia_Dao.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(docgia_Dao.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        //ket thuc.
    }
        public static List<docgia> findByFullname(String tendocgia) {
        List<docgia> docgiaList = new ArrayList<>();
        
        Connection connection = null;
        PreparedStatement statement = null;
        
        try {
            
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/quanlysach", "root", "");
            
            //query
            String sql = "select * from docgia where tendocgia like ?";
            statement = connection.prepareCall(sql);
            statement.setString(1, "%"+tendocgia+"%");
            
            ResultSet resultSet = statement.executeQuery();
            
            while (resultSet.next()) {                
                docgia dg = new docgia(resultSet.getInt("madocgia"), resultSet.getString("tendocgia"), 
                        resultSet.getString("sdt"), resultSet.getString("email")
                        , resultSet.getString("diachi"));
                docgiaList.add(dg);
            }
        } catch (SQLException ex) {
            Logger.getLogger(sach_Dao.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if(statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(sach_Dao.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(sach_Dao.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        //ket thuc.
        
        return docgiaList;
    }   
}
