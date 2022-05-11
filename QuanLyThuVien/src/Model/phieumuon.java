/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author admin
 */
public class phieumuon {
    private int maphieumuon;
    private String madocgiamuon,masachmuon,ngaymuon;
    public phieumuon(){}    

    public int getMaphieumuon() {
        return maphieumuon;
    }

    public void setMaphieumuon(int maphieumuon) {
        this.maphieumuon = maphieumuon;
    }

    public String getMadocgiamuon() {
        return madocgiamuon;
    }

    public void setMadocgiamuon(String madocgiamuon) {
        this.madocgiamuon = madocgiamuon;
    }

    public String getMasachmuon() {
        return masachmuon;
    }

    public void setMasachmuon(String masachmuon) {
        this.masachmuon = masachmuon;
    }

    public String getNgaymuon() {
        return ngaymuon;
    }

    public void setNgaymuon(String ngaymuon) {
        this.ngaymuon = ngaymuon;
    }

    public phieumuon(String madocgiamuon, String masachmuon, String ngaymuon) {
        this.madocgiamuon = madocgiamuon;
        this.masachmuon = masachmuon;
        this.ngaymuon = ngaymuon;
    }

    public phieumuon(int maphieumuon, String madocgiamuon, String masachmuon, String ngaymuon) {
        this.maphieumuon = maphieumuon;
        this.madocgiamuon = madocgiamuon;
        this.masachmuon = masachmuon;
        this.ngaymuon = ngaymuon;
    }
}
