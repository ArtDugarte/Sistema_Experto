package vistas;

import com.sun.awt.AWTUtilities;
import java.awt.Color;
import java.awt.Shape;
import java.awt.geom.RoundRectangle2D;
import paneles.p_ajustes;
import paneles.p_examenes;
import paneles.p_historial;
import paneles.p_resultados;
import paneles.p_subirExamen;

public class principal_paciente extends javax.swing.JFrame {

    public principal_paciente() {
        
        initComponents();
        setLocationRelativeTo(null);
        Shape forma = new RoundRectangle2D.Double(0, 0, getBounds().width, getBounds().height, 20, 20);
        AWTUtilities.setWindowShape(this, forma);
        
        p_se = new p_subirExamen(this);
        p_e = new p_examenes(p_se);
        p_r = new p_resultados();
        p_h = new p_historial();
        p_a = new p_ajustes();
        p_principal.add(p_se);
        p_principal.add(p_e);
        p_principal.add(p_r);
        p_principal.add(p_h);
        p_principal.add(p_a);
        p_e.setVisible(true);
        p_se.setVisible(false);
        p_r.setVisible(false);
        p_h.setVisible(false);
        p_a.setVisible(false);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        base = new javax.swing.JPanel();
        p_usu = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        p_barra = new javax.swing.JPanel();
        salir = new javax.swing.JButton();
        l_ico = new javax.swing.JLabel();
        p_menu = new javax.swing.JPanel();
        p_botones = new javax.swing.JPanel();
        b_examenes = new javax.swing.JButton();
        b_resultados = new javax.swing.JButton();
        b_historial = new javax.swing.JButton();
        b_ajustes = new javax.swing.JButton();
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

        jLabel2.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Arthuro Dugarte");
        p_usu.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, -1, -1));

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
        l_ico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/examenes.png"))); // NOI18N
        l_ico.setText(" Exámenes");
        p_barra.add(l_ico, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, -1));

        base.add(p_barra, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 0, 680, 60));

        p_menu.setBackground(new java.awt.Color(103, 174, 202));
        p_menu.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 0, 0, 2, new java.awt.Color(204, 204, 204)));
        p_menu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        p_botones.setOpaque(false);
        p_botones.setLayout(new java.awt.GridLayout(4, 0, 0, 5));

        b_examenes.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        b_examenes.setForeground(new java.awt.Color(204, 204, 204));
        b_examenes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/examenes2.png"))); // NOI18N
        b_examenes.setText("     Exámenes");
        b_examenes.setBorderPainted(false);
        b_examenes.setContentAreaFilled(false);
        b_examenes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b_examenes.setFocusPainted(false);
        b_examenes.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        b_examenes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b_examenesMouseClicked(evt);
            }
        });
        p_botones.add(b_examenes);

        b_resultados.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        b_resultados.setForeground(new java.awt.Color(255, 255, 255));
        b_resultados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/resultados.png"))); // NOI18N
        b_resultados.setText("     Resultado");
        b_resultados.setBorderPainted(false);
        b_resultados.setContentAreaFilled(false);
        b_resultados.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b_resultados.setFocusPainted(false);
        b_resultados.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        b_resultados.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/resultados2.png"))); // NOI18N
        b_resultados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b_resultadosMouseClicked(evt);
            }
        });
        p_botones.add(b_resultados);

        b_historial.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        b_historial.setForeground(new java.awt.Color(255, 255, 255));
        b_historial.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/historial.png"))); // NOI18N
        b_historial.setText("     Historial");
        b_historial.setBorderPainted(false);
        b_historial.setContentAreaFilled(false);
        b_historial.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b_historial.setFocusPainted(false);
        b_historial.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        b_historial.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b_historialMouseClicked(evt);
            }
        });
        p_botones.add(b_historial);

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

        p_menu.add(p_botones, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 220, 290));

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

    private void b_examenesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b_examenesMouseClicked
        
        abrir_panel_examenes();
        
    }//GEN-LAST:event_b_examenesMouseClicked

    private void b_resultadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b_resultadosMouseClicked
        
        b_resultados.setForeground(new Color(204, 204, 204));
        b_resultados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/resultados2.png")));
        
        b_examenes.setForeground(Color.WHITE);
        b_examenes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/examenes.png")));
        
        b_historial.setForeground(Color.WHITE);
        b_historial.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/historial.png")));   
        
        b_ajustes.setForeground(Color.WHITE);
        b_ajustes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ajustes.png")));
        
        l_ico.setText(" Resultados");
        l_ico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/resultados.png")));
        
        p_e.setVisible(false);
        p_r.setVisible(true);
        p_h.setVisible(false);
        p_a.setVisible(false);
        p_se.setVisible(false);
        
    }//GEN-LAST:event_b_resultadosMouseClicked

    private void b_historialMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b_historialMouseClicked
        
        b_historial.setForeground(new Color(204, 204, 204));
        b_historial.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/historial2.png")));
        
        b_examenes.setForeground(Color.WHITE);
        b_examenes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/examenes.png")));
        
        b_resultados.setForeground(Color.WHITE);
        b_resultados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/resultados.png")));   
        
        b_ajustes.setForeground(Color.WHITE);
        b_ajustes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ajustes.png")));
        
        l_ico.setText(" Historial");
        l_ico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/historial.png")));
        
        p_e.setVisible(false);
        p_r.setVisible(false);
        p_h.setVisible(true);
        p_a.setVisible(false);
        p_se.setVisible(false);
        
    }//GEN-LAST:event_b_historialMouseClicked

    private void b_ajustesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b_ajustesMouseClicked
        
        b_ajustes.setForeground(new Color(204, 204, 204));
        b_ajustes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ajustes2.png")));
        
        b_examenes.setForeground(Color.WHITE);
        b_examenes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/examenes.png")));
        
        b_resultados.setForeground(Color.WHITE);
        b_resultados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/resultados.png")));   
        
        b_historial.setForeground(Color.WHITE);
        b_historial.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/historial.png")));
        
        l_ico.setText(" Ajustes");
        l_ico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ajustes.png")));
        
        p_e.setVisible(false);
        p_r.setVisible(false);
        p_h.setVisible(false);
        p_a.limpiar_campos();
        p_a.setVisible(true);
        p_se.setVisible(false);
    }//GEN-LAST:event_b_ajustesMouseClicked
    
    //Metodos y Variables
    public void salir(){
        
        login l = new login();
        l.setVisible(true);
        this.dispose();
    }
    
    public void abrir_panel_examenes(){
    
        b_examenes.setForeground(new Color(204, 204, 204));
        b_examenes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/examenes2.png")));
        
        b_resultados.setForeground(Color.WHITE);
        b_resultados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/resultados.png")));
        
        b_historial.setForeground(Color.WHITE);
        b_historial.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/historial.png")));   
        
        b_ajustes.setForeground(Color.WHITE);
        b_ajustes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ajustes.png")));
        
        l_ico.setText(" Exámenes");
        l_ico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/examenes.png")));
        
        p_e.setVisible(true);
        p_r.setVisible(false);
        p_h.setVisible(false);
        p_a.setVisible(false);
        p_se.setVisible(false);
    }
    
    p_examenes p_e;
    p_resultados p_r;
    p_historial p_h;
    p_ajustes p_a;
    p_subirExamen p_se;
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b_ajustes;
    private javax.swing.JButton b_examenes;
    private javax.swing.JButton b_historial;
    private javax.swing.JButton b_resultados;
    private javax.swing.JPanel base;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel l_ico;
    private javax.swing.JPanel p_barra;
    private javax.swing.JPanel p_botones;
    private javax.swing.JPanel p_menu;
    private javax.swing.JPanel p_principal;
    private javax.swing.JPanel p_usu;
    private javax.swing.JButton salir;
    // End of variables declaration//GEN-END:variables
}
