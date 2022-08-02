package paneles;

import java.awt.Color;
import java.awt.Desktop;
import java.io.File;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;
import modelos.modelo;
import modelos.operar_examenes;
import modelos.operar_usuarios;

public class p_revision extends javax.swing.JPanel {

    public p_revision() {
        initComponents();
        actualizar_lista();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        principal = new javax.swing.JPanel();
        jSeparator2 = new javax.swing.JSeparator();
        usuario = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        lista = new javax.swing.JTable();
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

        principal.setBackground(new java.awt.Color(255, 255, 255));
        principal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSeparator2.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        principal.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 270, 10));

        usuario.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        usuario.setForeground(new java.awt.Color(102, 102, 102));
        usuario.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        usuario.setText("Exámenes por Revisar");
        usuario.setBorder(null);
        usuario.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        usuario.setFocusable(false);
        principal.add(usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 270, 30));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new javax.swing.BoxLayout(jPanel2, javax.swing.BoxLayout.LINE_AXIS));

        jScrollPane2.setEnabled(false);
        jScrollPane2.setFocusable(false);

        lista.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lista.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "       Fecha                   Cedula                       Tipo             "
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        lista.setFocusable(false);
        lista.getTableHeader().setResizingAllowed(false);
        lista.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(lista);

        jPanel2.add(jScrollPane2);

        principal.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 290, 470));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/nombre_m.png"))); // NOI18N
        principal.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 260, -1, -1));

        nombres.setEditable(false);
        nombres.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        nombres.setForeground(new java.awt.Color(102, 102, 102));
        nombres.setText("Nombres:");
        nombres.setBorder(null);
        nombres.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        nombres.setFocusable(false);
        principal.add(nombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 260, 290, 30));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/apellido_m.png"))); // NOI18N
        principal.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 330, -1, -1));

        apellidos.setEditable(false);
        apellidos.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        apellidos.setForeground(new java.awt.Color(102, 102, 102));
        apellidos.setText("Apellidos:");
        apellidos.setBorder(null);
        apellidos.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        apellidos.setFocusable(false);
        principal.add(apellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 330, 290, 30));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cedula_m.png"))); // NOI18N
        principal.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 180, -1, -1));

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
        principal.add(cedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 180, 230, 30));

        jSeparator7.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator7.setForeground(new java.awt.Color(0, 0, 0));
        principal.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 210, 230, 10));

        jSeparator5.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator5.setForeground(new java.awt.Color(0, 0, 0));
        principal.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 290, 290, 10));

        jSeparator3.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));
        principal.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 360, 290, 10));

        lupa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/lupa_grande.png"))); // NOI18N
        lupa.setBorderPainted(false);
        lupa.setContentAreaFilled(false);
        lupa.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lupa.setFocusPainted(false);
        lupa.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/lupa_grande2.png"))); // NOI18N
        lupa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lupaActionPerformed(evt);
            }
        });
        principal.add(lupa, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 180, -1, -1));

        usuario1.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        usuario1.setForeground(new java.awt.Color(102, 102, 102));
        usuario1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        usuario1.setText("Busqueda");
        usuario1.setBorder(null);
        usuario1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        usuario1.setFocusable(false);
        principal.add(usuario1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 110, 270, 30));

        jSeparator4.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator4.setForeground(new java.awt.Color(0, 0, 0));
        principal.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 140, 270, 10));

        b_revisar.setBackground(new java.awt.Color(103, 174, 202));
        b_revisar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        b_revisar.setForeground(new java.awt.Color(255, 255, 255));
        b_revisar.setText("Revisar");
        b_revisar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(103, 174, 202), 2));
        b_revisar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b_revisar.setEnabled(false);
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
        b_revisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_revisarActionPerformed(evt);
            }
        });
        principal.add(b_revisar, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 430, 100, 30));

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
        principal.add(b_limpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 430, 100, 30));

        add(principal, "card2");

        getAccessibleContext().setAccessibleName("");
    }// </editor-fold>//GEN-END:initComponents

    private void b_revisarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b_revisarMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_b_revisarMousePressed

    private void b_revisarMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b_revisarMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_b_revisarMouseReleased

    private void b_limpiarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b_limpiarMousePressed

        b_limpiar.setForeground(new Color(103, 174, 202));
        b_limpiar.setBorder(new LineBorder(new Color(103, 174, 202), 2));
        b_limpiar.setBackground(Color.white);
    }//GEN-LAST:event_b_limpiarMousePressed

    private void b_limpiarMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b_limpiarMouseReleased

        b_limpiar.setForeground(Color.white);
        b_limpiar.setBorder(new LineBorder(new Color(103, 174, 202), 2));
        b_limpiar.setBackground(new Color(103, 174, 202));
    }//GEN-LAST:event_b_limpiarMouseReleased

    private void b_limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_limpiarActionPerformed
        limpiar_campos();
    }//GEN-LAST:event_b_limpiarActionPerformed

    private void cedulaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cedulaFocusGained
        cedula.setText("");
    }//GEN-LAST:event_cedulaFocusGained

    private void cedulaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cedulaFocusLost
        if (cedula.getText().equals("")) {
            cedula.setText("Cédula:");
        }
    }//GEN-LAST:event_cedulaFocusLost

    private void lupaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lupaActionPerformed
        if (cedula.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "¡La cedula no puede estar vacia! \n        Intente Nuevamente...", "¡ERROR!", JOptionPane.ERROR_MESSAGE);
        } else {

            modelo m = null;
            m = new operar_usuarios().BuscarUsuarioConExamenPendiente(cedula.getText());
            if (m != null) {
                b_revisar.setEnabled(true);
                nombres.setText(m.getNombre());
                apellidos.setText(m.getApellido());
                cedula.setEditable(false);
                cedula.setFocusable(false);
                lupa.setEnabled(false);
                idExamen = m.getId_examen();
            } else {
                JOptionPane.showMessageDialog(null, "¡Este paciente no tiene examenes pendientes! \n        Intente Nuevamente...", "¡ERROR!", JOptionPane.ERROR_MESSAGE);
                limpiar_campos();
            }

        }
    }//GEN-LAST:event_lupaActionPerformed

    private void b_revisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_revisarActionPerformed
        //Se debe descargar el examen
        String archivo = new operar_examenes().ejecutar_archivo(idExamen);
        try {
            Desktop.getDesktop().open(new File("C:\\Resultados\\"+archivo+""));
        } catch (Exception ex) {
        }
        //Luego deben aparecer los examenes de orina, sangre o ambos depende el caso
        //Se acepta la revision
    }//GEN-LAST:event_b_revisarActionPerformed

    //Métodos y Variables
    public void actualizar_lista() {
        ArrayList<modelo> li = new operar_examenes().ExamenesPendientes();
        DefaultTableModel model = (DefaultTableModel) lista.getModel();
        model.setRowCount(0);
        String aux = "";
        if (li != null) {

            for (int i = 0; i < li.size(); i++) {
                if (li.get(i).isSangre() && li.get(i).isOrina()) {
                    aux = " (Sangre y Orina)";
                } else if (li.get(i).isSangre()) {
                    aux = " (Sangre)";
                } else {
                    aux = " (Orina)";
                }

                model.addRow(new Object[]{" {" + li.get(i).getFecha() + "}           " + li.get(i).getCedula() + "         " + aux});
            }
        }
    }

    public void limpiar_campos() {

        cedula.setText("Cédula:");
        nombres.setText("Nombres:");
        apellidos.setText("Apellidos:");
        b_revisar.setEnabled(false);
        cedula.setEditable(true);
        cedula.setFocusable(true);
        lupa.setEnabled(true);
        idExamen = 0;
    }

    int idExamen = 0;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField apellidos;
    private javax.swing.JButton b_limpiar;
    private javax.swing.JButton b_revisar;
    private javax.swing.JTextField cedula;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JTable lista;
    private javax.swing.JButton lupa;
    private javax.swing.JTextField nombres;
    private javax.swing.JPanel principal;
    private javax.swing.JTextField usuario;
    private javax.swing.JTextField usuario1;
    // End of variables declaration//GEN-END:variables
}
