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
        txt_reorder = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
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
        date_expected = new com.toedter.calendar.JDateChooser();
        date_order = new com.toedter.calendar.JDateChooser();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

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
        txt_available.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_availableActionPerformed(evt);
            }
        });

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

        txt_reorder.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Re order Level");

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
                    .addComponent(jLabel21)
                    .addComponent(jLabel15))
                .addGap(57, 57, 57)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_reorder)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_unitmeasure, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_reorder, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(txt_orderstatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21))
        );

        jPanel3.setBackground(new java.awt.Color(51, 51, 51));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Purchase", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Purchase Order No");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Raw Material Name");

        txt_rawnamesearch2.setBackground(new java.awt.Color(204, 204, 204));
        txt_rawnamesearch2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_rawnamesearch2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_rawnamesearch2KeyReleased(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Units of Measure");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Quantity");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Supplier ID");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Order Date");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Expected Date");

        txt_qty.setBackground(new java.awt.Color(204, 204, 204));
        txt_qty.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_qty.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_qtyKeyReleased(evt);
            }
        });

        txt_suppid.setBackground(new java.awt.Color(204, 204, 204));
        txt_suppid.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txt_totalcost.setBackground(new java.awt.Color(204, 204, 204));
        txt_totalcost.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        txt_unitmeasure2.setBackground(new java.awt.Color(204, 204, 204));
        txt_unitmeasure2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Raw Material Code");

        txt_rawcode2.setBackground(new java.awt.Color(204, 204, 204));
        txt_rawcode2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Supplier Name");

        txt_suppname.setBackground(new java.awt.Color(204, 204, 204));
        txt_suppname.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_suppname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_suppnameKeyReleased(evt);
            }
        });

        lbl_purchaseorderno.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_purchaseorderno.setForeground(new java.awt.Color(255, 255, 255));
        lbl_purchaseorderno.setText("No");

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Select");

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

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Select");

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("cost/unit");

        txt_costperunit2.setBackground(new java.awt.Color(204, 204, 204));
        txt_costperunit2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Total Cost");

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Inventory1/shopping-cart.png"))); // NOI18N
        jButton1.setText("Purchase");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(106, 106, 106)
                        .addComponent(txt_qty, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addComponent(jLabel12)
                            .addGap(89, 89, 89)
                            .addComponent(txt_totalcost, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(43, 43, 43)
                                .addComponent(lbl_purchaseorderno))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(45, 45, 45)
                                .addComponent(txt_rawnamesearch2, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31)
                                .addComponent(jLabel1)
                                .addGap(87, 87, 87)
                                .addComponent(txt_suppname, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel17)
                                .addGap(123, 123, 123)
                                .addComponent(cmb_rawnamesearch2, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31)
                                .addComponent(jLabel18)
                                .addGap(138, 138, 138)
                                .addComponent(cmb_suppnameselect, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(48, 48, 48)
                                .addComponent(txt_rawcode2, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31)
                                .addComponent(jLabel9)
                                .addGap(108, 108, 108)
                                .addComponent(txt_suppid, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(59, 59, 59)
                                .addComponent(txt_unitmeasure2, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31)
                                .addComponent(jLabel10)
                                .addGap(108, 108, 108)
                                .addComponent(date_order, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel19)
                                .addGap(105, 105, 105)
                                .addComponent(txt_costperunit2, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31)
                                .addComponent(jLabel11)
                                .addGap(83, 83, 83)
                                .addComponent(date_expected, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(69, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(lbl_purchaseorderno))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel6))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(txt_rawnamesearch2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jLabel1))
                    .addComponent(txt_suppname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel17))
                    .addComponent(cmb_rawnamesearch2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18)
                    .addComponent(cmb_suppnameselect, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_rawcode2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_suppid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(11, 11, 11)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel7))
                    .addComponent(txt_unitmeasure2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel10))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(date_order, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(7, 7, 7)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_costperunit2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel19)
                            .addComponent(jLabel11)
                            .addComponent(date_expected, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(11, 11, 11)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel8))
                    .addComponent(txt_qty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addComponent(txt_totalcost, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jButton1)))
                .addGap(15, 15, 15))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(183, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(82, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 668, Short.MAX_VALUE)
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

                            String sql = "SELECT * FROM rawmaterials WHERE name='"+name+"'" ;
                            Connection connection = connect();	
                            Statement st = connection.createStatement();
                            ResultSet rs = st.executeQuery(sql);
                            String stockqty = "";
                            String code="";
                            String unitmeasure="";
                            String reorder="";
                            
                                            

                            while(rs.next()){

                                                stockqty = rs.getString("stockqty");
                                                code = rs.getString("code");
                                                unitmeasure = rs.getString("unitmeasure");
                                                reorder=rs.getString("reorder");
                                               
                                            
                                            }
                    txt_available.setText(stockqty);
                    txt_rawcode.setText(code);
                    txt_unitmeasure.setText(unitmeasure);
                    txt_reorder.setText(reorder);
                    
                    Double av = Double.parseDouble(txt_available.getText());
                    Double re = Double.parseDouble(txt_reorder.getText());
                    
                    if(av <= re){
                    
                   
                            txt_orderstatus.setText("Yes");
                                               
                    }
                    
                    
                    else{
                            
                            txt_orderstatus.setText("Yes");
                    }
                   
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
                     
                                                                                                 
                     String query="INSERT INTO `supplierpurchases`(`rawmaterialname`,`rawmaterialcode`,`unitsofmeasure`,`cost/unit`,`quantity`,`businessname`,`supplierid`,`totalcost`,`expecteddate`,`orderdate`)"
                               + "VALUES ('"+cmb_rawnamesearch2.getSelectedItem()+"','"+txt_rawcode2.getText()+"','"+txt_unitmeasure2.getText()+"','"+txt_costperunit2.getText()+"','"+txt_qty.getText()+"','"+cmb_suppnameselect.getSelectedItem()+"','"+txt_suppid.getText()+"','"+txt_totalcost.getText()+"',"
                             + "'"+dateFormat.format(date_expected.getDate()) +"','"+dateFormat.format(date_order.getDate()) +"')";
       
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
                    String suppbusinessname = (String)cmb_suppnameselect.getSelectedItem();
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

    private void txt_availableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_availableActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_availableActionPerformed
    
    
    
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
    private com.toedter.calendar.JDateChooser date_expected;
    private com.toedter.calendar.JDateChooser date_order;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
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
    private javax.swing.JTextField txt_reorder;
    private javax.swing.JTextField txt_suppid;
    private javax.swing.JTextField txt_suppname;
    private javax.swing.JTextField txt_totalcost;
    private javax.swing.JTextField txt_unitmeasure;
    private javax.swing.JTextField txt_unitmeasure2;
    // End of variables declaration//GEN-END:variables
}
