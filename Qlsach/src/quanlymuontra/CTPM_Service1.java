/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlymuontra;

import quanlymuontra.CTPM_DAO1;
import quanlymuontra.CTPM;
import java.util.List;

/**
 *
 * @author nguye
 */
public class CTPM_Service1 {
    private CTPM_DAO1 ctpmDAO;
    public CTPM_Service1() {
        ctpmDAO = new CTPM_DAO1();
    }
    
    public List<CTPM> getDSCHiTietPM(String maPhieuMuon) {
        return ctpmDAO.getDSCHiTietPM(maPhieuMuon);
    }
    
    public void updateChiTietPM(CTPM ctpm) {
        ctpmDAO.updateChiTietPM(ctpm);
    }
    
    public void insertChiTietPM(CTPM ctpm) {
        ctpmDAO.insertChiTietPM(ctpm);
    }
    
    public void deleteChiTietPM(String idPhieuMuon, String idSach) {
        ctpmDAO.deleteChiTietPM(idPhieuMuon, idSach);
    }
}
