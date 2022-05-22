package paneles;

import java.awt.Color;
import javax.swing.border.LineBorder;

public class p_revision extends javax.swing.JPanel {

    public p_revision() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jSeparator2 = new javax.swing.JSeparator();
        usuario = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        nombres = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        apellidos = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        cedula = new javax.swing.JTextField();
        jSeparator7 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        lupa = new javax.swing.JButton();
        usuario1 = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        b_revisar = new javax.swing.JButton();
        b_limpiar = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(680, 540));
        setMinimumSize(new java.awt.Dimension(680, 540));
        setName("Panel Revisión"); // NOI18N
        setLayout(new java.awt.CardLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSeparator2.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 270, 10));

        usuario.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        usuario.setForeground(new java.awt.Color(102, 102, 102));
        usuario.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        usuario.setText("Exámenes por Revisar");
        usuario.setBorder(null);
        usuario.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        usuario.setFocusable(false);
        jPanel1.add(usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 270, 30));

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 290, 470));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/nombre_m.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 260, -1, -1));

        nombres.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        nombres.setForeground(new java.awt.Color(102, 102, 102));
        nombres.setText("Nombres:");
        nombres.setBorder(null);
        nombres.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        nombres.setFocusable(false);
        jPanel1.add(nombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 260, 290, 30));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/apellido_m.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 330, -1, -1));

        apellidos.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        apellidos.setForeground(new java.awt.Color(102, 102, 102));
        apellidos.setText("Apellidos:");
        apellidos.setBorder(null);
        apellidos.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        apellidos.setFocusable(false);
        jPanel1.add(apellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 330, 290, 30));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cedula_m.png"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 180, -1, -1));

        cedula.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        cedula.setForeground(new java.awt.Color(102, 102, 102));
        cedula.setText("Cédula:");
        cedula.setBorder(null);
        cedula.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        cedula.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                cedulaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                cedulaFocusLost(evt);
            }
        });
        jPanel1.add(cedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 180, 230, 30));

        jSeparator7.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator7.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 210, 230, 10));

        jSeparator5.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator5.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 290, 290, 10));

        jSeparator3.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 360, 290, 10));

        lupa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/lupa_grande.png"))); // NOI18N
        lupa.setBorderPainted(false);
        lupa.setContentAreaFilled(false);
        lupa.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lupa.setFocusPainted(false);
        lupa.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/lupa_grande2.png"))); // NOI18N
        jPanel1.add(lupa, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 180, -1, -1));

        usuario1.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        usuario1.setForeground(new java.awt.Color(102, 102, 102));
        usuario1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        usuario1.setText("Busqueda Avanzada");
        usuario1.setBorder(null);
        usuario1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        usuario1.setFocusable(false);
        jPanel1.add(usuario1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 110, 270, 30));

        jSeparator4.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator4.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 140, 270, 10));

        b_revisar.setBackground(new java.awt.Color(103, 174, 202));
        b_revisar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        b_revisar.setForeground(new java.awt.Color(255, 255, 255));
        b_revisar.setText("Revisar");
        b_revisar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(103, 174, 202), 2));
        b_revisar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b_revisar.setFocusPainted(false);
        b_revisar.setRolloverEnabled(false);
        b_revisar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                b_revisarMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                b_revisarMouseReleased(evt);
            }
        });
        jPanel1.add(b_revisar, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 430, 100, 30));

        b_limpiar.setBackground(new java.awt.Color(103, 174, 202));
        b_limpiar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        b_limpiar.setForeground(new java.awt.Color(255, 255, 255));
        b_limpiar.setText("Limpiar");
        b_limpiar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(103, 174, 202), 2));
        b_limpiar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b_limpiar.setFocusPainted(false);
        b_limpiar.setRolloverEnabled(false);
        b_limpiar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                b_limpiarMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                b_limpiarMouseReleased(evt);
            }
        });
        b_limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_limpiarActionPerformed(evt);
            }
        });
        jPanel1.add(b_limpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 430, 100, 30));

        add(jPanel1, "card2");

        getAccessibleContext().setAccessibleName("");
    }// </editor-fold>//GEN-END:initComponents

    private void b_revisarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b_revisarMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_b_revisarMousePressed

    private void b_revisarMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b_revisarMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_b_revisarMouseReleased

    private void b_limpiarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b_limpiarMousePressed

        b_limpiar.setForeground(new Color(103,174,202));
        b_limpiar.setBorder(new LineBorder(new Color(103,174,202), 2));
        b_limpiar.setBackground(Color.white);
    }//GEN-LAST:event_b_limpiarMousePressed

    private void b_limpiarMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b_limpiarMouseReleased

        b_limpiar.setForeground(Color.white);
        b_limpiar.setBorder(new LineBorder(new Color(103,174,202), 2));
        b_limpiar.setBackground(new Color(103,174,202));
    }//GEN-LAST:event_b_limpiarMouseReleased

    private void b_limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_limpiarActionPerformed
        limpiar_campos();
    }//GEN-LAST:event_b_limpiarActionPerformed

    private void cedulaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cedulaFocusGained
        cedula.setText("");
    }//GEN-LAST:event_cedulaFocusGained

    private void cedulaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cedulaFocusLost
        if(cedula.getText().equals("")){
            cedula.setText("Cédula:");
        }
    }//GEN-LAST:event_cedulaFocusLost

    //Métodos y Variables
    
    public void limpiar_campos(){
    
        cedula.setText("Cédula:");
        nombres.setText("Nombres:");
        apellidos.setText("Apellidos:");
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField apellidos;
    private javax.swing.JButton b_limpiar;
    private javax.swing.JButton b_revisar;
    private javax.swing.JTextField cedula;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JButton lupa;
    private javax.swing.JTextField nombres;
    private javax.swing.JTextField usuario;
    private javax.swing.JTextField usuario1;
    // End of variables declaration//GEN-END:variables
}
