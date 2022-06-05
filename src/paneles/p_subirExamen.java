package paneles;

import java.awt.Color;
import javax.swing.border.LineBorder;

public class p_subirExamen extends javax.swing.JPanel {

    public p_subirExamen() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        l_titulo = new javax.swing.JLabel();
        base = new javax.swing.JPanel();
        documento = new javax.swing.JPanel();
        jLabel60 = new javax.swing.JLabel();
        registrar = new javax.swing.JButton();
        b_limpiar2 = new javax.swing.JButton();
        orina = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jSeparator14 = new javax.swing.JSeparator();
        globulos_rojos1 = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        hemoglobina1 = new javax.swing.JTextField();
        jSeparator15 = new javax.swing.JSeparator();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jSeparator16 = new javax.swing.JSeparator();
        hematocritos1 = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        plaquetas1 = new javax.swing.JTextField();
        jSeparator17 = new javax.swing.JSeparator();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jSeparator18 = new javax.swing.JSeparator();
        leucocitos1 = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        segmentados1 = new javax.swing.JTextField();
        jSeparator19 = new javax.swing.JSeparator();
        jLabel34 = new javax.swing.JLabel();
        jSeparator20 = new javax.swing.JSeparator();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        linfocitos1 = new javax.swing.JTextField();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        b_siguienteOrina = new javax.swing.JButton();
        b_limpiar1 = new javax.swing.JButton();
        jLabel44 = new javax.swing.JLabel();
        sangre = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator7 = new javax.swing.JSeparator();
        globulos_rojos = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        hemoglobina = new javax.swing.JTextField();
        jSeparator8 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jSeparator9 = new javax.swing.JSeparator();
        hematocritos = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        plaquetas = new javax.swing.JTextField();
        jSeparator10 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jSeparator11 = new javax.swing.JSeparator();
        leucocitos = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        segmentados = new javax.swing.JTextField();
        jSeparator12 = new javax.swing.JSeparator();
        jLabel12 = new javax.swing.JLabel();
        jSeparator13 = new javax.swing.JSeparator();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        linfocitos = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        b_siguienteSangre = new javax.swing.JButton();
        b_limpiarSangre = new javax.swing.JButton();
        jLabel22 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(680, 540));
        setMinimumSize(new java.awt.Dimension(680, 540));
        setName("Panel Examenes"); // NOI18N
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        l_titulo.setFont(new java.awt.Font("Arial", 3, 24)); // NOI18N
        l_titulo.setText("Ingrese los resultados de sus exámenes...");
        add(l_titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 630, -1));

        base.setOpaque(false);
        base.setLayout(new java.awt.CardLayout());

        documento.setOpaque(false);
        documento.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel60.setFont(new java.awt.Font("Arial", 3, 24)); // NOI18N
        jLabel60.setForeground(new java.awt.Color(102, 102, 102));
        jLabel60.setText("EXÁMENES EN PDF");
        documento.add(jLabel60, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 0, -1, -1));

        registrar.setBackground(new java.awt.Color(103, 174, 202));
        registrar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        registrar.setForeground(new java.awt.Color(255, 255, 255));
        registrar.setText("Registrar");
        registrar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(103, 174, 202), 2));
        registrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        registrar.setFocusPainted(false);
        registrar.setRolloverEnabled(false);
        registrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                registrarMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                registrarMouseReleased(evt);
            }
        });
        registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarActionPerformed(evt);
            }
        });
        documento.add(registrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 410, 100, 30));

        b_limpiar2.setBackground(new java.awt.Color(103, 174, 202));
        b_limpiar2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        b_limpiar2.setForeground(new java.awt.Color(255, 255, 255));
        b_limpiar2.setText("Limpiar");
        b_limpiar2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(103, 174, 202), 2));
        b_limpiar2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b_limpiar2.setFocusPainted(false);
        b_limpiar2.setRolloverEnabled(false);
        b_limpiar2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                b_limpiar2MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                b_limpiar2MouseReleased(evt);
            }
        });
        b_limpiar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_limpiar2ActionPerformed(evt);
            }
        });
        documento.add(b_limpiar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 410, 100, 30));

        base.add(documento, "card2");

        orina.setOpaque(false);
        orina.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel23.setFont(new java.awt.Font("Arial", 3, 15)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(102, 102, 102));
        jLabel23.setText("LINFOCITOS:");
        orina.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 325, -1, -1));

        jSeparator14.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator14.setForeground(new java.awt.Color(0, 0, 0));
        orina.add(jSeparator14, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 100, 130, 10));

        globulos_rojos1.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        globulos_rojos1.setForeground(new java.awt.Color(102, 102, 102));
        globulos_rojos1.setBorder(null);
        globulos_rojos1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        orina.add(globulos_rojos1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 70, 130, 30));

        jLabel24.setFont(new java.awt.Font("Arial", 3, 15)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(102, 102, 102));
        jLabel24.setText("VN: 3,90 - 5,40");
        orina.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 85, -1, -1));

        jLabel25.setFont(new java.awt.Font("Arial", 3, 15)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(102, 102, 102));
        jLabel25.setText("VN: 12,0 - 16,0");
        orina.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 125, -1, -1));

        hemoglobina1.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        hemoglobina1.setForeground(new java.awt.Color(102, 102, 102));
        hemoglobina1.setBorder(null);
        hemoglobina1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        orina.add(hemoglobina1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 110, 130, 30));

        jSeparator15.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator15.setForeground(new java.awt.Color(0, 0, 0));
        orina.add(jSeparator15, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 140, 130, 10));

        jLabel26.setFont(new java.awt.Font("Arial", 3, 15)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(102, 102, 102));
        jLabel26.setText("g/dL");
        orina.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 125, -1, -1));

        jLabel27.setFont(new java.awt.Font("Arial", 3, 15)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(102, 102, 102));
        jLabel27.setText("%");
        orina.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 165, -1, -1));

        jSeparator16.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator16.setForeground(new java.awt.Color(0, 0, 0));
        orina.add(jSeparator16, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 180, 130, 10));

        hematocritos1.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        hematocritos1.setForeground(new java.awt.Color(102, 102, 102));
        hematocritos1.setBorder(null);
        hematocritos1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        orina.add(hematocritos1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 150, 130, 30));

        jLabel28.setFont(new java.awt.Font("Arial", 3, 15)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(102, 102, 102));
        jLabel28.setText("VN: 35,0 - 47,0");
        orina.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 165, -1, -1));

        jLabel29.setFont(new java.awt.Font("Arial", 3, 15)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(102, 102, 102));
        jLabel29.setText("VN: 140,0 - 500,0");
        orina.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 205, -1, -1));

        plaquetas1.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        plaquetas1.setForeground(new java.awt.Color(102, 102, 102));
        plaquetas1.setBorder(null);
        plaquetas1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        orina.add(plaquetas1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 190, 130, 30));

        jSeparator17.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator17.setForeground(new java.awt.Color(0, 0, 0));
        orina.add(jSeparator17, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 220, 130, 10));

        jLabel30.setFont(new java.awt.Font("Arial", 3, 15)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(102, 102, 102));
        jLabel30.setText("10^3/uL");
        orina.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 205, -1, -1));

        jLabel31.setFont(new java.awt.Font("Arial", 3, 15)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(102, 102, 102));
        jLabel31.setText("10^3/uL");
        orina.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 245, -1, -1));

        jSeparator18.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator18.setForeground(new java.awt.Color(0, 0, 0));
        orina.add(jSeparator18, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 260, 130, 10));

        leucocitos1.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        leucocitos1.setForeground(new java.awt.Color(102, 102, 102));
        leucocitos1.setBorder(null);
        leucocitos1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        orina.add(leucocitos1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 230, 130, 30));

        jLabel32.setFont(new java.awt.Font("Arial", 3, 15)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(102, 102, 102));
        jLabel32.setText("VN: 4,50 - 11,20");
        orina.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 245, -1, -1));

        jLabel33.setFont(new java.awt.Font("Arial", 3, 15)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(102, 102, 102));
        jLabel33.setText("VN: 39,9 - 75,0");
        orina.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 285, -1, -1));

        segmentados1.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        segmentados1.setForeground(new java.awt.Color(102, 102, 102));
        segmentados1.setBorder(null);
        segmentados1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        orina.add(segmentados1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 270, 130, 30));

        jSeparator19.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator19.setForeground(new java.awt.Color(0, 0, 0));
        orina.add(jSeparator19, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 300, 130, 10));

        jLabel34.setFont(new java.awt.Font("Arial", 3, 15)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(102, 102, 102));
        jLabel34.setText("%");
        orina.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 285, -1, -1));

        jSeparator20.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator20.setForeground(new java.awt.Color(0, 0, 0));
        orina.add(jSeparator20, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 340, 130, 10));

        jLabel35.setFont(new java.awt.Font("Arial", 3, 15)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(102, 102, 102));
        jLabel35.setText("%");
        orina.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 325, -1, -1));

        jLabel36.setFont(new java.awt.Font("Arial", 3, 15)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(102, 102, 102));
        jLabel36.setText("VN: 18,8 - 50,8");
        orina.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 325, -1, -1));

        linfocitos1.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        linfocitos1.setForeground(new java.awt.Color(102, 102, 102));
        linfocitos1.setBorder(null);
        linfocitos1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        orina.add(linfocitos1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 310, 130, 30));

        jLabel37.setFont(new java.awt.Font("Arial", 3, 15)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(102, 102, 102));
        jLabel37.setText("10^6/uL");
        orina.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 85, -1, -1));

        jLabel38.setFont(new java.awt.Font("Arial", 3, 24)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(102, 102, 102));
        jLabel38.setText("EXÁMENES DE ORINA");
        orina.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 0, -1, -1));

        jLabel39.setFont(new java.awt.Font("Arial", 3, 15)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(102, 102, 102));
        jLabel39.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel39.setText("HEMOGLOBINA O HB:");
        orina.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 125, -1, -1));

        jLabel40.setFont(new java.awt.Font("Arial", 3, 15)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(102, 102, 102));
        jLabel40.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel40.setText("HEMATOCRITOS O HTC:");
        orina.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 165, 180, -1));

        jLabel41.setFont(new java.awt.Font("Arial", 3, 15)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(102, 102, 102));
        jLabel41.setText("PLAQUETAS:");
        orina.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 205, 100, -1));

        jLabel42.setFont(new java.awt.Font("Arial", 3, 15)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(102, 102, 102));
        jLabel42.setText("LEUCOCITOS O GLÓBULOS BLANCOS:");
        orina.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 245, -1, -1));

        jLabel43.setFont(new java.awt.Font("Arial", 3, 15)); // NOI18N
        jLabel43.setForeground(new java.awt.Color(102, 102, 102));
        jLabel43.setText("SEGMENTADOS O NEUTROFILOS:");
        orina.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 285, -1, -1));

        b_siguienteOrina.setBackground(new java.awt.Color(103, 174, 202));
        b_siguienteOrina.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        b_siguienteOrina.setForeground(new java.awt.Color(255, 255, 255));
        b_siguienteOrina.setText("Siguiente");
        b_siguienteOrina.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(103, 174, 202), 2));
        b_siguienteOrina.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b_siguienteOrina.setFocusPainted(false);
        b_siguienteOrina.setRolloverEnabled(false);
        b_siguienteOrina.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                b_siguienteOrinaMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                b_siguienteOrinaMouseReleased(evt);
            }
        });
        b_siguienteOrina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_siguienteOrinaActionPerformed(evt);
            }
        });
        orina.add(b_siguienteOrina, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 410, 100, 30));

        b_limpiar1.setBackground(new java.awt.Color(103, 174, 202));
        b_limpiar1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        b_limpiar1.setForeground(new java.awt.Color(255, 255, 255));
        b_limpiar1.setText("Limpiar");
        b_limpiar1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(103, 174, 202), 2));
        b_limpiar1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b_limpiar1.setFocusPainted(false);
        b_limpiar1.setRolloverEnabled(false);
        b_limpiar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                b_limpiar1MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                b_limpiar1MouseReleased(evt);
            }
        });
        b_limpiar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_limpiar1ActionPerformed(evt);
            }
        });
        orina.add(b_limpiar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 410, 100, 30));

        jLabel44.setFont(new java.awt.Font("Arial", 3, 15)); // NOI18N
        jLabel44.setForeground(new java.awt.Color(102, 102, 102));
        jLabel44.setText("HEMATIES O GLÓBULOS ROJOS: ");
        orina.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 85, -1, -1));

        base.add(orina, "card2");

        sangre.setOpaque(false);
        sangre.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial", 3, 15)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setText("LINFOCITOS:");
        sangre.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 325, -1, -1));

        jSeparator7.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator7.setForeground(new java.awt.Color(0, 0, 0));
        sangre.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 100, 130, 10));

        globulos_rojos.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        globulos_rojos.setForeground(new java.awt.Color(102, 102, 102));
        globulos_rojos.setBorder(null);
        globulos_rojos.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        sangre.add(globulos_rojos, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 70, 130, 30));

        jLabel2.setFont(new java.awt.Font("Arial", 3, 15)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("VN: 3,90 - 5,40");
        sangre.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 85, -1, -1));

        jLabel3.setFont(new java.awt.Font("Arial", 3, 15)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("VN: 12,0 - 16,0");
        sangre.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 125, -1, -1));

        hemoglobina.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        hemoglobina.setForeground(new java.awt.Color(102, 102, 102));
        hemoglobina.setBorder(null);
        hemoglobina.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        sangre.add(hemoglobina, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 110, 130, 30));

        jSeparator8.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator8.setForeground(new java.awt.Color(0, 0, 0));
        sangre.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 140, 130, 10));

        jLabel4.setFont(new java.awt.Font("Arial", 3, 15)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setText("g/dL");
        sangre.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 125, -1, -1));

        jLabel5.setFont(new java.awt.Font("Arial", 3, 15)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setText("%");
        sangre.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 165, -1, -1));

        jSeparator9.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator9.setForeground(new java.awt.Color(0, 0, 0));
        sangre.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 180, 130, 10));

        hematocritos.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        hematocritos.setForeground(new java.awt.Color(102, 102, 102));
        hematocritos.setBorder(null);
        hematocritos.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        sangre.add(hematocritos, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 150, 130, 30));

        jLabel6.setFont(new java.awt.Font("Arial", 3, 15)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 102, 102));
        jLabel6.setText("VN: 35,0 - 47,0");
        sangre.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 165, -1, -1));

        jLabel7.setFont(new java.awt.Font("Arial", 3, 15)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 102, 102));
        jLabel7.setText("VN: 140,0 - 500,0");
        sangre.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 205, -1, -1));

        plaquetas.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        plaquetas.setForeground(new java.awt.Color(102, 102, 102));
        plaquetas.setBorder(null);
        plaquetas.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        sangre.add(plaquetas, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 190, 130, 30));

        jSeparator10.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator10.setForeground(new java.awt.Color(0, 0, 0));
        sangre.add(jSeparator10, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 220, 130, 10));

        jLabel8.setFont(new java.awt.Font("Arial", 3, 15)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 102, 102));
        jLabel8.setText("10^3/uL");
        sangre.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 205, -1, -1));

        jLabel9.setFont(new java.awt.Font("Arial", 3, 15)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(102, 102, 102));
        jLabel9.setText("10^3/uL");
        sangre.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 245, -1, -1));

        jSeparator11.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator11.setForeground(new java.awt.Color(0, 0, 0));
        sangre.add(jSeparator11, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 260, 130, 10));

        leucocitos.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        leucocitos.setForeground(new java.awt.Color(102, 102, 102));
        leucocitos.setBorder(null);
        leucocitos.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        sangre.add(leucocitos, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 230, 130, 30));

        jLabel10.setFont(new java.awt.Font("Arial", 3, 15)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(102, 102, 102));
        jLabel10.setText("VN: 4,50 - 11,20");
        sangre.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 245, -1, -1));

        jLabel11.setFont(new java.awt.Font("Arial", 3, 15)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(102, 102, 102));
        jLabel11.setText("VN: 39,9 - 75,0");
        sangre.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 285, -1, -1));

        segmentados.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        segmentados.setForeground(new java.awt.Color(102, 102, 102));
        segmentados.setBorder(null);
        segmentados.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        sangre.add(segmentados, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 270, 130, 30));

        jSeparator12.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator12.setForeground(new java.awt.Color(0, 0, 0));
        sangre.add(jSeparator12, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 300, 130, 10));

        jLabel12.setFont(new java.awt.Font("Arial", 3, 15)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(102, 102, 102));
        jLabel12.setText("%");
        sangre.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 285, -1, -1));

        jSeparator13.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator13.setForeground(new java.awt.Color(0, 0, 0));
        sangre.add(jSeparator13, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 340, 130, 10));

        jLabel13.setFont(new java.awt.Font("Arial", 3, 15)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(102, 102, 102));
        jLabel13.setText("%");
        sangre.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 325, -1, -1));

        jLabel14.setFont(new java.awt.Font("Arial", 3, 15)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(102, 102, 102));
        jLabel14.setText("VN: 18,8 - 50,8");
        sangre.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 325, -1, -1));

        linfocitos.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        linfocitos.setForeground(new java.awt.Color(102, 102, 102));
        linfocitos.setBorder(null);
        linfocitos.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        sangre.add(linfocitos, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 310, 130, 30));

        jLabel15.setFont(new java.awt.Font("Arial", 3, 15)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(102, 102, 102));
        jLabel15.setText("10^6/uL");
        sangre.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 85, -1, -1));

        jLabel16.setFont(new java.awt.Font("Arial", 3, 24)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(102, 102, 102));
        jLabel16.setText("EXÁMENES SANGUÍNEOS");
        sangre.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 0, -1, -1));

        jLabel17.setFont(new java.awt.Font("Arial", 3, 15)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(102, 102, 102));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel17.setText("HEMOGLOBINA O HB:");
        sangre.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 125, -1, -1));

        jLabel18.setFont(new java.awt.Font("Arial", 3, 15)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(102, 102, 102));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel18.setText("HEMATOCRITOS O HTC:");
        sangre.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 165, 180, -1));

        jLabel19.setFont(new java.awt.Font("Arial", 3, 15)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(102, 102, 102));
        jLabel19.setText("PLAQUETAS:");
        sangre.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 205, 100, -1));

        jLabel20.setFont(new java.awt.Font("Arial", 3, 15)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(102, 102, 102));
        jLabel20.setText("LEUCOCITOS O GLÓBULOS BLANCOS:");
        sangre.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 245, -1, -1));

        jLabel21.setFont(new java.awt.Font("Arial", 3, 15)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(102, 102, 102));
        jLabel21.setText("SEGMENTADOS O NEUTROFILOS:");
        sangre.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 285, -1, -1));

        b_siguienteSangre.setBackground(new java.awt.Color(103, 174, 202));
        b_siguienteSangre.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        b_siguienteSangre.setForeground(new java.awt.Color(255, 255, 255));
        b_siguienteSangre.setText("Siguiente");
        b_siguienteSangre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(103, 174, 202), 2));
        b_siguienteSangre.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b_siguienteSangre.setFocusPainted(false);
        b_siguienteSangre.setRolloverEnabled(false);
        b_siguienteSangre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                b_siguienteSangreMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                b_siguienteSangreMouseReleased(evt);
            }
        });
        b_siguienteSangre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_siguienteSangreActionPerformed(evt);
            }
        });
        sangre.add(b_siguienteSangre, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 410, 100, 30));

        b_limpiarSangre.setBackground(new java.awt.Color(103, 174, 202));
        b_limpiarSangre.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        b_limpiarSangre.setForeground(new java.awt.Color(255, 255, 255));
        b_limpiarSangre.setText("Limpiar");
        b_limpiarSangre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(103, 174, 202), 2));
        b_limpiarSangre.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b_limpiarSangre.setFocusPainted(false);
        b_limpiarSangre.setRolloverEnabled(false);
        b_limpiarSangre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                b_limpiarSangreMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                b_limpiarSangreMouseReleased(evt);
            }
        });
        b_limpiarSangre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_limpiarSangreActionPerformed(evt);
            }
        });
        sangre.add(b_limpiarSangre, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 410, 100, 30));

        jLabel22.setFont(new java.awt.Font("Arial", 3, 15)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(102, 102, 102));
        jLabel22.setText("HEMATIES O GLÓBULOS ROJOS: ");
        sangre.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 85, -1, -1));

        base.add(sangre, "card2");

        add(base, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 680, 470));

        getAccessibleContext().setAccessibleName("");
    }// </editor-fold>//GEN-END:initComponents

    private void b_siguienteSangreMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b_siguienteSangreMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_b_siguienteSangreMousePressed

    private void b_siguienteSangreMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b_siguienteSangreMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_b_siguienteSangreMouseReleased

    private void b_siguienteSangreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_siguienteSangreActionPerformed
        
        if(tipo==3){
            sangre.setVisible(false);
            orina.setVisible(true);
            documento.setVisible(false);
        }else{
            sangre.setVisible(false);
            orina.setVisible(false);
            documento.setVisible(true);
        }
        
    }//GEN-LAST:event_b_siguienteSangreActionPerformed

    private void b_limpiarSangreMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b_limpiarSangreMousePressed

        b_limpiarSangre.setForeground(new Color(103,174,202));
        b_limpiarSangre.setBorder(new LineBorder(new Color(103,174,202), 2));
        b_limpiarSangre.setBackground(Color.white);
    }//GEN-LAST:event_b_limpiarSangreMousePressed

    private void b_limpiarSangreMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b_limpiarSangreMouseReleased

        b_limpiarSangre.setForeground(Color.white);
        b_limpiarSangre.setBorder(new LineBorder(new Color(103,174,202), 2));
        b_limpiarSangre.setBackground(new Color(103,174,202));
    }//GEN-LAST:event_b_limpiarSangreMouseReleased

    private void b_limpiarSangreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_limpiarSangreActionPerformed
        limpiar_campos();
    }//GEN-LAST:event_b_limpiarSangreActionPerformed

    private void b_siguienteOrinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_siguienteOrinaActionPerformed
        sangre.setVisible(false);
        orina.setVisible(false);
        documento.setVisible(true);
    }//GEN-LAST:event_b_siguienteOrinaActionPerformed

    private void b_limpiar1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b_limpiar1MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_b_limpiar1MousePressed

    private void b_limpiar1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b_limpiar1MouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_b_limpiar1MouseReleased

    private void b_limpiar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_limpiar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_b_limpiar1ActionPerformed

    private void registrarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registrarMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_registrarMousePressed

    private void registrarMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registrarMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_registrarMouseReleased

    private void registrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_registrarActionPerformed

    private void b_limpiar2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b_limpiar2MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_b_limpiar2MousePressed

    private void b_limpiar2MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b_limpiar2MouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_b_limpiar2MouseReleased

    private void b_limpiar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_limpiar2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_b_limpiar2ActionPerformed

    private void b_siguienteOrinaMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b_siguienteOrinaMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_b_siguienteOrinaMouseReleased

    private void b_siguienteOrinaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b_siguienteOrinaMousePressed

    }//GEN-LAST:event_b_siguienteOrinaMousePressed

    //metodos y variables
    
    public void limpiar_campos(){
        globulos_rojos.setText("");
        hemoglobina.setText("");
        hematocritos.setText("");
        plaquetas.setText("");
        leucocitos.setText("");
        segmentados.setText("");
        linfocitos.setText("");
    }
    
    public void setTipo(int tipo){
        this.tipo = tipo; //1 sangre, 2 orina, 3 ambos
    }

    public void mostrarSangre(){
        sangre.setVisible(true);
        orina.setVisible(false);
        documento.setVisible(false);
    }
    
    public void mostrarOrina(){
        sangre.setVisible(false);
        orina.setVisible(true);
        documento.setVisible(false);
    }
    
    public void mostrarDocumento(){
        sangre.setVisible(false);
        orina.setVisible(false);
        documento.setVisible(true);
    }
    
    int tipo=0;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b_limpiar1;
    private javax.swing.JButton b_limpiar2;
    private javax.swing.JButton b_limpiarSangre;
    private javax.swing.JButton b_siguienteOrina;
    private javax.swing.JButton b_siguienteSangre;
    private javax.swing.JPanel base;
    private javax.swing.JPanel documento;
    private javax.swing.JTextField globulos_rojos;
    private javax.swing.JTextField globulos_rojos1;
    private javax.swing.JTextField hematocritos;
    private javax.swing.JTextField hematocritos1;
    private javax.swing.JTextField hemoglobina;
    private javax.swing.JTextField hemoglobina1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator13;
    private javax.swing.JSeparator jSeparator14;
    private javax.swing.JSeparator jSeparator15;
    private javax.swing.JSeparator jSeparator16;
    private javax.swing.JSeparator jSeparator17;
    private javax.swing.JSeparator jSeparator18;
    private javax.swing.JSeparator jSeparator19;
    private javax.swing.JSeparator jSeparator20;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JLabel l_titulo;
    private javax.swing.JTextField leucocitos;
    private javax.swing.JTextField leucocitos1;
    private javax.swing.JTextField linfocitos;
    private javax.swing.JTextField linfocitos1;
    private javax.swing.JPanel orina;
    private javax.swing.JTextField plaquetas;
    private javax.swing.JTextField plaquetas1;
    private javax.swing.JButton registrar;
    private javax.swing.JPanel sangre;
    private javax.swing.JTextField segmentados;
    private javax.swing.JTextField segmentados1;
    // End of variables declaration//GEN-END:variables
}
