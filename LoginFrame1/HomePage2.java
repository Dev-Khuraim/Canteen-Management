/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package LoginFrame1;
import java.sql.*;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author hp
 */
public class HomePage2 extends javax.swing.JFrame {
DefaultTableModel model;
    static boolean t = false;

    /**
     * Creates new form HomePage2
     */
    public HomePage2() {
        initComponents();
        setExtendedState(HomePage.MAXIMIZED_BOTH);
        jPanel2.setVisible(t);
//        managecategory.setVisible(false);
//        newproduct.setVisible(false);
        jTable1.setVisible(false);
//           jButton2.setEnabled(false); 

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        managecategory = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        subtotal = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        newproduct = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setText("USERS");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 20, 100, 50));

        jButton4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LoginFrame1/bils (1).png"))); // NOI18N
        jButton4.setText("Bills and Placed Orders Details");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 20, 290, 50));

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LoginFrame1/logout (1).png"))); // NOI18N
        jButton5.setText("LOGOUT");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 20, 130, 40));

        jButton6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LoginFrame1/menu (2).png"))); // NOI18N
        jButton6.setText("MENU");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 130, 50));

        jButton7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LoginFrame1/cart (1).png"))); // NOI18N
        jButton7.setText("CART");
        jButton7.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 20, 110, 50));

        managecategory.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        managecategory.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LoginFrame1/managecategory (1).png"))); // NOI18N
        managecategory.setText("Manage Category");
        managecategory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                managecategoryActionPerformed(evt);
            }
        });
        getContentPane().add(managecategory, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 430, 180, 50));

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));

        jLabel1.setFont(new java.awt.Font("Segoe UI Historic", 3, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Quantity", "Items", "Amount"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(2).setResizable(false);
        }

        subtotal.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        subtotal.setForeground(new java.awt.Color(255, 255, 255));

        jButton2.setBackground(new java.awt.Color(102, 102, 255));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton2.setText("PLACE ORDER");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(94, 94, 94)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(81, 81, 81)
                                .addComponent(subtotal, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(subtotal, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 80, 470, 440));

        newproduct.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        newproduct.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LoginFrame1/new product (1).png"))); // NOI18N
        newproduct.setText("New Product");
        newproduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newproductActionPerformed(evt);
            }
        });
        getContentPane().add(newproduct, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 430, 190, 50));

        jButton3.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jButton3.setText("Products Rrecord");
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 20, 190, 50));

        jButton8.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jButton8.setText("Customer Info");
        getContentPane().add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 20, 140, 50));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LoginFrame1/home1.jpeg"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-290, -500, -1, 1280));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        if (t == false) {
            t = true;
            jPanel2.setVisible(t);
        } else if (t == true) {
            t = false;
            jPanel2.setVisible(t);
        }
//        if (!(subtotal.getText().equals(""))) {
//            jButton2.setEnabled(true);}
       

    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        HomePage h = new HomePage();
        h.setVisible(true);
// TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void newproductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newproductActionPerformed
        NewProduct p = new NewProduct();
        p.pack();
        p.setLocationRelativeTo(null);
        
p.setVisible(true);
    }//GEN-LAST:event_newproductActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        this.dispose();
        
       LoginScreen h = new LoginScreen();
       h.setVisible(true);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
      model = Selection.model;
        boolean t = true;
        if(subtotal.getText().equals("")){
           JOptionPane.showMessageDialog(null,"first add some products in cart");
       }
       else{
           
        
            Reciept r = new Reciept();
            r.pack();
            r.setLocationRelativeTo(null);
       
            
        
          
            int rows = model.getRowCount(); 
            System.out.println(rows);
            
//            Selection.model.setRowCount(0);
   if(rows>0){
////       model.setRowCount(0);
for(int i = rows - 1; i >=0; i--)
{
   Selection.model.removeRow(i); 
}
   }
            subtotal.setText("");
            jLabel1.setText("");
          
        
       try{
        PreparedStatement st0 = ProvideConnection.con().prepareStatement("show tables");
        ResultSet rs0 = st0.executeQuery();
        while(rs0.next()){
            if(LoginScreen.Name.getText().toLowerCase().equals(rs0.getString(1))){
                 t = false;
                 break;
            }
           
        }
        if(t == true){
           
                      PreparedStatement st = ProvideConnection.con().prepareStatement("create table "+LoginScreen.Name.getText()+"(ID int primary key auto_increment ,ORDER_ID int not null, date char(100) not null)");
      st.executeUpdate();}
//            
//     
      PreparedStatement st1 = ProvideConnection.con().prepareStatement("insert into "+LoginScreen.Name.getText()+"(ORDER_ID,date) values (?,?)");
      st1.setString(1,(Reciept.order.getText()));
      st1.setString(2, Reciept.Date.getText());
      st1.executeUpdate();

       }
       catch(Exception e){
           JOptionPane.showMessageDialog(null, e);
       }
//       setVisible(false);
//        HomePage2 h = new HomePage2();
//        h.setVisible(true);
//new HomePage2().setVisible(true);
         r.setVisible(true);
         
       }
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
BillsDetails b = new BillsDetails();
b.pack();
b.setLocationRelativeTo(null);
b.setVisible(true); 
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
 int row = jTable1.getSelectedRow();
 JOptionPane.showConfirmDialog(null, "do you want to remove this item from cart");
 int v = Integer.parseInt(jTable1.getValueAt(row,2).toString());
           Selection.model.removeRow(row); 
           v = Integer.parseInt(subtotal.getText())-v;
           subtotal.setText(""+v);
          if(subtotal.getText().equals("0")){
               jLabel1.setText("");
               subtotal.setText("");
               
          }
            // TODO add your handling code here:
    }//GEN-LAST:event_jTable1MouseClicked

    private void managecategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_managecategoryActionPerformed
ManageCategory m = new ManageCategory();
m.pack();
m.setLocationRelativeTo(null);
m.setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_managecategoryActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
Users u = new Users();
u.pack();
u.setLocationRelativeTo(null);
u.setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(HomePage2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomePage2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomePage2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomePage2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomePage2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    public static javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    public static javax.swing.JTable jTable1;
    public static javax.swing.JButton managecategory;
    public static javax.swing.JButton newproduct;
    public static javax.swing.JLabel subtotal;
    // End of variables declaration//GEN-END:variables
}