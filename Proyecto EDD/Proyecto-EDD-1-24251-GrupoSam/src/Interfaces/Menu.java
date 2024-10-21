/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interfaces;

import static Interfaces.Cargar.redApp;
import javax.swing.JOptionPane;

/**
 *
 * @author Moises Liota
 */
public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    public Menu() {
        initComponents();
        this.setVisible(true);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        salir = new javax.swing.JButton();
        sucursal = new javax.swing.JButton();
        recorridos = new javax.swing.JButton();
        cargar = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        establecerT = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        jLabel1.setText("Menu Principal");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 30, -1, -1));

        salir.setText("X");
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });
        jPanel1.add(salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 10, 60, 60));

        sucursal.setText("Sucursales");
        sucursal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sucursalActionPerformed(evt);
            }
        });
        jPanel1.add(sucursal, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 120, 150, -1));

        recorridos.setText("Recorridos");
        recorridos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                recorridosActionPerformed(evt);
            }
        });
        jPanel1.add(recorridos, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 120, 150, -1));

        cargar.setText("Cargar Red");
        cargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cargarActionPerformed(evt);
            }
        });
        jPanel1.add(cargar, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, 150, -1));

        jButton4.setText("Agregar Linea");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 180, 140, -1));

        establecerT.setText("Establecer T");
        establecerT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                establecerTActionPerformed(evt);
            }
        });
        jPanel1.add(establecerT, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 240, 150, -1));

        jButton6.setText("Mostrar Grafo");
        jPanel1.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 240, 140, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 560, 490));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_salirActionPerformed

    private void establecerTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_establecerTActionPerformed
        EstablecerT establecerT = new EstablecerT();
        this.dispose();
    }//GEN-LAST:event_establecerTActionPerformed

    private void cargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cargarActionPerformed
        redApp.destruir();
        Cargar cargarRed = new Cargar();
        this.dispose();
    }//GEN-LAST:event_cargarActionPerformed

    private void sucursalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sucursalActionPerformed
        if(!redApp.isEmpty()){
            Sucursales sucursales = new Sucursales();
            this.dispose();
        }else{
            JOptionPane.showMessageDialog(null, "El grafo esta vacio. Primero debe cargar un grafo.");
        }
    }//GEN-LAST:event_sucursalActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        AgregarLineas agregarLineas = new AgregarLineas();
        this.dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void recorridosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_recorridosActionPerformed
       Recorridos recorridos = new Recorridos();
       this.dispose();
    }//GEN-LAST:event_recorridosActionPerformed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cargar;
    private javax.swing.JButton establecerT;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton recorridos;
    private javax.swing.JButton salir;
    private javax.swing.JButton sucursal;
    // End of variables declaration//GEN-END:variables
}
