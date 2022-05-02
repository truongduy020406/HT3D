/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thongke;

import thongke.DMS_DAO1;
import thongke.DMS;
import java.util.List;
import javax.swing.JOptionPane;


public class DMS_Service1 {
     private DMS_DAO1 dmsDAO;
    public DMS_Service1(){
        dmsDAO = new DMS_DAO1();
    }
    
    public List<DMS> getDSDanhMucSach(){
        return dmsDAO.getDSDanhMucSach();
    }
    
    public boolean checkMaDM(String maDM){
        return dmsDAO.checkMaDM(maDM);
    }
    
    public void addDanhMucSach(DMS danhmuc, String maDM){
        if(!dmsDAO.checkMaDM(maDM)){
            dmsDAO.addDanhMucSach(danhmuc);
            JOptionPane.showMessageDialog(null, "Đã thêm thành công!");
        }else{
            JOptionPane.showMessageDialog(null, "Không thể thêm vì trùng mã danh mục!");
        }
    }
    
    public void updateDanhMucSach(DMS danhmuc){
        dmsDAO.updateDanhMucSach(danhmuc);
//        JOptionPane.showMessageDialog(null, "Đã sửa thành công!");
    }

}
