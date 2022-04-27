/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TTSach;

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
 * @author TechCare
 */
public class nhaxuatbanDao {
    PreparedStatement statement = null;
   public static List<nhaxuatban> getAll() {
        List<nhaxuatban> ls = new ArrayList<>();
        
        Connection connection = null;
        Statement statement = null;
        
        try {
          
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/quanlysach", "root", "");
            String sql = "select * from nhaxuatban";
            statement = connection.createStatement();
            
            ResultSet rs = statement.executeQuery(sql);
            
            while (rs.next()) {                
               nhaxuatban nxb=new nhaxuatban();
               nxb.setId(rs.getInt(1));
               nxb.setName(rs.getString(2));
               nxb.setDiachi(rs.getString(3));
               ls.add(nxb);
            }
        } catch (SQLException ex) {
            Logger.getLogger(nhaxuatbanDao.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if(statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(nhaxuatbanDao.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(nhaxuatbanDao.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        //ket thuc.
        
        return ls;
    }
   public nhaxuatban getbyname(String name) {
        
        Connection connection = null;
        Statement statement = null;
        
        try {
          
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/quanlysach", "root", "");
            String sql = "select * from nhaxuatban where nhaxuatban='"+name+"'";
            statement = connection.createStatement();
            
            ResultSet rs = statement.executeQuery(sql);
            
            while (rs.next()) {                
               nhaxuatban nxb=new nhaxuatban();
               nxb.setId(rs.getInt(1));
               nxb.setName(rs.getString(2));
               return nxb;
            }
        } catch (SQLException ex) {
            Logger.getLogger(nhaxuatbanDao.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if(statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(nhaxuatbanDao.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(nhaxuatbanDao.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        //ket thuc.
        
        return null;
    }
      public List<nhaxuatban> findAll(){
        List<nhaxuatban> ls = new ArrayList<>();
        Connection connection = null;
        Statement statement = null;
        
        try {
          
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/quanlysach", "root", "");
            String sql = "select *from nhaxuatban";
            statement = connection.createStatement();
            
            ResultSet rs = statement.executeQuery(sql);
            
            while (rs.next()) {                
              nhaxuatban nxb =new nhaxuatban();
              nxb.setId(rs.getInt(1));
              nxb.setName(rs.getString(2));
              nxb.setDiachi(rs.getString(3));
            
              ls.add(nxb);
            }
        } catch (SQLException ex) {
            Logger.getLogger(nhaxuatbanDao.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if(statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(nhaxuatbanDao.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(nhaxuatbanDao.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        //ket thuc.
        
        return ls;
        
    }
      public static void insert(nhaxuatban b) {
        Connection connection = null;
        PreparedStatement statement = null;
        
        try {
            
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/quanlysach", "root", "");
            
            //query
            String sql = "insert into nhaxuatban( id,nxb,diachi) values( ?,?,?)";
            statement = connection.prepareCall(sql);
            
            statement.setInt(1, b.getId());
            statement.setString(2, b.getName());
            statement.setString(3, b.getDiachi());
            
            
            statement.execute();
        } catch (SQLException ex) {
            Logger.getLogger(nhaxuatbanDao.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if(statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(nhaxuatbanDao.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(nhaxuatbanDao.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        //ket thuc.
    }
            public static void delete(int id) {
        Connection connection = null;
        PreparedStatement statement = null;
        
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/quanlysach", "root", "");
            String sql = "delete from nhaxuatban where id = ?";
            statement = connection.prepareCall(sql);    
            statement.setInt(1, id);
            statement.execute();
        } catch (SQLException ex) {
            Logger.getLogger(nhaxuatbanDao.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if(statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(nhaxuatbanDao.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(nhaxuatbanDao.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        //ket thuc.
    }
}
