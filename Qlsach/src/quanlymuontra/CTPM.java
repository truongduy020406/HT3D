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
public class CTPM {
    private String maPM = "";
    private String maSach = "";
    private String ngayThucTra = "";
    private String tinhTrangSach = "";
    
    public CTPM() {
        
    }
    
    public CTPM(String maPM, String maSach) {
        this.maPM = maPM;
        this.maSach = maSach;
    }

    public String getMaPM() {
        return maPM;
    }

    public String getMaSach() {
        return maSach;
    }

    public String getNgayThucTra() {
        return ngayThucTra;
    }

    public String getTinhTrangSach() {
        return tinhTrangSach;
    }

    public void setMaPM(String maPM) {
        this.maPM = maPM;
    }

    public void setMaSach(String maSach) {
        this.maSach = maSach;
    }

    public void setNgayThucTra(String ngayThucTra) {
        this.ngayThucTra = ngayThucTra;
    }

    public void setTinhTrangSach(String tinhTrangSach) {
        this.tinhTrangSach = tinhTrangSach;
    }
    
}
