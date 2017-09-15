/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Order_management;

import DbConn.dbconnect;
import java.awt.Color;
import java.awt.Event;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showMessageDialog;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Ganador
 */
public class Order_details extends javax.swing.JFrame {

    Connection con = null;
    PreparedStatement pst = null;
    // PreparedStatement pst1 = null;
    ResultSet rs = null;
    // ResultSet rs1 = null;

    public Order_details() {
        initComponents();
        con = dbconnect.connect();
        tableload();
        showdate();
    }

    public void tableload() {

        try {
            String sql = "SELECT * FROM orders";
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();

            t1.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception e) {
            System.out.println(e);
        }
    }
 public void showdate(){
    
        Date d1 = new Date();
        SimpleDateFormat s = new SimpleDateFormat("YYYY-MM-dd");
        jTextField8.setText(s.format(d1));
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        jTextField9 = new javax.swing.JTextField();
        jSeparator8 = new javax.swing.JSeparator();
        jLabel21 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        t1 = new javax.swing.JTable();
        jTextField10 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel11 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(270, 80));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1130, 610));

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Order Date");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 280, 90, -1));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Order_ID");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 190, -1, -1));

        jTextField4.setBackground(new java.awt.Color(102, 102, 102));
        jTextField4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTextField4.setForeground(new java.awt.Color(255, 255, 255));
        jTextField4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField4.setBorder(null);
        jTextField4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField4KeyPressed(evt);
            }
        });
        jPanel2.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 230, 260, 30));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Customer Id");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 290, -1, -1));

        jTextField5.setBackground(new java.awt.Color(102, 102, 102));
        jTextField5.setForeground(new java.awt.Color(255, 255, 255));
        jTextField5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField5.setBorder(null);
        jPanel2.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 270, 260, 30));

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("PO Quantity");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 330, -1, -1));

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Dilivery Date");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 320, -1, -1));

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Fabric Discription");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 240, 90, -1));

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("ID");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 90, -1, -1));

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Fabric Code");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 200, 80, -1));

        jTextField6.setBackground(new java.awt.Color(102, 102, 102));
        jTextField6.setForeground(new java.awt.Color(255, 255, 255));
        jTextField6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField6.setBorder(null);
        jPanel2.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 310, 260, 30));

        jTextField7.setBackground(new java.awt.Color(102, 102, 102));
        jTextField7.setForeground(new java.awt.Color(255, 255, 255));
        jTextField7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField7.setBorder(null);
        jPanel2.add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 310, 260, 30));

        jTextField8.setBackground(new java.awt.Color(102, 102, 102));
        jTextField8.setForeground(new java.awt.Color(255, 255, 255));
        jTextField8.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField8.setBorder(null);
        jPanel2.add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 270, 260, 30));
        jPanel2.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 260, 260, 20));
        jPanel2.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 300, 260, 30));
        jPanel2.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 340, 260, 30));
        jPanel2.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 300, 260, 30));
        jPanel2.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 340, 260, 40));
        jPanel2.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 260, 260, 40));

        jTextField9.setBackground(new java.awt.Color(102, 102, 102));
        jTextField9.setForeground(new java.awt.Color(255, 255, 255));
        jTextField9.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField9.setBorder(null);
        jPanel2.add(jTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 190, 260, 30));
        jPanel2.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 220, 260, 20));

        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("NO");
        jPanel2.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 180, 90, 20));

        t1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Order ID", "Customer Id", "Product code", "PO Quantity", "Order Date", "Fabric type", "Delivery Date", "Fabric description"
            }
        ));
        t1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                t1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(t1);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 510, 1060, 100));

        jTextField10.setBackground(new java.awt.Color(102, 102, 102));
        jTextField10.setForeground(new java.awt.Color(255, 255, 255));
        jTextField10.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField10.setBorder(null);
        jPanel2.add(jTextField10, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 230, 260, 30));

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Product code");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 240, -1, -1));

        jSeparator1.setForeground(new java.awt.Color(255, 0, 0));
        jSeparator1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, 1010, 5));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Order Details");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 40, -1, -1));

        jPanel4.setBackground(new java.awt.Color(51, 51, 51));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel4MouseExited(evt);
            }
        });
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel16.setBackground(new java.awt.Color(153, 153, 153));
        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("ADD Customer");
        jPanel5.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 200, 40));

        jPanel4.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 220, 40));

        jLabel14.setBackground(new java.awt.Color(153, 153, 153));
        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("ADD Order");
        jLabel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel14MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel14MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel14MouseExited(evt);
            }
        });
        jPanel4.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 160, 40));

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 420, 180, 40));

        jPanel6.setBackground(new java.awt.Color(51, 51, 51));
        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel6MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel6MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel6MouseExited(evt);
            }
        });
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel15.setBackground(new java.awt.Color(153, 153, 153));
        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("Delete Order");
        jLabel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel15MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel15MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel15MouseExited(evt);
            }
        });
        jPanel6.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 160, 40));

        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel17.setBackground(new java.awt.Color(153, 153, 153));
        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("Delete Customer");
        jPanel7.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 200, 40));

        jPanel6.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 220, 40));

        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel18.setBackground(new java.awt.Color(153, 153, 153));
        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("Delete Customer");
        jPanel9.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 200, 40));

        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel19.setBackground(new java.awt.Color(153, 153, 153));
        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("Delete Customer");
        jPanel10.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 200, 40));

        jPanel9.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 220, 40));

        jPanel6.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 220, 40));

        jPanel2.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 420, 180, 40));

        jPanel8.setBackground(new java.awt.Color(51, 51, 51));
        jPanel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jLabel20.setBackground(new java.awt.Color(153, 153, 153));
        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("Cancel");
        jLabel20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel20MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel20MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel20MouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel2.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 420, -1, -1));

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        jPanel2.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 90, 220, 30));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Search");
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 130, 100, -1));

        jPanel13.setBackground(new java.awt.Color(51, 51, 51));
        jPanel13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jLabel23.setBackground(new java.awt.Color(153, 153, 153));
        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setText("Update Order");
        jLabel23.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel23MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel23MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel23MouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel2.add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 420, -1, -1));

        jPanel11.setBackground(new java.awt.Color(51, 51, 51));
        jPanel11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jLabel24.setBackground(new java.awt.Color(153, 153, 153));
        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel24.setText("Clear");
        jLabel24.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel24MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel24MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel24MouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel2.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 420, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 678, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jPanel6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel6MouseExited

    }//GEN-LAST:event_jPanel6MouseExited

    private void jPanel6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel6MouseEntered

    }//GEN-LAST:event_jPanel6MouseEntered

    private void jPanel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel6MouseClicked

    }//GEN-LAST:event_jPanel6MouseClicked

    private void jPanel4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MouseExited

    }//GEN-LAST:event_jPanel4MouseExited

    private void jPanel4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MouseEntered

    }//GEN-LAST:event_jPanel4MouseEntered

    private void jLabel20MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel20MouseClicked
        this.dispose();
    }//GEN-LAST:event_jLabel20MouseClicked

    private void jTextField4KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField4KeyPressed

    }//GEN-LAST:event_jTextField4KeyPressed

    private void jLabel23MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel23MouseClicked
        int x = JOptionPane.showConfirmDialog(null, "Do you really want to update?");
        String OId = jLabel21.getText();
        if(x==0){

        String Pcode = jTextField4.getText();
        String Cid = jTextField5.getText();
        String PQ = jTextField6.getText();
        String Fabcode = jTextField9.getText();
        String Fabdes = jTextField10.getText();
        String OrdDate = jTextField8.getText();
        String delDate = jTextField7.getText();
                                                   
        
//update Order
            String sql = "UPDATE orders SET product_code= '"+Pcode+"', cus_id= '"+Cid+"', quantity= '"+PQ+"', facbri_code= '"+Fabcode+"',fabric_des= '"+Fabdes+"', Order_date= '"+OrdDate+"', delivery_date= '"+delDate+"' WHERE Order_id = '"+OId+"'";

            try {
                pst = con.prepareStatement(sql);
                pst.execute();
                     
            
            } catch (Exception e) {
            }

            //load table
           tableload();
            JOptionPane.showMessageDialog(null, "Succesfully updated.");
        }
    }//GEN-LAST:event_jLabel23MouseClicked

    private void jLabel14MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseEntered
        jPanel4.setBackground(new Color(0, 0, 0));
    }//GEN-LAST:event_jLabel14MouseEntered

    private void jLabel14MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseExited
        jPanel4.setBackground(new Color(51, 51, 51));
    }//GEN-LAST:event_jLabel14MouseExited

    private void jLabel15MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseEntered
        jPanel6.setBackground(new Color(0, 0, 0));
    }//GEN-LAST:event_jLabel15MouseEntered

    private void jLabel15MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseExited
        jPanel6.setBackground(new Color(51, 51, 51));
    }//GEN-LAST:event_jLabel15MouseExited

    private void jLabel23MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel23MouseEntered
        jPanel13.setBackground(new Color(0, 0, 0));        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel23MouseEntered

    private void jLabel23MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel23MouseExited
        jPanel13.setBackground(new Color(51, 51, 51));
    }//GEN-LAST:event_jLabel23MouseExited

    private void jLabel20MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel20MouseEntered
        jPanel8.setBackground(new Color(0, 0, 0));
    }//GEN-LAST:event_jLabel20MouseEntered

    private void jLabel20MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel20MouseExited
        jPanel8.setBackground(new Color(51, 51, 51));
    }//GEN-LAST:event_jLabel20MouseExited

    private void jLabel24MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel24MouseClicked
        jLabel21.setText("No");
        jTextField4.setText(null);
        jTextField5.setText(null);
        jTextField6.setText(null);
        jTextField9.setText(null);
        jTextField10.setText(null);
        jTextField8.setText(null);
        jTextField7.setText(null);
        tableload();
    }//GEN-LAST:event_jLabel24MouseClicked

    private void jLabel24MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel24MouseEntered
        jPanel11.setBackground(new Color(0, 0, 0));
    }//GEN-LAST:event_jLabel24MouseEntered

    private void jLabel24MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel24MouseExited
        jPanel11.setBackground(new Color(51, 51, 51));
    }//GEN-LAST:event_jLabel24MouseExited

    private void jLabel14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseClicked
        
        String Pcode = jTextField4.getText();
        String Cid = jTextField5.getText();
        String PQ = jTextField6.getText();
        String Fabcode = jTextField9.getText();
        String Fabdes = jTextField10.getText();
        String OrdDate = jTextField8.getText();
        String delDate = jTextField7.getText();
        
      try{
        
       if(Pcode.isEmpty() || Cid.isEmpty() || PQ.isEmpty()||Fabcode.isEmpty()||Fabdes.isEmpty()||OrdDate.isEmpty()||delDate.isEmpty())
       {
           JOptionPane.showMessageDialog(null, "Empty field detected !");
       }
       //check exist customer
       String sql ="SELECT * FROM customer  "; 
                        pst = con.prepareStatement(sql);
                        rs =pst.executeQuery();
                        
                        while(rs.next()){
                          String cid=rs.getString("id");
                            
                            if(!Cid.equals(cid)){
                                showMessageDialog(null,"Access Denied");
                                jTextField5.setText(null);}
                            
                            }
        
        try {
            String d = "insert into orders(product_code,cus_id,quantity,facbri_code,fabric_des,Order_date,delivery_date) values ('"+Pcode+"','"+Cid+"','"+PQ+"','"+Fabcode+"','"+Fabdes+"','"+OrdDate+"','"+delDate+"')";
            pst = con.prepareStatement(d);
            pst.execute();

            JOptionPane.showMessageDialog(null, "Succesfully added");

        } catch (Exception e) {
            System.out.println(e);
        }
        }
        catch(Exception e){
            System.out.println(e);
        }
        jLabel21.setText("No");
        jTextField4.setText(null);
        jTextField5.setText(null);
        jTextField6.setText(null);
        jTextField9.setText(null);
        jTextField10.setText(null);
        jTextField8.setText(null);
        jTextField7.setText(null);

        tableload();
    }//GEN-LAST:event_jLabel14MouseClicked

    private void t1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_t1MouseClicked
       //table load into textfield
        
        int r = t1.getSelectedRow();
        String OId = t1.getValueAt(r, 0).toString();
        String Pcode = t1.getValueAt(r, 1).toString();
        String Cid = t1.getValueAt(r, 2).toString();
        String PQ = t1.getValueAt(r, 3).toString();
        String Fabcode = t1.getValueAt(r,4).toString();
        String Fabdes = t1.getValueAt(r, 5).toString();
        String OrdDate = t1.getValueAt(r, 6).toString();
        String DelDate = t1.getValueAt(r, 7).toString();
        
        jLabel21.setText(OId);
        jTextField4.setText(Pcode);
        jTextField5.setText(Cid);
        jTextField6.setText(PQ);
        jTextField9.setText(Fabcode);
        jTextField10.setText(Fabdes);
        jTextField8.setText(OrdDate);
        jTextField7.setText(DelDate);
    }//GEN-LAST:event_t1MouseClicked

    private void jLabel15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseClicked
        int x = JOptionPane.showConfirmDialog(null, "Do you really want to delete this?");

        if(x==0){
            String OId = jLabel21.getText();

            String sql = "DELETE FROM orders WHERE Order_id = '"+OId+"'";

            try {
                pst = con.prepareStatement(sql);

                pst.execute();

                
                JOptionPane.showMessageDialog(null, "Succesfully deleted.");
                tableload();
            } 
            catch (Exception e) {
            }
        }
    }//GEN-LAST:event_jLabel15MouseClicked

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        String order_id = jTextField2.getText();  
            //Search customer
            String sql="SELECT * FROM orders WHERE Order_id LIKE '%"+order_id+"%'";
            
            try 
            {
                pst =con.prepareStatement(sql);
                rs = pst.executeQuery();
                t1.setModel(DbUtils.resultSetToTableModel(rs));
                
              
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
    }//GEN-LAST:event_jLabel10MouseClicked

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
            java.util.logging.Logger.getLogger(Order_details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Order_details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Order_details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Order_details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Order_details().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JTable t1;
    // End of variables declaration//GEN-END:variables
}
