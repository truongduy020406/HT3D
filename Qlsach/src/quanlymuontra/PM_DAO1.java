/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlymuontra;

import quanlymuontra.PM;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


public class PM_DAO1{
    public List<PM> getAllDSPhieuMuon() {
        List<PM> pmList = new ArrayList<PM>();
        
        Connection connection = KetNoiSQL.getConnection();
        
        String sql = "select maPhieuMuon, TaiKhoan.tenNguoiDung,soNgayMuon,trangThai from PhieuMuon, TaiKhoan where PhieuMuon.maTaiKhoan = TaiKhoan.maTaiKhoan";
        
        try {
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            while (rs.next()) {
                PM pm = new PM();

                pm.setMaPM(rs.getString("maPhieuMuon"));
                pm.setMaTaiKhoan(rs.getString("tenNguoiDung"));
                pm.setSoNgayMuon(rs.getInt("soNgayMuon"));
                pm.setTrangThai(rs.getString("trangThai"));
                
                pmList.add(pm);
            }
        } catch (SQLException e) {
        }

        return pmList;
    }
    public List<PM> getDSPhieuMuon() {
        List<PM> pmList = new ArrayList<PM>();
        
        Connection connection = KetNoiSQL.getConnection();
        
        String sql = "select maPhieuMuon, TaiKhoan.tenNguoiDung,soNgayMuon,trangThai from PhieuMuon, TaiKhoan where  PhieuMuon.maTaiKhoan = TaiKhoan.maTaiKhoan";
        
        try {
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            while (rs.next()) {
                PM pm = new PM();

                pm.setMaPM(rs.getString("maPhieuMuon"));
                pm.setMaTaiKhoan(rs.getString("tenNguoiDung"));
                pm.setSoNgayMuon(rs.getInt("soNgayMuon"));
                pm.setTrangThai(rs.getString("trangThai"));
            }
        } catch (SQLException e) {
        }

        return pmList;
    }
    
    public void addPhieuMuon(PM phieuMuon) {
        Connection connection = KetNoiSQL.getConnection();
            String sql = "INSERT INTO PhieuMuon VALUES (?, ?, ?, ?, ?, ?, ?)";
            try {           
                PreparedStatement preparedStatement = connection.prepareStatement(sql);
                preparedStatement.setString(1, phieuMuon.getMaPM());
                preparedStatement.setInt(2, phieuMuon.getSoNgayMuon());
                preparedStatement.setString(3, phieuMuon.getMaTaiKhoan());
                preparedStatement.setString(4, phieuMuon.getTrangThai());
                
                preparedStatement.executeUpdate();
            } catch (SQLException e) {
                e.printStackTrace();
            }
     
    }

    
    public void updatePhieuMuon(PM phieuMuon) {
        Connection connection = KetNoiSQL.getConnection();
        String sql = "UPDATE PhieuMuon SET trangThai = ?, ngayMuon = ? WHERE maPhieuMuon = ?";
        try {           
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, phieuMuon.getTrangThai());
            preparedStatement.setString(2, phieuMuon.getNgayMuon());
            preparedStatement.setString(3, phieuMuon.getMaPM());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            System.out.println("loi");
        }
    }
    
    public String getMaPMInserted() {
        Connection con = KetNoiSQL.getConnection();
        String sql = "select top 1 maPhieuMuon from PhieuMuon order by maPhieuMuon desc";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            rs.next();
            return rs.getString("maPhieuMuon");
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }    
}
