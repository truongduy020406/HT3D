
package quanlymuontra;

import java.awt.Font;
import java.sql.Connection;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
/**
 *
 * @author KHP2T
 */
public class QuanLiPhieuMuon extends javax.swing.JFrame {

    DefaultTableModel defaultTableModel_DM;

    DefaultTableModel defaultTableModel_S;

    
    

    

    DefaultTableModel defaultTableModel_DSPM;
    DefaultTableModel defaultTableModel_CTPM;
    
    public Connection conn = KetNoiSQL1.getConnection();
    
    public QuanLiPhieuMuon() {
        initComponents();
        //QuanLyPM
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
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        gioitinhbtngroup = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jTPK_QuanLyPM = new javax.swing.JTabbedPane();
        Panel_DanhSachPM = new javax.swing.JPanel();
        jSPK_DSPM = new javax.swing.JScrollPane();
        tblK_DSPM = new javax.swing.JTable();
        btnK_themPM = new javax.swing.JButton();
        K_tieuDe = new javax.swing.JLabel();
        Panel_ChiTietPM = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        K_maPM = new javax.swing.JTextField();
        K_maSach = new javax.swing.JTextField();
        K_tinhTrangSach = new javax.swing.JComboBox<>();
        btnK_suaChiTiet = new javax.swing.JButton();
        btnK_luuChiTiet = new javax.swing.JButton();
        btnK_lamMoi = new javax.swing.JButton();
        jPanel13 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        tblK_ChiTiet = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Trang chủ dành cho Thủ thư");

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 26)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("QUẢN LÍ PHIẾU MƯỢN");

        jLabel36.setFont(new java.awt.Font("Times New Roman", 1, 26)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(0, 0, 0));
        jLabel36.setText(" TRƯỜNG ĐẠI HỌC SƯ PHẠM KỸ THUẬT - ĐẠI HỌC ĐÀ NẴNG");

