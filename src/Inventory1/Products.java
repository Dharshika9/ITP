/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inventory1;
import dbConnect.dbcon;
import static dbConnect.dbcon.connect;
import java.awt.Color;
import java.awt.event.ItemEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author Dharshika
 */
public class Products extends javax.swing.JFrame {

    Connection con = null;
    PreparedStatement pst = null;
    PreparedStatement pst1 = null;
    ResultSet rs = null;
    ResultSet rs1 = null;
    public Products() {
        initComponents();
        con= dbcon.connect();
        showjTable();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txt_procost = new javax.swing.JTextField();
        cmb_productcategory = new javax.swing.JComboBox<>();
        cmb_prosubcategory = new javax.swing.JComboBox<>();
        cmb_size = new javax.swing.JComboBox<>();
        cmb_color = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_pro = new javax.swing.JTable();
        lbl_procode = new javax.swing.JLabel();
        cmb_prounitmeasure = new javax.swing.JComboBox<>();
        btn_Insert = new javax.swing.JButton();
        btn_Update = new javax.swing.JButton();
        btn_Delete = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Category");

        jLabel2.setText("Subcategory");

        jLabel3.setText("Size");

        jLabel4.setText("Color");

        jLabel5.setText("Units of measure");

        jLabel6.setText("Cost/unit");

        cmb_productcategory.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Formal Shirt", "Formal Trouser", "Brief" }));
        cmb_productcategory.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmb_productcategoryItemStateChanged(evt);
            }
        });

        cmb_prosubcategory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_prosubcategoryActionPerformed(evt);
            }
        });

        cmb_size.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "S", "L", "XL", "XXL", "XXL" }));

        cmb_color.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Blue" }));

        jTable_pro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "code", "Category", "Subcategory", "Size", "Color", "Unit/measure", "cost/unit"
            }
        ));
        jTable_pro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_proMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable_pro);

        lbl_procode.setText("procode");

        cmb_prounitmeasure.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Package" }));

        btn_Insert.setText("Insert");
        btn_Insert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_InsertActionPerformed(evt);
            }
        });

        btn_Update.setText("Update");
        btn_Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_UpdateActionPerformed(evt);
            }
        });

        btn_Delete.setText("Delete");
        btn_Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_DeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4))
                                .addGap(62, 62, 62)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txt_procost)
                                    .addComponent(cmb_productcategory, 0, 183, Short.MAX_VALUE)
                                    .addComponent(cmb_prosubcategory, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cmb_size, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cmb_color, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cmb_prounitmeasure, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addComponent(lbl_procode)
                                        .addGap(214, 214, 214))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(btn_Delete)
                                            .addComponent(btn_Insert))
                                        .addGap(76, 76, 76)
                                        .addComponent(btn_Update)
                                        .addGap(20, 20, 20))))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 835, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(cmb_productcategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(lbl_procode)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cmb_prosubcategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(cmb_size, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_Insert)
                            .addComponent(btn_Update))))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cmb_color, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Delete))
                .addGap(16, 16, 16)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cmb_prounitmeasure, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txt_procost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(45, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
     public String[] getx(String x)
    {
        String[] y = new String[5];
        if(x.equalsIgnoreCase("Formal Shirt"))
        {
            y[0]="Select";
            y[1] = "Slim Fit Shirt";
            y[2] = "Classic Fit Shirt";
                       
        }
         else if(x.equalsIgnoreCase("Formal Trouser"))
        {
            y[0]="Select";
            y[1] = "Pleated Trouser";
            y[2] = "Flat front Trouser";
           
        }
         else if(x.equalsIgnoreCase("Brief"))
        {
            y[0]="Select";
            y[1] = "Normal Brief";
            y[2] = "Boxer Brief";
           
        }
        
        
        return y;
    }
    
    
    
    private void cmb_productcategoryItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmb_productcategoryItemStateChanged
       if(evt.getStateChange() == ItemEvent.SELECTED)
       {
           if(this.cmb_productcategory.getSelectedIndex()>0)
           {
               this.cmb_prosubcategory.setModel(new DefaultComboBoxModel(this.getx(this.cmb_productcategory.getSelectedItem().toString())));
           }
       }
    }//GEN-LAST:event_cmb_productcategoryItemStateChanged

    private void jTable_proMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_proMouseClicked
         int i=jTable_pro.getSelectedRow();
        TableModel model=jTable_pro.getModel();
        
        lbl_procode.setText(model.getValueAt(i, 0).toString());
        cmb_productcategory.setSelectedItem(model.getValueAt(i, 1).toString());
        cmb_prosubcategory.setSelectedItem(model.getValueAt(i, 2).toString());
        cmb_size.setSelectedItem(model.getValueAt(i, 3).toString());
        cmb_color.setSelectedItem(model.getValueAt(i, 4).toString());
        cmb_prounitmeasure.setSelectedItem(model.getValueAt(i, 5).toString());
        txt_procost.setText(model.getValueAt(i, 6).toString());
        
    }//GEN-LAST:event_jTable_proMouseClicked

    private void btn_InsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_InsertActionPerformed
         String query="INSERT INTO `products`(`procategory`, `prosubcategory`, `size`, `color`, `prounitmeasure`,`procostperunit`) "
                               + "VALUES ('"+cmb_productcategory.getSelectedItem()+"','"+cmb_prosubcategory.getSelectedItem()+"','"+cmb_size.getSelectedItem()+"','"+cmb_color.getSelectedItem()+"','"+cmb_prounitmeasure.getSelectedItem()+"','"+txt_procost.getText()+"')";
        executeSqlQuery(query, "Insert");
    }//GEN-LAST:event_btn_InsertActionPerformed

    private void btn_DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_DeleteActionPerformed
        String query="DELETE FROM `products` WHERE `procode`='"+lbl_procode.getText()+"'";
        executeSqlQuery(query, "Delete");
    }//GEN-LAST:event_btn_DeleteActionPerformed

    private void btn_UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_UpdateActionPerformed
         String query="UPDATE `products` SET `procategory`='"+cmb_productcategory.getSelectedItem()+"',`prosubcategory`='"+cmb_prosubcategory.getSelectedItem()+"',`size`='"+cmb_size.getSelectedItem()+"',`color`='"+cmb_color.getSelectedItem()+"',`prounitmeasure`='"+cmb_prounitmeasure.getSelectedItem()+"',`procostperunit`='"+txt_procost.getText()+"',`procostperunit`='"+txt_procost.getText()+"'WHERE `procode`='"+lbl_procode.getText()+"'";
        executeSqlQuery(query, "Update");
    }//GEN-LAST:event_btn_UpdateActionPerformed

    private void cmb_prosubcategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_prosubcategoryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmb_prosubcategoryActionPerformed

    
     public ArrayList<ProductsModel> getProductsList()
    {
        ArrayList<ProductsModel> productslist=new ArrayList<>();
        Connection connection = connect();
        String query="Select * from products";
        
        Statement st;
        ResultSet rs;
        
        try {
            st=connection.createStatement();
            rs=st.executeQuery(query);
            ProductsModel promodel;
            
            while(rs.next())
            {
                promodel=new ProductsModel(rs.getInt("procode"), rs.getString("procategory"), rs.getString("prosubcategory"), rs.getString("size"), rs.getString("color"), rs.getString("prounitmeasure"), rs.getDouble("procostperunit"));
                productslist.add(promodel);
            }
                    
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return productslist;
    }
     
      public void showjTable()
    {
        ArrayList<ProductsModel> listdata=getProductsList();
        DefaultTableModel model =(DefaultTableModel)jTable_pro.getModel();
        
        Object [] row=new Object[7];
        for(int i = 0;i<listdata.size();i++)
        {
            row[0]=listdata.get(i).getProcode();
            row[1]=listdata.get(i).getProcategory();
            row[2]=listdata.get(i).getProsubcategory();
            row[3]=listdata.get(i).getSize();
            row[4]=listdata.get(i).getColor();
            row[5]=listdata.get(i).getProunitmeasure();
            row[6]=listdata.get(i).getProcostunit();
          
            
            model.addRow(row);
        }
    
    }
      public void ClearField()
    {
        cmb_productcategory.setSelectedItem("Select");
        cmb_prosubcategory.setSelectedItem("Select");
        cmb_size.setSelectedItem("Select");
        cmb_color.setSelectedItem("Select");
        cmb_prounitmeasure.setSelectedItem("Select");
        txt_procost.setText(null);
        
    }
      
        public void executeSqlQuery(String query,String message)
     {
         Connection conn= connect();
         Statement st;
         try {
              st=con.createStatement();
              if((st.executeUpdate(query))==1)
              {
                  // data get refresh after query runs 
                  DefaultTableModel model = (DefaultTableModel)jTable_pro.getModel();
                  model.setRowCount(0);
                  showjTable();
                  
                  
                  // message box
                  JOptionPane.showMessageDialog(null, "Data "+message+" Successfully");
                  ClearField();
              }else{
                  JOptionPane.showMessageDialog(null, "Data "+message+" Failed");
              }
         } catch (Exception e) {
             JOptionPane.showMessageDialog(null, e);
         }
     
     }
     
     
     
     
    
        //main method
   
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Products().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Delete;
    private javax.swing.JButton btn_Insert;
    private javax.swing.JButton btn_Update;
    private javax.swing.JComboBox<String> cmb_color;
    private javax.swing.JComboBox<String> cmb_productcategory;
    private javax.swing.JComboBox<String> cmb_prosubcategory;
    private javax.swing.JComboBox<String> cmb_prounitmeasure;
    private javax.swing.JComboBox<String> cmb_size;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable_pro;
    private javax.swing.JLabel lbl_procode;
    private javax.swing.JTextField txt_procost;
    // End of variables declaration//GEN-END:variables
}
