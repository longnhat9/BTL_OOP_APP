package btl_oop;
import java.awt.Font;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.JFrame;

public class SinhVien_Form extends JFrame {
    DefaultTableModel tablemodel;

    public SinhVien_Form(){
        initComponents();
        setLocationRelativeTo(null);
        table_sinhvien.setRowHeight(table_sinhvien.getRowHeight() + 10);
        tablemodel = (DefaultTableModel) table_sinhvien.getModel();
        show_SV();
    }

    private void show_SV() {
        tablemodel = (DefaultTableModel) table_sinhvien.getModel();
        ArrayList<SinhVien> list_sv = SinhVien_Modify.sinhvien_list();
        tablemodel.setNumRows(0);
        
        table_sinhvien.getTableHeader().setFont( new Font( "Times New Roman" , Font.PLAIN, 18 ));
        
        for (SinhVien sv : list_sv) {
            tablemodel.addRow(new Object[]{
                sv.getMasv(), sv.getHoten(), sv.getGioitinh(), sv.getKhoa(), sv.getQuequan()
                }
            );
        }
    }

    private void resetForm() {
        txtMasv.setText("");
        txtHoten.setText("");
        cbGioitinh.setSelectedIndex(0);
        cbKhoa.setSelectedIndex(0);
        txtQuequan.setText("");
    }

    private boolean checkValidForm() {
        if (txtMasv.getText().isEmpty() || txtHoten.getText().isEmpty() || txtQuequan.getText().isEmpty()) return false;
        else return true;
    }
    