        jLabel29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/logo-truong-250.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(jLabel29))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addComponent(jLabel36))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(325, 325, 325)
                        .addComponent(jLabel6)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addComponent(jLabel36)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel29)
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));

        jTPK_QuanLyPM.setForeground(new java.awt.Color(51, 0, 102));
        jTPK_QuanLyPM.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N

        Panel_DanhSachPM.setBackground(new java.awt.Color(255, 255, 204));
        Panel_DanhSachPM.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        tblK_DSPM.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        tblK_DSPM.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tblK_DSPM.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblK_DSPMMouseClicked(evt);
            }
        });
        jSPK_DSPM.setViewportView(tblK_DSPM);

        btnK_themPM.setBackground(new java.awt.Color(255, 204, 204));
        btnK_themPM.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnK_themPM.setForeground(new java.awt.Color(102, 102, 102));
        btnK_themPM.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/plus.png"))); // NOI18N
        btnK_themPM.setText("Thêm phiếu mượn");
        btnK_themPM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnK_themPMActionPerformed(evt);
            }
        });

        K_tieuDe.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        K_tieuDe.setForeground(new java.awt.Color(255, 0, 0));
        K_tieuDe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/bill.png"))); // NOI18N
        K_tieuDe.setText("DANH SÁCH PHIẾU MƯỢN");

        javax.swing.GroupLayout Panel_DanhSachPMLayout = new javax.swing.GroupLayout(Panel_DanhSachPM);
        Panel_DanhSachPM.setLayout(Panel_DanhSachPMLayout);
        Panel_DanhSachPMLayout.setHorizontalGroup(
            Panel_DanhSachPMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_DanhSachPMLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(Panel_DanhSachPMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel_DanhSachPMLayout.createSequentialGroup()
                        .addGroup(Panel_DanhSachPMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnK_themPM)
                            .addComponent(jSPK_DSPM, javax.swing.GroupLayout.PREFERRED_SIZE, 809, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(80, 80, 80))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel_DanhSachPMLayout.createSequentialGroup()
                        .addComponent(K_tieuDe)
                        .addGap(661, 661, 661))))
        );
        Panel_DanhSachPMLayout.setVerticalGroup(
            Panel_DanhSachPMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_DanhSachPMLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(K_tieuDe, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(btnK_themPM, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jSPK_DSPM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(185, Short.MAX_VALUE))
        );

        jTPK_QuanLyPM.addTab("Danh sách phiếu mượn", Panel_DanhSachPM);

        Panel_ChiTietPM.setBackground(new java.awt.Color(255, 255, 204));

        jPanel12.setBackground(new java.awt.Color(255, 255, 204));
        jPanel12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        jLabel26.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(102, 102, 102));
        jLabel26.setText("Mã phiếu mượn:");

        jLabel27.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(102, 102, 102));
        jLabel27.setText("Mã sách:");

        jLabel30.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(102, 102, 102));
        jLabel30.setText("Tình trạng sách:");

        K_maPM.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N

        K_maSach.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N

        K_tinhTrangSach.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        K_tinhTrangSach.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bình thường", "Mất", "Hư hỏng" }));
        K_tinhTrangSach.setSelectedIndex(-1);
        K_tinhTrangSach.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                K_tinhTrangSachItemStateChanged(evt);
            }
        });

        btnK_suaChiTiet.setBackground(new java.awt.Color(255, 204, 204));
        btnK_suaChiTiet.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        btnK_suaChiTiet.setForeground(new java.awt.Color(102, 102, 102));
        btnK_suaChiTiet.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/exchange1.png"))); // NOI18N
        btnK_suaChiTiet.setText("Sửa ");
        btnK_suaChiTiet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnK_suaChiTietActionPerformed(evt);
            }
        });

        btnK_luuChiTiet.setBackground(new java.awt.Color(255, 204, 204));
        btnK_luuChiTiet.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        btnK_luuChiTiet.setForeground(new java.awt.Color(102, 102, 102));
        btnK_luuChiTiet.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/luu.png"))); // NOI18N
        btnK_luuChiTiet.setText("Lưu ");
        btnK_luuChiTiet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnK_luuChiTietActionPerformed(evt);
            }
        });

        btnK_lamMoi.setBackground(new java.awt.Color(255, 204, 204));
        btnK_lamMoi.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        btnK_lamMoi.setForeground(new java.awt.Color(102, 102, 102));
        btnK_lamMoi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/eraser.png"))); // NOI18N
        btnK_lamMoi.setText("Xoá");
        btnK_lamMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnK_lamMoiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel26)
                    .addComponent(jLabel27))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(K_maPM, javax.swing.GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE)
                            .addComponent(K_maSach))
                        .addGap(31, 31, 31)
                        .addComponent(jLabel30)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(K_tinhTrangSach, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addComponent(btnK_suaChiTiet, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnK_luuChiTiet, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnK_lamMoi, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel26)
                            .addComponent(K_maPM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel27)
                            .addComponent(K_maSach, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel30)
                            .addComponent(K_tinhTrangSach, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(60, 60, 60)))
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnK_suaChiTiet, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnK_luuChiTiet, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnK_lamMoi, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
        );

        jPanel13.setBackground(new java.awt.Color(255, 255, 204));

        tblK_ChiTiet.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        tblK_ChiTiet.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tblK_ChiTiet.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblK_ChiTietMouseClicked(evt);
            }
        });
        jScrollPane6.setViewportView(tblK_ChiTiet);

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 852, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(63, Short.MAX_VALUE))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(113, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout Panel_ChiTietPMLayout = new javax.swing.GroupLayout(Panel_ChiTietPM);
        Panel_ChiTietPM.setLayout(Panel_ChiTietPMLayout);
        Panel_ChiTietPMLayout.setHorizontalGroup(
            Panel_ChiTietPMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        Panel_ChiTietPMLayout.setVerticalGroup(
            Panel_ChiTietPMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_ChiTietPMLayout.createSequentialGroup()
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTPK_QuanLyPM.addTab("Chi tiết phiếu mượn", Panel_ChiTietPM);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTPK_QuanLyPM)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTPK_QuanLyPM, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void K_tinhTrangSachItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_K_tinhTrangSachItemStateChanged
//        if(K_tinhTrangSach.getSelectedItem().equals("Bình thường")) {
//            K_tienPhat.setText("0");
//        } else if(K_tinhTrangSach.getSelectedItem().equals("Mất sách")){
//            K_tienPhat.setText("20000");
//        } else if(K_tinhTrangSach.getSelectedItem().equals("Hư hỏng")){
//            K_tienPhat.setText("10000");
//        }else if(K_tinhTrangSach.getSelectedItem().equals("Trễ hạn")){
//            //int để tìm số ngày quá hạn 
//            int tienPhat = getSoNgayTre(K_maPM.getText(), K_maSach.getText(), new java.sql.Date(K_ngayThucTra.getDate().getTime()).toString()) * 10000;
//            K_tienPhat.setText(String.valueOf(tienPhat));
//            System.out.println("" + new java.sql.Date(K_ngayThucTra.getDate().getTime()).toString());
//        }
//        else
//            K_tienPhat.setText("");
    }//GEN-LAST:event_K_tinhTrangSachItemStateChanged

    private void tblK_DSPMMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblK_DSPMMouseClicked
        // TODO add your handling code here:
        jTPK_QuanLyPM.setSelectedIndex(1);
        int selectedRow = tblK_DSPM.getSelectedRow();
        K_maPM.setText(tblK_DSPM.getValueAt(selectedRow, 0).toString());
        loadData_TblCTPM();
        
    }//GEN-LAST:event_tblK_DSPMMouseClicked

    private void tblK_ChiTietMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblK_ChiTietMouseClicked
      
    }//GEN-LAST:event_tblK_ChiTietMouseClicked

    private void btnK_suaChiTietActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnK_suaChiTietActionPerformed
     
    }//GEN-LAST:event_btnK_suaChiTietActionPerformed

    private void btnK_luuChiTietActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnK_luuChiTietActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_btnK_luuChiTietActionPerformed

    private void btnK_lamMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnK_lamMoiActionPerformed
        // TODO add your handling code here:
