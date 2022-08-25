package vistas;

import BD.BDConex;
import com.sun.awt.AWTUtilities;
import globales.validaciones;
import globales.encriptacion;
import globales.mensajes;
import java.awt.Color;
import java.awt.Shape;
import java.awt.geom.RoundRectangle2D;
import javax.swing.JOptionPane;
import javax.swing.border.LineBorder;
import modelos.modelo;
import modelos.operar_resultados;
import modelos.operar_usuarios;

public class login extends javax.swing.JFrame {

    public login() {

        initComponents();
        setLocationRelativeTo(null);
        Shape forma = new RoundRectangle2D.Double(0, 0, getBounds().width, getBounds().height, 20, 20);
        AWTUtilities.setWindowShape(this, forma);
        new operar_resultados().borrarDocumentosViejos();
        ingreso.setVisible(true);
        olvido_contra.setVisible(false);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        base = new javax.swing.JPanel();
        izq = new javax.swing.JPanel();
        jEImagePanel1 = new LIB.JEImagePanel();
        der = new javax.swing.JPanel();
        olvido_contra = new javax.swing.JPanel();
        usuario_olvido = new javax.swing.JTextField();
        nueva_clave = new javax.swing.JPasswordField();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        ico_clave1 = new javax.swing.JLabel();
        ico_usu1 = new javax.swing.JLabel();
        modificar = new javax.swing.JButton();
        salir_OC = new javax.swing.JButton();
        volver_login = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        lupa = new javax.swing.JButton();
        ico_usu2 = new javax.swing.JLabel();
        pregunta_olvido = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        ico_usu3 = new javax.swing.JLabel();
        respuesta_olvido = new javax.swing.JTextField();
        ingreso = new javax.swing.JPanel();
        usuario = new javax.swing.JTextField();
        clave = new javax.swing.JPasswordField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        ico_clave = new javax.swing.JLabel();
        ico_usu = new javax.swing.JLabel();
        ingresar = new javax.swing.JButton();
        salir = new javax.swing.JButton();
        olvido_clave = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 255, 255));
        setMinimumSize(new java.awt.Dimension(800, 500));
        setName("login"); // NOI18N
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new java.awt.GridLayout(1, 0));

        base.setBackground(new java.awt.Color(255, 255, 255));
        base.setLayout(new java.awt.GridLayout(1, 2));

        izq.setBackground(new java.awt.Color(103, 86, 130));
        izq.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 1, new java.awt.Color(255, 255, 255)));
        izq.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jEImagePanel1.setFocusable(false);
        jEImagePanel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo2.png"))); // NOI18N
        jEImagePanel1.setOpaque(false);

        javax.swing.GroupLayout jEImagePanel1Layout = new javax.swing.GroupLayout(jEImagePanel1);
        jEImagePanel1.setLayout(jEImagePanel1Layout);
        jEImagePanel1Layout.setHorizontalGroup(
            jEImagePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 350, Short.MAX_VALUE)
        );
        jEImagePanel1Layout.setVerticalGroup(
            jEImagePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 360, Short.MAX_VALUE)
        );

        izq.add(jEImagePanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 350, 360));

        base.add(izq);

        der.setBackground(new java.awt.Color(103, 174, 202));
        der.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 1, 0, 0, new java.awt.Color(255, 255, 255)));
        der.setLayout(new java.awt.CardLayout());

        olvido_contra.setBackground(new java.awt.Color(103, 174, 202));
        olvido_contra.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        usuario_olvido.setBackground(new java.awt.Color(103, 174, 202));
        usuario_olvido.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        usuario_olvido.setForeground(new java.awt.Color(255, 255, 255));
        usuario_olvido.setText("Usuario");
        usuario_olvido.setBorder(null);
        usuario_olvido.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        usuario_olvido.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                usuario_olvidoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                usuario_olvidoFocusLost(evt);
            }
        });
        usuario_olvido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                usuario_olvidoKeyTyped(evt);
            }
        });
        olvido_contra.add(usuario_olvido, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 190, 250, 30));

        nueva_clave.setBackground(new java.awt.Color(103, 174, 202));
        nueva_clave.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        nueva_clave.setForeground(new java.awt.Color(255, 255, 255));
        nueva_clave.setText("contraseña");
        nueva_clave.setBorder(null);
        nueva_clave.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        nueva_clave.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                nueva_claveFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                nueva_claveFocusLost(evt);
            }
        });
        nueva_clave.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nueva_claveKeyTyped(evt);
            }
        });
        olvido_contra.add(nueva_clave, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 340, 250, 30));

        jSeparator3.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator3.setForeground(new java.awt.Color(255, 255, 255));
        olvido_contra.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 370, 250, 10));

        jSeparator4.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator4.setForeground(new java.awt.Color(255, 255, 255));
        olvido_contra.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 220, 250, 10));

        ico_clave1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/clave.png"))); // NOI18N
        ico_clave1.setFocusable(false);
        olvido_contra.add(ico_clave1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 340, 30, 30));

        ico_usu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/usuario.png"))); // NOI18N
        ico_usu1.setFocusable(false);
        olvido_contra.add(ico_usu1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, 20, 30));

        modificar.setBackground(new java.awt.Color(103, 174, 202));
        modificar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        modificar.setForeground(new java.awt.Color(255, 255, 255));
        modificar.setText("Modificar");
        modificar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        modificar.setContentAreaFilled(false);
        modificar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        modificar.setEnabled(false);
        modificar.setFocusPainted(false);
        modificar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                modificarMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                modificarMouseReleased(evt);
            }
        });
        modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarActionPerformed(evt);
            }
        });
        olvido_contra.add(modificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 400, 100, 30));

        salir_OC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/salir.png"))); // NOI18N
        salir_OC.setBorderPainted(false);
        salir_OC.setContentAreaFilled(false);
        salir_OC.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        salir_OC.setFocusPainted(false);
        salir_OC.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/salir2.png"))); // NOI18N
        salir_OC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                salir_OCMouseClicked(evt);
            }
        });
        olvido_contra.add(salir_OC, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 10, -1, -1));

        volver_login.setBackground(new java.awt.Color(103, 174, 202));
        volver_login.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        volver_login.setForeground(new java.awt.Color(255, 255, 255));
        volver_login.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/volver1.png"))); // NOI18N
        volver_login.setText("Volver al Login");
        volver_login.setBorder(null);
        volver_login.setBorderPainted(false);
        volver_login.setContentAreaFilled(false);
        volver_login.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        volver_login.setFocusPainted(false);
        volver_login.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                volver_loginMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                volver_loginMouseReleased(evt);
            }
        });
        volver_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volver_loginActionPerformed(evt);
            }
        });
        olvido_contra.add(volver_login, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 440, 160, 30));

        jLabel2.setFont(new java.awt.Font("Berlin Sans FB Demi", 2, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("¿Olvidó su Contraseña?");
        olvido_contra.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 380, -1));

        lupa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/lupa1.png"))); // NOI18N
        lupa.setBorderPainted(false);
        lupa.setContentAreaFilled(false);
        lupa.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lupa.setFocusPainted(false);
        lupa.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/lupa2.png"))); // NOI18N
        lupa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lupaActionPerformed(evt);
            }
        });
        olvido_contra.add(lupa, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 190, 30, 30));

        ico_usu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/pregunta.png"))); // NOI18N
        ico_usu2.setFocusable(false);
        olvido_contra.add(ico_usu2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, 20, 30));

        pregunta_olvido.setEditable(false);
        pregunta_olvido.setBackground(new java.awt.Color(103, 174, 202));
        pregunta_olvido.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        pregunta_olvido.setForeground(new java.awt.Color(255, 255, 255));
        pregunta_olvido.setText("Pregunta de Seguridad");
        pregunta_olvido.setBorder(null);
        pregunta_olvido.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        olvido_contra.add(pregunta_olvido, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 240, 250, 30));

        jSeparator5.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator5.setForeground(new java.awt.Color(255, 255, 255));
        olvido_contra.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 270, 250, 10));

        jSeparator6.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator6.setForeground(new java.awt.Color(255, 255, 255));
        olvido_contra.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 320, 250, 10));

        ico_usu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/respuesta.png"))); // NOI18N
        ico_usu3.setFocusable(false);
        olvido_contra.add(ico_usu3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 290, 20, 30));

        respuesta_olvido.setBackground(new java.awt.Color(103, 174, 202));
        respuesta_olvido.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        respuesta_olvido.setForeground(new java.awt.Color(255, 255, 255));
        respuesta_olvido.setText("Respuesta");
        respuesta_olvido.setBorder(null);
        respuesta_olvido.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        respuesta_olvido.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                respuesta_olvidoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                respuesta_olvidoFocusLost(evt);
            }
        });
        olvido_contra.add(respuesta_olvido, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 290, 250, 30));

        der.add(olvido_contra, "card2");

        ingreso.setBackground(new java.awt.Color(103, 174, 202));
        ingreso.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        usuario.setBackground(new java.awt.Color(103, 174, 202));
        usuario.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        usuario.setForeground(new java.awt.Color(255, 255, 255));
        usuario.setText("Usuario");
        usuario.setBorder(null);
        usuario.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        usuario.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                usuarioFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                usuarioFocusLost(evt);
            }
        });
        usuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                usuarioKeyTyped(evt);
            }
        });
        ingreso.add(usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 190, 250, 30));

        clave.setBackground(new java.awt.Color(103, 174, 202));
        clave.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        clave.setForeground(new java.awt.Color(255, 255, 255));
        clave.setText("contraseña");
        clave.setBorder(null);
        clave.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        clave.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                claveFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                claveFocusLost(evt);
            }
        });
        clave.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                claveKeyTyped(evt);
            }
        });
        ingreso.add(clave, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 250, 250, 30));

        jSeparator1.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        ingreso.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 280, 250, 10));

        jSeparator2.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator2.setForeground(new java.awt.Color(255, 255, 255));
        ingreso.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 220, 250, 10));

        ico_clave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/clave.png"))); // NOI18N
        ico_clave.setFocusable(false);
        ingreso.add(ico_clave, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 250, 30, 30));

        ico_usu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/usuario.png"))); // NOI18N
        ico_usu.setFocusable(false);
        ingreso.add(ico_usu, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, 20, 30));

        ingresar.setBackground(new java.awt.Color(103, 174, 202));
        ingresar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        ingresar.setForeground(new java.awt.Color(255, 255, 255));
        ingresar.setText("Ingresar");
        ingresar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        ingresar.setContentAreaFilled(false);
        ingresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ingresar.setFocusPainted(false);
        ingresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ingresarMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                ingresarMouseReleased(evt);
            }
        });
        ingresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ingresarActionPerformed(evt);
            }
        });
        ingreso.add(ingresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 350, 100, 30));

        salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/salir.png"))); // NOI18N
        salir.setBorderPainted(false);
        salir.setContentAreaFilled(false);
        salir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        salir.setFocusPainted(false);
        salir.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/salir2.png"))); // NOI18N
        salir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                salirMouseClicked(evt);
            }
        });
        ingreso.add(salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 10, -1, -1));

        olvido_clave.setBackground(new java.awt.Color(103, 174, 202));
        olvido_clave.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        olvido_clave.setForeground(new java.awt.Color(255, 255, 255));
        olvido_clave.setText("¿Olvidó su contraseña?");
        olvido_clave.setBorder(null);
        olvido_clave.setBorderPainted(false);
        olvido_clave.setContentAreaFilled(false);
        olvido_clave.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        olvido_clave.setFocusPainted(false);
        olvido_clave.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                olvido_claveMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                olvido_claveMouseReleased(evt);
            }
        });
        olvido_clave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                olvido_claveActionPerformed(evt);
            }
        });
        ingreso.add(olvido_clave, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 390, 210, 30));

        jLabel1.setFont(new java.awt.Font("Berlin Sans FB Demi", 2, 50)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Bienvenido");
        ingreso.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 70, 260, -1));

        der.add(ingreso, "card2");

        base.add(der);

        getContentPane().add(base);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ingresarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ingresarMousePressed

        ingresar.setForeground(new Color(204, 204, 204));
        ingresar.setBorder(new LineBorder(new Color(204, 204, 204), 2));
    }//GEN-LAST:event_ingresarMousePressed

    private void ingresarMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ingresarMouseReleased

        ingresar.setForeground(Color.WHITE);
        ingresar.setBorder(new LineBorder(Color.white, 2));
    }//GEN-LAST:event_ingresarMouseReleased

    private void olvido_claveMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_olvido_claveMousePressed

        olvido_clave.setForeground(new Color(204, 204, 204));
    }//GEN-LAST:event_olvido_claveMousePressed

    private void olvido_claveMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_olvido_claveMouseReleased

        olvido_clave.setForeground(Color.WHITE);
    }//GEN-LAST:event_olvido_claveMouseReleased

    private void usuarioFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_usuarioFocusGained

        usuario.setText("");
    }//GEN-LAST:event_usuarioFocusGained

    private void claveFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_claveFocusGained

        clave.setText("");


    }//GEN-LAST:event_claveFocusGained

    private void salirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salirMouseClicked

        salir();
    }//GEN-LAST:event_salirMouseClicked

    private void usuario_olvidoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_usuario_olvidoFocusGained

        usuario_olvido.setText("");

    }//GEN-LAST:event_usuario_olvidoFocusGained

    private void nueva_claveFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nueva_claveFocusGained

        nueva_clave.setText("");

    }//GEN-LAST:event_nueva_claveFocusGained

    private void modificarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modificarMousePressed

        modificar.setForeground(new Color(204, 204, 204));
        modificar.setBorder(new LineBorder(new Color(204, 204, 204), 2));

    }//GEN-LAST:event_modificarMousePressed

    private void modificarMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modificarMouseReleased

        modificar.setForeground(Color.WHITE);
        modificar.setBorder(new LineBorder(Color.white, 2));

    }//GEN-LAST:event_modificarMouseReleased

    private void salir_OCMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salir_OCMouseClicked

        salir();
    }//GEN-LAST:event_salir_OCMouseClicked

    private void volver_loginMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_volver_loginMousePressed

        volver_login.setForeground(new Color(204, 204, 204));
        volver_login.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/volver2.png")));

    }//GEN-LAST:event_volver_loginMousePressed

    private void volver_loginMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_volver_loginMouseReleased

        volver_login.setForeground(Color.WHITE);
        volver_login.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/volver1.png")));

    }//GEN-LAST:event_volver_loginMouseReleased

    private void olvido_claveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_olvido_claveActionPerformed

        ingreso.setVisible(false);
        olvido_contra.setVisible(true);
        usuario_olvido.setText("Usuario");
        pregunta_olvido.setText("Pregunta de Seguridad");
        respuesta_olvido.setText("Respuesta");
        nueva_clave.setText("Contraseña");
        lupa.setEnabled(true);
        modificar.setEnabled(false);
        usuario_olvido.setFocusable(true);

    }//GEN-LAST:event_olvido_claveActionPerformed

    private void volver_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volver_loginActionPerformed

        ingreso.setVisible(true);
        olvido_contra.setVisible(false);
        usuario.setText("Usuario");
        clave.setText("Contraseña");

    }//GEN-LAST:event_volver_loginActionPerformed

    private void respuesta_olvidoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_respuesta_olvidoFocusGained

        respuesta_olvido.setText("");

    }//GEN-LAST:event_respuesta_olvidoFocusGained

    private void ingresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingresarActionPerformed

        if (usuario.getText().equals("") || clave.getText().equals("") || usuario.getText().equals("Usuario")) {
            msg.mensaje("¡Algún campo está vacío o por defecto!", "alerta");
        } else {

            operar_usuarios op = new operar_usuarios();
            String resultado = op.Ingresar(usuario.getText(), encrip.encriptar(clave.getText()));
            int tipo, id_usuario = 0;
            String nombre = null;

            if (!resultado.equals("")) {

                int aux = resultado.indexOf("-");
                id_usuario = Integer.parseInt(resultado.substring(0, aux));
                tipo = Integer.parseInt(resultado.substring(aux + 1, aux + 2));
                nombre = resultado.substring(aux + 3);

            } else {
                tipo = 4;
            }

            switch (tipo) {
                case 1:
                    principal_experto pe = new principal_experto(usuario.getText(), nombre, tipo);
                    pe.setVisible(true);
                    this.dispose();
                    break;
                case 3:
                    principal_paciente p = new principal_paciente(usuario.getText(), nombre, id_usuario, tipo);
                    p.setVisible(true);
                    this.dispose();
                    break;
                case 2:
                    principal_asistente pa = new principal_asistente(usuario.getText(), nombre, tipo);
                    pa.setVisible(true);
                    this.dispose();
                    break;
                default:
                    msg.mensaje("¡Credenciales no válidas!", "error");
                    break;
            }
        }
    }//GEN-LAST:event_ingresarActionPerformed

    private void claveFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_claveFocusLost
        if (clave.getText().equals("")) {
            clave.setText("Contraseña");
        }
    }//GEN-LAST:event_claveFocusLost

    private void usuarioFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_usuarioFocusLost
        if (usuario.getText().equals("")) {
            usuario.setText("Usuario");
        }
    }//GEN-LAST:event_usuarioFocusLost

    private void usuario_olvidoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_usuario_olvidoFocusLost
        if (usuario_olvido.getText().equals("")) {
            usuario_olvido.setText("Usuario");
        }
    }//GEN-LAST:event_usuario_olvidoFocusLost

    private void respuesta_olvidoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_respuesta_olvidoFocusLost
        if (respuesta_olvido.getText().equals("")) {
            respuesta_olvido.setText("Respuesta");
        }
    }//GEN-LAST:event_respuesta_olvidoFocusLost

    private void nueva_claveFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nueva_claveFocusLost
        if (nueva_clave.getText().equals("")) {
            nueva_clave.setText("Contraseña");
        }
    }//GEN-LAST:event_nueva_claveFocusLost

    private void lupaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lupaActionPerformed
        if (usuario_olvido.getText().equals("") || usuario_olvido.getText().equals("Usuario")) {
            msg.mensaje("¡Usuario vacío o no válido!", "alerta");
        } else if (usuario_olvido.getText().equals("00000000")) {
            msg.mensaje("¡No puedes recuperar los datos del administrador!", "alerta");
            usuario_olvido.setText("Usuario");
        } else {
            modelo m = new operar_usuarios().Buscar(usuario_olvido.getText());
            if (m != null) {
                pregunta_olvido.setText(m.getPregunta());
                modificar.setEnabled(true);
                lupa.setEnabled(false);
                usuario_olvido.setFocusable(false);
            } else {
                msg.mensaje("¡El usuario no existe!", "error");
            }
        }
    }//GEN-LAST:event_lupaActionPerformed

    private void modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarActionPerformed

        if (respuesta_olvido.getText().equals("") || nueva_clave.getText().equals("")) {
            msg.mensaje("¡Algún campo está vacío!", "alerta");
        } else if (nueva_clave.getText().length() < 7 || nueva_clave.getText().length() > 10) {
            msg.mensaje("¡La contraseña debe tener entre 7 y 10 carácteres!", "alerta");
        } else {
            new operar_usuarios().Modificar(usuario_olvido.getText(), encrip.encriptar(respuesta_olvido.getText()), encrip.encriptar(nueva_clave.getText()));
            usuario_olvido.setText("Usuario");
            nueva_clave.setText("Contraseña");
            pregunta_olvido.setText("Pregunta de Seguridad");
            respuesta_olvido.setText("Respuesta");
            lupa.setEnabled(true);
            modificar.setEnabled(false);
            usuario_olvido.setFocusable(true);

        }
    }//GEN-LAST:event_modificarActionPerformed

    private void usuarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_usuarioKeyTyped
        char c = evt.getKeyChar();
        validador.validarNumeroEntero(c, evt);
        validador.limitarCaracteres(usuario, evt, 9);
    }//GEN-LAST:event_usuarioKeyTyped

    private void usuario_olvidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_usuario_olvidoKeyTyped
        char c = evt.getKeyChar();
        validador.validarNumeroEntero(c, evt);
        validador.limitarCaracteres(usuario_olvido, evt, 9);
    }//GEN-LAST:event_usuario_olvidoKeyTyped

    private void claveKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_claveKeyTyped
        validador.limitarCaracteres(clave, evt, 10);
    }//GEN-LAST:event_claveKeyTyped

    private void nueva_claveKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nueva_claveKeyTyped
        validador.limitarCaracteres(nueva_clave, evt, 10);
    }//GEN-LAST:event_nueva_claveKeyTyped

    //METODOS Y VARIABLES
    public void salir() {

        System.exit(0);
    }

    private final encriptacion encrip = new encriptacion();
    private final validaciones validador = new validaciones();
    private final mensajes msg = new mensajes();
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel base;
    private javax.swing.JPasswordField clave;
    private javax.swing.JPanel der;
    private javax.swing.JLabel ico_clave;
    private javax.swing.JLabel ico_clave1;
    private javax.swing.JLabel ico_usu;
    private javax.swing.JLabel ico_usu1;
    private javax.swing.JLabel ico_usu2;
    private javax.swing.JLabel ico_usu3;
    private javax.swing.JButton ingresar;
    private javax.swing.JPanel ingreso;
    private javax.swing.JPanel izq;
    private LIB.JEImagePanel jEImagePanel1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JButton lupa;
    private javax.swing.JButton modificar;
    private javax.swing.JPasswordField nueva_clave;
    private javax.swing.JButton olvido_clave;
    private javax.swing.JPanel olvido_contra;
    private javax.swing.JTextField pregunta_olvido;
    private javax.swing.JTextField respuesta_olvido;
    private javax.swing.JButton salir;
    private javax.swing.JButton salir_OC;
    private javax.swing.JTextField usuario;
    private javax.swing.JTextField usuario_olvido;
    private javax.swing.JButton volver_login;
    // End of variables declaration//GEN-END:variables
}
