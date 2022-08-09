
package paneles;

public class p_resultados extends javax.swing.JPanel {

    public p_resultados() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel30 = new javax.swing.JLabel();
        usuario3 = new javax.swing.JTextField();
        jSeparator20 = new javax.swing.JSeparator();
        jScrollPane4 = new javax.swing.JScrollPane();
        area_diagnostico_sugerido = new javax.swing.JTextArea();
        b_guardar = new javax.swing.JButton();
        usuario4 = new javax.swing.JTextField();
        jSeparator21 = new javax.swing.JSeparator();
        usuario5 = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(680, 540));
        setMinimumSize(new java.awt.Dimension(680, 540));
        setName("Panel Resultados"); // NOI18N
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel30.setFont(new java.awt.Font("Arial", 3, 24)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(102, 102, 102));
        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel30.setText("RESULTADO");
        add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 20, 210, -1));

        usuario3.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        usuario3.setForeground(new java.awt.Color(102, 102, 102));
        usuario3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        usuario3.setText("Diagnósticado el día: dd/mm/yyyy ");
        usuario3.setBorder(null);
        usuario3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        usuario3.setFocusable(false);
        add(usuario3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, 300, 30));

        jSeparator20.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator20.setForeground(new java.awt.Color(0, 0, 0));
        add(jSeparator20, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 370, 300, 10));

        jScrollPane4.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        area_diagnostico_sugerido.setEditable(false);
        area_diagnostico_sugerido.setColumns(20);
        area_diagnostico_sugerido.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        area_diagnostico_sugerido.setRows(5);
        area_diagnostico_sugerido.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        area_diagnostico_sugerido.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jScrollPane4.setViewportView(area_diagnostico_sugerido);

        add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 590, 190));

        b_guardar.setBackground(new java.awt.Color(103, 174, 202));
        b_guardar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        b_guardar.setForeground(new java.awt.Color(255, 255, 255));
        b_guardar.setText("Descargar documento");
        b_guardar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(103, 174, 202), 2));
        b_guardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b_guardar.setFocusPainted(false);
        b_guardar.setRolloverEnabled(false);
        b_guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_guardarActionPerformed(evt);
            }
        });
        add(b_guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 490, 460, 30));

        usuario4.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        usuario4.setForeground(new java.awt.Color(102, 102, 102));
        usuario4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        usuario4.setText("Su diagnóstico para el exámen subido el dia dd/mm/yyyy es:");
        usuario4.setBorder(null);
        usuario4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        usuario4.setFocusable(false);
        add(usuario4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 590, 30));

        jSeparator21.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator21.setForeground(new java.awt.Color(0, 0, 0));
        add(jSeparator21, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 590, 10));

        usuario5.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        usuario5.setForeground(new java.awt.Color(102, 102, 102));
        usuario5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        usuario5.setText("Aprobado por Nombre Apellido - Especialista Certificado/a");
        usuario5.setBorder(null);
        usuario5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        usuario5.setFocusable(false);
        add(usuario5, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 420, 400, 30));

        getAccessibleContext().setAccessibleName("");
    }// </editor-fold>//GEN-END:initComponents

    private void b_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_guardarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_b_guardarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea area_diagnostico_sugerido;
    private javax.swing.JButton b_guardar;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSeparator jSeparator20;
    private javax.swing.JSeparator jSeparator21;
    private javax.swing.JTextField usuario3;
    private javax.swing.JTextField usuario4;
    private javax.swing.JTextField usuario5;
    // End of variables declaration//GEN-END:variables
}
