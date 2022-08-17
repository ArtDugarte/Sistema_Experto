package paneles;

import globales.Validaciones;
import globales.encriptacion;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.border.LineBorder;
import modelos.modelo;
import modelos.operar_usuarios;

public class p_registrarUsuarios extends javax.swing.JPanel {

    public p_registrarUsuarios(String usuario) {
        initComponents();
        this.usuario = usuario;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        r_botones = new javax.swing.ButtonGroup();
        clave = new javax.swing.JTextField();
        apellidos = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        pregunta = new javax.swing.JComboBox<>();
        nombres = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        respuesta = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();
        cedula = new javax.swing.JTextField();
        jSeparator7 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        b_limpiar = new javax.swing.JButton();
        b_registrar = new javax.swing.JButton();
        b_borrar = new javax.swing.JButton();
        b_modificar = new javax.swing.JButton();
        lupa = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        rb_asistente = new javax.swing.JRadioButton();
        rb_paciente = new javax.swing.JRadioButton();
        rb_medico = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jSeparator8 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        jSeparator9 = new javax.swing.JSeparator();
        jLabel9 = new javax.swing.JLabel();
        correo = new javax.swing.JTextField();
        edad = new javax.swing.JComboBox<>();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(680, 540));
        setMinimumSize(new java.awt.Dimension(680, 540));
        setName("Panel Registrar Pacientes"); // NOI18N
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        clave.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        clave.setForeground(new java.awt.Color(102, 102, 102));
        clave.setText("Contraseña:");
        clave.setBorder(null);
        clave.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        clave.setFocusable(false);
        clave.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                claveFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                claveFocusLost(evt);
            }
        });
        clave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                claveActionPerformed(evt);
            }
        });
        add(clave, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 370, 540, 30));

        apellidos.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        apellidos.setForeground(new java.awt.Color(102, 102, 102));
        apellidos.setText("Apellidos:");
        apellidos.setBorder(null);
        apellidos.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        apellidos.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                apellidosFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                apellidosFocusLost(evt);
            }
        });
        add(apellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 120, 540, 30));

        jSeparator3.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));
        add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 470, 540, 10));

        jSeparator4.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator4.setForeground(new java.awt.Color(0, 0, 0));
        add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 400, 540, 10));

        pregunta.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        pregunta.setForeground(new java.awt.Color(102, 102, 102));
        pregunta.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "¿CUÁL ES TU LIBRO FAVORITO?", "¿COMO SE LLAMA TU MEJOR AMIGO DE LA INFANCIA?", "¿CUÁL ERA EL NOMBRE DE TU PRIMERA MASCOTA?", "¿EN QUÉ CIUDAD SE CONOCIERON TUS PADRES?", "¿CUÁL ES TU EQUIPO FAVORITO?", "¿CUÁL FUÉ TU PRIMERA PELÍCULA EN EL CINE?", "¿CUÁL ES TU GRUPO O CANTANTE FAVORITO?", "¿CUÁL ES TU COLOR FAVORITO?", "¿COMO TE LLAMABAN EN TU INFANCIA?", "¿CÓMO SE LLAMABA TU PRIMER JEFE?" }));
        pregunta.setBorder(null);
        pregunta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pregunta.setFocusable(false);
        pregunta.setName("Desplegable"); // NOI18N
        add(pregunta, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 240, 540, 40));

        nombres.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        nombres.setForeground(new java.awt.Color(102, 102, 102));
        nombres.setText("Nombres:");
        nombres.setBorder(null);
        nombres.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        nombres.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                nombresFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                nombresFocusLost(evt);
            }
        });
        add(nombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 70, 540, 30));

        jSeparator5.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator5.setForeground(new java.awt.Color(0, 0, 0));
        add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 100, 540, 10));

        respuesta.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        respuesta.setForeground(new java.awt.Color(102, 102, 102));
        respuesta.setText("Respuesta de seguridad");
        respuesta.setBorder(null);
        respuesta.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        respuesta.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                respuestaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                respuestaFocusLost(evt);
            }
        });
        add(respuesta, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 300, 540, 30));

        jSeparator6.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator6.setForeground(new java.awt.Color(0, 0, 0));
        add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 330, 540, 10));

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
        cedula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cedulaKeyTyped(evt);
            }
        });
        add(cedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, 250, 30));

        jSeparator7.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator7.setForeground(new java.awt.Color(0, 0, 0));
        add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 50, 250, 10));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/tipo_usuario.png"))); // NOI18N
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 440, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/nombre_m.png"))); // NOI18N
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/apellido_m.png"))); // NOI18N
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cedula_m.png"))); // NOI18N
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/respuesta_segu.png"))); // NOI18N
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, -1, -1));

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
        add(b_limpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 500, 100, 30));

        b_registrar.setBackground(new java.awt.Color(103, 174, 202));
        b_registrar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        b_registrar.setForeground(new java.awt.Color(255, 255, 255));
        b_registrar.setText("Registrar");
        b_registrar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(103, 174, 202), 2));
        b_registrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b_registrar.setFocusPainted(false);
        b_registrar.setRolloverEnabled(false);
        b_registrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                b_registrarMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                b_registrarMouseReleased(evt);
            }
        });
        b_registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_registrarActionPerformed(evt);
            }
        });
        add(b_registrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 500, 100, 30));

        b_borrar.setBackground(new java.awt.Color(103, 174, 202));
        b_borrar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        b_borrar.setForeground(new java.awt.Color(255, 255, 255));
        b_borrar.setText("Borrar");
        b_borrar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(103, 174, 202), 2));
        b_borrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b_borrar.setEnabled(false);
        b_borrar.setFocusPainted(false);
        b_borrar.setRolloverEnabled(false);
        b_borrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                b_borrarMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                b_borrarMouseReleased(evt);
            }
        });
        b_borrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_borrarActionPerformed(evt);
            }
        });
        add(b_borrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 500, 100, 30));

        b_modificar.setBackground(new java.awt.Color(103, 174, 202));
        b_modificar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        b_modificar.setForeground(new java.awt.Color(255, 255, 255));
        b_modificar.setText("Modificar");
        b_modificar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(103, 174, 202), 2));
        b_modificar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b_modificar.setEnabled(false);
        b_modificar.setFocusPainted(false);
        b_modificar.setRolloverEnabled(false);
        b_modificar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                b_modificarMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                b_modificarMouseReleased(evt);
            }
        });
        b_modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_modificarActionPerformed(evt);
            }
        });
        add(b_modificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 500, 100, 30));

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
        add(lupa, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 20, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/seguridad_m.png"))); // NOI18N
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, -1, -1));

        rb_asistente.setBackground(new java.awt.Color(255, 255, 255));
        r_botones.add(rb_asistente);
        rb_asistente.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        rb_asistente.setForeground(new java.awt.Color(102, 102, 102));
        rb_asistente.setText("Asistente");
        rb_asistente.setBorder(null);
        rb_asistente.setContentAreaFilled(false);
        rb_asistente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        rb_asistente.setFocusPainted(false);
        add(rb_asistente, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 450, -1, -1));

        rb_paciente.setBackground(new java.awt.Color(255, 255, 255));
        r_botones.add(rb_paciente);
        rb_paciente.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        rb_paciente.setForeground(new java.awt.Color(102, 102, 102));
        rb_paciente.setSelected(true);
        rb_paciente.setText("Paciente");
        rb_paciente.setBorder(null);
        rb_paciente.setContentAreaFilled(false);
        rb_paciente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        rb_paciente.setFocusPainted(false);
        add(rb_paciente, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 450, -1, -1));

        rb_medico.setBackground(new java.awt.Color(255, 255, 255));
        r_botones.add(rb_medico);
        rb_medico.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        rb_medico.setForeground(new java.awt.Color(102, 102, 102));
        rb_medico.setText("Médico");
        rb_medico.setBorder(null);
        rb_medico.setContentAreaFilled(false);
        rb_medico.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        rb_medico.setFocusPainted(false);
        add(rb_medico, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 450, 80, -1));

        jLabel1.setFont(new java.awt.Font("Arial", 3, 15)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setText("Tipo de Usuario:");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 450, -1, -1));

        jSeparator8.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator8.setForeground(new java.awt.Color(0, 0, 0));
        add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 150, 540, 10));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/clave_m.png"))); // NOI18N
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 370, -1, -1));

        jSeparator9.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator9.setForeground(new java.awt.Color(0, 0, 0));
        add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 210, 540, 10));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/correo.png"))); // NOI18N
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, -1, -1));

        correo.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        correo.setForeground(new java.awt.Color(102, 102, 102));
        correo.setText("Correo:");
        correo.setBorder(null);
        correo.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        correo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                correoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                correoFocusLost(evt);
            }
        });
        correo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                correoActionPerformed(evt);
            }
        });
        add(correo, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 180, 540, 30));

        edad.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        edad.setForeground(new java.awt.Color(102, 102, 102));
        edad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--EDAD--", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59", "60", "61", "62", "63", "64", "65", "66", "67", "68", "69", "70", "71", "72", "73", "74", "75", "76", "77", "78", "79", "80", "81", "82", "83", "84", "85", "86", "87", "88", "89", "90", "91", "92", "93", "94", "95", "96", "97", "98", "99", "100", " " }));
        edad.setBorder(null);
        edad.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        edad.setFocusable(false);
        edad.setName("Desplegable"); // NOI18N
        add(edad, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 20, 110, 40));

        getAccessibleContext().setAccessibleName("");
    }// </editor-fold>//GEN-END:initComponents

    private void respuestaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_respuestaFocusGained
        respuesta.setText("");
    }//GEN-LAST:event_respuestaFocusGained

    private void respuestaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_respuestaFocusLost
        if (respuesta.getText().equals("")) {
            respuesta.setText("Respuesta de seguridad");
        }
    }//GEN-LAST:event_respuestaFocusLost

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

    private void b_registrarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b_registrarMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_b_registrarMousePressed

    private void b_registrarMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b_registrarMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_b_registrarMouseReleased

    private void b_borrarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b_borrarMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_b_borrarMousePressed

    private void b_borrarMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b_borrarMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_b_borrarMouseReleased

    private void b_modificarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b_modificarMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_b_modificarMousePressed

    private void b_modificarMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b_modificarMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_b_modificarMouseReleased

    private void cedulaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cedulaFocusGained
        cedula.setText("");
    }//GEN-LAST:event_cedulaFocusGained

    private void cedulaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cedulaFocusLost
        if (cedula.getText().equals("")) {
            cedula.setText("Cédula:");
        }
    }//GEN-LAST:event_cedulaFocusLost

    private void nombresFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nombresFocusGained
        nombres.setText("");
    }//GEN-LAST:event_nombresFocusGained

    private void nombresFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nombresFocusLost
        if (nombres.getText().equals("")) {
            nombres.setText("Nombres:");
        }
    }//GEN-LAST:event_nombresFocusLost

    private void apellidosFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_apellidosFocusGained
        apellidos.setText("");
    }//GEN-LAST:event_apellidosFocusGained

    private void apellidosFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_apellidosFocusLost
        if (apellidos.getText().equals("")) {
            apellidos.setText("Apellidos:");
        }
    }//GEN-LAST:event_apellidosFocusLost

    private void b_registrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_registrarActionPerformed

        if (cedula.getText().equals("") || nombres.getText().equals("") || apellidos.getText().equals("") || respuesta.getText().equals("") || correo.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "¡Campos Vacíos! \n        Intente Nuevamente...", "¡ERROR!", JOptionPane.ERROR_MESSAGE);
        } else if (cedula.getText().equals("Cédula:") || nombres.getText().equals("Nombres:") || correo.getText().equals("Correo:")
                || apellidos.getText().equals("Apellidos:") || respuesta.getText().equals("Respuesta de seguridad")) {
            JOptionPane.showMessageDialog(null, "¡Campos por Defecto! \n        Intente Nuevamente...", "¡ERROR!", JOptionPane.ERROR_MESSAGE);
        } else if (edad.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(null, "¡Debe seleccionar una edad! \n        Intente Nuevamente...", "¡ERROR!", JOptionPane.ERROR_MESSAGE);
        } else {
            int tipo_usuario;

            if (rb_paciente.isSelected()) {

                tipo_usuario = 3;

            } else if (rb_asistente.isSelected()) {

                tipo_usuario = 2;

            } else {
                tipo_usuario = 1;
            }

            operar_usuarios op = new operar_usuarios();
            op.Crear(cedula.getText(), nombres.getText().toUpperCase(), apellidos.getText().toUpperCase(), correo.getText().toUpperCase(), Integer.parseInt(edad.getSelectedItem().toString()),
                    pregunta.getSelectedItem() + "", encrip.encriptar(respuesta.getText()), encrip.encriptar(cedula.getText()), tipo_usuario);
            limpiar_campos();
        }
    }//GEN-LAST:event_b_registrarActionPerformed

    private void lupaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lupaActionPerformed
        if (cedula.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "¡Campo Vacío! \n        Intente Nuevamente...", "¡ERROR!", JOptionPane.ERROR_MESSAGE);
        } else if (cedula.getText().equals(usuario)) {
            JOptionPane.showMessageDialog(null, "¡Para editar sus datos, ingrese a la seccion de Ajustes! \n        Intente Nuevamente...", "¡ERROR!", JOptionPane.ERROR_MESSAGE);
        } else {
            modelo m;
            m = new operar_usuarios().Buscar(cedula.getText());
            if (m != null) {

                switch (m.getTipo_usuario()) {
                    case 1:
                        rb_medico.setSelected(true);
                        break;
                    case 2:
                        rb_asistente.setSelected(true);
                        break;
                    case 3:
                        rb_paciente.setSelected(true);
                        break;
                }

                nombres.setFocusable(false);
                apellidos.setFocusable(false);
                correo.setFocusable(false); //Auxiliares
                nombres.setText(m.getNombre());
                apellidos.setText(m.getApellido());
                pregunta.setSelectedItem(m.getPregunta());
                edad.setSelectedItem(m.getEdad() + "");
                correo.setText(m.getCorreo());
                b_borrar.setEnabled(true);
                b_modificar.setEnabled(true);
                b_registrar.setEnabled(false);
                lupa.setEnabled(false);
                clave.setFocusable(true);
                clave.requestFocus();
                cedula.setFocusable(false);
                nombres.setFocusable(true);
                apellidos.setFocusable(true);
                correo.setFocusable(true); //Auxiliares

            } else {
                JOptionPane.showMessageDialog(null, "¡El usuario no existe! \n        Intente Nuevamente...", "¡ERROR!", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_lupaActionPerformed

    private void b_borrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_borrarActionPerformed
        if (cedula.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "¡Campo Vacío! \n        Intente Nuevamente...", "¡ERROR!", JOptionPane.ERROR_MESSAGE);
        } else if (cedula.getText().equals(usuario)) {
            JOptionPane.showMessageDialog(null, "¡No puede borrarse a si mismo! \n        Intente Nuevamente...", "¡ERROR!", JOptionPane.ERROR_MESSAGE);
        } else {
            new operar_usuarios().Borrar(cedula.getText());
            limpiar_campos();
        }
    }//GEN-LAST:event_b_borrarActionPerformed

    private void b_modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_modificarActionPerformed
        if (nombres.getText().equals("") || apellidos.getText().equals("") || respuesta.getText().equals("") || cedula.getText().equals("") || clave.getText().equals("")
                || correo.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "¡Campos Vacíos! \n        Intente Nuevamente...", "¡ERROR!", JOptionPane.ERROR_MESSAGE);
        } else if (cedula.getText().equals("Cédula:") || nombres.getText().equals("Nombres:") || correo.getText().equals("Correo:")
                || apellidos.getText().equals("Apellidos:") || respuesta.getText().equals("Respuesta de seguridad") || edad.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(null, "¡Valores por defecto presentes! \n        Intente Nuevamente...", "¡ERROR!", JOptionPane.ERROR_MESSAGE);
        } else {
            int tipo_usuario;

            if (rb_paciente.isSelected()) {

                tipo_usuario = 3;

            } else if (rb_asistente.isSelected()) {

                tipo_usuario = 2;

            } else {
                tipo_usuario = 1;
            }

            operar_usuarios op = new operar_usuarios();
            op.Modificar(cedula.getText(), nombres.getText().toUpperCase(), apellidos.getText().toUpperCase(), correo.getText().toUpperCase(), Integer.parseInt(edad.getSelectedItem().toString()), 
                    pregunta.getSelectedItem() + "", encrip.encriptar(respuesta.getText()), encrip.encriptar(clave.getText()), tipo_usuario);
            limpiar_campos();
        }
    }//GEN-LAST:event_b_modificarActionPerformed

    private void claveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_claveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_claveActionPerformed

    private void claveFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_claveFocusLost
        if (clave.getText().equals("")) {
            clave.setText("Contraseña:");
        }
    }//GEN-LAST:event_claveFocusLost

    private void claveFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_claveFocusGained

        clave.setText("");
    }//GEN-LAST:event_claveFocusGained

    private void cedulaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cedulaKeyTyped
        char c = evt.getKeyChar();
        validador.validarNumeroEntero(c, evt);
    }//GEN-LAST:event_cedulaKeyTyped

    private void correoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_correoFocusGained
        correo.setText("");
    }//GEN-LAST:event_correoFocusGained

    private void correoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_correoFocusLost
        if (correo.getText().equals("")) {
            correo.setText("Correo:");
        }
    }//GEN-LAST:event_correoFocusLost

    private void correoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_correoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_correoActionPerformed

    //Metodos y Variables
    encriptacion encrip = new encriptacion();
    String usuario = "";
    private Validaciones validador = new Validaciones();

    public void limpiar_campos() {

        pregunta.setSelectedIndex(0); //Aqui se debe poner el codigo SQL para que se marque la pregunta de la persona
        respuesta.setText("Respuesta de seguridad"); //Aqui se debe poner la respuesta de la persona
        clave.setText("Contraseña:");
        cedula.setText("Cédula:");
        nombres.setText("Nombres:");
        apellidos.setText("Apellidos:");
        rb_paciente.setSelected(true);
        lupa.setEnabled(true);
        clave.setFocusable(false);
        b_borrar.setEnabled(false);
        b_modificar.setEnabled(false);
        b_registrar.setEnabled(true);
        cedula.setFocusable(true);
        correo.setText("Correo:");
        edad.setSelectedIndex(0);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField apellidos;
    private javax.swing.JButton b_borrar;
    private javax.swing.JButton b_limpiar;
    private javax.swing.JButton b_modificar;
    private javax.swing.JButton b_registrar;
    private javax.swing.JTextField cedula;
    private javax.swing.JTextField clave;
    private javax.swing.JTextField correo;
    private javax.swing.JComboBox<String> edad;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JButton lupa;
    private javax.swing.JTextField nombres;
    private javax.swing.JComboBox<String> pregunta;
    private javax.swing.ButtonGroup r_botones;
    private javax.swing.JRadioButton rb_asistente;
    private javax.swing.JRadioButton rb_medico;
    private javax.swing.JRadioButton rb_paciente;
    private javax.swing.JTextField respuesta;
    // End of variables declaration//GEN-END:variables
}
