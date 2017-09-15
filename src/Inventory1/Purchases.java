/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inventory1;
import dbConnect.dbcon;
import static dbConnect.dbcon.connect;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import Inventory1.SupplierPayments;
import static dbConnect.dbcon.connect;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.text.SimpleDateFormat;

/**
 *
 * @author Dharshika
 */
public class Purchases extends javax.swing.JFrame {
 Connection con = null;
    PreparedStatement pst = null;
    PreparedStatement pst1 = null;
    ResultSet rs = null;
    ResultSet rs1 = null;
    /**
     * Creates new form Purchases
     */
    public Purchases() {
       initComponents();
       con= dbcon.connect();
    }

   
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_rawnamesearch = new javax.swing.JTextField();
        cmb_rawnamesearch = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        txt_available = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txt_unitmeasure = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txt_rawcode = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        txt_orderstatus = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txt_rawnamesearch2 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txt_qty = new javax.swing.JTextField();
        txt_suppid = new javax.swing.JTextField();
        txt_totalcost = new javax.swing.JTextField();
        txt_unitmeasure2 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txt_rawcode2 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txt_suppname = new javax.swing.JTextField();
        lbl_purchaseorderno = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        cmb_rawnamesearch2 = new javax.swing.JComboBox<>();
        cmb_suppnameselect = new javax.swing.JComboBox<>();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        txt_costperunit2 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();
        txt_status = new javax.swing.JTextField();
        date_orderdate = new com.toedter.calendar.JDateChooser();
        date_expectdate = new com.toedter.calendar.JDateChooser();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setForeground(new java.awt.Color(51, 51, 51));
        jPanel1.setPreferredSize(new java.awt.Dimension(1130, 610));

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Check Availability", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Raw Material Name");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Available");

        txt_rawnamesearch.setBackground(new java.awt.Color(204, 204, 204));
        txt_rawnamesearch.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_rawnamesearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_rawnamesearchKeyReleased(evt);
            }
        });

        cmb_rawnamesearch.setBackground(new java.awt.Color(204, 204, 204));
        cmb_rawnamesearch.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cmb_rawnamesearch.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmb_rawnamesearchItemStateChanged(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Select");

        txt_available.setBackground(new java.awt.Color(204, 204, 204));
        txt_available.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Units of Measure");

        txt_unitmeasure.setBackground(new java.awt.Color(204, 204, 204));
        txt_unitmeasure.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Raw Material Code");

        txt_rawcode.setBackground(new java.awt.Color(204, 204, 204));
        txt_rawcode.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Order Status");

        txt_orderstatus.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel13))
                .addGap(44, 44, 44)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txt_rawnamesearch)
                    .addComponent(cmb_rawnamesearch, 0, 204, Short.MAX_VALUE))
                .addGap(37, 37, 37)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel16)
                    .addComponent(jLabel14)
                    .addComponent(jLabel21))
                .addGap(57, 57, 57)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_orderstatus)
                    .addComponent(txt_unitmeasure)
                    .addComponent(txt_available)
                    .addComponent(txt_rawcode))
                .addGap(87, 87, 87))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_rawnamesearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_rawcode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel13)
                        .addComponent(cmb_rawnamesearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txt_available, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_unitmeasure, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel21)
                    .addComponent(txt_orderstatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17))
        );

        jPanel3.setBackground(new java.awt.Color(51, 51, 51));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Purchase", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Purchase Order No");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 49, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Raw Material Name");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 78, -1, -1));

        txt_rawnamesearch2.setBackground(new java.awt.Color(204, 204, 204));
        txt_rawnamesearch2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_rawnamesearch2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_rawnamesearch2KeyReleased(evt);
            }
        });
        jPanel3.add(txt_rawnamesearch2, new org.netbeans.lib.awtextra.AbsoluteConstraints(199, 72, 204, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Units of Measure");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 179, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Quantity");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 247, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Supplier ID");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(434, 140, -1, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Order Date");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(434, 179, -1, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Expected Date");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(434, 213, -1, -1));

        txt_qty.setBackground(new java.awt.Color(204, 204, 204));
        txt_qty.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_qty.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_qtyKeyReleased(evt);
            }
        });
        jPanel3.add(txt_qty, new org.netbeans.lib.awtextra.AbsoluteConstraints(199, 244, 204, -1));

        txt_suppid.setBackground(new java.awt.Color(204, 204, 204));
        txt_suppid.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel3.add(txt_suppid, new org.netbeans.lib.awtextra.AbsoluteConstraints(608, 141, 204, -1));

        txt_totalcost.setBackground(new java.awt.Color(204, 204, 204));
        txt_totalcost.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel3.add(txt_totalcost, new org.netbeans.lib.awtextra.AbsoluteConstraints(608, 244, 204, 39));

        txt_unitmeasure2.setBackground(new java.awt.Color(204, 204, 204));
        txt_unitmeasure2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel3.add(txt_unitmeasure2, new org.netbeans.lib.awtextra.AbsoluteConstraints(199, 176, 204, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Raw Material Code");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, -1, 25));

        txt_rawcode2.setBackground(new java.awt.Color(204, 204, 204));
        txt_rawcode2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel3.add(txt_rawcode2, new org.netbeans.lib.awtextra.AbsoluteConstraints(199, 141, 204, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Supplier Name");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(434, 75, -1, -1));

        txt_suppname.setBackground(new java.awt.Color(204, 204, 204));
        txt_suppname.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_suppname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_suppnameKeyReleased(evt);
            }
        });
        jPanel3.add(txt_suppname, new org.netbeans.lib.awtextra.AbsoluteConstraints(608, 66, 204, -1));

        lbl_purchaseorderno.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_purchaseorderno.setForeground(new java.awt.Color(255, 255, 255));
        lbl_purchaseorderno.setText("No");
        jPanel3.add(lbl_purchaseorderno, new org.netbeans.lib.awtextra.AbsoluteConstraints(199, 49, -1, -1));

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Select");
        jPanel3.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 109, -1, -1));

        cmb_rawnamesearch2.setBackground(new java.awt.Color(204, 204, 204));
        cmb_rawnamesearch2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cmb_rawnamesearch2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmb_rawnamesearch2ItemStateChanged(evt);
            }
        });
        cmb_rawnamesearch2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_rawnamesearch2ActionPerformed(evt);
            }
        });
        jPanel3.add(cmb_rawnamesearch2, new org.netbeans.lib.awtextra.AbsoluteConstraints(199, 106, 204, -1));

        cmb_suppnameselect.setBackground(new java.awt.Color(204, 204, 204));
        cmb_suppnameselect.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cmb_suppnameselect.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmb_suppnameselectItemStateChanged(evt);
            }
        });
        cmb_suppnameselect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_suppnameselectActionPerformed(evt);
            }
        });
        jPanel3.add(cmb_suppnameselect, new org.netbeans.lib.awtextra.AbsoluteConstraints(608, 106, 204, -1));

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Select");
        jPanel3.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(434, 106, -1, -1));

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("cost/unit");
        jPanel3.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 213, -1, -1));

        txt_costperunit2.setBackground(new java.awt.Color(204, 204, 204));
        txt_costperunit2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel3.add(txt_costperunit2, new org.netbeans.lib.awtextra.AbsoluteConstraints(199, 210, 204, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Total Cost");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(434, 247, -1, -1));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText("Purchase");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(771, 313, 111, 34));

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Status");
        jPanel3.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(434, 294, -1, -1));

        txt_status.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel3.add(txt_status, new org.netbeans.lib.awtextra.AbsoluteConstraints(608, 294, 115, -1));
        jPanel3.add(date_orderdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(608, 176, 204, -1));
        jPanel3.add(date_expectdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(608, 210, 204, -1));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(188, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 625, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_rawnamesearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_rawnamesearchKeyReleased
        String ch = txt_rawnamesearch.getText();
			cmb_rawnamesearch.removeAllItems();
			if (ch.equals("")) {
						} 
                        else 
                        {
                        System.out.println(ch);
			try 
                        {
				Connection connection = connect();	
                                Statement st = connection.createStatement();
                                ResultSet rs = st.executeQuery("Select name from rawmaterials where name like '"+ ch + "%'");
                               while (rs.next()) {
                                            String name = rs.getString("name");
                                            if (name.equals("")) {
                                                                    cmb_rawnamesearch.addItem("");
                                                                    cmb_rawnamesearch.setVisible(false);
                                                                 } 
                                            
                                            else                 {
                                                                    cmb_rawnamesearch .addItem(rs.getString("name"));
			
                                                                  }
                                          }
                                            
                        
                        
			} catch (Exception ex) {
         		}
			}
    }//GEN-LAST:event_txt_rawnamesearchKeyReleased

    private void cmb_rawnamesearchItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmb_rawnamesearchItemStateChanged
         if(evt.getStateChange() ==java.awt.event.ItemEvent.SELECTED) {
             String name = (String) cmb_rawnamesearch.getSelectedItem();
                    try{

                            String sql = "SELECT * FROM rawmaterials WHERE name='"+name+"'";
                            Connection connection = connect();	
                            Statement st = connection.createStatement();
                            ResultSet rs = st.executeQuery(sql);
                            String stockqty = "";
                            String code="";
                            String unitmeasure="";
                             String orderstatus = "";
                                            

                            while(rs.next()){

                                                stockqty = rs.getString("stockqty");
                                                code = rs.getString("code");
                                                unitmeasure = rs.getString("unitmeasure");
                                                orderstatus = rs.getString("orderstatus");
                                            
                                            }
                    txt_available.setText(stockqty);
                    txt_rawcode.setText(code);
                    txt_unitmeasure.setText(unitmeasure);
                    txt_orderstatus.setText(orderstatus); 
                   }catch(Exception ex){
                                        }
                   
             
             
             
             
                    
         }
    }//GEN-LAST:event_cmb_rawnamesearchItemStateChanged

    private void cmb_rawnamesearch2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_rawnamesearch2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmb_rawnamesearch2ActionPerformed

    private void txt_rawnamesearch2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_rawnamesearch2KeyReleased
       String ch = txt_rawnamesearch2.getText();
			cmb_rawnamesearch2.removeAllItems();
			if (ch.equals("")) {
						} 
                        else 
                        {
                        System.out.println(ch);
			try 
                        {
				Connection connection = connect();	
                                Statement st = connection.createStatement();
                                ResultSet rs = st.executeQuery("Select name from rawmaterials where name like '"+ ch + "%'");
                               while (rs.next()) {
                                            String name = rs.getString("name");
                                           
                                            if (name.equals("")) {
                                                                    cmb_rawnamesearch2.addItem("");
                                                                    cmb_rawnamesearch2.setVisible(false);
                                                                    
                                                                 } 
                                            
                                            else                 {
                                                                    cmb_rawnamesearch2 .addItem(rs.getString("name"));
			
                                                                  }
                                          }
                                            
                        
                        
			} catch (Exception ex) {
         		}
			}
    }//GEN-LAST:event_txt_rawnamesearch2KeyReleased

    private void cmb_rawnamesearch2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmb_rawnamesearch2ItemStateChanged
        if(evt.getStateChange() ==java.awt.event.ItemEvent.SELECTED) {
             String name = (String) cmb_rawnamesearch2.getSelectedItem();
                    try{

                            String sql = "SELECT * FROM rawmaterials WHERE name='"+name+"'";
                            Connection connection = connect();	
                            Statement st = connection.createStatement();
                            ResultSet rs = st.executeQuery(sql);
                            String stockqty = "";
                            String code="";
                            String unitmeasure="";
                            String cost="";
                           
                            
                           

                            while(rs.next()){

                                                
                                                code = rs.getString("code");
                                                unitmeasure = rs.getString("unitmeasure");
                                                cost = rs.getString("cost");
                                              
                                                                                               
                                            }
                    
                    txt_rawcode2.setText(code);
                    txt_unitmeasure2.setText(unitmeasure);
                    txt_costperunit2.setText(cost);
                  
                    
                    }catch(Exception ex){
                                        }
                   
             
             
             
             
                    
         }
    }//GEN-LAST:event_cmb_rawnamesearch2ItemStateChanged

    private void txt_suppnameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_suppnameKeyReleased
       String ch = txt_suppname.getText();
			cmb_suppnameselect.removeAllItems();
			if (ch.equals("")) {
						} 
                        else 
                        {
                        System.out.println(ch);
			try 
                        {
				Connection connection = connect();	
                                Statement st = connection.createStatement();
                                ResultSet rs = st.executeQuery("Select businessname from suppliers where businessname like '"+ ch + "%'");
                               while (rs.next()) {
                                            String businessname = rs.getString("businessname");
                                            if (businessname.equals("")) {
                                                                    cmb_suppnameselect.addItem("");
                                                                    cmb_suppnameselect.setVisible(false);
                                                                 } 
                                            
                                            else                 {
                                                                    cmb_suppnameselect
                                                                            .addItem(rs.getString("businessname"));
			
                                                                  }
                                          }
                                            
                        
                        
			} catch (Exception ex) {
         		}
			}
    }//GEN-LAST:event_txt_suppnameKeyReleased

    private void cmb_suppnameselectItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmb_suppnameselectItemStateChanged
       if(evt.getStateChange() ==java.awt.event.ItemEvent.SELECTED) {
             String businessname = (String) cmb_suppnameselect.getSelectedItem();
                    try{

                            String sql = "SELECT * FROM suppliers WHERE businessname='"+businessname+"'";
                            Connection connection = connect();	
                            Statement st = connection.createStatement();
                            ResultSet rs = st.executeQuery(sql);
                            String supplierid = "";
                            

                            while(rs.next()){

                                                
                                                supplierid = rs.getString("supplierid");
                                                
                                            }
                    
                    txt_suppid.setText(supplierid);
                    
                    }catch(Exception ex){
                                        }
                   
    }//GEN-LAST:event_cmb_suppnameselectItemStateChanged
    }
    private void txt_qtyKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_qtyKeyReleased
       
        Double qty = Double.parseDouble(txt_qty.getText());
        Double cost = Double.parseDouble(txt_costperunit2.getText());
        try{
                Double totalcost=qty*cost;
                String total = String.valueOf(totalcost);
                txt_totalcost.setText(total);
                            
                    }catch(Exception ex){
                                        }
        
        
        
        


