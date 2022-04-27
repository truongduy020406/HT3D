/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlymuontra;

import quanlymuontra.PM_DAO1;
import quanlymuontra.PM;
import java.util.List;

/**
 *
 * @author nguye
 */
public class PM_Service1 {
    private PM_DAO1 pmDAO;
    public PM_Service1() {
        pmDAO = new PM_DAO1();
    }
    
    public List<PM> getAllDSPhieuMuon() {
        return pmDAO.getAllDSPhieuMuon();
    }
    
    public List<PM> getDSPhieuMuon() {
        return pmDAO.getDSPhieuMuon();
    }
    
    public void addPhieuMuon(PM phieuMuon) {
        pmDAO.addPhieuMuon(phieuMuon);
    }
    
    public void updatePhieuMuon(PM phieuMuon) {
        pmDAO.updatePhieuMuon(phieuMuon);
    }
    
    public String getMaPMInserted() {
        return pmDAO.getMaPMInserted();
    }
}
