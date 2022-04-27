/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TTSach;

/**
 *
 * @author TechCare
 */
public class book {
    
    String tacgia,theloai,tensach,nhaxuatban;
    int masach,soluong;

    public book(){}

    public book(String tacgia, String theloai, String tensach, String nhaxuatban, int masach, int soluong) {
        this.tacgia = tacgia;
        this.theloai = theloai;
        this.tensach = tensach;
        this.nhaxuatban = nhaxuatban;
        this.masach = masach;
        this.soluong = soluong;
    }

    public book(String tacgia, String theloai, String tensach, String nhaxuatban, int soluong) {
        this.tacgia = tacgia;
        this.theloai = theloai;
        this.tensach = tensach;
        this.nhaxuatban = nhaxuatban;
        this.soluong = soluong;
    }

    public book(int masach) {
        this.masach = masach;
    }

    public String getTacgia() {
        return tacgia;
    }

    public void setTacgia(String tacgia) {
        this.tacgia = tacgia;
    }

    public String getTheloai() {
        return theloai;
    }

    public void setTheloai(String theloai) {
        this.theloai = theloai;
    }

    public String getTensach() {
        return tensach;
    }

    public void setTensach(String tensach) {
        this.tensach = tensach;
    }

    public String getNhaxuatban() {
        return nhaxuatban;
    }

    public void setNhaxuatban(String nhaxuatban) {
        this.nhaxuatban = nhaxuatban;
    }

    public int getMasach() {
        return masach;
    }

    public void setMasach(int masach) {
        this.masach = masach;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

   
    }