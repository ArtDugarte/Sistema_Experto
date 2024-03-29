package paneles;

import globales.MultiLineCellRenderer;
import globales.mensajes;
import globales.validaciones;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelos.modelo;
import modelos.operar_resultados;

public class p_busquedaAvanzada extends javax.swing.JPanel {

    public p_busquedaAvanzada() {
        initComponents();
        iniciar();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        principal = new javax.swing.JPanel();
        nombres = new javax.swing.JTextField();
        apellidos = new javax.swing.JTextField();
        cedula = new javax.swing.JTextField();
        jSeparator7 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        lupa = new javax.swing.JButton();
        b_limpiar = new javax.swing.JButton();
        listado = new javax.swing.JScrollPane();
        lista = new javax.swing.JTable();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(680, 540));
        setMinimumSize(new java.awt.Dimension(680, 540));
        setName("Panel Revisión"); // NOI18N
        setLayout(new java.awt.BorderLayout());

        principal.setBackground(new java.awt.Color(255, 255, 255));
        principal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        nombres.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        nombres.setForeground(new java.awt.Color(102, 102, 102));
        nombres.setText("Nombres:");
        nombres.setBorder(null);
        nombres.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        nombres.setFocusable(false);
        principal.add(nombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 300, 30));

        apellidos.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        apellidos.setForeground(new java.awt.Color(102, 102, 102));
        apellidos.setText("Apellidos:");
        apellidos.setBorder(null);
        apellidos.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        apellidos.setFocusable(false);
        principal.add(apellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 70, 310, 30));

        cedula.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        cedula.setForeground(new java.awt.Color(102, 102, 102));
        cedula.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cedula.setText("Introduzca la cédula del paciente a buscar:");
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
        cedula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cedulaKeyTyped(evt);
            }
        });
        principal.add(cedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 20, 310, 30));

        jSeparator7.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator7.setForeground(new java.awt.Color(0, 0, 0));
        principal.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 50, 310, 10));

        jSeparator5.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator5.setForeground(new java.awt.Color(0, 0, 0));
        principal.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 300, 10));

        jSeparator3.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));
        principal.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 100, 310, 10));

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
        principal.add(lupa, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 10, -1, -1));

        b_limpiar.setBackground(new java.awt.Color(103, 174, 202));
        b_limpiar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        b_limpiar.setForeground(new java.awt.Color(255, 255, 255));
        b_limpiar.setText("Limpiar");
        b_limpiar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(103, 174, 202), 2));
        b_limpiar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b_limpiar.setFocusPainted(false);
        b_limpiar.setRolloverEnabled(false);
        b_limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_limpiarActionPerformed(evt);
            }
        });
        principal.add(b_limpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 500, 500, 30));

        listado.setBorder(null);
        listado.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N

        lista.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lista.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Médico", "Diagnóstico", "Fecha de Envío", "Fecha de Diagnóstico"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        lista.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lista.setEnabled(false);
        lista.setFocusable(false);
        lista.setRequestFocusEnabled(false);
        lista.setRowHeight(50);
        lista.getTableHeader().setReorderingAllowed(false);
        listado.setViewportView(lista);

        principal.add(listado, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 660, 370));

        add(principal, java.awt.BorderLayout.CENTER);

        getAccessibleContext().setAccessibleName("");
    }// </editor-fold>//GEN-END:initComponents

    private void b_limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_limpiarActionPerformed
        limpiar_campos();
    }//GEN-LAST:event_b_limpiarActionPerformed

    private void cedulaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cedulaFocusGained
        cedula.setText("");
    }//GEN-LAST:event_cedulaFocusGained

    private void cedulaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cedulaFocusLost
        if (cedula.getText().equals("")) {
            cedula.setText("Introduzca la cédula del paciente a buscar:");
        }
    }//GEN-LAST:event_cedulaFocusLost

    private void lupaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lupaActionPerformed

        switch (cedula.getText()) {
            case "":
                msg.mensaje("¡La cédula no puede estar vacía!", "alerta");
                break;
            case "Introduzca la cédula del paciente a buscar:":
                msg.mensaje("¡No ha ingresado un valor válido!", "alerta");
                break;
            default:
                modelo m = new operar_resultados().Buscar(cedula.getText());
                DefaultTableModel model = (DefaultTableModel) lista.getModel();
                model.setRowCount(0);

                nombres.setText("Nombres: ");
                apellidos.setText("Apelidos: ");
                if (m != null) {

                    nombres.setText("Nombres: " + m.getNombre());
                    apellidos.setText("Apelidos: " + m.getApellido());

                    ArrayList<modelo> li = new operar_resultados().historial(m.getId_usuario());

                    if (li != null) {

                        for (int i = 0; i < li.size(); i++) {

                            model.addRow(new Object[]{
                                li.get(i).getNombre() + " " + li.get(i).getApellido() + "\n",
                                li.get(i).getDiagnostico_final() + "\n",
                                li.get(i).getFecha_envio() + "\n",
                                li.get(i).getFecha_diagnostico() + "\n"
                            });

                            lista.getColumnModel().getColumn(0).setCellRenderer(new MultiLineCellRenderer());
                            lista.getColumnModel().getColumn(1).setCellRenderer(new MultiLineCellRenderer());
                            lista.getColumnModel().getColumn(2).setCellRenderer(new MultiLineCellRenderer());
                            lista.getColumnModel().getColumn(3).setCellRenderer(new MultiLineCellRenderer());
                        }
                    }
                } else {
                    msg.mensaje("     ¡Paciente no encontrado! ", "error");
                }
                break;
        }
    }//GEN-LAST:event_lupaActionPerformed

    private void cedulaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cedulaKeyTyped
        char c = evt.getKeyChar();
        validador.validarNumeroEntero(c, evt);
        validador.limitarCaracteres(cedula, evt, 9);
    }//GEN-LAST:event_cedulaKeyTyped

    //Métodos y Variables
    public void limpiar_campos() {

        cedula.setText("Introduzca la cédula del paciente a buscar:");
        nombres.setText("Nombres:");
        apellidos.setText("Apellidos:");
        lupa.setEnabled(true);
        DefaultTableModel model = (DefaultTableModel) lista.getModel();
        model.setRowCount(0);
        idExamen = 0;
        aux = null;
    }

    public void iniciar() {
        limpiar_campos();
    }

    int idExamen = 0, tipo = 0;

    modelo aux = null;
    mensajes msg = new mensajes();
    validaciones validador = new validaciones();

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField apellidos;
    private javax.swing.JButton b_limpiar;
    private javax.swing.JTextField cedula;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JTable lista;
    private javax.swing.JScrollPane listado;
    private javax.swing.JButton lupa;
    private javax.swing.JTextField nombres;
    private javax.swing.JPanel principal;
    // End of variables declaration//GEN-END:variables
}
