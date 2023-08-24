/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Formularios;

import Interfaces.Vista;

public class FrmMenu extends javax.swing.JFrame {

    /**
     * Creates new form FrmMenu
     */
    public FrmMenu() {
        initComponents();
        Vista.maximize(this);
        //Maximize el formulario utilizando la interface View
        //Cargar datos utilizando clase Data.
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktopMenu = new javax.swing.JDesktopPane();
        menu = new javax.swing.JMenuBar();
        menuManage = new javax.swing.JMenu();
        menuHabitaciones = new javax.swing.JMenuItem();
        menuServicios = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout desktopMenuLayout = new javax.swing.GroupLayout(desktopMenu);
        desktopMenu.setLayout(desktopMenuLayout);
        desktopMenuLayout.setHorizontalGroup(
            desktopMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1005, Short.MAX_VALUE)
        );
        desktopMenuLayout.setVerticalGroup(
            desktopMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 535, Short.MAX_VALUE)
        );

        menu.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        menuManage.setText("Administrar");
        menuManage.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        menuHabitaciones.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_H, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        menuHabitaciones.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        menuHabitaciones.setText("Habitaciones");
        menuHabitaciones.setToolTipText("");
        menuHabitaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuHabitacionesActionPerformed(evt);
            }
        });
        menuManage.add(menuHabitaciones);

        menuServicios.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        menuServicios.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        menuServicios.setText("Servicios");
        menuServicios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuServiciosActionPerformed(evt);
            }
        });
        menuManage.add(menuServicios);

        menu.add(menuManage);

        setJMenuBar(menu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopMenu)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopMenu, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuHabitacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuHabitacionesActionPerformed
        FrmHabitaciones habitaciones = new FrmHabitaciones();
        Vista.showInternal(desktopMenu, habitaciones);
    }//GEN-LAST:event_menuHabitacionesActionPerformed

    private void menuServiciosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuServiciosActionPerformed
        FrmServicios servicios = new FrmServicios();
        Vista.showInternal(desktopMenu,servicios);
    }//GEN-LAST:event_menuServiciosActionPerformed

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
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane desktopMenu;
    private javax.swing.JMenuBar menu;
    private javax.swing.JMenuItem menuHabitaciones;
    private javax.swing.JMenu menuManage;
    private javax.swing.JMenuItem menuServicios;
    // End of variables declaration//GEN-END:variables
}