//        btnK_suaChiTiet.setEnabled(false);
//        ((JTextField)K_ngayThucTra.getDateEditor().getUiComponent()).setText("");
//        K_tienPhat.setText("");
//        K_ngayThucTra.setEnabled(false);
//        K_tinhTrangSach.setEnabled(false);
//        K_tienPhat.setEnabled(false);
 
    }//GEN-LAST:event_btnK_lamMoiActionPerformed

    private void btnK_themPMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnK_themPMActionPerformed
        // TODO add your handling code here:
        QuanLiPhieuMuon qlPM = new QuanLiPhieuMuon();
        qlPM.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnK_themPMActionPerformed
    private String cutChar(String arry){
            return arry.replaceAll("\\D+","");
        }
    
    private void K_ngayThucTraMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_K_ngayThucTraMousePressed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_K_ngayThucTraMousePressed

    private void K_ngayThucTraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_K_ngayThucTraMouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_K_ngayThucTraMouseClicked
    
    
   
    

    
    private void disable_CTPM() {
        K_maPM.setEnabled(false);

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
        defaultTableModel_DSPM.addColumn("Tên cán bộ");
        defaultTableModel_DSPM.addColumn("Ngày mượn");
        defaultTableModel_DSPM.addColumn("Số ngày mượn");
        defaultTableModel_DSPM.addColumn("Ghi chú");
        defaultTableModel_DSPM.addColumn("Trạng thái");
        

    }
    
    private void loadData_TblCTPM() {
        tblK_ChiTiet.setModel(defaultTableModel_CTPM);
        defaultTableModel_CTPM.setColumnCount(0);
        defaultTableModel_CTPM.setRowCount(0);
        defaultTableModel_CTPM.addColumn("Mã Phiếu mượn");
        defaultTableModel_CTPM.addColumn("Mã sách");
        defaultTableModel_CTPM.addColumn("Ngày thực trả");
        defaultTableModel_CTPM.addColumn("Tình trạng sách");
        defaultTableModel_CTPM.addColumn("Tiền phạt");
        DesignTbl_CTPM();
        

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
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QuanLiPhieuMuon().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField K_maPM;
    private javax.swing.JTextField K_maSach;
    private javax.swing.JLabel K_tieuDe;
    private javax.swing.JComboBox<String> K_tinhTrangSach;
    private javax.swing.JPanel Panel_ChiTietPM;
    private javax.swing.JPanel Panel_DanhSachPM;
    private javax.swing.JButton btnK_lamMoi;
    private javax.swing.JButton btnK_luuChiTiet;
    private javax.swing.JButton btnK_suaChiTiet;
    private javax.swing.JButton btnK_themPM;
    private javax.swing.ButtonGroup gioitinhbtngroup;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jSPK_DSPM;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTabbedPane jTPK_QuanLyPM;
    private javax.swing.JTable tblK_ChiTiet;
    private javax.swing.JTable tblK_DSPM;
    // End of variables declaration//GEN-END:variables
}
