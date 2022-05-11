/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Model.phieumuon;
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
public class phieumuon_Dao {
        public static List<phieumuon> findAll() {
        List<phieumuon> phieumuonList = new ArrayList<>();
        
        Connection connection = null;
        Statement statement = null;
        
        try {
          
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/quanlysach", "root", "");
            
            String sql = "select * from phieumuon";
            statement = connection.createStatement();
            
            ResultSet resultSet = statement.executeQuery(sql);
            
            while (resultSet.next()) {                
                phieumuon pm = new phieumuon(resultSet.getInt("maphieumuon"), resultSet.getString("madocgiamuon"), 
                        resultSet.getString("masachmuon"), resultSet.getString("ngaymuon")
                        );
                phieumuonList.add(pm);
            }
        } catch (SQLException ex) {
            Logger.getLogger(phieumuon_Dao.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if(statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(phieumuon_Dao.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(phieumuon_Dao.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        //ket thuc.
        
        return phieumuonList;
    }
        public static void insert(phieumuon pm) {
        Connection connection = null;
        PreparedStatement statement = null;
        
        try {

            
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/quanlysach", "root", "");
            
            //query
            String sql = "insert into phieumuon(madocgiamuon,masachmuon,ngaymuon) values(?,?,?)";
            statement = connection.prepareCall(sql);
            
            
            statement.setString(1, pm.getMadocgiamuon_15());
            statement.setString(2, pm.getMasachmuon_15());
            statement.setString(3, pm.getNgaymuon_15());


            
            
            statement.execute();
        } catch (SQLException ex) {
            Logger.getLogger(phieumuon_Dao.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if(statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(phieumuon_Dao.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(phieumuon_Dao.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        //ket thuc.
    }
            public static void delete(int maphieumuon) {
        Connection connection = null;
        PreparedStatement statement = null;
        
        try {
            //lay tat ca danh sach sinh vien
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/quanlysach", "root", "");
            
            //query
            String sql = "delete from phieumuon where maphieumuon = ?";
            statement = connection.prepareCall(sql);
            
            statement.setInt(1, maphieumuon);
            
            statement.execute();
        } catch (SQLException ex) {
            Logger.getLogger(phieumuon_Dao.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if(statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(phieumuon_Dao.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(phieumuon_Dao.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        //ket thuc.
    }
        public static List<phieumuon> findByFullname(String madocgiamuon) {
        List<phieumuon> phieumuonList = new ArrayList<>();
        
        Connection connection = null;
        PreparedStatement statement = null;
        
        try {
            
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/quanlysach", "root", "");
            
            //query
            String sql = "select * from phieumuon where madocgiamuon like ?";
            statement = connection.prepareCall(sql);
            statement.setString(1, "%"+madocgiamuon+"%");
            
            ResultSet resultSet = statement.executeQuery();
            
            while (resultSet.next()) {                
                phieumuon pm = new phieumuon(resultSet.getInt("maphieumuon"), resultSet.getString("madocgiamuon"), 
                        resultSet.getString("masachmuon"), resultSet.getString("ngaymuon")
                        );
                phieumuonList.add(pm);
            }
        } catch (SQLException ex) {
            Logger.getLogger(phieumuon_Dao.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if(statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(phieumuon_Dao.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(phieumuon_Dao.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        //ket thuc.
        
        return phieumuonList;
    }     
}
