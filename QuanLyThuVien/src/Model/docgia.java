/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author admin
 */
public class docgia {
    private int madocgia;
    private String tendocgia,sdt,email,diachi;
    public docgia(){}

    public docgia(int madocgia, String tendocgia, String sdt, String email, String diachi) {
        this.madocgia = madocgia;
        this.tendocgia = tendocgia;
        this.sdt = sdt;
        this.email = email;
        this.diachi = diachi;
    }

    public docgia(String tendocgia, String sdt, String email, String diachi) {
        this.tendocgia = tendocgia;
        this.sdt = sdt;
        this.email = email;
        this.diachi = diachi;
    }

    public int getMadocgia() {
        return madocgia;
    }

    public void setMadocgia(int madocgia) {
        this.madocgia = madocgia;
    }

    public String getTendocgia() {
        return tendocgia;
    }

    public void setTendocgia(String tendocgia) {
        this.tendocgia = tendocgia;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    
}
