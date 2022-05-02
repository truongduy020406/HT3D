
package thongke;

//import DAO.DocGia_Dao;
//import DAO.DocGia_Dao_implement;
import quanlymuontra.KetNoiSQL1;
//import DAO.Sach_Dao_implement;
//import DAO.Sach_dao_thuy;
import thongke.TK_DAO1;
import quanlymuontra.CTPM;
//import Model.Docgia;
import quanlymuontra.PM;
import thongke.Sach;
import quanlymuontra.CTPM_Service1;
import thongke.DMS_Service1;
import quanlymuontra.PM_Service1;
import thongke.Sach_Service1;
import java.awt.Font;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTextField;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import javax.swing.table.TableRowSorter;
/**
 *
 * @author KHP2T
 */
public class ThongKe extends javax.swing.JFrame {

    DefaultTableModel defaultTableModel_DM;
    DMS_Service1 dms_Service;
    DefaultTableModel defaultTableModel_S;
    Sach_Service1 s_Service;
    
    
    //DocGia_Dao accessDocGia = new DocGia_Dao_implement();
    //Sach_dao_thuy getSach = new Sach_Dao_implement();
    TK_DAO1 getThongke = new TK_DAO1();
    
    CTPM_Service1 ctpmsService;
    PM_Service1 pmsService;
    DefaultTableModel defaultTableModel_DSPM;
    DefaultTableModel defaultTableModel_CTPM;
    
    public Connection conn = KetNoiSQL1.getConnection();
    
    public ThongKe() {
        initComponents();
        //QuanLyPM
        pmsService = new PM_Service1();
        ctpmsService = new CTPM_Service1();
        defaultTableModel_DSPM = new DefaultTableModel(){
            @Override
            public boolean isCellEditable(int row, int column){
                return false;
            }
        };
        
        defaultTableModel_CTPM = new DefaultTableModel(){
            @Override
            public boolean isCellEditable(int row, int column){
                return false;
            }
        };
        loadData_TblDSPM();
        DesignTbl_DSPM();
        disable_CTPM();
        //Danh mục sách
        dms_Service = new DMS_Service1();
        defaultTableModel_DM = new DefaultTableModel(){
            @Override
            public boolean isCellEditable(int row, int column){
                return false;
            }
        };
        
        tbl_DMSach.setModel(defaultTableModel_DM);
        defaultTableModel_DM.addColumn("Mã danh mục");
        defaultTableModel_DM.addColumn("Tên danh mục");
        
        setTableData_DM(dms_Service.getDSDanhMucSach());
        
        DefaultTableCellRenderer renderer = (DefaultTableCellRenderer) tbl_DMSach.getTableHeader().getDefaultRenderer();
        renderer.setHorizontalAlignment(0);
        tbl_DMSach.getTableHeader().setFont(new Font("Times New Roman", Font.BOLD, 18));
        tbl_DMSach.setRowHeight(30);
        
        TableColumnModel columnModel = tbl_DMSach.getColumnModel();
        columnModel.getColumn(0).setPreferredWidth(170);
        columnModel.getColumn(1).setPreferredWidth(300);
        
        //Sách
        loadmaDanhMuc();
        loadmaTheLoai();
        disable_S();
        refresh();
        
        
        s_Service = new Sach_Service1();
        defaultTableModel_S = new DefaultTableModel(){
            @Override
            public boolean isCellEditable(int row, int column){
                return false;
            }
        };
        
        tblH_Sach.setModel(defaultTableModel_S);
        defaultTableModel_S.addColumn("Mã sách");
        defaultTableModel_S.addColumn("Tên sách");
        defaultTableModel_S.addColumn("Tác giả");
        defaultTableModel_S.addColumn("Nhà XB");
        defaultTableModel_S.addColumn("Năm XB");
        defaultTableModel_S.addColumn("SL");
        //defaultTableModel_S.addColumn("Ảnh");
        
        setTableData_S(s_Service.getDSSach());
        
        DefaultTableCellRenderer renderers = (DefaultTableCellRenderer) tblH_Sach.getTableHeader().getDefaultRenderer();
        renderers.setHorizontalAlignment(0);
        tblH_Sach.getTableHeader().setFont(new Font("Times New Roman", Font.BOLD, 20));
        tblH_Sach.setRowHeight(30);
        
        TableColumnModel columnModel1 = tblH_Sach.getColumnModel();
        columnModel1.getColumn(0).setPreferredWidth(150);
        columnModel1.getColumn(1).setPreferredWidth(350);
        columnModel1.getColumn(2).setPreferredWidth(150);
        columnModel1.getColumn(3).setPreferredWidth(150);
        columnModel1.getColumn(4).setPreferredWidth(170);
        columnModel1.getColumn(5).setPreferredWidth(250);
        columnModel1.getColumn(6).setPreferredWidth(120);
        //columnModel1.getColumn(9).setPreferredWidth(100);
              
        DefaultTableCellRenderer rendertks = (DefaultTableCellRenderer) tabletksach.getTableHeader().getDefaultRenderer();
        rendertks.setHorizontalAlignment(0);
        tabletksach.getTableHeader().setFont(new Font("Times New Roman", Font.BOLD, 20));
        tabletksach.setRowHeight(30);
        
    
        

    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        gioitinhbtngroup = new javax.swing.ButtonGroup();
        jPanel6 = new javax.swing.JPanel();
        jTabbedPane5 = new javax.swing.JTabbedPane();
        jPanel15 = new javax.swing.JPanel();
        jLabel33 = new javax.swing.JLabel();
        cbb_chucNangThongKe1 = new javax.swing.JComboBox<>();
        jScrollPane8 = new javax.swing.JScrollPane();
        tabletksach = new javax.swing.JTable();
        jPanel14 = new javax.swing.JPanel();
        jLabel32 = new javax.swing.JLabel();
        cbb_chucNangThongKe = new javax.swing.JComboBox<>();
        jScrollPane7 = new javax.swing.JScrollPane();
        tabletkbandoc = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Trang chủ dành cho Thủ thư");

        jPanel6.setBackground(new java.awt.Color(255, 204, 204));

        jTabbedPane5.setForeground(new java.awt.Color(255, 0, 0));
        jTabbedPane5.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N

        jPanel15.setBackground(new java.awt.Color(204, 204, 255));

        jLabel33.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(102, 102, 102));
        jLabel33.setText("Chọn nội dung thống kê:");

