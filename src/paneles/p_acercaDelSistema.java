package paneles;

import java.awt.Desktop;
import java.io.File;
import modelos.operar_manuales;
import modelos.operar_resultados;

public class p_acercaDelSistema extends javax.swing.JPanel {

    public p_acercaDelSistema(int tipo) {
        initComponents();
        this.tipo = tipo;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fecha_envio = new javax.swing.JTextField();
        fecha_envio1 = new javax.swing.JTextField();
        fecha_envio2 = new javax.swing.JTextField();
        fecha_envio3 = new javax.swing.JTextField();
        fecha_envio4 = new javax.swing.JTextField();
        descargar = new javax.swing.JButton();
        fecha_envio5 = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(680, 540));
        setMinimumSize(new java.awt.Dimension(680, 540));
        setName("Panel Historial"); // NOI18N
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        fecha_envio.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        fecha_envio.setForeground(new java.awt.Color(102, 102, 102));
        fecha_envio.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        fecha_envio.setText("Contacto: arthuro.dugarte@gmail.com");
        fecha_envio.setBorder(null);
        fecha_envio.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        fecha_envio.setFocusable(false);
        add(fecha_envio, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 500, 680, 30));

        fecha_envio1.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        fecha_envio1.setForeground(new java.awt.Color(102, 102, 102));
        fecha_envio1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        fecha_envio1.setText("SISTEMA EXPERTO PARA EL DIAGNÓSTICO DE INFECCIONES");
        fecha_envio1.setBorder(null);
        fecha_envio1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        fecha_envio1.setFocusable(false);
        fecha_envio1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fecha_envio1ActionPerformed(evt);
            }
        });
        add(fecha_envio1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 590, 30));

        fecha_envio2.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        fecha_envio2.setForeground(new java.awt.Color(102, 102, 102));
        fecha_envio2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        fecha_envio2.setText("Y PATOLOGÍAS EN EL ÁREA DE LA GINECOLOGÍA");
        fecha_envio2.setBorder(null);
        fecha_envio2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        fecha_envio2.setFocusable(false);
        fecha_envio2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fecha_envio2ActionPerformed(evt);
            }
        });
        add(fecha_envio2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 590, 30));

        fecha_envio3.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        fecha_envio3.setForeground(new java.awt.Color(102, 102, 102));
        fecha_envio3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        fecha_envio3.setText("(SEDIPG)");
        fecha_envio3.setBorder(null);
        fecha_envio3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        fecha_envio3.setFocusable(false);
        add(fecha_envio3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 590, 30));

        fecha_envio4.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        fecha_envio4.setForeground(new java.awt.Color(102, 102, 102));
        fecha_envio4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        fecha_envio4.setText("Versión 1.0 - Año 2022");
        fecha_envio4.setBorder(null);
        fecha_envio4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        fecha_envio4.setFocusable(false);
        add(fecha_envio4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 590, 30));

        descargar.setBackground(new java.awt.Color(103, 174, 202));
        descargar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        descargar.setForeground(new java.awt.Color(255, 255, 255));
        descargar.setText("Descargar manual de usuario");
        descargar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(103, 174, 202), 2));
        descargar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        descargar.setFocusPainted(false);
        descargar.setRolloverEnabled(false);
        descargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                descargarActionPerformed(evt);
            }
        });
        add(descargar, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 350, 460, 30));

        fecha_envio5.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        fecha_envio5.setForeground(new java.awt.Color(102, 102, 102));
        fecha_envio5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        fecha_envio5.setText("Desarrollado por: Arthuro Dugarte");
        fecha_envio5.setBorder(null);
        fecha_envio5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        fecha_envio5.setFocusable(false);
        add(fecha_envio5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 470, 680, 30));

        getAccessibleContext().setAccessibleName("");
    }// </editor-fold>//GEN-END:initComponents

    private void fecha_envio1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fecha_envio1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fecha_envio1ActionPerformed

    private void fecha_envio2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fecha_envio2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fecha_envio2ActionPerformed

    private void descargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_descargarActionPerformed

        operar_manuales op = new operar_manuales();
        File directorio = new File("C:\\Resultados\\");
        String archivo = null;

        if (!directorio.exists()) {

            if (directorio.mkdirs()) {
                switch (tipo) {
                    case 1:
                        archivo = op.ejecutar_archivo(1);
                        break;
                    case 2:
                        archivo = op.ejecutar_archivo(2);
                        break;
                    default:
                        archivo = op.ejecutar_archivo(3);
                        break;
                }

            }
        } else {
            switch (tipo) {
                case 1:
                    archivo = op.ejecutar_archivo(1);
                    break;
                case 2:
                    archivo = op.ejecutar_archivo(2);
                    break;
                default:
                    archivo = op.ejecutar_archivo(3);
                    break;
            }
        }

        try {
            Desktop.getDesktop().open(new File("C:\\Resultados\\" + archivo + ""));
        } catch (Exception ex) {
        }
    }//GEN-LAST:event_descargarActionPerformed

    int tipo;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton descargar;
    private javax.swing.JTextField fecha_envio;
    private javax.swing.JTextField fecha_envio1;
    private javax.swing.JTextField fecha_envio2;
    private javax.swing.JTextField fecha_envio3;
    private javax.swing.JTextField fecha_envio4;
    private javax.swing.JTextField fecha_envio5;
    // End of variables declaration//GEN-END:variables
}
