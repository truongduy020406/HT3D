/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package TTSach;

import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author TechCare
 */
public class TTbookFrame extends javax.swing.JFrame {
   nhaxuatbanDao nxbDao=new nhaxuatbanDao();
       DefaultTableModel tableModel;
   bookDao bDao=new bookDao();
       List<book> bookList = new ArrayList<>();
    /**
     * Creates new form TTbookFrame
     */
    public TTbookFrame() {
        initComponents();
        tableModel = (DefaultTableModel) tblBook.getModel();
      getCboNhaxuatban();
      showbook();
        
    }

     public void getCboNhaxuatban(){
         DefaultComboBoxModel cboModel=(DefaultComboBoxModel) cboNxb.getModel();
         for (nhaxuatban nxb : nxbDao.getAll()) {
             cboModel.addElement(nxb);
         }
     }
     public void resetForm(){
         txtMasach.setText("");
         txtSoluong.setText("");
         txtTacgia.setText("");
         txtTensach.setText("");
         txtTheloai.setText("");
         
     }
     private void showbook() {
        bookList = bDao.findAll();
        
        tableModel.setRowCount(0);
        
        bookList.forEach((book) -> {
            tableModel.addRow(new Object[] {tableModel.getRowCount() + 1, book.getTensach(), 
                book.getTacgia(), book.getNhaxuatban(), book.getTheloai(), book.getSoluong()});
        });
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtMasach = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtTheloai = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtSoluong = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtTensach = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtTacgia = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        cboNxb = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        btThem = new javax.swing.JButton();
        btSua = new javax.swing.JButton();
        btHuyBo = new javax.swing.JButton();
        btXoa = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblBook = new javax.swing.JTable();
        btReset = new javax.swing.JButton();

        jScrollPane1.setViewportView(jTextPane1);

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/image/books.png"))); // NOI18N
        jLabel1.setText(" THÔNG TIN SÁCH");

        jPanel2.setLayout(new java.awt.GridLayout(2, 6));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText("Mã sách:");
        jPanel2.add(jLabel2);
        jPanel2.add(txtMasach);

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Thể loại:");
        jPanel2.add(jLabel3);
        jPanel2.add(txtTheloai);

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Số lượng:");
        jPanel2.add(jLabel4);
        jPanel2.add(txtSoluong);

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setText("Tên sách:");
        jPanel2.add(jLabel5);
        jPanel2.add(txtTensach);

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Tác giả");
        jPanel2.add(jLabel6);
        jPanel2.add(txtTacgia);

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Nhà xuất bản:");
        jPanel2.add(jLabel7);

        jPanel2.add(cboNxb);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 602, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addContainerGap())
        );

        btThem.setBackground(new java.awt.Color(204, 204, 255));
        btThem.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btThem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/image/add.png"))); // NOI18N
        btThem.setText("Thêm");
        btThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btThemActionPerformed(evt);
            }
        });

        btSua.setBackground(new java.awt.Color(0, 255, 204));
        btSua.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btSua.setForeground(new java.awt.Color(51, 51, 51));
        btSua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/image/find-my-friend.png"))); // NOI18N
        btSua.setText("Tìm kiếm");
        btSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSuaActionPerformed(evt);
            }
        });

        btHuyBo.setBackground(new java.awt.Color(153, 255, 102));
        btHuyBo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btHuyBo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/image/prohibition.png"))); // NOI18N
        btHuyBo.setText("Hủy bỏ");

        btXoa.setBackground(new java.awt.Color(255, 255, 204));
        btXoa.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btXoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/image/clear.png"))); // NOI18N
        btXoa.setText("Xóa");
        btXoa.setToolTipText("");
        btXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btXoaActionPerformed(evt);
            }
        });

        tblBook.setBackground(new java.awt.Color(255, 204, 204));
        tblBook.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Mã sách", "Tên sách", "Tác giả", "Nhà xuất bản", "Thể lọai", "Số lượng"
            }
        ));
        jScrollPane2.setViewportView(tblBook);

        btReset.setBackground(new java.awt.Color(204, 255, 204));
        btReset.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btReset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/image/reset.png"))); // NOI18N
        btReset.setText("Reset");
        btReset.setToolTipText("");
        btReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btResetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(171, 171, 171)
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(btThem)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btSua)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btXoa)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btReset)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btHuyBo)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 12, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btThem, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btSua, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btReset, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btHuyBo, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btResetActionPerformed
        resetForm();
    }//GEN-LAST:event_btResetActionPerformed

    private void btThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btThemActionPerformed

    }//GEN-LAST:event_btThemActionPerformed

    private void btXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btXoaActionPerformed
         int selectedIndex = tblBook.getSelectedRow();
        if(selectedIndex >= 0) {
            book b = bookList.get(selectedIndex);
            
            int option = JOptionPane.showConfirmDialog(this, "Bạn có muốn xóa thông tin sách này  ?");
            System.out.println("option : " + option);
            
            if(option == 0) {
                bookDao.delete(b.getMasach());
                
                showbook();
            }
        }
    }//GEN-LAST:event_btXoaActionPerformed

    private void btSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSuaActionPerformed
        String input = JOptionPane.showInputDialog(this, "Nhập tên thể loại cần tìm kiếm !!!!");
        if(input != null && input.length() > 0) {
           bookList = bDao.findByFullname(input);
            
            tableModel.setRowCount(0);
        
      bookList.forEach((book) -> {
            tableModel.addRow(new Object[] {tableModel.getRowCount() + 1, book.getTensach(), 
                book.getTacgia(), book.getNhaxuatban(), book.getTheloai(), book.getSoluong()});
        });
        } else {
            showbook(); 
        }
    }//GEN-LAST:event_btSuaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TTbookFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TTbookFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TTbookFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TTbookFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TTbookFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btHuyBo;
    private javax.swing.JButton btReset;
    private javax.swing.JButton btSua;
    private javax.swing.JButton btThem;
    private javax.swing.JButton btXoa;
    private javax.swing.JComboBox<String> cboNxb;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JTable tblBook;
    private javax.swing.JTextField txtMasach;
    private javax.swing.JTextField txtSoluong;
    private javax.swing.JTextField txtTacgia;
    private javax.swing.JTextField txtTensach;
    private javax.swing.JTextField txtTheloai;
    // End of variables declaration//GEN-END:variables
}
