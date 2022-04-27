package quanlymuontra;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
public class ThemPhieuMuon extends javax.swing.JFrame {
    DefaultTableModel defaultTableModel;
    DefaultTableModel defaultTableModel1_CTPM;
    public Connection conn = KetNoiSQL1.getConnection();
    public ThemPhieuMuon() {
        initComponents();
        defaultTableModel = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        tblK_kq.setModel(defaultTableModel);
        loadData_TblDSPM();
        Disable();
        cbbK_maPM.removeAllItems();
        loadMaPM();
        defaultTableModel1_CTPM = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        tblK_CTPM.setModel(defaultTableModel1_CTPM);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPK_tieuDe = new javax.swing.JPanel();
        lbK_tieuDe = new javax.swing.JLabel();
        btnK_veTrangTruoc = new javax.swing.JButton();
        jPK_qlPM = new javax.swing.JPanel();
        jPK_themPM = new javax.swing.JPanel();
        lbK_maPM1 = new javax.swing.JLabel();
        txtK_maPM_1 = new javax.swing.JTextField();
        lbL_maTK = new javax.swing.JLabel();
        txtK_maTK = new javax.swing.JTextField();
        lbK_soNgayMuon = new javax.swing.JLabel();
        cbbK_soNgayMuon = new javax.swing.JComboBox<>();
        lbK_trangThai = new javax.swing.JLabel();
        cbbK_trangThai = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jPK_button = new javax.swing.JPanel();
        jPK_btnQLS = new javax.swing.JPanel();
        btnK_themMaSach = new javax.swing.JButton();
        btnK_lamMoiSach = new javax.swing.JButton();
        btnK_luuMaSach = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblK_kq = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblK_CTPM = new javax.swing.JTable();
        jPK_btnQLPM = new javax.swing.JPanel();
        btnK_themPM = new javax.swing.JButton();
        btnK_lamMoiPM = new javax.swing.JButton();
        btnK_luuPM = new javax.swing.JButton();
        jPK_themMaSach = new javax.swing.JPanel();
        txtK_maPM_2 = new javax.swing.JTextField();
        lbK_maPM2 = new javax.swing.JLabel();
        txtK_maSach = new javax.swing.JTextField();
        lbK_maSach = new javax.swing.JLabel();
        lbK_maPM3 = new javax.swing.JLabel();
        cbbK_maPM = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 204));

        jPK_tieuDe.setBackground(new java.awt.Color(204, 204, 255));

        lbK_tieuDe.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        lbK_tieuDe.setForeground(java.awt.Color.darkGray);
        lbK_tieuDe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/bill.png"))); // NOI18N
        lbK_tieuDe.setText("QUẢN LÝ PHIẾU MƯỢN");

        btnK_veTrangTruoc.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnK_veTrangTruoc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icon_previous.png"))); // NOI18N
        btnK_veTrangTruoc.setText("Quay lại");
        btnK_veTrangTruoc.setToolTipText("");
        btnK_veTrangTruoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnK_veTrangTruocActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPK_tieuDeLayout = new javax.swing.GroupLayout(jPK_tieuDe);
        jPK_tieuDe.setLayout(jPK_tieuDeLayout);
        jPK_tieuDeLayout.setHorizontalGroup(
            jPK_tieuDeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPK_tieuDeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnK_veTrangTruoc)
                .addGap(337, 337, 337)
                .addComponent(lbK_tieuDe)
                .addContainerGap(328, Short.MAX_VALUE))
        );
        jPK_tieuDeLayout.setVerticalGroup(
            jPK_tieuDeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPK_tieuDeLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPK_tieuDeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbK_tieuDe, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                    .addComponent(btnK_veTrangTruoc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPK_qlPM.setBackground(new java.awt.Color(204, 204, 204));

        jPK_themPM.setBackground(new java.awt.Color(204, 204, 255));
        jPK_themPM.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lbK_maPM1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lbK_maPM1.setForeground(new java.awt.Color(102, 102, 102));
        lbK_maPM1.setText("Mã phiếu mượn:");

        txtK_maPM_1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        lbL_maTK.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lbL_maTK.setForeground(new java.awt.Color(102, 102, 102));
        lbL_maTK.setText("Mã tài khoản:");

        txtK_maTK.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txtK_maTK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtK_maTKActionPerformed(evt);
            }
        });

        lbK_soNgayMuon.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lbK_soNgayMuon.setForeground(new java.awt.Color(102, 102, 102));
        lbK_soNgayMuon.setText("Số ngày mượn:");

        cbbK_soNgayMuon.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        cbbK_soNgayMuon.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "7", "14", "21" }));

        lbK_trangThai.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lbK_trangThai.setForeground(new java.awt.Color(102, 102, 102));
        lbK_trangThai.setText("Trạng thái:");

        cbbK_trangThai.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        cbbK_trangThai.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Chưa trả", "Đã trả", "Chưa duyệt", " " }));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setText("ĐỌC GIẢ");

        javax.swing.GroupLayout jPK_themPMLayout = new javax.swing.GroupLayout(jPK_themPM);
        jPK_themPM.setLayout(jPK_themPMLayout);
        jPK_themPMLayout.setHorizontalGroup(
            jPK_themPMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPK_themPMLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPK_themPMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbK_maPM1)
                    .addComponent(lbK_soNgayMuon, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbK_trangThai, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbL_maTK, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPK_themPMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtK_maPM_1, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtK_maTK, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbbK_soNgayMuon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbbK_trangThai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPK_themPMLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPK_themPMLayout.setVerticalGroup(
            jPK_themPMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPK_themPMLayout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPK_themPMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtK_maPM_1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbK_maPM1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPK_themPMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                    .addComponent(lbK_soNgayMuon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cbbK_soNgayMuon))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPK_themPMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbK_trangThai, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbbK_trangThai))
                .addGap(18, 18, 18)
                .addGroup(jPK_themPMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbL_maTK)
                    .addComponent(txtK_maTK, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jPK_button.setBackground(new java.awt.Color(255, 255, 204));

        javax.swing.GroupLayout jPK_buttonLayout = new javax.swing.GroupLayout(jPK_button);
        jPK_button.setLayout(jPK_buttonLayout);
        jPK_buttonLayout.setHorizontalGroup(
            jPK_buttonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPK_buttonLayout.setVerticalGroup(
            jPK_buttonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 443, Short.MAX_VALUE)
        );

        jPK_btnQLS.setBackground(new java.awt.Color(204, 204, 255));
        jPK_btnQLS.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPK_btnQLS.setForeground(new java.awt.Color(102, 102, 102));
        jPK_btnQLS.setPreferredSize(new java.awt.Dimension(540, 84));

        btnK_themMaSach.setBackground(new java.awt.Color(255, 204, 204));
        btnK_themMaSach.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        btnK_themMaSach.setForeground(new java.awt.Color(102, 102, 102));
        btnK_themMaSach.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/them.png"))); // NOI18N
        btnK_themMaSach.setText("Thêm");
        btnK_themMaSach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnK_themMaSachActionPerformed(evt);
            }
        });

        btnK_lamMoiSach.setBackground(new java.awt.Color(255, 204, 204));
        btnK_lamMoiSach.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        btnK_lamMoiSach.setForeground(new java.awt.Color(102, 102, 102));
        btnK_lamMoiSach.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/eraser.png"))); // NOI18N
        btnK_lamMoiSach.setText("Xoá");
        btnK_lamMoiSach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnK_lamMoiSachActionPerformed(evt);
            }
        });

        btnK_luuMaSach.setBackground(new java.awt.Color(255, 204, 204));
        btnK_luuMaSach.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        btnK_luuMaSach.setForeground(new java.awt.Color(102, 102, 102));
        btnK_luuMaSach.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/luu.png"))); // NOI18N
        btnK_luuMaSach.setText("Lưu");
        btnK_luuMaSach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnK_luuMaSachActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPK_btnQLSLayout = new javax.swing.GroupLayout(jPK_btnQLS);
        jPK_btnQLS.setLayout(jPK_btnQLSLayout);
        jPK_btnQLSLayout.setHorizontalGroup(
            jPK_btnQLSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPK_btnQLSLayout.createSequentialGroup()
                .addContainerGap(127, Short.MAX_VALUE)
                .addComponent(btnK_themMaSach)
                .addGap(18, 18, 18)
                .addComponent(btnK_luuMaSach)
                .addGap(18, 18, 18)
                .addComponent(btnK_lamMoiSach)
                .addGap(164, 164, 164))
        );
        jPK_btnQLSLayout.setVerticalGroup(
            jPK_btnQLSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPK_btnQLSLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPK_btnQLSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnK_luuMaSach)
                    .addComponent(btnK_lamMoiSach)
                    .addComponent(btnK_themMaSach))
                .addContainerGap())
        );

        jScrollPane2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        tblK_kq.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tblK_kq.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblK_kqMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblK_kq);

        jScrollPane1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jScrollPane1.setPreferredSize(new java.awt.Dimension(540, 402));
        jScrollPane1.setRequestFocusEnabled(false);

        tblK_CTPM.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tblK_CTPM.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblK_CTPMMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblK_CTPM);

        jPK_btnQLPM.setBackground(new java.awt.Color(204, 204, 255));
        jPK_btnQLPM.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPK_btnQLPM.setPreferredSize(new java.awt.Dimension(520, 84));

        btnK_themPM.setBackground(new java.awt.Color(255, 204, 204));
        btnK_themPM.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        btnK_themPM.setForeground(new java.awt.Color(102, 102, 102));
        btnK_themPM.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/plus.png"))); // NOI18N
        btnK_themPM.setText("Thêm");
        btnK_themPM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnK_themPMActionPerformed(evt);
            }
        });

        btnK_lamMoiPM.setBackground(new java.awt.Color(255, 204, 204));
        btnK_lamMoiPM.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        btnK_lamMoiPM.setForeground(new java.awt.Color(102, 102, 102));
        btnK_lamMoiPM.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/eraser.png"))); // NOI18N
        btnK_lamMoiPM.setText("Xoá");
        btnK_lamMoiPM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnK_lamMoiPMActionPerformed(evt);
            }
        });

        btnK_luuPM.setBackground(new java.awt.Color(255, 204, 204));
        btnK_luuPM.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        btnK_luuPM.setForeground(new java.awt.Color(102, 102, 102));
        btnK_luuPM.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/luu.png"))); // NOI18N
        btnK_luuPM.setText("Lưu");
        btnK_luuPM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnK_luuPMActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPK_btnQLPMLayout = new javax.swing.GroupLayout(jPK_btnQLPM);
        jPK_btnQLPM.setLayout(jPK_btnQLPMLayout);
        jPK_btnQLPMLayout.setHorizontalGroup(
            jPK_btnQLPMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPK_btnQLPMLayout.createSequentialGroup()
                .addContainerGap(111, Short.MAX_VALUE)
                .addComponent(btnK_themPM)
                .addGap(18, 18, 18)
                .addComponent(btnK_luuPM)
                .addGap(18, 18, 18)
                .addComponent(btnK_lamMoiPM)
                .addGap(180, 180, 180))
        );
        jPK_btnQLPMLayout.setVerticalGroup(
            jPK_btnQLPMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPK_btnQLPMLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPK_btnQLPMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                    .addComponent(btnK_luuPM, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnK_lamMoiPM)
                    .addComponent(btnK_themPM, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        jPK_themMaSach.setBackground(new java.awt.Color(204, 204, 255));
        jPK_themMaSach.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtK_maPM_2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txtK_maPM_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtK_maPM_2ActionPerformed(evt);
            }
        });

        lbK_maPM2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lbK_maPM2.setForeground(new java.awt.Color(102, 102, 102));
        lbK_maPM2.setText("Mã phiếu mượn:");

        txtK_maSach.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        lbK_maSach.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lbK_maSach.setForeground(new java.awt.Color(102, 102, 102));
        lbK_maSach.setText("Mã sách:");

        lbK_maPM3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lbK_maPM3.setForeground(new java.awt.Color(102, 102, 102));
        lbK_maPM3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/open-book.png"))); // NOI18N
        lbK_maPM3.setText("Mã phiếu mượn:");

        cbbK_maPM.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        cbbK_maPM.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbbK_maPMItemStateChanged(evt);
            }
        });
        cbbK_maPM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbbK_maPMActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("SÁCH");

        javax.swing.GroupLayout jPK_themMaSachLayout = new javax.swing.GroupLayout(jPK_themMaSach);
        jPK_themMaSach.setLayout(jPK_themMaSachLayout);
        jPK_themMaSachLayout.setHorizontalGroup(
            jPK_themMaSachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPK_themMaSachLayout.createSequentialGroup()
                .addContainerGap(87, Short.MAX_VALUE)
                .addGroup(jPK_themMaSachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPK_themMaSachLayout.createSequentialGroup()
                        .addComponent(lbK_maSach)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtK_maSach, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPK_themMaSachLayout.createSequentialGroup()
                        .addComponent(lbK_maPM2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtK_maPM_2, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPK_themMaSachLayout.createSequentialGroup()
                        .addComponent(lbK_maPM3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbbK_maPM, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(158, 158, 158))
            .addGroup(jPK_themMaSachLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPK_themMaSachLayout.setVerticalGroup(
            jPK_themMaSachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPK_themMaSachLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPK_themMaSachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbK_maPM3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbbK_maPM, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPK_themMaSachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtK_maPM_2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbK_maPM2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPK_themMaSachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbK_maSach, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtK_maSach, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPK_qlPMLayout = new javax.swing.GroupLayout(jPK_qlPM);
        jPK_qlPM.setLayout(jPK_qlPMLayout);
        jPK_qlPMLayout.setHorizontalGroup(
            jPK_qlPMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPK_qlPMLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPK_qlPMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPK_qlPMLayout.createSequentialGroup()
                        .addGroup(jPK_qlPMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPK_themPM, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPK_btnQLPM, javax.swing.GroupLayout.DEFAULT_SIZE, 553, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPK_qlPMLayout.createSequentialGroup()
                        .addGroup(jPK_qlPMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPK_themMaSach, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPK_btnQLS, javax.swing.GroupLayout.PREFERRED_SIZE, 553, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(419, 419, 419)
                .addComponent(jPK_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPK_qlPMLayout.setVerticalGroup(
            jPK_qlPMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPK_qlPMLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPK_qlPMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPK_button, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPK_qlPMLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(jPK_qlPMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPK_qlPMLayout.createSequentialGroup()
                                .addComponent(jPK_themPM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPK_btnQLPM, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addGap(31, 31, 31)
                        .addGroup(jPK_qlPMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPK_qlPMLayout.createSequentialGroup()
                                .addComponent(jPK_themMaSach, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPK_btnQLS, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPK_tieuDe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPK_qlPM, javax.swing.GroupLayout.PREFERRED_SIZE, 1045, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPK_tieuDe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPK_qlPM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnK_themPMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnK_themPMActionPerformed
        // TODO add your handling code here:
        txtK_maTK.setEnabled(true);
        cbbK_soNgayMuon.setEnabled(true);
        cbbK_trangThai.setEnabled(true);
        btnK_themPM.setEnabled(false);
        btnK_luuPM.setEnabled(true);
    }//GEN-LAST:event_btnK_themPMActionPerformed

    private void btnK_luuPMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnK_luuPMActionPerformed
        // TODO add your handling code here:
        if (txtK_maPM_1.getText().compareTo("") == 0) {
            if (txtK_maTK.getText().equals("")) {
                JOptionPane.showMessageDialog(rootPane, "Vui lòng nhập mã TK!");
            } else {
                if (checkSoLuongMuon(txtK_maTK.getText()) == true) {
                    loadData_TblDSPM();
                    refreshPM();
                } else {
                    JOptionPane.showMessageDialog(rootPane, "Bạn đã mượn tối đa 3 cuốn sách!");
                }
            }
        } else if (txtK_maPM_1.getText().compareTo("") != 0) {
            loadData_TblDSPM();
            refreshPM();
        }
    }//GEN-LAST:event_btnK_luuPMActionPerformed

    private void tblK_kqMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblK_kqMouseClicked
        // TODO add your handling code here:
        int selectedRow = tblK_kq.getSelectedRow();
        txtK_maPM_1.setText(tblK_kq.getValueAt(selectedRow, 0).toString());
        loadMaTKwithName(tblK_kq.getValueAt(selectedRow, 1).toString());              
        cbbK_soNgayMuon.setSelectedItem(tblK_kq.getValueAt(selectedRow, 4).toString());
        cbbK_trangThai.setSelectedItem(tblK_kq.getValueAt(selectedRow, 5).toString());
        btnK_luuPM.setEnabled(false);
        btnK_themPM.setEnabled(false);
        cbbK_trangThai.setEnabled(false);
    }//GEN-LAST:event_tblK_kqMouseClicked

    private void btnK_lamMoiPMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnK_lamMoiPMActionPerformed
        // TODO add your handling code here:
        refreshPM();
        loadData_TblDSPM();
    }//GEN-LAST:event_btnK_lamMoiPMActionPerformed

    private void btnK_themMaSachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnK_themMaSachActionPerformed
        // TODO add your handling code here:
//        loadData_TblCTPM();
        txtK_maPM_2.setText(cbbK_maPM.getSelectedItem().toString());
        txtK_maSach.setEnabled(true);
        btnK_themMaSach.setEnabled(false);
        btnK_luuMaSach.setEnabled(true);
        btnK_lamMoiSach.setEnabled(true);
    }//GEN-LAST:event_btnK_themMaSachActionPerformed

    private void cbbK_maPMItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbbK_maPMItemStateChanged
        // TODO add your handling code here:
        btnK_themMaSach.setEnabled(true);
        try {
            loadData_TblCTPM();
        } catch (Exception e) {
        }
    }//GEN-LAST:event_cbbK_maPMItemStateChanged

    private void btnK_luuMaSachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnK_luuMaSachActionPerformed
        // TODO add your handling code here:
        if (checkSoLuongMuonWithMaPM(txtK_maPM_2.getText()) == true) {
            loadData_TblCTPM();
            txtK_maSach.setText("");
        } else {
            JOptionPane.showMessageDialog(rootPane, "Bạn đã mượn tối đa 3 cuốn sách");
        }
    }//GEN-LAST:event_btnK_luuMaSachActionPerformed

    private void btnK_lamMoiSachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnK_lamMoiSachActionPerformed
        // TODO add your handling code here:
        btnK_luuMaSach.setEnabled(false);
        btnK_themMaSach.setEnabled(true);
        txtK_maSach.setEnabled(false);
        defaultTableModel1_CTPM.setColumnCount(0);
        defaultTableModel1_CTPM.setRowCount(0);
    }//GEN-LAST:event_btnK_lamMoiSachActionPerformed

    private void btnK_veTrangTruocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnK_veTrangTruocActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        QuanLiPhieuMuon trangChuThuThu = new QuanLiPhieuMuon();
        trangChuThuThu.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnK_veTrangTruocActionPerformed

    private void cbbK_maPMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbbK_maPMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbbK_maPMActionPerformed

    private void tblK_CTPMMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblK_CTPMMouseClicked
        // TODO add your handling code here:
        int selectedRow = tblK_CTPM.getSelectedRow();
        txtK_maPM_2.setText(tblK_CTPM.getValueAt(selectedRow, 0).toString());
        txtK_maSach.setText(tblK_CTPM.getValueAt(selectedRow, 1).toString());
        btnK_themMaSach.setEnabled(false);
        btnK_luuMaSach.setEnabled(false);
        txtK_maPM_2.setEnabled(false);
        txtK_maSach.setEnabled(false);
    }//GEN-LAST:event_tblK_CTPMMouseClicked

    private void txtK_maTKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtK_maTKActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtK_maTKActionPerformed

    private void txtK_maPM_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtK_maPM_2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtK_maPM_2ActionPerformed

    private void Disable() {
        txtK_maPM_1.setEnabled(false);
        txtK_maTK.setEnabled(false);
        cbbK_soNgayMuon.setEnabled(false);
        cbbK_trangThai.setEnabled(false);
        btnK_luuPM.setEnabled(false);

        txtK_maPM_2.setEnabled(false);
        txtK_maSach.setEnabled(false);
        btnK_lamMoiSach.setEnabled(false);
        btnK_themMaSach.setEnabled(false);
        btnK_luuMaSach.setEnabled(false);
    }

    private void refreshPM() {
        Disable();
        btnK_themPM.setEnabled(true);
        txtK_maPM_1.setText("");
        txtK_maTK.setText("");
        cbbK_maPM.removeAllItems();
        loadMaPM();
    }

    private void loadData_TblDSPM() {
        defaultTableModel.setColumnCount(0);
        defaultTableModel.setRowCount(0);
        defaultTableModel.addColumn("Mã phiếu mượn");
        defaultTableModel.addColumn("Tên bạn đọc");
        defaultTableModel.addColumn("Mã cán bộ");
        defaultTableModel.addColumn("Ngày mượn");
        defaultTableModel.addColumn("Số ngày mượn");
        defaultTableModel.addColumn("Ghi chú");
        defaultTableModel.addColumn("Trạng thái");
    }
    private void loadData_TblCTPM() {
        defaultTableModel1_CTPM.setColumnCount(0);
        defaultTableModel1_CTPM.setRowCount(0);
        defaultTableModel1_CTPM.addColumn("Mã Phiếu mượn");
        defaultTableModel1_CTPM.addColumn("Mã sách");
    }

    private void loadMaTKwithName(String name) {
        String sql = "SELECT maTaiKhoan FROM TaiKhoan WHERE tenNguoiDung like N'%" + name + "%'";
        try {
            Statement statement = conn.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            while (rs.next()) {
                this.txtK_maTK.setText(rs.getString("maTaiKhoan"));
            }
        } catch (Exception e) {
        }
    }
    private boolean checkSoLuongMuon(String maTK) {
        String sql = "SELECT soLuongMuon FROM TaiKhoan WHERE maTaiKhoan like '%" + maTK + "%'";
        try {
            Statement statement = conn.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            while (rs.next()) {
                int result = Integer.parseInt(rs.getString("soLuongMuon"));
                if (result == 3) {
                    return false;
                }
            }
        } catch (Exception e) {
        }
        return true;
    }
    private boolean checkSoLuongMuonWithMaPM(String maPM) {
        String sql = "select soLuongMuon from PhieuMuon, TaiKhoan where PhieuMuon.maTaiKhoan = TaiKhoan.maTaiKhoan and maPhieuMuon like '%" + maPM + "%'";
        try {
            Statement statement = conn.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            while (rs.next()) {
                int result = Integer.parseInt(rs.getString("soLuongMuon"));
                if (result == 3) {
                    return false;
                }
            }
        } catch (Exception e) {

        }
        return true;
    }
    private void loadMaPM() {
        String sql = "SELECT maPhieuMuon FROM PhieuMuon ORDER BY maPhieuMuon DESC";
        try {
            Statement statement = conn.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            while (rs.next()) {
                this.cbbK_maPM.addItem(rs.getString("maPhieuMuon"));
            }
        } catch (Exception e) {

        }
    }
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(QuanLiPhieuMuon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QuanLiPhieuMuon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QuanLiPhieuMuon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QuanLiPhieuMuon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QuanLiPhieuMuon().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnK_lamMoiPM;
    private javax.swing.JButton btnK_lamMoiSach;
    private javax.swing.JButton btnK_luuMaSach;
    private javax.swing.JButton btnK_luuPM;
    private javax.swing.JButton btnK_themMaSach;
    private javax.swing.JButton btnK_themPM;
    private javax.swing.JButton btnK_veTrangTruoc;
    private javax.swing.JComboBox<String> cbbK_maPM;
    private javax.swing.JComboBox<String> cbbK_soNgayMuon;
    private javax.swing.JComboBox<String> cbbK_trangThai;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPK_btnQLPM;
    private javax.swing.JPanel jPK_btnQLS;
    private javax.swing.JPanel jPK_button;
    private javax.swing.JPanel jPK_qlPM;
    private javax.swing.JPanel jPK_themMaSach;
    private javax.swing.JPanel jPK_themPM;
    private javax.swing.JPanel jPK_tieuDe;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbK_maPM1;
    private javax.swing.JLabel lbK_maPM2;
    private javax.swing.JLabel lbK_maPM3;
    private javax.swing.JLabel lbK_maSach;
    private javax.swing.JLabel lbK_soNgayMuon;
    private javax.swing.JLabel lbK_tieuDe;
    private javax.swing.JLabel lbK_trangThai;
    private javax.swing.JLabel lbL_maTK;
    private javax.swing.JTable tblK_CTPM;
    private javax.swing.JTable tblK_kq;
    private javax.swing.JTextField txtK_maPM_1;
    private javax.swing.JTextField txtK_maPM_2;
    private javax.swing.JTextField txtK_maSach;
    private javax.swing.JTextField txtK_maTK;
    // End of variables declaration//GEN-END:variables
}
