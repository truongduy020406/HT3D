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
    private int maphieumuon_15;
    private String madocgiamuon_15,masachmuon_15,ngaymuon_15;
    public phieumuon(){}    

    public int getMaphieumuon_15() {
        return maphieumuon_15;
    }

    public void setMaphieumuon_15(int maphieumuon_15) {
        this.maphieumuon_15 = maphieumuon_15;
    }

    public String getMadocgiamuon_15() {
        return madocgiamuon_15;
    }

    public void setMadocgiamuon_15(String madocgiamuon_15) {
        this.madocgiamuon_15 = madocgiamuon_15;
    }

    public String getMasachmuon_15() {
        return masachmuon_15;
    }

    public void setMasachmuon_15(String masachmuon_15) {
        this.masachmuon_15 = masachmuon_15;
    }

    public String getNgaymuon_15() {
        return ngaymuon_15;
    }

    public void setNgaymuon_15(String ngaymuon_15) {
        this.ngaymuon_15 = ngaymuon_15;
    }
     public phieumuon(String madocgiamuon_15, String masachmuon_15, String ngaymuon_15) {
         this.madocgiamuon_15 = madocgiamuon_15;
        this.masachmuon_15 = masachmuon_15;
        this.ngaymuon_15 = ngaymuon_15;
    }
    
    public phieumuon(int maphieumuon_15,String madocgiamuon_15, String masachmuon_15, String ngaymuon_15) {
        this.maphieumuon_15 = maphieumuon_15;
         this.madocgiamuon_15 = madocgiamuon_15;
        this.masachmuon_15 = masachmuon_15;
        this.ngaymuon_15 = ngaymuon_15;
    }
}