// TODO add your handling code here:
    }//GEN-LAST:event_txt_qtyKeyReleased

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
                    
        
        
                  
                    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
                     
                                                                                                 
                     String query="INSERT INTO `supplierpurchases`(`rawmaterialname`,`rawmaterialcode`,`unitsofmeasure`,`cost/unit`,`quantity`,`businessname`,`supplierid`,`totalcost`,`expecteddate`)"
                               + "VALUES ('"+cmb_rawnamesearch2.getSelectedItem()+"','"+txt_rawcode2.getText()+"','"+txt_unitmeasure2.getText()+"','"+txt_costperunit2.getText()+"','"+txt_qty.getText()+"','"+cmb_suppnameselect.getSelectedItem()+"','"+txt_suppid.getText()+"','"+txt_totalcost.getText()+"',"
                             + "'"+dateFormat.format(date_expectdate.getDate()) +"')";
       
                    executeSqlQuery(query, "PurchaseOrder");
                    
               
                  

               
                
               
                
             
                
    }//GEN-LAST:event_jButton1ActionPerformed
     
    
    public void ClearField()
    {
        
        txt_rawnamesearch2.setText(null);
        cmb_rawnamesearch2.setSelectedItem(null);
        txt_rawcode2.setText(null);
        txt_unitmeasure2.setText(null);
        txt_costperunit2.setText(null);
        txt_qty.setText(null);
        cmb_suppnameselect.setSelectedItem(null);
        txt_suppid.setText(null);
        txt_totalcost.setText(null);
        txt_suppname.setText(null);
    }
    
    
    

    
    
    
    
    
    
    
    
    
    public void executeSqlQuery(String query,String message)
     {
         Connection conn= connect();
         Statement st;
         try {
                st=con.createStatement();
                int n = JOptionPane.showConfirmDialog(
                null,
                "Confirm"+message+"?",
                "Confirmation",
                JOptionPane.YES_NO_OPTION);
              if ( n==JOptionPane.YES_OPTION)
              {
                  
                  st.executeUpdate(query);
                  
                   
                    String suppid = txt_suppid.getText();
                    String suppbusinessname = txt_suppname.getText();
                    String totalamount = txt_totalcost.getText();
                                     
                    
                                    
                    
                    SupplierPayments sp = new SupplierPayments(suppid,suppbusinessname,totalamount);
                  sp.setVisible(true);                                     
                    
                  
                  
              }
              else if( n==JOptionPane.NO_OPTION) {
                  
                  ClearField();
              }
         } catch (Exception e) {
             JOptionPane.showMessageDialog(null, e);
         }
     
     }
    

    
    private void cmb_suppnameselectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_suppnameselectActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmb_suppnameselectActionPerformed
    
    
    
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
            java.util.logging.Logger.getLogger(Purchases.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Purchases.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Purchases.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Purchases.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Purchases().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cmb_rawnamesearch;
    private javax.swing.JComboBox<String> cmb_rawnamesearch2;
    private javax.swing.JComboBox<String> cmb_suppnameselect;
    private com.toedter.calendar.JDateChooser date_expectdate;
    private com.toedter.calendar.JDateChooser date_orderdate;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lbl_purchaseorderno;
    private javax.swing.JTextField txt_available;
    private javax.swing.JTextField txt_costperunit2;
    private javax.swing.JTextField txt_orderstatus;
    private javax.swing.JTextField txt_qty;
    private javax.swing.JTextField txt_rawcode;
    private javax.swing.JTextField txt_rawcode2;
    private javax.swing.JTextField txt_rawnamesearch;
    private javax.swing.JTextField txt_rawnamesearch2;
    private javax.swing.JTextField txt_status;
    private javax.swing.JTextField txt_suppid;
    private javax.swing.JTextField txt_suppname;
    private javax.swing.JTextField txt_totalcost;
    private javax.swing.JTextField txt_unitmeasure;
    private javax.swing.JTextField txt_unitmeasure2;
    // End of variables declaration//GEN-END:variables
}