        cbb_chucNangThongKe1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        cbb_chucNangThongKe1.setForeground(new java.awt.Color(255, 0, 0));
        cbb_chucNangThongKe1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sách được mượn nhiều nhất theo ngày", "Tổng số sách đượn mượn theo từng tháng" }));
        cbb_chucNangThongKe1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbb_chucNangThongKe1ItemStateChanged(evt);
            }
        });

        tabletksach.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        tabletksach.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane8.setViewportView(tabletksach);

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addComponent(jLabel33)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbb_chucNangThongKe1, javax.swing.GroupLayout.PREFERRED_SIZE, 409, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 652, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(110, Short.MAX_VALUE))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap(84, Short.MAX_VALUE)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbb_chucNangThongKe1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(98, 98, 98))
        );

        jTabbedPane5.addTab("Thống Kê Sách", jPanel15);

        jPanel14.setBackground(new java.awt.Color(204, 204, 255));
        jPanel14.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        jLabel32.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(102, 102, 102));
        jLabel32.setText("Chọn nội dung cần thống kê:");

        cbb_chucNangThongKe.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        cbb_chucNangThongKe.setForeground(new java.awt.Color(255, 51, 51));
        cbb_chucNangThongKe.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bạn đọc chưa trả sách", "Bạn đọc mượn quá hạn", "Bạn đọc mượn nhiều nhất" }));
        cbb_chucNangThongKe.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbb_chucNangThongKeItemStateChanged(evt);
            }
        });

        tabletkbandoc.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        tabletkbandoc.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane7.setViewportView(tabletkbandoc);

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addComponent(jLabel32)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbb_chucNangThongKe, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 659, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(105, Short.MAX_VALUE))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbb_chucNangThongKe, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(80, Short.MAX_VALUE))
        );

        jTabbedPane5.addTab("Thông Kê Bạn Đọc", jPanel14);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane5)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane5, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cbb_chucNangThongKeItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbb_chucNangThongKeItemStateChanged

        try {
            int index = cbb_chucNangThongKe.getSelectedIndex();
            if (index == 0) {
                ResultSet chuatrasach = getThongke.chuatrasach();
                DefaultTableModel tkdg = (DefaultTableModel) tabletkbandoc.getModel();
                tkdg.setColumnCount(0);
                tkdg.addColumn("ma Tài Khoản");
                tkdg.addColumn("tên Tài Khoản");
                tkdg.setRowCount(0);
                while (chuatrasach.next()) {
                    tkdg.addRow(new Object[] {chuatrasach.getString(1), chuatrasach.getString(2)});
                }
            }
            if (index == 1 ) {
                ResultSet quahan = getThongke.quahantra();
                DefaultTableModel tkdg = (DefaultTableModel) tabletkbandoc.getModel();
                tkdg.setColumnCount(0);
                tkdg.addColumn("tên Tài Khoản");
                tkdg.addColumn("ngày mượn");
                tkdg.addColumn("số ngày mượn");
                tkdg.addColumn("ngày thực trả");
                tkdg.addColumn("số ngày quá hạn");

                tkdg.setRowCount(0);
                while (quahan.next()) {
                    tkdg.addRow(new Object[] {quahan.getString(1), quahan.getString(2),quahan.getInt(3),quahan.getString(4),quahan.getInt(5)});
                }
            }
            if (index == 2) {
                ResultSet quahan = getThongke.muonnhiunhat();
                DefaultTableModel tkdg = (DefaultTableModel) tabletkbandoc.getModel();
                tkdg.setColumnCount(0);
                tkdg.addColumn("tên Tài Khoản");
                tkdg.addColumn("số lần mượn");
                tkdg.setRowCount(0);
                while (quahan.next()) {
                    tkdg.addRow(new Object[] {quahan.getString(2),quahan.getInt(1)});
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(ThongKe.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_cbb_chucNangThongKeItemStateChanged

    private void cbb_chucNangThongKe1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbb_chucNangThongKe1ItemStateChanged

        try {
            int index = cbb_chucNangThongKe1.getSelectedIndex();
            if (index == 0) {
                ResultSet sachmuonnhiunhat = getThongke.sachdocnhiunhat();
                DefaultTableModel sach = (DefaultTableModel) tabletksach.getModel();
                sach.setColumnCount(0);
                sach.addColumn("Mã Sách");
                sach.addColumn("Tên Sách");
                sach.setRowCount(0);
                while (sachmuonnhiunhat.next()) {

                    sach.addRow(new Object[] {sachmuonnhiunhat.getString(2), sachmuonnhiunhat.getString(3),sachmuonnhiunhat.getInt(1), sachmuonnhiunhat.getString(4)});
                }
            }
            if (index == 1 ) {
                ResultSet quahan = getThongke.sachnhatthang();
                DefaultTableModel tkdg = (DefaultTableModel) tabletksach.getModel();
                tkdg.setColumnCount(0);
                tkdg.addColumn("Tháng");
                tkdg.addColumn("Số Sách Được Mượn");

                tkdg.setRowCount(0);
                while (quahan.next()) {
                    tkdg.addRow(new Object[] {quahan.getString(2), quahan.getInt(1)});
                }
            }

        } catch (SQLException ex) {
            Logger.getLogger(ThongKe.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_cbb_chucNangThongKe1ItemStateChanged
    private String cutChar(String arry){
            return arry.replaceAll("\\D+","");
        }
    
    private void K_ngayThucTraMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_K_ngayThucTraMousePressed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_K_ngayThucTraMousePressed

    private void K_ngayThucTraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_K_ngayThucTraMouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_K_ngayThucTraMouseClicked
    
    
    
    private void timkiem(String query){
           TableRowSorter<DefaultTableModel> tbl = new TableRowSorter<DefaultTableModel>(defaultTableModel_DM);
           tbl_DMSach.setRowSorter(tbl);
           tbl.setRowFilter(RowFilter.regexFilter(query));

    }
    
    private void setTableData_DSPM(List<PM> pms) {
        for(PM pm : pms) {
            defaultTableModel_DSPM.addRow(new Object[] {pm.getMaPM(), pm.getMaTaiKhoan(),
                            pm.getNgayMuon(), pm.getSoNgayMuon(),pm.getTrangThai()});
        }
    }
    
    private void setTableData_CTPM(List<CTPM> ctpms) {
        for(CTPM ctpm : ctpms) {
            defaultTableModel_CTPM.addRow(new Object[]{ctpm.getMaPM(), ctpm.getMaSach(), ctpm.getNgayThucTra(),
                            ctpm.getTinhTrangSach()});
        }
    }
    
    private void disable_CTPM() {
        K_maPM.setEnabled(false);
        K_ngayThucTra.setEnabled(false);
        K_maSach.setEnabled(false);
        K_tinhTrangSach.setEnabled(false);
//        K_tienPhat.setEnabled(false);
        
        btnK_suaChiTiet.setEnabled(false);
        btnK_luuChiTiet.setEnabled(false);
    }
    
    private void loadData_TblDSPM() {
        tblK_DSPM.setModel(defaultTableModel_DSPM);
        defaultTableModel_DSPM.addColumn("Mã phiếu mượn");
        defaultTableModel_DSPM.addColumn("Tên bạn đọc");
        defaultTableModel_DSPM.addColumn("Ngày mượn");
        defaultTableModel_DSPM.addColumn("Số ngày mượn");
        
        setTableData_DSPM(pmsService.getDSPhieuMuon());
    }
    
    private void loadData_TblCTPM() {
        tblK_ChiTiet.setModel(defaultTableModel_CTPM);
        defaultTableModel_CTPM.setColumnCount(0);
        defaultTableModel_CTPM.setRowCount(0);
        defaultTableModel_CTPM.addColumn("Mã Phiếu mượn");
        defaultTableModel_CTPM.addColumn("Mã sách");
        defaultTableModel_CTPM.addColumn("Ngày thực trả");
        defaultTableModel_CTPM.addColumn("Tình trạng sách");
        DesignTbl_CTPM();
        
        setTableData_CTPM(ctpmsService.getDSCHiTietPM(K_maPM.getText()));
    }
    
    private void DesignTbl_DSPM() {
        DefaultTableCellRenderer renderer = (DefaultTableCellRenderer) tblK_DSPM.getTableHeader().getDefaultRenderer();
        renderer.setHorizontalAlignment(0);
        tblK_DSPM.getTableHeader().setFont(new Font("Times New Roman", Font.BOLD, 18));
        tblK_DSPM.setRowHeight(30);
        
        TableColumnModel columnModel_DSPM = tblK_DSPM.getColumnModel();
        columnModel_DSPM.getColumn(0).setPreferredWidth(200);
        columnModel_DSPM.getColumn(1).setPreferredWidth(225);
        columnModel_DSPM.getColumn(2).setPreferredWidth(225);
        columnModel_DSPM.getColumn(3).setPreferredWidth(200);
        columnModel_DSPM.getColumn(4).setPreferredWidth(200);
        columnModel_DSPM.getColumn(5).setPreferredWidth(200);
        columnModel_DSPM.getColumn(6).setPreferredWidth(150);
    }
    
    private void DesignTbl_CTPM() {
        DefaultTableCellRenderer renderer = (DefaultTableCellRenderer) tblK_ChiTiet.getTableHeader().getDefaultRenderer();
        renderer.setHorizontalAlignment(0);
        tblK_ChiTiet.getTableHeader().setFont(new Font("Times New Roman", Font.BOLD, 18));
        tblK_ChiTiet.setRowHeight(30);
        
        TableColumnModel columnModel_DSPM = tblK_ChiTiet.getColumnModel();
        columnModel_DSPM.getColumn(0).setPreferredWidth(200);
        columnModel_DSPM.getColumn(1).setPreferredWidth(200);
        columnModel_DSPM.getColumn(2).setPreferredWidth(200);
        columnModel_DSPM.getColumn(3).setPreferredWidth(200);
        columnModel_DSPM.getColumn(4).setPreferredWidth(200);
    }
    
    private void Refresh_CTPM() {
        ((JTextField)K_ngayThucTra.getDateEditor().getUiComponent()).setText("");
//        K_tienPhat.setText("");
        K_ngayThucTra.setEnabled(false);
        K_tinhTrangSach.setEnabled(false);
//        K_tienPhat.setEnabled(false);
        btnK_suaChiTiet.setEnabled(false);
        btnK_luuChiTiet.setEnabled(false);
        K_maSach.setText("");
        loadData_TblCTPM();
    }
    public void setDSPM() {
        jTP_main.setSelectedIndex(2);
    }
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ThongKe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbb_chucNangThongKe;
    private javax.swing.JComboBox<String> cbb_chucNangThongKe1;
    private javax.swing.ButtonGroup gioitinhbtngroup;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JTabbedPane jTabbedPane5;
    private javax.swing.JTable tabletkbandoc;
    private javax.swing.JTable tabletksach;
    // End of variables declaration//GEN-END:variables
}
