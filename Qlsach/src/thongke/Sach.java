/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thongke;


public class Sach {
    private String maSach = "";
    private String tenSach;
    private String tacGia;
    private String NXB;
    private int namXuatBan;
    private int soLuongCon;


    public Sach() {
    }

    public String getMaSach() {
        return maSach;
    }

    public String getTenSach() {
        return tenSach;
    }

    public String getTacGia() {
        return tacGia;
    }

    public String getNXB() {
        return NXB;
    }

    public int getNamXuatBan() {
        return namXuatBan;
    }

    public int getSoLuongCon() {
        return soLuongCon;
    }

    public void setMaSach(String maSach) {
        this.maSach = maSach;
    }

    public void setTenSach(String tenSach) {
        this.tenSach = tenSach;
    }


    public void setTacGia(String tacGia) {
        this.tacGia = tacGia;
    }

    public void setNXB(String NXB) {
        this.NXB = NXB;
    }

    public void setNamXuatBan(int namXuatBan) {
        this.namXuatBan = namXuatBan;
    }

    public void setSoLuongCon(int soLuongCon) {
        this.soLuongCon = soLuongCon;
    }   
    
}
