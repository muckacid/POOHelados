/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.pedidos.app;

import com.formdev.flatlaf.FlatDarculaLaf;
import com.pedidos.app.event.MiEventoListener;
import com.pedidos.app.forms.FormFlavor;
import com.pedidos.db.mysql.Manager;
import com.pedidos.model.iceScream.Flavor;
import com.pedidos.model.tm.TMFlavor;
import java.awt.event.ActionEvent;
import java.sql.SQLException;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class App extends javax.swing.JFrame implements MiEventoListener {

    private Manager manager;

    public App() {
        initComponents();
        setManager();
        setTableFlavors();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jScrollPane3 = new javax.swing.JScrollPane();
        jEditorPane1 = new javax.swing.JEditorPane();
        jPanel1 = new javax.swing.JPanel();
        app_tabbed = new javax.swing.JTabbedPane();
        tbb_pnl_orders = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        app_table_orders = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        app_filters_cb_rut = new javax.swing.JComboBox<>();
        app_filters_dateEnd = new com.toedter.calendar.JDateChooser();
        app_filters_dateInit = new com.toedter.calendar.JDateChooser();
        app_filters_serch = new javax.swing.JButton();
        tbb_pnl_flavors = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        app_table_flavor = new javax.swing.JTable();
        jPanel7 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        app_flavors_txt_filter_name = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        app_flavor_form_txt_tag = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        app_flavor_form_txt_price = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        app_flavor_form_txt_id = new javax.swing.JTextField();
        app_flavor_form_btn_edit = new javax.swing.JButton();
        app_flavor_form_btn_delete = new javax.swing.JButton();
        app_flavor_form_btn_new = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        app_menu_newFlavor = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        jScrollPane3.setViewportView(jEditorPane1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        app_table_orders.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(app_table_orders);

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Filtros"));

        jLabel1.setText("Rut");

        jLabel2.setText("Fecha");

        app_filters_cb_rut.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        app_filters_serch.setText("Buscar");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(app_filters_serch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(app_filters_cb_rut, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(app_filters_dateInit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(app_filters_dateEnd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(app_filters_cb_rut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(app_filters_dateInit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(app_filters_dateEnd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(app_filters_serch)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout tbb_pnl_ordersLayout = new javax.swing.GroupLayout(tbb_pnl_orders);
        tbb_pnl_orders.setLayout(tbb_pnl_ordersLayout);
        tbb_pnl_ordersLayout.setHorizontalGroup(
            tbb_pnl_ordersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tbb_pnl_ordersLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 718, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        tbb_pnl_ordersLayout.setVerticalGroup(
            tbb_pnl_ordersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tbb_pnl_ordersLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tbb_pnl_ordersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        app_tabbed.addTab("Ordenes", tbb_pnl_orders);

        app_table_flavor.setModel(new javax.swing.table.DefaultTableModel(
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
        app_table_flavor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                app_table_flavorMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(app_table_flavor);

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder("Filtros"));

        jLabel3.setText("Nombre");

        app_flavors_txt_filter_name.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                app_flavors_txt_filter_nameKeyReleased(evt);
            }
        });

        jLabel4.setBackground(new java.awt.Color(255, 51, 51));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(app_flavors_txt_filter_name)
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(app_flavors_txt_filter_name)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 654, Short.MAX_VALUE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Formulario"));

        jLabel5.setText("Sabor");

        jLabel6.setText("Precio");

        jLabel7.setText("ID");

        app_flavor_form_txt_id.setEditable(false);

        app_flavor_form_btn_edit.setText("Guardar");
        app_flavor_form_btn_edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                app_flavor_form_btn_editActionPerformed(evt);
            }
        });

        app_flavor_form_btn_delete.setText("Eliminar");
        app_flavor_form_btn_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                app_flavor_form_btn_deleteActionPerformed(evt);
            }
        });

        app_flavor_form_btn_new.setText("Nuevo");
        app_flavor_form_btn_new.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                app_flavor_form_btn_newActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(app_flavor_form_txt_tag)
                            .addComponent(app_flavor_form_txt_price)
                            .addComponent(app_flavor_form_txt_id)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(app_flavor_form_btn_new)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(app_flavor_form_btn_edit)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(app_flavor_form_btn_delete)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(app_flavor_form_txt_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(app_flavor_form_txt_tag)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(app_flavor_form_txt_price, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(app_flavor_form_btn_edit)
                    .addComponent(app_flavor_form_btn_delete)
                    .addComponent(app_flavor_form_btn_new))
                .addContainerGap())
        );

        javax.swing.GroupLayout tbb_pnl_flavorsLayout = new javax.swing.GroupLayout(tbb_pnl_flavors);
        tbb_pnl_flavors.setLayout(tbb_pnl_flavorsLayout);
        tbb_pnl_flavorsLayout.setHorizontalGroup(
            tbb_pnl_flavorsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tbb_pnl_flavorsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        tbb_pnl_flavorsLayout.setVerticalGroup(
            tbb_pnl_flavorsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tbb_pnl_flavorsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tbb_pnl_flavorsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(tbb_pnl_flavorsLayout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 269, Short.MAX_VALUE))))
        );

        app_tabbed.addTab("Sabores", tbb_pnl_flavors);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(app_tabbed, javax.swing.GroupLayout.PREFERRED_SIZE, 934, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(10, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(app_tabbed)
                .addContainerGap())
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 950, 480));

        jMenu1.setText("Archivo");

        app_menu_newFlavor.setText("Nuevo Sabor");
        app_menu_newFlavor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                app_menu_newFlavorActionPerformed(evt);
            }
        });
        jMenu1.add(app_menu_newFlavor);

        jMenuItem2.setText("Nuevo Topping");
        jMenu1.add(jMenuItem2);

        jMenuItem3.setText("Nuevo Tamaño");
        jMenu1.add(jMenuItem3);

        jMenuItem4.setText("Nuevo Formato");
        jMenu1.add(jMenuItem4);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void app_menu_newFlavorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_app_menu_newFlavorActionPerformed
        FormFlavor form = new FormFlavor(manager, this);
        form.setVisible(true);
    }//GEN-LAST:event_app_menu_newFlavorActionPerformed

    private void app_flavors_txt_filter_nameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_app_flavors_txt_filter_nameKeyReleased
        try {
            String filter = app_flavors_txt_filter_name.getText();
            chargeTableFlavor(manager.getDAOFlavor().getByName(filter));
        } catch (SQLException ex) {
            System.out.println("Error al filtrar la lista de datos");
        }
    }//GEN-LAST:event_app_flavors_txt_filter_nameKeyReleased

    private void app_table_flavorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_app_table_flavorMouseClicked
        int fila = app_table_flavor.getSelectedRow();
        app_flavor_form_txt_id.setText(String.valueOf(app_table_flavor.getValueAt(fila, 0)));
        app_flavor_form_txt_tag.setText(String.valueOf(app_table_flavor.getValueAt(fila, 1)));
        app_flavor_form_txt_price.setText(String.valueOf(app_table_flavor.getValueAt(fila, 2)));

        // TODO add your handling code here:
    }//GEN-LAST:event_app_table_flavorMouseClicked

    private void app_flavor_form_btn_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_app_flavor_form_btn_deleteActionPerformed

