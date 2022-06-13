package paneles;

import java.awt.Color;
import javax.swing.border.LineBorder;

public class p_examenes extends javax.swing.JPanel {

    public p_examenes(p_subirExamen pse) {
        initComponents();
        this.pse = pse;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        l_titulo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        b_sangre = new javax.swing.JButton();
        b_orina = new javax.swing.JButton();
        b_ambos = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        l_sangre = new javax.swing.JLabel();
        l_orina = new javax.swing.JLabel();
        l_ambos = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(680, 540));
        setMinimumSize(new java.awt.Dimension(680, 540));
        setName("Panel Examenes"); // NOI18N
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSeparator1.setForeground(new java.awt.Color(153, 153, 153));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 270, 200, 10));

        jSeparator2.setForeground(new java.awt.Color(153, 153, 153));
        add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 200, 10));

        jSeparator3.setForeground(new java.awt.Color(153, 153, 153));
        add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 270, 200, 10));

        l_titulo.setFont(new java.awt.Font("Arial", 3, 22)); // NOI18N
        l_titulo.setText("Ingrese los resultados de sus exámenes de...");
        add(l_titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 630, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/sangre.png"))); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/orina.png"))); // NOI18N
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 80, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/sangre_orina.png"))); // NOI18N
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 80, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/info_sangre.png"))); // NOI18N
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 200, 190));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/info_orina.png"))); // NOI18N
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 290, 200, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/info_ambas.png"))); // NOI18N
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 280, 200, 190));

        b_sangre.setBackground(new java.awt.Color(103, 174, 202));
        b_sangre.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        b_sangre.setForeground(new java.awt.Color(255, 255, 255));
        b_sangre.setText("Ingresar");
        b_sangre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(103, 174, 202), 2));
        b_sangre.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b_sangre.setFocusPainted(false);
        b_sangre.setRolloverEnabled(false);
        b_sangre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                b_sangreMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                b_sangreMouseReleased(evt);
            }
        });
        b_sangre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_sangreActionPerformed(evt);
            }
        });
        add(b_sangre, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 480, 100, 30));

        b_orina.setBackground(new java.awt.Color(103, 174, 202));
        b_orina.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        b_orina.setForeground(new java.awt.Color(255, 255, 255));
        b_orina.setText("Ingresar");
        b_orina.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(103, 174, 202), 2));
        b_orina.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b_orina.setFocusPainted(false);
        b_orina.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                b_orinaMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                b_orinaMouseReleased(evt);
            }
        });
        b_orina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_orinaActionPerformed(evt);
            }
        });
        add(b_orina, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 480, 100, 30));

        b_ambos.setBackground(new java.awt.Color(103, 174, 202));
        b_ambos.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        b_ambos.setForeground(new java.awt.Color(255, 255, 255));
        b_ambos.setText("Ingresar");
        b_ambos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(103, 174, 202), 2));
        b_ambos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b_ambos.setFocusPainted(false);
        b_ambos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                b_ambosMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                b_ambosMouseReleased(evt);
            }
        });
        b_ambos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_ambosActionPerformed(evt);
            }
        });
        add(b_ambos, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 480, 100, 30));

        jLabel4.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        jLabel4.setText("Sangre");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, -1, -1));

        jLabel5.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        jLabel5.setText("Orina");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 240, -1, -1));

        jLabel6.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        jLabel6.setText("Ambos");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 240, -1, -1));

        l_sangre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/rectangulo.png"))); // NOI18N
        add(l_sangre, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 220, 470));

        l_orina.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/rectangulo.png"))); // NOI18N
        add(l_orina, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 70, 220, 470));

        l_ambos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/rectangulo.png"))); // NOI18N
        add(l_ambos, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 70, 220, 470));

        getAccessibleContext().setAccessibleName("");
    }// </editor-fold>//GEN-END:initComponents

    private void b_sangreMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b_sangreMousePressed

        b_sangre.setForeground(new Color(103,174,202));
        b_sangre.setBorder(new LineBorder(new Color(103,174,202), 2));
        b_sangre.setBackground(Color.white);
    }//GEN-LAST:event_b_sangreMousePressed

    private void b_sangreMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b_sangreMouseReleased

        b_sangre.setForeground(Color.white);
        b_sangre.setBorder(new LineBorder(new Color(103,174,202), 2));
        b_sangre.setBackground(new Color(103,174,202));
    }//GEN-LAST:event_b_sangreMouseReleased

    private void b_orinaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b_orinaMousePressed
        
        b_orina.setForeground(new Color(103,174,202));
        b_orina.setBorder(new LineBorder(new Color(103,174,202), 2));
        b_orina.setBackground(Color.white);                                   
    }//GEN-LAST:event_b_orinaMousePressed

    private void b_orinaMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b_orinaMouseReleased
        
        b_orina.setForeground(Color.white);
        b_orina.setBorder(new LineBorder(new Color(103,174,202), 2));  
        b_orina.setBackground(new Color(103,174,202));
    }//GEN-LAST:event_b_orinaMouseReleased

    private void b_ambosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b_ambosMousePressed
       
        b_ambos.setForeground(new Color(103,174,202));
        b_ambos.setBorder(new LineBorder(new Color(103,174,202), 2));
        b_ambos.setBackground(Color.white);                                    
    }//GEN-LAST:event_b_ambosMousePressed

    private void b_ambosMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b_ambosMouseReleased
        
        b_ambos.setForeground(Color.white);
        b_ambos.setBorder(new LineBorder(new Color(103,174,202), 2));    
        b_ambos.setBackground(new Color(103,174,202));
    }//GEN-LAST:event_b_ambosMouseReleased

    private void b_sangreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_sangreActionPerformed
        pse.setTipo(1);
        pse.limpiar_campos();
        pse.mostrarSangre();
        this.setVisible(false);
        pse.setVisible(true);
    }//GEN-LAST:event_b_sangreActionPerformed

    private void b_orinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_orinaActionPerformed
        pse.setTipo(2);
        pse.limpiar_campos();
        pse.mostrarOrina();
        this.setVisible(false);
        pse.setVisible(true);
    }//GEN-LAST:event_b_orinaActionPerformed

    private void b_ambosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_ambosActionPerformed
        pse.setTipo(3);
        pse.limpiar_campos();
        pse.mostrarSangre();
        this.setVisible(false);
        pse.setVisible(true);
    }//GEN-LAST:event_b_ambosActionPerformed

    p_subirExamen pse;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b_ambos;
    private javax.swing.JButton b_orina;
    private javax.swing.JButton b_sangre;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel l_ambos;
    private javax.swing.JLabel l_orina;
    private javax.swing.JLabel l_sangre;
    private javax.swing.JLabel l_titulo;
    // End of variables declaration//GEN-END:variables
}
