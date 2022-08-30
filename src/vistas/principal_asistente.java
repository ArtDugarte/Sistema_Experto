package vistas;

import com.sun.awt.AWTUtilities;
import java.awt.Color;
import java.awt.Shape;
import java.awt.geom.RoundRectangle2D;
import javax.swing.ImageIcon;
import paneles.p_acercaDelSistema;
import paneles.p_ajustes;
import paneles.p_revision;

public class principal_asistente extends javax.swing.JFrame {

    public principal_asistente(String usuario, String nombre, int tipo_usu) {

        initComponents();
        this.tipo_usu = tipo_usu;
        setLocationRelativeTo(null);
        Shape forma = new RoundRectangle2D.Double(0, 0, getBounds().width, getBounds().height, 20, 20);
        AWTUtilities.setWindowShape(this, forma);
        setIconImage(new ImageIcon(getClass().getResource("/imagenes/fondo2.png")).getImage());
        setTitle("SEDIPG");

        p_a = new p_ajustes(usuario);
        p_r = new p_revision();
        p_as = new p_acercaDelSistema(tipo_usu);

        p_principal.add(p_r);
        p_principal.add(p_a);
        p_principal.add(p_as);

        p_r.setVisible(true);
        p_a.setVisible(false);
        p_as.setVisible(false);
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
        b_revision = new javax.swing.JButton();
        b_ajustes = new javax.swing.JButton();
        b_acercaDelsistema = new javax.swing.JButton();
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
        l_ico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/revision.png"))); // NOI18N
        l_ico.setText(" Revisión de Exámenes");
        p_barra.add(l_ico, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, -1));

        base.add(p_barra, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 0, 680, 60));

        p_menu.setBackground(new java.awt.Color(103, 174, 202));
        p_menu.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 0, 0, 2, new java.awt.Color(204, 204, 204)));
        p_menu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        p_botones.setOpaque(false);
        p_botones.setLayout(new java.awt.GridLayout(3, 0, 0, 5));

        b_revision.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        b_revision.setForeground(new java.awt.Color(204, 204, 204));
        b_revision.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/revision2.png"))); // NOI18N
        b_revision.setText("     Revisión");
        b_revision.setBorderPainted(false);
        b_revision.setContentAreaFilled(false);
        b_revision.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b_revision.setFocusPainted(false);
        b_revision.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        b_revision.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b_revisionMouseClicked(evt);
            }
        });
        p_botones.add(b_revision);

        b_ajustes.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        b_ajustes.setForeground(new java.awt.Color(255, 255, 255));
        b_ajustes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ajustes.png"))); // NOI18N
        b_ajustes.setText("     Ajustes");
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

        b_acercaDelsistema.setFont(new java.awt.Font("Arial", 3, 16)); // NOI18N
        b_acercaDelsistema.setForeground(new java.awt.Color(255, 255, 255));
        b_acercaDelsistema.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/acerca_de.png"))); // NOI18N
        b_acercaDelsistema.setText("Acerca del Sistema");
        b_acercaDelsistema.setBorderPainted(false);
        b_acercaDelsistema.setContentAreaFilled(false);
        b_acercaDelsistema.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b_acercaDelsistema.setFocusPainted(false);
        b_acercaDelsistema.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        b_acercaDelsistema.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b_acercaDelsistemaMouseClicked(evt);
            }
        });
        p_botones.add(b_acercaDelsistema);

        p_menu.add(p_botones, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 220, 190));

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

    private void b_revisionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b_revisionMouseClicked

        b_revision.setForeground(new Color(204, 204, 204));
        b_revision.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/revision2.png")));

        b_ajustes.setForeground(Color.WHITE);
        b_ajustes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ajustes.png")));

        b_acercaDelsistema.setForeground(Color.WHITE);
        b_acercaDelsistema.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/acerca_de.png")));

        l_ico.setText(" Revisión de Exámenes");
        l_ico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/revision.png")));

        p_r.setVisible(true);
        p_a.setVisible(false);
        p_as.setVisible(false);
        p_r.iniciar();

    }//GEN-LAST:event_b_revisionMouseClicked

    private void b_ajustesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b_ajustesMouseClicked

        b_ajustes.setForeground(new Color(204, 204, 204));
        b_ajustes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ajustes2.png")));

        b_revision.setForeground(Color.WHITE);
        b_revision.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/revision.png")));

        b_acercaDelsistema.setForeground(Color.WHITE);
        b_acercaDelsistema.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/acerca_de.png")));

        l_ico.setText(" Ajustes");
        l_ico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ajustes.png")));

        p_r.setVisible(false);
        p_as.setVisible(false);
        p_a.info_usuario();
        p_a.setVisible(true);
    }//GEN-LAST:event_b_ajustesMouseClicked

    private void b_acercaDelsistemaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b_acercaDelsistemaMouseClicked

        b_acercaDelsistema.setForeground(new Color(204, 204, 204));
        b_acercaDelsistema.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/acerca_de2.png")));

        b_ajustes.setForeground(Color.WHITE);
        b_ajustes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ajustes.png")));

        b_revision.setForeground(Color.WHITE);
        b_revision.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/revision.png")));

        l_ico.setText(" Acerca del Sistema");
        l_ico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/acerca_de.png")));

        p_r.setVisible(false);
        p_a.setVisible(false);
        p_as.setVisible(true);
    }//GEN-LAST:event_b_acercaDelsistemaMouseClicked

    //Metodos y Variables
    public void salir() {

        login l = new login();
        l.setVisible(true);
        this.dispose();
    }

    p_revision p_r;
    p_ajustes p_a;
    p_acercaDelSistema p_as;
    int tipo_usu;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b_acercaDelsistema;
    private javax.swing.JButton b_ajustes;
    private javax.swing.JButton b_revision;
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
