package vistas;

import com.sun.awt.AWTUtilities;
import java.awt.Color;
import java.awt.Shape;
import java.awt.geom.RoundRectangle2D;
import javax.swing.ImageIcon;
import paneles.p_acercaDelSistema;
import paneles.p_ajustes;
import paneles.p_busquedaAvanzada;
import paneles.p_crudDiagnosticos;
import paneles.p_diagnosticos;
import paneles.p_examenes;
import paneles.p_historial;
import paneles.p_registrarUsuarios;
import paneles.p_reportes;
import paneles.p_resultados;

public class principal_experto extends javax.swing.JFrame {

    public principal_experto(String usuario, String nombre, int tipo_usu) {

        initComponents();
        this.tipo_usu = tipo_usu;
        setLocationRelativeTo(null);
        Shape forma = new RoundRectangle2D.Double(0, 0, getBounds().width, getBounds().height, 20, 20);
        AWTUtilities.setWindowShape(this, forma);
        setIconImage(new ImageIcon(getClass().getResource("/imagenes/fondo2.png")).getImage());
        setTitle("SEDIPG");

        p_d = new p_diagnosticos(usuario);
        p_r = new p_registrarUsuarios(usuario);
        p_a = new p_ajustes(usuario);
        p_cd = new p_crudDiagnosticos();
        p_b = new p_busquedaAvanzada();
        p_as = new p_acercaDelSistema(tipo_usu);
        p_re = new p_reportes();
        p_principal.add(p_d);
        p_principal.add(p_r);
        p_principal.add(p_a);
        p_principal.add(p_cd);
        p_principal.add(p_b);
        p_principal.add(p_as);
        p_principal.add(p_re);
        p_d.setVisible(true);
        p_r.setVisible(false);
        p_a.setVisible(false);
        p_cd.setVisible(false);
        p_b.setVisible(false);
        p_as.setVisible(false);
        p_re.setVisible(false);
        p_cd.iniciar();
        l_nombreUsuario.setText(nombre.substring(0, 1) + nombre.substring(1).toLowerCase());

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        base = new javax.swing.JPanel();
        p_usu = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        l_nombreUsuario = new javax.swing.JLabel();
        p_barra = new javax.swing.JPanel();
        salir = new javax.swing.JButton();
        l_ico = new javax.swing.JLabel();
        p_menu = new javax.swing.JPanel();
        p_botones = new javax.swing.JPanel();
        b_diagnosticos = new javax.swing.JButton();
        b_registrarU = new javax.swing.JButton();
        b_crud_diagnosticos = new javax.swing.JButton();
        b_busquedaAvenzada = new javax.swing.JButton();
        b_reportes = new javax.swing.JButton();
        b_ajustes = new javax.swing.JButton();
        b_acercaDelSistema = new javax.swing.JButton();
        p_principal = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 153, 153));
        setMinimumSize(new java.awt.Dimension(900, 600));
        setName("principal_pacientes"); // NOI18N
        setUndecorated(true);

        base.setBackground(new java.awt.Color(255, 255, 255));
        base.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        p_usu.setBackground(new java.awt.Color(103, 86, 130));
        p_usu.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 2, new java.awt.Color(204, 204, 204)));
        p_usu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/imagen_perfil.png"))); // NOI18N
        p_usu.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 160, 150));

        l_nombreUsuario.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        l_nombreUsuario.setForeground(new java.awt.Color(255, 255, 255));
        l_nombreUsuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l_nombreUsuario.setText("Arthuro Dugarte");
        p_usu.add(l_nombreUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 220, -1));

        base.add(p_usu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 220, 190));

        p_barra.setBackground(new java.awt.Color(103, 86, 130));
        p_barra.setForeground(new java.awt.Color(204, 204, 255));
        p_barra.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        p_barra.add(salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 10, 60, 40));

        l_ico.setFont(new java.awt.Font("Arial", 3, 36)); // NOI18N
        l_ico.setForeground(new java.awt.Color(255, 255, 255));
        l_ico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/diagnostico.png"))); // NOI18N
        l_ico.setText(" Diagnósticos");
        p_barra.add(l_ico, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, -1));

        base.add(p_barra, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 0, 680, 60));

        p_menu.setBackground(new java.awt.Color(103, 174, 202));
        p_menu.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 0, 0, 2, new java.awt.Color(204, 204, 204)));
        p_menu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        p_botones.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        p_botones.setOpaque(false);
        p_botones.setLayout(new java.awt.GridLayout(7, 0, 0, 5));

        b_diagnosticos.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        b_diagnosticos.setForeground(new java.awt.Color(204, 204, 204));
        b_diagnosticos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/diagnostico2.png"))); // NOI18N
        b_diagnosticos.setText(" Diagnósticos");
        b_diagnosticos.setBorderPainted(false);
        b_diagnosticos.setContentAreaFilled(false);
        b_diagnosticos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b_diagnosticos.setFocusPainted(false);
        b_diagnosticos.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        b_diagnosticos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b_diagnosticosMouseClicked(evt);
            }
        });
        p_botones.add(b_diagnosticos);

        b_registrarU.setFont(new java.awt.Font("Arial", 3, 15)); // NOI18N
        b_registrarU.setForeground(new java.awt.Color(255, 255, 255));
        b_registrarU.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/usuarios.png"))); // NOI18N
        b_registrarU.setText("Admin. Usuarios");
        b_registrarU.setBorderPainted(false);
        b_registrarU.setContentAreaFilled(false);
        b_registrarU.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b_registrarU.setFocusPainted(false);
        b_registrarU.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        b_registrarU.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/resultados2.png"))); // NOI18N
        b_registrarU.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b_registrarUMouseClicked(evt);
            }
        });
        p_botones.add(b_registrarU);

        b_crud_diagnosticos.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        b_crud_diagnosticos.setForeground(new java.awt.Color(255, 255, 255));
        b_crud_diagnosticos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/crud_diagnosticos.png"))); // NOI18N
        b_crud_diagnosticos.setText("Admin. Diagnósticos");
        b_crud_diagnosticos.setBorderPainted(false);
        b_crud_diagnosticos.setContentAreaFilled(false);
        b_crud_diagnosticos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b_crud_diagnosticos.setFocusPainted(false);
        b_crud_diagnosticos.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        b_crud_diagnosticos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b_crud_diagnosticosMouseClicked(evt);
            }
        });
        p_botones.add(b_crud_diagnosticos);

        b_busquedaAvenzada.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        b_busquedaAvenzada.setForeground(new java.awt.Color(255, 255, 255));
        b_busquedaAvenzada.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/busqueda_avanzada.png"))); // NOI18N
        b_busquedaAvenzada.setText("Búsqueda Avanzada");
        b_busquedaAvenzada.setBorderPainted(false);
        b_busquedaAvenzada.setContentAreaFilled(false);
        b_busquedaAvenzada.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b_busquedaAvenzada.setFocusPainted(false);
        b_busquedaAvenzada.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        b_busquedaAvenzada.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b_busquedaAvenzadaMouseClicked(evt);
            }
        });
        p_botones.add(b_busquedaAvenzada);

        b_reportes.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        b_reportes.setForeground(new java.awt.Color(255, 255, 255));
        b_reportes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/reportes.png"))); // NOI18N
        b_reportes.setText(" Reportes");
        b_reportes.setBorderPainted(false);
        b_reportes.setContentAreaFilled(false);
        b_reportes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b_reportes.setFocusPainted(false);
        b_reportes.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        b_reportes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b_reportesMouseClicked(evt);
            }
        });
        p_botones.add(b_reportes);

        b_ajustes.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        b_ajustes.setForeground(new java.awt.Color(255, 255, 255));
        b_ajustes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ajustes.png"))); // NOI18N
        b_ajustes.setText(" Ajustes");
        b_ajustes.setBorderPainted(false);
        b_ajustes.setContentAreaFilled(false);
        b_ajustes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b_ajustes.setFocusPainted(false);
        b_ajustes.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        b_ajustes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b_ajustesMouseClicked(evt);
            }
        });
        p_botones.add(b_ajustes);

        b_acercaDelSistema.setFont(new java.awt.Font("Arial", 3, 16)); // NOI18N
        b_acercaDelSistema.setForeground(new java.awt.Color(255, 255, 255));
        b_acercaDelSistema.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/acerca_de.png"))); // NOI18N
        b_acercaDelSistema.setText("Acerca del Sistema");
        b_acercaDelSistema.setBorderPainted(false);
        b_acercaDelSistema.setContentAreaFilled(false);
        b_acercaDelSistema.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b_acercaDelSistema.setFocusPainted(false);
        b_acercaDelSistema.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        b_acercaDelSistema.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b_acercaDelSistemaMouseClicked(evt);
            }
        });
        p_botones.add(b_acercaDelSistema);

        p_menu.add(p_botones, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 220, 400));

        base.add(p_menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 220, 410));

        p_principal.setBackground(new java.awt.Color(255, 255, 255));
        p_principal.setLayout(new java.awt.CardLayout());
        base.add(p_principal, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 60, 680, 540));

        getContentPane().add(base, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void salirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salirMouseClicked

        salir();
    }//GEN-LAST:event_salirMouseClicked

    private void b_diagnosticosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b_diagnosticosMouseClicked

        b_diagnosticos.setForeground(new Color(204, 204, 204));
        b_diagnosticos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/diagnostico2.png")));

        b_registrarU.setForeground(Color.WHITE);
        b_registrarU.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/usuarios.png")));

        b_ajustes.setForeground(Color.WHITE);
        b_ajustes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ajustes.png")));

        b_crud_diagnosticos.setForeground(Color.WHITE);
        b_crud_diagnosticos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/crud_diagnosticos.png")));

        b_busquedaAvenzada.setForeground(Color.WHITE);
        b_busquedaAvenzada.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/busqueda_avanzada.png")));

        b_reportes.setForeground(Color.WHITE);
        b_reportes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/reportes.png")));

        b_acercaDelSistema.setForeground(Color.WHITE);
        b_acercaDelSistema.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/acerca_de.png")));

        l_ico.setText(" Diagnósticos");
        l_ico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/diagnostico.png")));

        p_d.setVisible(true);
        p_d.inicio();
        p_r.setVisible(false);
        p_a.setVisible(false);
        p_cd.setVisible(false);
        p_b.setVisible(false);
        p_re.setVisible(false);
        p_as.setVisible(false);
    }//GEN-LAST:event_b_diagnosticosMouseClicked

    private void b_registrarUMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b_registrarUMouseClicked

        b_registrarU.setForeground(new Color(204, 204, 204));
        b_registrarU.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/usuarios2.png")));

        b_diagnosticos.setForeground(Color.WHITE);
        b_diagnosticos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/diagnostico.png")));

        b_ajustes.setForeground(Color.WHITE);
        b_ajustes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ajustes.png")));

        b_crud_diagnosticos.setForeground(Color.WHITE);
        b_crud_diagnosticos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/crud_diagnosticos.png")));

        b_busquedaAvenzada.setForeground(Color.WHITE);
        b_busquedaAvenzada.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/busqueda_avanzada.png")));

        b_reportes.setForeground(Color.WHITE);
        b_reportes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/reportes.png")));

        b_acercaDelSistema.setForeground(Color.WHITE);
        b_acercaDelSistema.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/acerca_de.png")));

        l_ico.setText(" Administrar Usuarios");
        l_ico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/usuarios.png")));

        p_d.setVisible(false);
        p_r.setVisible(true);
        p_a.setVisible(false);
        p_cd.setVisible(false);
        p_b.setVisible(false);
        p_re.setVisible(false);
        p_as.setVisible(false);
    }//GEN-LAST:event_b_registrarUMouseClicked

    private void b_ajustesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b_ajustesMouseClicked

        b_ajustes.setForeground(new Color(204, 204, 204));
        b_ajustes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ajustes2.png")));

        b_diagnosticos.setForeground(Color.WHITE);
        b_diagnosticos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/diagnostico.png")));

        b_registrarU.setForeground(Color.WHITE);
        b_registrarU.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/usuarios.png")));

        b_crud_diagnosticos.setForeground(Color.WHITE);
        b_crud_diagnosticos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/crud_diagnosticos.png")));

        b_busquedaAvenzada.setForeground(Color.WHITE);
        b_busquedaAvenzada.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/busqueda_avanzada.png")));

        b_reportes.setForeground(Color.WHITE);
        b_reportes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/reportes.png")));

        b_acercaDelSistema.setForeground(Color.WHITE);
        b_acercaDelSistema.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/acerca_de.png")));

        l_ico.setText(" Ajustes");
        l_ico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ajustes.png")));

        p_d.setVisible(false);
        p_r.setVisible(false);
        p_cd.setVisible(false);
        p_a.info_usuario();
        p_a.setVisible(true);
        p_re.setVisible(false);
        p_as.setVisible(false);
        p_b.setVisible(false);
    }//GEN-LAST:event_b_ajustesMouseClicked

    private void b_crud_diagnosticosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b_crud_diagnosticosMouseClicked
        
        b_crud_diagnosticos.setForeground(new Color(204, 204, 204));
        b_crud_diagnosticos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/crud_diagnosticos2.png")));

        b_diagnosticos.setForeground(Color.WHITE);
        b_diagnosticos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/diagnostico.png")));

        b_ajustes.setForeground(Color.WHITE);
        b_ajustes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ajustes.png")));

        b_registrarU.setForeground(Color.WHITE);
        b_registrarU.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/usuarios.png")));

        b_busquedaAvenzada.setForeground(Color.WHITE);
        b_busquedaAvenzada.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/busqueda_avanzada.png")));

        b_reportes.setForeground(Color.WHITE);
        b_reportes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/reportes.png")));

        b_acercaDelSistema.setForeground(Color.WHITE);
        b_acercaDelSistema.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/acerca_de.png")));

        l_ico.setText(" Administrar Diagnósticos");
        l_ico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/crud_diagnosticos.png")));

        p_d.setVisible(false);
        p_r.setVisible(false);
        p_a.setVisible(false);
        p_cd.iniciar();
        p_cd.setVisible(true);
        p_b.setVisible(false);
        p_re.setVisible(false);
        p_as.setVisible(false);
    }//GEN-LAST:event_b_crud_diagnosticosMouseClicked

    private void b_busquedaAvenzadaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b_busquedaAvenzadaMouseClicked

        b_crud_diagnosticos.setForeground(Color.WHITE);
        b_crud_diagnosticos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/crud_diagnosticos.png")));

        b_diagnosticos.setForeground(Color.WHITE);
        b_diagnosticos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/diagnostico.png")));

        b_ajustes.setForeground(Color.WHITE);
        b_ajustes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ajustes.png")));

        b_registrarU.setForeground(Color.WHITE);
        b_registrarU.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/usuarios.png")));

        b_busquedaAvenzada.setForeground(new Color(204, 204, 204));
        b_busquedaAvenzada.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/busqueda_avanzada2.png")));

        b_reportes.setForeground(Color.WHITE);
        b_reportes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/reportes.png")));

        b_acercaDelSistema.setForeground(Color.WHITE);
        b_acercaDelSistema.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/acerca_de.png")));

        l_ico.setText(" Búsqueda Avanzada");
        l_ico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/busqueda_avanzada.png")));

        p_d.setVisible(false);
        p_r.setVisible(false);
        p_a.setVisible(false);
        p_cd.setVisible(false);
        p_re.setVisible(false);
        p_as.setVisible(false);
        p_b.limpiar_campos();
        p_b.setVisible(true);
    }//GEN-LAST:event_b_busquedaAvenzadaMouseClicked

    private void b_reportesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b_reportesMouseClicked

        b_reportes.setForeground(new Color(204, 204, 204));
        b_reportes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/reportes2.png")));

        b_diagnosticos.setForeground(Color.WHITE);
        b_diagnosticos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/diagnostico.png")));

        b_ajustes.setForeground(Color.WHITE);
        b_ajustes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ajustes.png")));

        b_registrarU.setForeground(Color.WHITE);
        b_registrarU.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/usuarios.png")));

        b_busquedaAvenzada.setForeground(Color.WHITE);
        b_busquedaAvenzada.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/busqueda_avanzada.png")));

        b_crud_diagnosticos.setForeground(Color.WHITE);
        b_crud_diagnosticos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/crud_diagnosticos.png")));

        b_acercaDelSistema.setForeground(Color.WHITE);
        b_acercaDelSistema.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/acerca_de.png")));

        l_ico.setText(" Reportes");
        l_ico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/reportes.png")));

        p_d.setVisible(false);
        p_r.setVisible(false);
        p_a.setVisible(false);
        p_cd.setVisible(false);
        p_b.setVisible(false);
        p_re.iniciar();
        p_re.setVisible(true);
        p_as.setVisible(false);
    }//GEN-LAST:event_b_reportesMouseClicked

    private void b_acercaDelSistemaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b_acercaDelSistemaMouseClicked
        
        b_acercaDelSistema.setForeground(new Color(204, 204, 204));
        b_acercaDelSistema.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/acerca_de2.png")));

        b_diagnosticos.setForeground(Color.WHITE);
        b_diagnosticos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/diagnostico.png")));

        b_ajustes.setForeground(Color.WHITE);
        b_ajustes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ajustes.png")));

        b_registrarU.setForeground(Color.WHITE);
        b_registrarU.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/usuarios.png")));

        b_busquedaAvenzada.setForeground(Color.WHITE);
        b_busquedaAvenzada.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/busqueda_avanzada.png")));

        b_crud_diagnosticos.setForeground(Color.WHITE);
        b_crud_diagnosticos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/crud_diagnosticos.png")));

        b_reportes.setForeground(Color.WHITE);
        b_reportes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/reportes.png")));

        l_ico.setText(" Acerca del Sistema");
        l_ico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/acerca_de.png")));

        p_d.setVisible(false);
        p_r.setVisible(false);
        p_a.setVisible(false);
        p_cd.setVisible(false);
        p_b.setVisible(false);
        p_re.setVisible(false);
        p_as.setVisible(true);
    }//GEN-LAST:event_b_acercaDelSistemaMouseClicked

    //Metodos y Variables
    public void salir() {

        login l = new login();
        l.setVisible(true);
        this.dispose();
    }

    p_diagnosticos p_d;
    p_busquedaAvanzada p_b;
    p_registrarUsuarios p_r;
    p_ajustes p_a;
    p_crudDiagnosticos p_cd;
    p_acercaDelSistema p_as;
    p_reportes p_re;
    int tipo_usu;


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b_acercaDelSistema;
    private javax.swing.JButton b_ajustes;
    private javax.swing.JButton b_busquedaAvenzada;
    private javax.swing.JButton b_crud_diagnosticos;
    private javax.swing.JButton b_diagnosticos;
    private javax.swing.JButton b_registrarU;
    private javax.swing.JButton b_reportes;
    private javax.swing.JPanel base;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel l_ico;
    private javax.swing.JLabel l_nombreUsuario;
    private javax.swing.JPanel p_barra;
    private javax.swing.JPanel p_botones;
    private javax.swing.JPanel p_menu;
    private javax.swing.JPanel p_principal;
    private javax.swing.JPanel p_usu;
    private javax.swing.JButton salir;
    // End of variables declaration//GEN-END:variables
}
