/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package tugas6;

import tugas5.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableColumnModel;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author User
 */
public class hp2 extends javax.swing.JFrame {

    /**
     * Creates new form hp1
     */
    public hp2() {
        initComponents();
        DefaultTableModel dataModel = (DefaultTableModel) tabelhp.getModel();
        int rowCount = dataModel.getRowCount();
        while (rowCount > 0) {
            dataModel.removeRow(rowCount - 1);
            rowCount = dataModel.getRowCount(); // Update rowCount after removal
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtwarna = new javax.swing.JTextField();
        txtjumblah = new javax.swing.JTextField();
        txtharga = new javax.swing.JTextField();
        cmbjenis = new javax.swing.JComboBox<>();
        btninput = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txtkodehp = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabelhp = new javax.swing.JTable();
        btnclose = new javax.swing.JButton();
        cmbnama = new javax.swing.JComboBox<>();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("rental HP Nila");

        jLabel2.setText("Jenis HP :");

        jLabel3.setText("warna :");

        jLabel4.setText("Tipe :");

        jLabel5.setText("Jumblah :");

        jLabel6.setText("Harga :");

        btninput.setText("input data");
        btninput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btninputActionPerformed(evt);
            }
        });

        jLabel7.setText("Kode HP :");

        tabelhp.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Jenis HP", "Warna", "Tipe", "Kode HP", "Jumblah", "Harga", "Total harga"
            }
        ));
        jScrollPane3.setViewportView(tabelhp);

        btnclose.setText("close");
        btnclose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncloseActionPerformed(evt);
            }
        });

        cmbnama.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "IPHONE", "VIVO", "SAMSUNG", " " }));
        cmbnama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbnamaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4))
                        .addGap(49, 49, 49)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtwarna)
                            .addComponent(cmbjenis, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cmbnama, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(81, 81, 81)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel6)
                                            .addComponent(jLabel7))
                                        .addGap(18, 18, 18))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtkodehp, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
                                    .addComponent(txtharga)
                                    .addComponent(txtjumblah))
                                .addGap(47, 47, 47)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btninput, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnclose, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(90, 90, 90)
                                .addComponent(jLabel1))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 779, Short.MAX_VALUE)))
                .addGap(55, 55, 55))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(cmbnama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtjumblah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(btninput))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtwarna, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(txtharga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnclose))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbjenis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(txtkodehp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(15, 15, 15)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btninputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btninputActionPerformed
        String handphone="";
        if (cmbnama.getSelectedIndex()==0){
            iphone P = new iphone();
            P.datatipe((String)cmbjenis.getSelectedItem());
            P.datawarna(txtwarna.getText());
            P.datajenis((String)cmbnama.getSelectedItem());
            P.kdhp(txtkodehp.getText());
            P.datajumblah(Integer.parseInt(txtjumblah.getText()));
            P.dataharga(Integer.parseInt(txtharga.getText()));
            
            
            iphone harga = new iphone();
            harga.dataharga(Integer.parseInt(txtharga.getText()));
            harga.datajumblah(Integer.parseInt(txtjumblah.getText()));
            JOptionPane.showMessageDialog(this,P.input(P.jenis) );
            tabelhp.setAutoCreateColumnsFromModel(true);
        DefaultTableModel dataModel = (DefaultTableModel) tabelhp.getModel();
        List list = new ArrayList<>();
        list.add(P.jenis);
        list.add(P.warna);
        list.add(P.tipe);
        list.add(P.kode_HP);
        list.add(P.jumblah);
        list.add(P.harga);
        list.add(P.totalhp());
        dataModel.addRow(list.toArray());
        } else if (cmbnama.getSelectedIndex()==1){
            samsung s = new samsung();
            s.datatipe((String)cmbjenis.getSelectedItem());
            s.datawarna(txtwarna.getText());
            s.datajenis((String)cmbnama.getSelectedItem());
            s.kdhp(txtkodehp.getText());
            s.datajumblah(Integer.parseInt(txtjumblah.getText()));
            s.dataharga(Integer.parseInt(txtharga.getText()));
            
            samsung harga = new samsung();
            harga.dataharga(Integer.parseInt(txtharga.getText()));
            harga.datajumblah(Integer.parseInt(txtjumblah.getText()));
            JOptionPane.showMessageDialog(this,s.input(s.jenis) );
             tabelhp.setAutoCreateColumnsFromModel(true);
        DefaultTableModel dataModel = (DefaultTableModel) tabelhp.getModel();
        List list = new ArrayList<>();
        list.add(s.jenis);
        list.add(s.warna);
        list.add(s.tipe);
        list.add(s.kode_HP);
        list.add(s.jumblah);
        list.add(s.harga);
        list.add(s.totalhp());
        
        dataModel.addRow(list.toArray());
        } else if (cmbnama.getSelectedIndex()==2){
            vivo v = new vivo();
            v.datatipe((String)cmbjenis.getSelectedItem());
            v.datawarna(txtwarna.getText());
            v.datajenis((String)cmbnama.getSelectedItem());
            v.kdhp(txtkodehp.getText());
            v.datajumblah(Integer.parseInt(txtjumblah.getText()));
            v.dataharga(Integer.parseInt(txtharga.getText()));
          
            vivo harga = new vivo();
            harga.dataharga(Integer.parseInt(txtharga.getText()));
            harga.datajumblah(Integer.parseInt(txtjumblah.getText()));
            JOptionPane.showMessageDialog(this,v.input(v.jenis) );
             DefaultTableModel dataModel = (DefaultTableModel) tabelhp.getModel();
        List list = new ArrayList<>();
        list.add(v.jenis);
        list.add(v.warna);
        list.add(v.tipe);
        list.add(v.kode_HP);
        list.add(v.jumblah);
        list.add(v.harga);
        list.add(v.totalhp());
        dataModel.addRow(list.toArray());
        }           
    }//GEN-LAST:event_btninputActionPerformed

    private void btncloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncloseActionPerformed
        dispose();
    }//GEN-LAST:event_btncloseActionPerformed

    private void cmbnamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbnamaActionPerformed
   if(cmbnama.getSelectedIndex()==0){
           iphone i = new iphone();
           txtkodehp.setText(i.kode_HP());
            cmbjenis.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Iphone x", "Iphone XR","Iphone 11" }));
        } else if (cmbnama.getSelectedIndex()==1){
               vivo v = new vivo();
           txtkodehp.setText(v.kode_HP());
            cmbjenis.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "vivo y21", "vivo32","vivo 22x" }));
        } else if (cmbnama.getSelectedIndex()==2){
             vivo v = new vivo();
           txtkodehp.setText(v.kode_HP());
           samsung s = new samsung();
           txtkodehp.setText(s.kode_HP());
            cmbjenis.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Samsung s22", "Samsung s23","Samsung s11" }));
        }        // TODO add your handling code here:
    }//GEN-LAST:event_cmbnamaActionPerformed

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
            java.util.logging.Logger.getLogger(hp2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(hp2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(hp2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(hp2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new hp2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnclose;
    private javax.swing.JButton btninput;
    private javax.swing.JComboBox<String> cmbjenis;
    private javax.swing.JComboBox<String> cmbnama;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable tabelhp;
    private javax.swing.JTextField txtharga;
    private javax.swing.JTextField txtjumblah;
    private javax.swing.JTextField txtkodehp;
    private javax.swing.JTextField txtwarna;
    // End of variables declaration//GEN-END:variables
}