    private void setmodel(SinhVien sv) {
        txtMasv.setText(String.valueOf(sv.getMasv()));
        txtHoten.setText(sv.getHoten());
        cbGioitinh.setSelectedItem(sv.getGioitinh());
        cbKhoa.setSelectedItem(sv.getKhoa());
        txtQuequan.setText(sv.getQuequan());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cbGioitinh = new javax.swing.JComboBox<>();
        cbKhoa = new javax.swing.JComboBox<>();
        txtQuequan = new javax.swing.JTextField();
        txtMasv = new javax.swing.JTextField();
        txtHoten = new javax.swing.JTextField();
        btSave = new javax.swing.JButton();
        btReset = new javax.swing.JButton();
        btDelete = new javax.swing.JButton();
        btFind = new javax.swing.JButton();
        button_update = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_sinhvien = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Thông Tin Sinh Vien");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Nhap Thong Tin Sinh Vien"));
        jPanel1.setToolTipText("");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Ma Sinh Vien");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Ho Va Ten");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("Khoa");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setText("Que Quan");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setText("Gioi Tinh");

        cbGioitinh.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cbGioitinh.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nam", "Nu" }));

        cbKhoa.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cbKhoa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "K11", "K12", "K13", "K14", "K15" }));

        txtQuequan.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtQuequan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtQuequanActionPerformed(evt);
            }
        });

        txtMasv.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        txtHoten.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        btSave.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btSave.setText("Save");
        btSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSaveActionPerformed(evt);
            }
        });

        btReset.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btReset.setText("Reset");
        btReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btResetActionPerformed(evt);
            }
        });

        btDelete.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btDelete.setText("Delete");
        btDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDeleteActionPerformed(evt);
            }
        });

        btFind.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btFind.setText("Find");
        btFind.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btFindActionPerformed(evt);
            }
        });

        button_update.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        button_update.setText("Update");
        button_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_updateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btSave, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47)
                        .addComponent(button_update)
                        .addGap(45, 45, 45)
                        .addComponent(btDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addComponent(btReset, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(btFind, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel3)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4))
                        .addGap(42, 42, 42)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtQuequan, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtHoten, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMasv, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(cbKhoa, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cbGioitinh, javax.swing.GroupLayout.Alignment.LEADING, 0, 100, Short.MAX_VALUE)))))
                .addContainerGap(66, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMasv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtHoten, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cbGioitinh, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cbKhoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtQuequan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(47, 47, 47)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btReset)
                    .addComponent(btFind)
                    .addComponent(btSave)
                    .addComponent(button_update)
                    .addComponent(btDelete))
                .addGap(14, 14, 14))
        );

        table_sinhvien.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        table_sinhvien.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Ma Sinh Vien", "Ho Va Ten", "Gioi Tinh", "Khoa", "Que Quan"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table_sinhvien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_sinhvienMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table_sinhvien);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtQuequanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtQuequanActionPerformed
    }//GEN-LAST:event_txtQuequanActionPerformed

    private void btResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btResetActionPerformed
        resetForm();
        show_SV();
    }//GEN-LAST:event_btResetActionPerformed

    private void btSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSaveActionPerformed
        if (!checkValidForm()) {
            JOptionPane.showMessageDialog(this, "Ban chua nhap du thong tin!");
        } else {
            ArrayList<SinhVien> arr_sv = SinhVien_Modify.querry_masv();
            try {
                SinhVien sv = new SinhVien();
                sv.setMasv(Integer.parseInt(txtMasv.getText()));
                sv.setHoten(txtHoten.getText());
                sv.setGioitinh(cbGioitinh.getSelectedItem().toString());
                sv.setKhoa(cbKhoa.getSelectedItem().toString());
                sv.setQuequan(txtQuequan.getText());

                for (SinhVien sv_ : arr_sv) {
                    if (sv_.getMasv() == sv.getMasv()) {
                        JOptionPane.showMessageDialog(this, "Ma Sinh Vien Da Ton Tai , Vui Long Nhap Lai Ma Sinh Vien!");
                        return;
                    }
                }

                SinhVien_Modify.insert_sv(sv);
                JOptionPane.showMessageDialog(this, "Da Them Thong Tin Thanh Cong!");

                show_SV();
            } catch (Exception ex) {
                System.out.println(ex);
            }
        }
        resetForm();
    }//GEN-LAST:event_btSaveActionPerformed

    private void btDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDeleteActionPerformed
        if (txtMasv.getText().isEmpty() == true) {
            String input = JOptionPane.showInputDialog(this, "Nhap Ma Sinh Vien Can Xoa : ");
            if (input != null && input.length() > 0) {
                if(input.charAt(0) >= '0' && input.charAt(0) <= '9'){
                    int masv_input = Integer.parseInt(input);
                    int masv_querry = SinhVien_Modify.querry_one_masv(masv_input);
                    if (masv_querry != -999) {
                        masv_input = Integer.parseInt(input);
                        int select = JOptionPane.showConfirmDialog(this, "Ban Co Muon Xoa Thong Tin Khong?");
                        if(select == 0){
                            SinhVien_Modify.delete_sv(masv_input);
                            JOptionPane.showMessageDialog(this, "Da Xoa Thanh Cong!");
                        }else{
                            resetForm();
                        }
                    } else {
                        JOptionPane.showMessageDialog(this, "Ma Sinh Vien Nhap Chua Dung , Vui Long Nhap Lai!");
                    }
                }
                else{
                    JOptionPane.showMessageDialog(this, "Ma Sinh Vien Phai La So Nguyen , Vui Long Nhap Lai!");
                }
            }
        } else {
            int masv_ = Integer.parseInt(txtMasv.getText());

            int querry_masv = SinhVien_Modify.querry_one_masv(masv_);

            if (querry_masv != -999) {
                int select = JOptionPane.showConfirmDialog(this, "Ban Co Muon Xoa Thong Tin Khong?");
                if(select == 0){
                    SinhVien_Modify.delete_sv(masv_);
                    JOptionPane.showMessageDialog(this, "Da Xoa Thanh Cong!");
                    resetForm();
                }else{
                    resetForm();
                }
            } else {
                JOptionPane.showMessageDialog(this, "Ma Sinh Vien Nhap Chua Dung , Vui Long Nhap Lai!");
            }
        }
        show_SV();
    }//GEN-LAST:event_btDeleteActionPerformed

    private void table_sinhvienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_sinhvienMouseClicked
        int masv = table_sinhvien.rowAtPoint(evt.getPoint());
        String str_masv = table_sinhvien.getValueAt(masv, 0).toString();
        SinhVien sv = SinhVien_Modify.get_Info_SV_by_masv(Integer.parseInt(str_masv));
        setmodel(sv);
    }//GEN-LAST:event_table_sinhvienMouseClicked
    
    private void button_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_updateActionPerformed
        if (!checkValidForm()) {
            JOptionPane.showMessageDialog(this, "Ban Chua Nhap Du Thong Tin!");
        } else {
            SinhVien sv_querry = SinhVien_Modify.get_Info_SV_by_masv(Integer.parseInt(txtMasv.getText()));
            
            if(sv_querry.getMasv() == Integer.parseInt(txtMasv.getText()) && 
                    (sv_querry.getHoten().equals(txtHoten.getText()) == true && 
                    (sv_querry.getGioitinh().equals(cbGioitinh.getSelectedItem().toString()) == true) && 
                    (sv_querry.getKhoa().equals(cbKhoa.getSelectedItem().toString())) == true && 
                    (sv_querry.getQuequan().equals(txtQuequan.getText())) == true)){
                
                JOptionPane.showMessageDialog(this, "Cac Truong Thong Tin Sinh Vien Chua Duoc Thay Doi!");
                show_SV();
                return;
            }
            
            int masv_querry = SinhVien_Modify.querry_one_masv(Integer.parseInt(txtMasv.getText()));

            if (masv_querry != -999) {
                SinhVien sv = new SinhVien();
                sv.setMasv(Integer.parseInt(txtMasv.getText()));
                sv.setHoten(txtHoten.getText());
                sv.setGioitinh(cbGioitinh.getSelectedItem().toString());
                sv.setKhoa(cbKhoa.getSelectedItem().toString());
                sv.setQuequan(txtQuequan.getText());

                SinhVien_Modify.update_sv(sv);
                JOptionPane.showMessageDialog(this, "Da Chinh Sua Thanh Cong!");
            } else {
                JOptionPane.showMessageDialog(this, "Thong Tin Sinh Vien Chua Duoc Tao Lap!");
                show_SV();
                return;
            }
            show_SV();
            resetForm();
        }
    }//GEN-LAST:event_button_updateActionPerformed

    private void btFindActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btFindActionPerformed
        String input = JOptionPane.showInputDialog(this, "Nhap Ma Sinh Vien / Ho Ten Sinh Vien Can Tim Kiem : ");
        if (input != null && input.length() > 0) {
            SinhVien sv = new SinhVien();
            sv.setMasv(-999);
            sv.setHoten(null);

            if (input.charAt(0) >= '0' && input.charAt(0) <= '9') {
                sv.setMasv(Integer.parseInt(input));
            } else {
                sv.setHoten(input);
            }

            ArrayList<SinhVien> sv_list = SinhVien_Modify.search_sv(sv);

            if (sv_list.isEmpty() == true) {
                JOptionPane.showMessageDialog(this, "Khong Tim Kiem Duoc Thong Tin!");
                resetForm();
                show_SV();
            } else {
                tablemodel.setNumRows(0);
                for (SinhVien sv_ : sv_list) {
                    setmodel(sv_);
                    tablemodel.addRow(new Object[]{
                        sv_.getMasv() , sv_.getHoten() , sv_.getGioitinh() , sv_.getKhoa() , sv_.getQuequan()
                    }
                    );
                }
            }
        } else {
            show_SV();
        }
    }//GEN-LAST:event_btFindActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    if(CockroachDB_Connection.cockroachdb_connect() == null){
                        System.out.println("Loi Ket noi voi CockroachDB!");
                        return;
                    }
                    SinhVien_Modify.set_Connection(CockroachDB_Connection.cockroachdb_connect());
                    new SinhVien_Form().setVisible(true);
                } catch (Exception ex) {
                    Logger.getLogger(SinhVien_Form.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btDelete;
    private javax.swing.JButton btFind;
    private javax.swing.JButton btReset;
    private javax.swing.JButton btSave;
    private javax.swing.JButton button_update;
    private javax.swing.JComboBox<String> cbGioitinh;
    private javax.swing.JComboBox<String> cbKhoa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table_sinhvien;
    private javax.swing.JTextField txtHoten;
    private javax.swing.JTextField txtMasv;
    private javax.swing.JTextField txtQuequan;
    // End of variables declaration//GEN-END:variables
}