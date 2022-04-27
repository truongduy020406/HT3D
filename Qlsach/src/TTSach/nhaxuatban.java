/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TTSach;

/**
 *
 * @author TechCare
 */
public class nhaxuatban {
    int id;
    String name,diachi;
    public nhaxuatban(){}

    public nhaxuatban(int id, String name, String diachi) {
        this.id = id;
        this.name = name;
        this.diachi = diachi;
    }

    public nhaxuatban(String name, String diachi) {
        this.name = name;
        this.diachi = diachi;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    @Override
    public String toString() {
        return getName();

  }
 
    }

