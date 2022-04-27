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
public class bookDao {
    public List<book> findAll(){
        List<book> ls = new ArrayList<>();
        Connection connection = null;
        Statement statement = null;
        
        try {
          
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/quanlysach", "root", "");
            String sql = "select *from thongtinsach";
            statement = connection.createStatement();
            
            ResultSet rs = statement.executeQuery(sql);
            
            while (rs.next()) {                
              book b =new book();
              b.setMasach(rs.getInt(1));
              b.setTensach(rs.getString(2));
              b.setTacgia(rs.getString(3));
              b.setNhaxuatban(rs.getString(4));
              b.setTheloai(rs.getString(5));
              b.setSoluong(rs.getInt(6));
              ls.add(b);
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
     public static void insert(book b) {
        Connection connection = null;
        PreparedStatement statement = null;
        
        try {
            
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/quanlysach", "root", "");
            
            //query
            String sql = "insert into thongtinsach( masach,tensach,tacgia,theloai,soluong) values( ?,?,?,?,?)";
            statement = connection.prepareCall(sql);
            
            statement.setInt(1, b.getMasach());
            statement.setString(2, b.getTensach());
            statement.setString(3, b.getTacgia());
            statement.setString(4, b.getTheloai());
            statement.setInt(5, b.getSoluong());
            
            statement.execute();
        } catch (SQLException ex) {
            Logger.getLogger(bookDao.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if(statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(bookDao.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(bookDao.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        //ket thuc.
    }
            public static void delete(int masach) {
        Connection connection = null;
        PreparedStatement statement = null;
        
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/quanlysach", "root", "");
            String sql = "delete from thongtinsach where masach = ?";
            statement = connection.prepareCall(sql);    
            statement.setInt(1, masach);
            statement.execute();
        } catch (SQLException ex) {
            Logger.getLogger(bookDao.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if(statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(bookDao.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(bookDao.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        //ket thuc.
    }
        public static List<book> findByFullname(String theloai) {
        List<book> bookList = new ArrayList<>();
        
        Connection connection = null;
        PreparedStatement statement = null;
        
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/quanlysach", "root", "");
            
            String sql = "select * from thongtinsach where theloai like ?";
            statement = connection.prepareCall(sql);
            statement.setString(1, "%"+theloai+"%");
            
            ResultSet resultSet = statement.executeQuery();
            
            while (resultSet.next()) {                
                book b = new book(resultSet.getString("tacgia"),
                        resultSet.getString("theloai"), 
                          resultSet.getString("tensach"),
                        resultSet.getString("nhaxuatban"),
                        resultSet.getInt("masach"),
                        resultSet.getInt("soluong"));
                bookList.add(b);
            }
        } catch (SQLException ex) {
            Logger.getLogger(bookDao.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if(statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(bookDao.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(bookDao.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        //ket thuc.
        
        return bookList;
    }
}
