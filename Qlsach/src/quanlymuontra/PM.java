/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlymuontra;

/**
 *
 * @author nguye
 */
public class PM {
    private String maPM = "";
    private String ngayMuon = "";
    private int soNgayMuon = 0;
    private String maTaiKhoan = "";
    private String trangThai = "Chưa trả";

    public PM() {
    }
    
    public PM(String maPM, String ngayMuon, int soNgayMuon, String maTaiKhoan) {
        this.maPM = maPM;
        this.ngayMuon = ngayMuon;
        this.soNgayMuon = soNgayMuon;
        this.maTaiKhoan = maTaiKhoan;
    }

    public String getMaPM() {
        return maPM;
    }

    public String getNgayMuon() {
        return ngayMuon;
    }

    public int getSoNgayMuon() {
        return soNgayMuon;
    }

    public String getMaTaiKhoan() {
        return maTaiKhoan;
    }

    public String getTrangThai() {
        return trangThai;
    }

    public void setMaPM(String maPM) {
        this.maPM = maPM;
    }

    public void setNgayMuon(String ngayMuon) {
        this.ngayMuon = ngayMuon;
    }

    public void setSoNgayMuon(int soNgayMuon) {
        this.soNgayMuon = soNgayMuon;
    }

    public void setMaTaiKhoan(String maTaiKhoan) {
        this.maTaiKhoan = maTaiKhoan;
    }

    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }
    
    
}