//        Flavor t = new Flavor();
//        String texto = app_flavor_form_txt_id.getText();
//        int id = Integer.parseInt(texto);
//        t.setId(id);
//        String nombre = app_flavor_form_txt_tag.getText();
//        t.setTag(nombre);
//        String precio_txt_x = app_flavor_form_txt_price.getText().split(" ")[1];
//        int precio_int = Integer.parseInt(precio_txt_x);
//        t.setPrice(precio_int);
//        
//        String id_txt = app_flavor_form_txt_id.getText();
//        String nombre_txt = app_flavor_form_txt_tag.getText();
//        String precio_txt = app_flavor_form_txt_price.getText().split(" ")[1];
//        Flavor sabor = new Flavor(Integer.parseInt(id_txt), nombre_txt, Integer.parseInt(precio_txt));
        Flavor t = new Flavor();
        t.setId(Integer.parseInt(app_flavor_form_txt_id.getText()));
        t.setTag(app_flavor_form_txt_tag.getText());
        t.setPrice(Integer.parseInt(app_flavor_form_txt_price.getText().split(" ")[1]));

        try {
            manager.getDAOFlavor().delete(t);
        } catch (SQLException ex) {
            System.out.println("Error al intentar eliminar el sabor");
        }

        setTableFlavors();
        cleanFormFlavor();
    }//GEN-LAST:event_app_flavor_form_btn_deleteActionPerformed

    private void app_flavor_form_btn_editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_app_flavor_form_btn_editActionPerformed
        Flavor t = new Flavor();
        t.setId(Integer.parseInt(app_flavor_form_txt_id.getText()));
        t.setTag(app_flavor_form_txt_tag.getText());
        t.setPrice(Integer.parseInt(app_flavor_form_txt_price.getText().split(" ")[1]));
        try {
            manager.getDAOFlavor().update(t);
        } catch (SQLException ex) {
            System.out.println("Error al intentar eliminar el sabor");
        }
    }//GEN-LAST:event_app_flavor_form_btn_editActionPerformed

    private void app_flavor_form_btn_newActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_app_flavor_form_btn_newActionPerformed
        cleanFormFlavor();
        // TODO add your handling code here:
    }//GEN-LAST:event_app_flavor_form_btn_newActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        try {
            UIManager.setLookAndFeel(new FlatDarculaLaf());
        } catch (UnsupportedLookAndFeelException ex) {
            System.out.println("Error al cargar look and feel");
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(() -> {
            App app = new App();
            app.setVisible(true);

        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> app_filters_cb_rut;
    private com.toedter.calendar.JDateChooser app_filters_dateEnd;
    private com.toedter.calendar.JDateChooser app_filters_dateInit;
    private javax.swing.JButton app_filters_serch;
    private javax.swing.JButton app_flavor_form_btn_delete;
    private javax.swing.JButton app_flavor_form_btn_edit;
    private javax.swing.JButton app_flavor_form_btn_new;
    private javax.swing.JTextField app_flavor_form_txt_id;
    private javax.swing.JTextField app_flavor_form_txt_price;
    private javax.swing.JTextField app_flavor_form_txt_tag;
    private javax.swing.JTextField app_flavors_txt_filter_name;
    private javax.swing.JMenuItem app_menu_newFlavor;
    private javax.swing.JTabbedPane app_tabbed;
    private javax.swing.JTable app_table_flavor;
    private javax.swing.JTable app_table_orders;
    private javax.swing.JEditorPane jEditorPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JPanel tbb_pnl_flavors;
    private javax.swing.JPanel tbb_pnl_orders;
    // End of variables declaration//GEN-END:variables

    private void setManager() {
        try {
            manager = new Manager();
        } catch (SQLException ex) {
            System.out.println("Error al intentar obtener el manager");
        }
    }

    private void chargeTableFlavor(List<Flavor> flavorList) {
        TMFlavor tmFlavor = new TMFlavor(flavorList);
        app_table_flavor.setModel(tmFlavor);
    }

    private void setTableFlavors() {
        try {
            chargeTableFlavor(manager.getDAOFlavor().getAll());
        } catch (SQLException ex) {
            System.out.println("Error al filtrar la lista de todos los datos");
        }
    }

    private void cleanFormFlavor() {
        app_flavor_form_txt_id.setText("");
        app_flavor_form_txt_tag.setText("");
        app_flavor_form_txt_price.setText("");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            chargeTableFlavor(manager.getDAOFlavor().getAll());
        } catch (SQLException ex) {
            System.out.println("No se pudo imprimir la tabla");
        }
    }
}
