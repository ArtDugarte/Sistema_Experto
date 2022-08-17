package paneles;

import java.awt.Color;
import java.awt.event.ItemEvent;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.border.LineBorder;
import modelos.modelo;
import modelos.operar_diagnosticos;

public class p_crudDiagnosticos extends javax.swing.JPanel {

    public p_crudDiagnosticos() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sangre = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jlabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        b_siguienteSangre = new javax.swing.JButton();
        b_limpiarSangre = new javax.swing.JButton();
        jLabel22 = new javax.swing.JLabel();
        cb7 = new javax.swing.JComboBox<>();
        cb1 = new javax.swing.JComboBox<>();
        cb2 = new javax.swing.JComboBox<>();
        cb3 = new javax.swing.JComboBox<>();
        cb4 = new javax.swing.JComboBox<>();
        cb5 = new javax.swing.JComboBox<>();
        cb6 = new javax.swing.JComboBox<>();
        ck1 = new javax.swing.JCheckBox();
        ck2 = new javax.swing.JCheckBox();
        ck3 = new javax.swing.JCheckBox();
        ck4 = new javax.swing.JCheckBox();
        ck5 = new javax.swing.JCheckBox();
        ck6 = new javax.swing.JCheckBox();
        ck7 = new javax.swing.JCheckBox();
        b_volver_sangre = new javax.swing.JButton();
        orina = new javax.swing.JPanel();
        jSeparator14 = new javax.swing.JSeparator();
        jLabel24 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        b_siguienteOrina = new javax.swing.JButton();
        b_limpiarOrina = new javax.swing.JButton();
        jLabel44 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        o1 = new javax.swing.JComboBox<>();
        jLabel47 = new javax.swing.JLabel();
        o2 = new javax.swing.JComboBox<>();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        o3 = new javax.swing.JComboBox<>();
        jLabel45 = new javax.swing.JLabel();
        jSeparator15 = new javax.swing.JSeparator();
        jLabel50 = new javax.swing.JLabel();
        o10 = new javax.swing.JComboBox<>();
        jLabel51 = new javax.swing.JLabel();
        o11 = new javax.swing.JComboBox<>();
        jLabel52 = new javax.swing.JLabel();
        o12 = new javax.swing.JComboBox<>();
        jLabel53 = new javax.swing.JLabel();
        o13 = new javax.swing.JComboBox<>();
        jLabel54 = new javax.swing.JLabel();
        o14 = new javax.swing.JComboBox<>();
        o15 = new javax.swing.JComboBox<>();
        jLabel55 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        o16 = new javax.swing.JComboBox<>();
        jLabel57 = new javax.swing.JLabel();
        o17 = new javax.swing.JComboBox<>();
        jLabel58 = new javax.swing.JLabel();
        jSeparator16 = new javax.swing.JSeparator();
        jLabel59 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        o7 = new javax.swing.JComboBox<>();
        jLabel63 = new javax.swing.JLabel();
        o8 = new javax.swing.JComboBox<>();
        jLabel64 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        b_volver_orina = new javax.swing.JButton();
        jLabel27 = new javax.swing.JLabel();
        o4 = new javax.swing.JComboBox<>();
        o5 = new javax.swing.JComboBox<>();
        o6 = new javax.swing.JComboBox<>();
        o9 = new javax.swing.JComboBox<>();
        ck8 = new javax.swing.JCheckBox();
        ck9 = new javax.swing.JCheckBox();
        ck10 = new javax.swing.JCheckBox();
        ck11 = new javax.swing.JCheckBox();
        ck12 = new javax.swing.JCheckBox();
        ck13 = new javax.swing.JCheckBox();
        ck14 = new javax.swing.JCheckBox();
        ck15 = new javax.swing.JCheckBox();
        ck16 = new javax.swing.JCheckBox();
        ck17 = new javax.swing.JCheckBox();
        ck18 = new javax.swing.JCheckBox();
        ck19 = new javax.swing.JCheckBox();
        ck20 = new javax.swing.JCheckBox();
        ck21 = new javax.swing.JCheckBox();
        ck22 = new javax.swing.JCheckBox();
        ck23 = new javax.swing.JCheckBox();
        ck24 = new javax.swing.JCheckBox();
        general = new javax.swing.JPanel();
        jLabel43 = new javax.swing.JLabel();
        crear = new javax.swing.JButton();
        limpiar_general = new javax.swing.JButton();
        b_siguiente_general = new javax.swing.JButton();
        modificar = new javax.swing.JButton();
        borrar = new javax.swing.JButton();
        nombre = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        descripcion = new javax.swing.JTextArea();
        jLabel60 = new javax.swing.JLabel();
        listado_diagnosticos = new javax.swing.JComboBox<>();
        jLabel65 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(680, 540));
        setMinimumSize(new java.awt.Dimension(680, 540));
        setName("Panel Resultados"); // NOI18N
        setLayout(new java.awt.CardLayout());

        sangre.setOpaque(false);
        sangre.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial", 3, 15)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setText("LINFOCITOS:");
        sangre.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(195, 450, 100, -1));

        jLabel2.setFont(new java.awt.Font("Arial", 3, 15)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("VN: 3,90 - 5,40");
        sangre.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 80, -1, -1));

        jLabel3.setFont(new java.awt.Font("Arial", 3, 15)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("VN: 12,0 - 16,0");
        sangre.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 140, -1, -1));

        jLabel6.setFont(new java.awt.Font("Arial", 3, 15)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 102, 102));
        jLabel6.setText("VN: 35,0 - 47,0");
        sangre.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 200, -1, -1));

        jLabel7.setFont(new java.awt.Font("Arial", 3, 15)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 102, 102));
        jLabel7.setText("VN: 140,0 - 500,0");
        sangre.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 260, -1, -1));

        jLabel10.setFont(new java.awt.Font("Arial", 3, 15)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(102, 102, 102));
        jLabel10.setText("VN: 4,50 - 11,20");
        sangre.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 320, -1, -1));

        jLabel11.setFont(new java.awt.Font("Arial", 3, 15)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(102, 102, 102));
        jLabel11.setText("VN: 39,9 - 75,0");
        sangre.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 390, -1, -1));

        jLabel14.setFont(new java.awt.Font("Arial", 3, 15)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(102, 102, 102));
        jLabel14.setText("VN: 18,8 - 50,8");
        sangre.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 450, -1, -1));

        jLabel16.setFont(new java.awt.Font("Arial", 3, 24)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(102, 102, 102));
        jLabel16.setText("EXÁMENES SANGUÍNEOS");
        sangre.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 20, -1, -1));

        jlabel17.setFont(new java.awt.Font("Arial", 3, 15)); // NOI18N
        jlabel17.setForeground(new java.awt.Color(102, 102, 102));
        jlabel17.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jlabel17.setText("HEMOGLOBINA O HB:");
        sangre.add(jlabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 140, 170, -1));

        jLabel18.setFont(new java.awt.Font("Arial", 3, 15)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(102, 102, 102));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel18.setText("HEMATOCRITOS O HTC:");
        sangre.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 200, 180, -1));

        jLabel19.setFont(new java.awt.Font("Arial", 3, 15)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(102, 102, 102));
        jLabel19.setText("PLAQUETAS:");
        sangre.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 260, 100, -1));

        jLabel20.setFont(new java.awt.Font("Arial", 3, 15)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(102, 102, 102));
        jLabel20.setText("LEUCOCITOS O GLÓBULOS BLANCOS:");
        sangre.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, -1, -1));

        jLabel21.setFont(new java.awt.Font("Arial", 3, 15)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(102, 102, 102));
        jLabel21.setText("SEGMENTADOS O NEUTROFILOS:");
        sangre.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 390, -1, -1));

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
        sangre.add(b_siguienteSangre, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 500, 100, 30));

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
        sangre.add(b_limpiarSangre, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 500, 100, 30));

        jLabel22.setFont(new java.awt.Font("Arial", 3, 15)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(102, 102, 102));
        jLabel22.setText("HEMATIES O GLÓBULOS ROJOS: ");
        sangre.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, 250, -1));

        cb7.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        cb7.setForeground(new java.awt.Color(102, 102, 102));
        cb7.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ALTOS", "BAJOS", "ALTERADOS" }));
        cb7.setSelectedItem("LIGERAMENTE TURBIO");
        cb7.setBorder(null);
        cb7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cb7.setFocusable(false);
        cb7.setName("Desplegable"); // NOI18N
        sangre.add(cb7, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 450, 200, 20));

        cb1.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        cb1.setForeground(new java.awt.Color(102, 102, 102));
        cb1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ALTOS", "BAJOS", "ALTERADOS" }));
        cb1.setSelectedItem("LIGERAMENTE TURBIO");
        cb1.setBorder(null);
        cb1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cb1.setFocusable(false);
        cb1.setName("Desplegable"); // NOI18N
        sangre.add(cb1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 80, 200, 20));

        cb2.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        cb2.setForeground(new java.awt.Color(102, 102, 102));
        cb2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ALTOS", "BAJOS", "ALTERADOS" }));
        cb2.setSelectedItem("LIGERAMENTE TURBIO");
        cb2.setBorder(null);
        cb2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cb2.setFocusable(false);
        cb2.setName("Desplegable"); // NOI18N
        sangre.add(cb2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 140, 200, 20));

        cb3.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        cb3.setForeground(new java.awt.Color(102, 102, 102));
        cb3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ALTOS", "BAJOS", "ALTERADOS" }));
        cb3.setSelectedItem("LIGERAMENTE TURBIO");
        cb3.setBorder(null);
        cb3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cb3.setFocusable(false);
        cb3.setName("Desplegable"); // NOI18N
        sangre.add(cb3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 200, 200, 20));

        cb4.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        cb4.setForeground(new java.awt.Color(102, 102, 102));
        cb4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ALTOS", "BAJOS", "ALTERADOS" }));
        cb4.setSelectedItem("LIGERAMENTE TURBIO");
        cb4.setBorder(null);
        cb4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cb4.setFocusable(false);
        cb4.setName("Desplegable"); // NOI18N
        sangre.add(cb4, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 260, 200, 20));

        cb5.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        cb5.setForeground(new java.awt.Color(102, 102, 102));
        cb5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ALTOS", "BAJOS", "ALTERADOS" }));
        cb5.setSelectedItem("LIGERAMENTE TURBIO");
        cb5.setBorder(null);
        cb5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cb5.setFocusable(false);
        cb5.setName("Desplegable"); // NOI18N
        sangre.add(cb5, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 320, 190, 20));

        cb6.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        cb6.setForeground(new java.awt.Color(102, 102, 102));
        cb6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ALTOS", "BAJOS", "ALTERADOS" }));
        cb6.setSelectedItem("LIGERAMENTE TURBIO");
        cb6.setBorder(null);
        cb6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cb6.setFocusable(false);
        cb6.setName("Desplegable"); // NOI18N
        sangre.add(cb6, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 390, 200, 20));

        ck1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        ck1.setContentAreaFilled(false);
        ck1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ck1.setFocusPainted(false);
        ck1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ck1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        sangre.add(ck1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 78, 20, 20));

        ck2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        ck2.setContentAreaFilled(false);
        ck2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ck2.setFocusPainted(false);
        ck2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ck2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        sangre.add(ck2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 138, 20, 20));

        ck3.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        ck3.setContentAreaFilled(false);
        ck3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ck3.setFocusPainted(false);
        ck3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ck3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        sangre.add(ck3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 200, -1, -1));

        ck4.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        ck4.setContentAreaFilled(false);
        ck4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ck4.setFocusPainted(false);
        ck4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ck4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        sangre.add(ck4, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 260, -1, -1));

        ck5.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        ck5.setContentAreaFilled(false);
        ck5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ck5.setFocusPainted(false);
        ck5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ck5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        sangre.add(ck5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, -1, -1));

        ck6.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        ck6.setContentAreaFilled(false);
        ck6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ck6.setFocusPainted(false);
        ck6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ck6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        sangre.add(ck6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 390, -1, -1));

        ck7.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        ck7.setContentAreaFilled(false);
        ck7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ck7.setFocusPainted(false);
        ck7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ck7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        sangre.add(ck7, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 450, -1, -1));

        b_volver_sangre.setBackground(new java.awt.Color(103, 174, 202));
        b_volver_sangre.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        b_volver_sangre.setForeground(new java.awt.Color(255, 255, 255));
        b_volver_sangre.setText("Volver");
        b_volver_sangre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(103, 174, 202), 2));
        b_volver_sangre.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b_volver_sangre.setFocusPainted(false);
        b_volver_sangre.setRolloverEnabled(false);
        b_volver_sangre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_volver_sangreActionPerformed(evt);
            }
        });
        sangre.add(b_volver_sangre, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 500, 100, 30));

        add(sangre, "card2");

        orina.setOpaque(false);
        orina.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSeparator14.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator14.setForeground(new java.awt.Color(0, 0, 0));
        orina.add(jSeparator14, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 280, 10));

        jLabel24.setFont(new java.awt.Font("Arial", 3, 15)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(102, 102, 102));
        jLabel24.setText("VN: 0-2");
        orina.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 290, -1, -1));

        jLabel38.setFont(new java.awt.Font("Arial", 3, 24)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(102, 102, 102));
        jLabel38.setText("EXÁMENES DE ORINA");
        orina.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 20, -1, -1));

        b_siguienteOrina.setBackground(new java.awt.Color(103, 174, 202));
        b_siguienteOrina.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        b_siguienteOrina.setForeground(new java.awt.Color(255, 255, 255));
        b_siguienteOrina.setText("Panel General");
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
        orina.add(b_siguienteOrina, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 500, 130, 30));

        b_limpiarOrina.setBackground(new java.awt.Color(103, 174, 202));
        b_limpiarOrina.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        b_limpiarOrina.setForeground(new java.awt.Color(255, 255, 255));
        b_limpiarOrina.setText("Limpiar");
        b_limpiarOrina.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(103, 174, 202), 2));
        b_limpiarOrina.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b_limpiarOrina.setFocusPainted(false);
        b_limpiarOrina.setRolloverEnabled(false);
        b_limpiarOrina.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                b_limpiarOrinaMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                b_limpiarOrinaMouseReleased(evt);
            }
        });
        b_limpiarOrina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_limpiarOrinaActionPerformed(evt);
            }
        });
        orina.add(b_limpiarOrina, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 500, 100, 30));

        jLabel44.setFont(new java.awt.Font("Arial", 3, 15)); // NOI18N
        jLabel44.setForeground(new java.awt.Color(102, 102, 102));
        jLabel44.setText("CARACTERÍSTICAS FÍSICAS:");
        orina.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 210, 20));

        jLabel46.setFont(new java.awt.Font("Arial", 3, 15)); // NOI18N
        jLabel46.setForeground(new java.awt.Color(102, 102, 102));
        jLabel46.setText("Leucocitos: ");
        orina.add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, -1, 20));

        o1.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        o1.setForeground(new java.awt.Color(102, 102, 102));
        o1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "TRANSPARENTE", "LIGERAMENTE TURBIO", "TURBIO" }));
        o1.setSelectedItem("LIGERAMENTE TURBIO");
        o1.setBorder(null);
        o1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        o1.setFocusable(false);
        o1.setName("Desplegable"); // NOI18N
        orina.add(o1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, 200, 20));

        jLabel47.setFont(new java.awt.Font("Arial", 3, 15)); // NOI18N
        jLabel47.setForeground(new java.awt.Color(102, 102, 102));
        jLabel47.setText("Color:");
        orina.add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, 20));

        o2.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        o2.setForeground(new java.awt.Color(102, 102, 102));
        o2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AMARILLA", "ROJIZA", "INCOLORA", "MARRÓN", "AZUL VERDOSA", "OTRO" }));
        o2.setSelectedItem("AMARILLA");
        o2.setBorder(null);
        o2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        o2.setFocusable(false);
        o2.setName("Desplegable"); // NOI18N
        orina.add(o2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, 200, 20));

        jLabel48.setFont(new java.awt.Font("Arial", 3, 15)); // NOI18N
        jLabel48.setForeground(new java.awt.Color(102, 102, 102));
        jLabel48.setText("Densidad:");
        orina.add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, -1, 20));

        jLabel49.setFont(new java.awt.Font("Arial", 3, 15)); // NOI18N
        jLabel49.setForeground(new java.awt.Color(102, 102, 102));
        jLabel49.setText("Reacción:");
        orina.add(jLabel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, -1, 20));

        o3.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        o3.setForeground(new java.awt.Color(102, 102, 102));
        o3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ÁCIDA", "ALCALINA", "NEUTRA" }));
        o3.setSelectedItem("ÁCIDA");
        o3.setBorder(null);
        o3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        o3.setFocusable(false);
        o3.setName("Desplegable"); // NOI18N
        orina.add(o3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 170, 200, 20));

        jLabel45.setFont(new java.awt.Font("Arial", 3, 15)); // NOI18N
        jLabel45.setForeground(new java.awt.Color(102, 102, 102));
        jLabel45.setText("CARACTERÍSTICAS QUÍMICAS:");
        orina.add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 80, 250, 20));

        jSeparator15.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator15.setForeground(new java.awt.Color(0, 0, 0));
        orina.add(jSeparator15, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 100, 280, 10));

        jLabel50.setFont(new java.awt.Font("Arial", 3, 15)); // NOI18N
        jLabel50.setForeground(new java.awt.Color(102, 102, 102));
        jLabel50.setText("Proteínas:");
        orina.add(jLabel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 110, -1, 20));

        o10.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        o10.setForeground(new java.awt.Color(102, 102, 102));
        o10.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "NEGATIVO", "POSITIVO" }));
        o10.setSelectedItem("LIGERAMENTE TURBIO");
        o10.setBorder(null);
        o10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        o10.setFocusable(false);
        o10.setName("Desplegable"); // NOI18N
        orina.add(o10, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 110, 200, 20));

        jLabel51.setFont(new java.awt.Font("Arial", 3, 15)); // NOI18N
        jLabel51.setForeground(new java.awt.Color(102, 102, 102));
        jLabel51.setText("Glucosa:");
        orina.add(jLabel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 150, -1, 20));

        o11.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        o11.setForeground(new java.awt.Color(102, 102, 102));
        o11.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "NEGATIVO", "POSITIVO" }));
        o11.setSelectedItem("LIGERAMENTE TURBIO");
        o11.setBorder(null);
        o11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        o11.setFocusable(false);
        o11.setName("Desplegable"); // NOI18N
        orina.add(o11, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 150, 200, 20));

        jLabel52.setFont(new java.awt.Font("Arial", 3, 15)); // NOI18N
        jLabel52.setForeground(new java.awt.Color(102, 102, 102));
        jLabel52.setText("Hemoglobina:");
        orina.add(jLabel52, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 190, -1, 20));

        o12.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        o12.setForeground(new java.awt.Color(102, 102, 102));
        o12.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "NEGATIVO", "POSITIVO" }));
        o12.setSelectedItem("LIGERAMENTE TURBIO");
        o12.setBorder(null);
        o12.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        o12.setFocusable(false);
        o12.setName("Desplegable"); // NOI18N
        orina.add(o12, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 190, 180, 20));

        jLabel53.setFont(new java.awt.Font("Arial", 3, 15)); // NOI18N
        jLabel53.setForeground(new java.awt.Color(102, 102, 102));
        jLabel53.setText("C. Cetonico:");
        orina.add(jLabel53, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 230, -1, 20));

        o13.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        o13.setForeground(new java.awt.Color(102, 102, 102));
        o13.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "NEGATIVO", "POSITIVO" }));
        o13.setSelectedItem("LIGERAMENTE TURBIO");
        o13.setBorder(null);
        o13.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        o13.setFocusable(false);
        o13.setName("Desplegable"); // NOI18N
        orina.add(o13, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 230, 190, 20));

        jLabel54.setFont(new java.awt.Font("Arial", 3, 15)); // NOI18N
        jLabel54.setForeground(new java.awt.Color(102, 102, 102));
        jLabel54.setText("P. Biliares:");
        orina.add(jLabel54, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 270, -1, 20));

        o14.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        o14.setForeground(new java.awt.Color(102, 102, 102));
        o14.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "NEGATIVO", "POSITIVO" }));
        o14.setSelectedItem("LIGERAMENTE TURBIO");
        o14.setBorder(null);
        o14.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        o14.setFocusable(false);
        o14.setName("Desplegable"); // NOI18N
        orina.add(o14, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 270, 200, 20));

        o15.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        o15.setForeground(new java.awt.Color(102, 102, 102));
        o15.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "NEGATIVO", "POSITIVO" }));
        o15.setSelectedItem("LIGERAMENTE TURBIO");
        o15.setBorder(null);
        o15.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        o15.setFocusable(false);
        o15.setName("Desplegable"); // NOI18N
        orina.add(o15, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 310, 180, 20));

        jLabel55.setFont(new java.awt.Font("Arial", 3, 15)); // NOI18N
        jLabel55.setForeground(new java.awt.Color(102, 102, 102));
        jLabel55.setText("Urobilinogen:");
        orina.add(jLabel55, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 310, -1, 20));

        jLabel56.setFont(new java.awt.Font("Arial", 3, 15)); // NOI18N
        jLabel56.setForeground(new java.awt.Color(102, 102, 102));
        jLabel56.setText("Bilirrubina:");
        orina.add(jLabel56, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 350, -1, 20));

        o16.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        o16.setForeground(new java.awt.Color(102, 102, 102));
        o16.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "NEGATIVO", "POSITIVO" }));
        o16.setSelectedItem("LIGERAMENTE TURBIO");
        o16.setBorder(null);
        o16.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        o16.setFocusable(false);
        o16.setName("Desplegable"); // NOI18N
        orina.add(o16, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 350, 200, 20));

        jLabel57.setFont(new java.awt.Font("Arial", 3, 15)); // NOI18N
        jLabel57.setForeground(new java.awt.Color(102, 102, 102));
        jLabel57.setText("Nitritos:");
        orina.add(jLabel57, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 390, -1, 20));

        o17.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        o17.setForeground(new java.awt.Color(102, 102, 102));
        o17.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "NEGATIVO", "POSITIVO" }));
        o17.setSelectedItem("LIGERAMENTE TURBIO");
        o17.setBorder(null);
        o17.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        o17.setFocusable(false);
        o17.setName("Desplegable"); // NOI18N
        orina.add(o17, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 390, 200, 20));

        jLabel58.setFont(new java.awt.Font("Arial", 3, 15)); // NOI18N
        jLabel58.setForeground(new java.awt.Color(102, 102, 102));
        jLabel58.setText("MICROSCOPIO:");
        orina.add(jLabel58, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 250, 20));

        jSeparator16.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator16.setForeground(new java.awt.Color(0, 0, 0));
        orina.add(jSeparator16, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 280, 10));

        jLabel59.setFont(new java.awt.Font("Arial", 3, 15)); // NOI18N
        jLabel59.setForeground(new java.awt.Color(102, 102, 102));
        jLabel59.setText("Aspecto:");
        orina.add(jLabel59, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, 20));

        jLabel61.setFont(new java.awt.Font("Arial", 3, 15)); // NOI18N
        jLabel61.setForeground(new java.awt.Color(102, 102, 102));
        jLabel61.setText("Hematies:");
        orina.add(jLabel61, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, -1, 20));

        jLabel25.setFont(new java.awt.Font("Arial", 3, 15)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(102, 102, 102));
        jLabel25.setText("VN: 0-1");
        orina.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 320, -1, -1));

        jLabel62.setFont(new java.awt.Font("Arial", 3, 15)); // NOI18N
        jLabel62.setForeground(new java.awt.Color(102, 102, 102));
        jLabel62.setText("Piocitos:");
        orina.add(jLabel62, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, -1, 20));

        o7.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        o7.setForeground(new java.awt.Color(102, 102, 102));
        o7.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "NEGATIVO", "POSITIVO" }));
        o7.setSelectedItem("LIGERAMENTE TURBIO");
        o7.setBorder(null);
        o7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        o7.setFocusable(false);
        o7.setName("Desplegable"); // NOI18N
        orina.add(o7, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 350, 190, 20));

        jLabel63.setFont(new java.awt.Font("Arial", 3, 15)); // NOI18N
        jLabel63.setForeground(new java.awt.Color(102, 102, 102));
        jLabel63.setText("Bacterias:");
        orina.add(jLabel63, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, -1, 20));

        o8.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        o8.setForeground(new java.awt.Color(102, 102, 102));
        o8.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ESCASAS", "MODERADAS", "ABUNDANTES" }));
        o8.setSelectedItem("ESCASAS");
        o8.setBorder(null);
        o8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        o8.setFocusable(false);
        o8.setName("Desplegable"); // NOI18N
        orina.add(o8, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 380, 190, 20));

        jLabel64.setFont(new java.awt.Font("Arial", 3, 15)); // NOI18N
        jLabel64.setForeground(new java.awt.Color(102, 102, 102));
        jLabel64.setText("E. Plano:");
        orina.add(jLabel64, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 410, -1, 20));

        jLabel26.setFont(new java.awt.Font("Arial", 3, 15)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(102, 102, 102));
        jLabel26.setText("VN: 0-2");
        orina.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 410, -1, -1));

        b_volver_orina.setBackground(new java.awt.Color(103, 174, 202));
        b_volver_orina.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        b_volver_orina.setForeground(new java.awt.Color(255, 255, 255));
        b_volver_orina.setText("Volver");
        b_volver_orina.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(103, 174, 202), 2));
        b_volver_orina.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b_volver_orina.setFocusPainted(false);
        b_volver_orina.setRolloverEnabled(false);
        b_volver_orina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_volver_orinaActionPerformed(evt);
            }
        });
        orina.add(b_volver_orina, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 500, 100, 30));

        jLabel27.setFont(new java.awt.Font("Arial", 3, 15)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(102, 102, 102));
        jLabel27.setText("VN: 1.005-1.030");
        orina.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 200, 120, -1));

        o4.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        o4.setForeground(new java.awt.Color(102, 102, 102));
        o4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ALTOS", "BAJOS", "ALTERADOS" }));
        o4.setSelectedItem("LIGERAMENTE TURBIO");
        o4.setBorder(null);
        o4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        o4.setFocusable(false);
        o4.setName("Desplegable"); // NOI18N
        orina.add(o4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 200, 100, 20));

        o5.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        o5.setForeground(new java.awt.Color(102, 102, 102));
        o5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ALTOS", "BAJOS", "ALTERADOS" }));
        o5.setSelectedItem("LIGERAMENTE TURBIO");
        o5.setBorder(null);
        o5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        o5.setFocusable(false);
        o5.setName("Desplegable"); // NOI18N
        orina.add(o5, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 290, 130, 20));

        o6.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        o6.setForeground(new java.awt.Color(102, 102, 102));
        o6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ALTOS", "BAJOS", "ALTERADOS" }));
        o6.setSelectedItem("LIGERAMENTE TURBIO");
        o6.setBorder(null);
        o6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        o6.setFocusable(false);
        o6.setName("Desplegable"); // NOI18N
        orina.add(o6, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 320, 130, 20));

        o9.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        o9.setForeground(new java.awt.Color(102, 102, 102));
        o9.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ALTOS", "BAJOS", "ALTERADOS" }));
        o9.setSelectedItem("LIGERAMENTE TURBIO");
        o9.setBorder(null);
        o9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        o9.setFocusable(false);
        o9.setName("Desplegable"); // NOI18N
        orina.add(o9, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 410, 130, 20));

        ck8.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        ck8.setContentAreaFilled(false);
        ck8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ck8.setFocusPainted(false);
        orina.add(ck8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, -1, -1));

        ck9.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        ck9.setContentAreaFilled(false);
        ck9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ck9.setFocusPainted(false);
        orina.add(ck9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, -1, -1));

        ck10.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        ck10.setContentAreaFilled(false);
        ck10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ck10.setFocusPainted(false);
        orina.add(ck10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, -1, -1));

        ck11.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        ck11.setContentAreaFilled(false);
        ck11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ck11.setFocusPainted(false);
        orina.add(ck11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, -1, -1));

        ck12.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        ck12.setContentAreaFilled(false);
        ck12.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ck12.setFocusPainted(false);
        orina.add(ck12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, -1, -1));

        ck13.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        ck13.setContentAreaFilled(false);
        ck13.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ck13.setFocusPainted(false);
        orina.add(ck13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, -1, -1));

        ck14.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        ck14.setContentAreaFilled(false);
        ck14.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ck14.setFocusPainted(false);
        orina.add(ck14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, -1, -1));

        ck15.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        ck15.setContentAreaFilled(false);
        ck15.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ck15.setFocusPainted(false);
        orina.add(ck15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, -1, -1));

        ck16.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        ck16.setContentAreaFilled(false);
        ck16.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ck16.setFocusPainted(false);
        orina.add(ck16, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 410, -1, -1));

        ck17.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        ck17.setContentAreaFilled(false);
        ck17.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ck17.setFocusPainted(false);
        orina.add(ck17, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 110, -1, -1));

        ck18.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        ck18.setContentAreaFilled(false);
        ck18.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ck18.setFocusPainted(false);
        orina.add(ck18, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 150, -1, -1));

        ck19.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        ck19.setContentAreaFilled(false);
        ck19.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ck19.setFocusPainted(false);
        orina.add(ck19, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 190, -1, -1));

        ck20.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        ck20.setContentAreaFilled(false);
        ck20.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ck20.setFocusPainted(false);
        orina.add(ck20, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 230, -1, -1));

        ck21.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        ck21.setContentAreaFilled(false);
        ck21.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ck21.setFocusPainted(false);
        orina.add(ck21, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 270, -1, -1));

        ck22.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        ck22.setContentAreaFilled(false);
        ck22.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ck22.setFocusPainted(false);
        orina.add(ck22, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 310, -1, -1));

        ck23.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        ck23.setContentAreaFilled(false);
        ck23.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ck23.setFocusPainted(false);
        orina.add(ck23, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 350, -1, -1));

        ck24.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        ck24.setContentAreaFilled(false);
        ck24.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ck24.setFocusPainted(false);
        orina.add(ck24, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 390, -1, -1));

        add(orina, "card2");

        general.setOpaque(false);
        general.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel43.setFont(new java.awt.Font("Arial", 3, 24)); // NOI18N
        jLabel43.setForeground(new java.awt.Color(102, 102, 102));
        jLabel43.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel43.setText("PANEL GENERAL");
        general.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 630, -1));

        crear.setBackground(new java.awt.Color(103, 174, 202));
        crear.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        crear.setForeground(new java.awt.Color(255, 255, 255));
        crear.setText("Crear");
        crear.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(103, 174, 202), 2));
        crear.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        crear.setFocusPainted(false);
        crear.setRolloverEnabled(false);
        crear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearActionPerformed(evt);
            }
        });
        general.add(crear, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 500, 100, 30));

        limpiar_general.setBackground(new java.awt.Color(103, 174, 202));
        limpiar_general.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        limpiar_general.setForeground(new java.awt.Color(255, 255, 255));
        limpiar_general.setText("Limpiar");
        limpiar_general.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(103, 174, 202), 2));
        limpiar_general.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        limpiar_general.setFocusPainted(false);
        limpiar_general.setRolloverEnabled(false);
        limpiar_general.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpiar_generalActionPerformed(evt);
            }
        });
        general.add(limpiar_general, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 500, 100, 30));

        b_siguiente_general.setBackground(new java.awt.Color(103, 174, 202));
        b_siguiente_general.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        b_siguiente_general.setForeground(new java.awt.Color(255, 255, 255));
        b_siguiente_general.setText("Siguiente");
        b_siguiente_general.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(103, 174, 202), 2));
        b_siguiente_general.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b_siguiente_general.setFocusPainted(false);
        b_siguiente_general.setRolloverEnabled(false);
        b_siguiente_general.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_siguiente_generalActionPerformed(evt);
            }
        });
        general.add(b_siguiente_general, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 500, 100, 30));

        modificar.setBackground(new java.awt.Color(103, 174, 202));
        modificar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        modificar.setForeground(new java.awt.Color(255, 255, 255));
        modificar.setText("Modificar");
        modificar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(103, 174, 202), 2));
        modificar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        modificar.setFocusPainted(false);
        modificar.setRolloverEnabled(false);
        modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarActionPerformed(evt);
            }
        });
        general.add(modificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 500, 100, 30));

        borrar.setBackground(new java.awt.Color(103, 174, 202));
        borrar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        borrar.setForeground(new java.awt.Color(255, 255, 255));
        borrar.setText("Borrar");
        borrar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(103, 174, 202), 2));
        borrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        borrar.setFocusPainted(false);
        borrar.setRolloverEnabled(false);
        borrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                borrarMouseReleased(evt);
            }
        });
        borrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borrarActionPerformed(evt);
            }
        });
        general.add(borrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 500, 100, 30));

        nombre.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        nombre.setForeground(new java.awt.Color(102, 102, 102));
        nombre.setText("Nombre del Diagnostico:");
        nombre.setBorder(null);
        nombre.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        nombre.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                nombreFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                nombreFocusLost(evt);
            }
        });
        nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreActionPerformed(evt);
            }
        });
        general.add(nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 630, 30));

        jSeparator5.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator5.setForeground(new java.awt.Color(0, 0, 0));
        general.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 630, 10));

        descripcion.setColumns(20);
        descripcion.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        descripcion.setRows(5);
        jScrollPane1.setViewportView(descripcion);

        general.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 630, -1));

        jLabel60.setFont(new java.awt.Font("Arial", 3, 15)); // NOI18N
        jLabel60.setForeground(new java.awt.Color(102, 102, 102));
        jLabel60.setText("Diagnosticos Registrados:");
        general.add(jLabel60, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 220, 20));

        listado_diagnosticos.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        listado_diagnosticos.setForeground(new java.awt.Color(102, 102, 102));
        listado_diagnosticos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "D1", "D2", "D3", "D4" }));
        listado_diagnosticos.setSelectedItem("ÁCIDA");
        listado_diagnosticos.setBorder(null);
        listado_diagnosticos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        listado_diagnosticos.setFocusable(false);
        listado_diagnosticos.setName("Desplegable"); // NOI18N
        listado_diagnosticos.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                listado_diagnosticosItemStateChanged(evt);
            }
        });
        general.add(listado_diagnosticos, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 630, 20));

        jLabel65.setFont(new java.awt.Font("Arial", 3, 15)); // NOI18N
        jLabel65.setForeground(new java.awt.Color(102, 102, 102));
        jLabel65.setText("Descripción del Diagnostico:");
        general.add(jLabel65, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 210, 20));

        add(general, "card2");

        getAccessibleContext().setAccessibleName("");
    }// </editor-fold>//GEN-END:initComponents

    private void b_siguienteSangreMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b_siguienteSangreMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_b_siguienteSangreMousePressed

    private void b_siguienteSangreMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b_siguienteSangreMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_b_siguienteSangreMouseReleased

    private void b_siguienteSangreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_siguienteSangreActionPerformed
        sangre.setVisible(false);
        orina.setVisible(true);
        general.setVisible(false);

    }//GEN-LAST:event_b_siguienteSangreActionPerformed

    private void b_limpiarSangreMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b_limpiarSangreMousePressed

        b_limpiarSangre.setForeground(new Color(103, 174, 202));
        b_limpiarSangre.setBorder(new LineBorder(new Color(103, 174, 202), 2));
        b_limpiarSangre.setBackground(Color.white);
    }//GEN-LAST:event_b_limpiarSangreMousePressed

    private void b_limpiarSangreMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b_limpiarSangreMouseReleased

        b_limpiarSangre.setForeground(Color.white);
        b_limpiarSangre.setBorder(new LineBorder(new Color(103, 174, 202), 2));
        b_limpiarSangre.setBackground(new Color(103, 174, 202));
    }//GEN-LAST:event_b_limpiarSangreMouseReleased

    private void b_limpiarSangreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_limpiarSangreActionPerformed
        limpiarSangre();
    }//GEN-LAST:event_b_limpiarSangreActionPerformed

    private void b_limpiarOrinaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b_limpiarOrinaMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_b_limpiarOrinaMousePressed

    private void b_limpiarOrinaMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b_limpiarOrinaMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_b_limpiarOrinaMouseReleased

    private void b_limpiarOrinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_limpiarOrinaActionPerformed
        limpiarOrina();
    }//GEN-LAST:event_b_limpiarOrinaActionPerformed

    private void b_volver_orinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_volver_orinaActionPerformed
        sangre.setVisible(true);
        orina.setVisible(false);
        general.setVisible(false);

    }//GEN-LAST:event_b_volver_orinaActionPerformed

    private void crearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearActionPerformed

        if (nombre.getText().equals("Nombre del Diagnostico:") || descripcion.getText().equals("") || nombre.getText().equals("")) {

            JOptionPane.showMessageDialog(null, "¡Campos Vacíos o por defecto! \n        Intente Nuevamente...", "¡ERROR!", JOptionPane.ERROR_MESSAGE);

        } else {

            ArrayList<String> valores = new ArrayList<String>();
            ArrayList<Boolean> resultado_seleccionado = new ArrayList<Boolean>();
            operar_diagnosticos op = new operar_diagnosticos();
            int aux = op.Crear(nombre.getText().toUpperCase() + "", descripcion.getText());
            //PARAMETROS A GUARDAR

            if (aux > 0) {

                //EXAMENES DE SANGRE 
                valores.add(cb1.getSelectedItem() + "");
                valores.add(cb2.getSelectedItem() + "");
                valores.add(cb3.getSelectedItem() + "");
                valores.add(cb4.getSelectedItem() + "");
                valores.add(cb5.getSelectedItem() + "");
                valores.add(cb6.getSelectedItem() + "");
                valores.add(cb7.getSelectedItem() + "");

                //IMPORTANCIA DE LOS PARAMETROS
                //SI ES 1 LA IMPORTANCIA, ES IRRELEVANTE SU VALOR     
                resultado_seleccionado.add(ck1.isSelected());
                resultado_seleccionado.add(ck2.isSelected());
                resultado_seleccionado.add(ck3.isSelected());
                resultado_seleccionado.add(ck4.isSelected());
                resultado_seleccionado.add(ck5.isSelected());
                resultado_seleccionado.add(ck6.isSelected());
                resultado_seleccionado.add(ck7.isSelected());
                op.parametros_diagnostico_sangre(valores, resultado_seleccionado);

                //EXAMENES DE ORINA 
                valores = new ArrayList<String>();
                resultado_seleccionado = new ArrayList<Boolean>();
                valores.add(o1.getSelectedItem() + "");
                valores.add(o2.getSelectedItem() + "");
                valores.add(o3.getSelectedItem() + "");
                valores.add(o4.getSelectedItem() + "");
                valores.add(o5.getSelectedItem() + "");
                valores.add(o6.getSelectedItem() + "");
                valores.add(o7.getSelectedItem() + "");
                valores.add(o8.getSelectedItem() + "");
                valores.add(o9.getSelectedItem() + "");
                valores.add(o10.getSelectedItem() + "");
                valores.add(o11.getSelectedItem() + "");
                valores.add(o12.getSelectedItem() + "");
                valores.add(o13.getSelectedItem() + "");
                valores.add(o14.getSelectedItem() + "");
                valores.add(o15.getSelectedItem() + "");
                valores.add(o16.getSelectedItem() + "");
                valores.add(o17.getSelectedItem() + "");

                //IMPORTANCIA DE LOS PARAMETROS
                //SI ES 1 LA IMPORTANCIA, ES IRRELEVANTE SU VALOR     
                resultado_seleccionado.add(ck8.isSelected());
                resultado_seleccionado.add(ck9.isSelected());
                resultado_seleccionado.add(ck10.isSelected());
                resultado_seleccionado.add(ck11.isSelected());
                resultado_seleccionado.add(ck12.isSelected());
                resultado_seleccionado.add(ck13.isSelected());
                resultado_seleccionado.add(ck14.isSelected());
                resultado_seleccionado.add(ck15.isSelected());
                resultado_seleccionado.add(ck16.isSelected());
                resultado_seleccionado.add(ck17.isSelected());
                resultado_seleccionado.add(ck18.isSelected());
                resultado_seleccionado.add(ck19.isSelected());
                resultado_seleccionado.add(ck20.isSelected());
                resultado_seleccionado.add(ck21.isSelected());
                resultado_seleccionado.add(ck22.isSelected());
                resultado_seleccionado.add(ck23.isSelected());
                resultado_seleccionado.add(ck24.isSelected());
                op.parametros_diagnostico_orina(valores, resultado_seleccionado);

                iniciar();
            }
        }
    }//GEN-LAST:event_crearActionPerformed

    private void limpiar_generalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiar_generalActionPerformed
        limpiarGeneral();

    }//GEN-LAST:event_limpiar_generalActionPerformed

    private void b_siguiente_generalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_siguiente_generalActionPerformed
        sangre.setVisible(true);
        orina.setVisible(false);
        general.setVisible(false);
    }//GEN-LAST:event_b_siguiente_generalActionPerformed

    private void modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarActionPerformed
        if (listado_diagnosticos.getSelectedItem().equals("--DIAGNOSTICOS EXISTENTES--")) {
            JOptionPane.showMessageDialog(null, "¡Debe seleccionar un diagnostico! \n        Intente Nuevamente...", "¡ERROR!", JOptionPane.ERROR_MESSAGE);

        } else if (nombre.getText().equals("") || descripcion.getText().equals("") || nombre.getText().equals("Nombre del Diagnostico:")) {
            JOptionPane.showMessageDialog(null, "¡Campos en blanco o por defecto! \n        Intente Nuevamente...", "¡ERROR!", JOptionPane.ERROR_MESSAGE);

        } else {
            ArrayList<String> valores = new ArrayList<String>();
            ArrayList<Boolean> resultado_seleccionado = new ArrayList<Boolean>();
            operar_diagnosticos op = new operar_diagnosticos();

            //EXAMENES DE SANGRE 
            valores.add(cb1.getSelectedItem() + "");
            valores.add(cb2.getSelectedItem() + "");
            valores.add(cb3.getSelectedItem() + "");
            valores.add(cb4.getSelectedItem() + "");
            valores.add(cb5.getSelectedItem() + "");
            valores.add(cb6.getSelectedItem() + "");
            valores.add(cb7.getSelectedItem() + "");

            //IMPORTANCIA DE LOS PARAMETROS   
            resultado_seleccionado.add(ck1.isSelected());
            resultado_seleccionado.add(ck2.isSelected());
            resultado_seleccionado.add(ck3.isSelected());
            resultado_seleccionado.add(ck4.isSelected());
            resultado_seleccionado.add(ck5.isSelected());
            resultado_seleccionado.add(ck6.isSelected());
            resultado_seleccionado.add(ck7.isSelected());

            //EXAMENES DE ORINA 
            valores.add(o1.getSelectedItem() + "");
            valores.add(o2.getSelectedItem() + "");
            valores.add(o3.getSelectedItem() + "");
            valores.add(o4.getSelectedItem() + "");
            valores.add(o5.getSelectedItem() + "");
            valores.add(o6.getSelectedItem() + "");
            valores.add(o7.getSelectedItem() + "");
            valores.add(o8.getSelectedItem() + "");
            valores.add(o9.getSelectedItem() + "");
            valores.add(o10.getSelectedItem() + "");
            valores.add(o11.getSelectedItem() + "");
            valores.add(o12.getSelectedItem() + "");
            valores.add(o13.getSelectedItem() + "");
            valores.add(o14.getSelectedItem() + "");
            valores.add(o15.getSelectedItem() + "");
            valores.add(o16.getSelectedItem() + "");
            valores.add(o17.getSelectedItem() + "");

            //IMPORTANCIA DE LOS PARAMETROS  
            resultado_seleccionado.add(ck8.isSelected());
            resultado_seleccionado.add(ck9.isSelected());
            resultado_seleccionado.add(ck10.isSelected());
            resultado_seleccionado.add(ck11.isSelected());
            resultado_seleccionado.add(ck12.isSelected());
            resultado_seleccionado.add(ck13.isSelected());
            resultado_seleccionado.add(ck14.isSelected());
            resultado_seleccionado.add(ck15.isSelected());
            resultado_seleccionado.add(ck16.isSelected());
            resultado_seleccionado.add(ck17.isSelected());
            resultado_seleccionado.add(ck18.isSelected());
            resultado_seleccionado.add(ck19.isSelected());
            resultado_seleccionado.add(ck20.isSelected());
            resultado_seleccionado.add(ck21.isSelected());
            resultado_seleccionado.add(ck22.isSelected());
            resultado_seleccionado.add(ck23.isSelected());
            resultado_seleccionado.add(ck24.isSelected());
            int aux = op.Modificar(li.get(listado_diagnosticos.getSelectedIndex()).getIdDiagnostico(), nombre.getText().toUpperCase() + "", descripcion.getText(), valores, resultado_seleccionado);

            if (aux > 0) {
                iniciar();
            }

        }
    }//GEN-LAST:event_modificarActionPerformed

    private void borrarMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_borrarMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_borrarMouseReleased

    private void borrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borrarActionPerformed
        if (listado_diagnosticos.getSelectedItem().equals("--DIAGNOSTICOS EXISTENTES--")) {
            JOptionPane.showMessageDialog(null, "¡Debe seleccionar un diagnostico! \n        Intente Nuevamente...", "¡ERROR!", JOptionPane.ERROR_MESSAGE);

        } else if (nombre.getText().equals("") || descripcion.getText().equals("") || nombre.getText().equals("Nombre del Diagnostico:")) {
            JOptionPane.showMessageDialog(null, "¡Campos en blanco o por defecto! \n        Intente Nuevamente...", "¡ERROR!", JOptionPane.ERROR_MESSAGE);

        } else {
            new operar_diagnosticos().Borrar(li.get(listado_diagnosticos.getSelectedIndex()).getIdDiagnostico());
            iniciar();
        }

    }//GEN-LAST:event_borrarActionPerformed

    private void nombreFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nombreFocusGained
        nombre.setText("");
    }//GEN-LAST:event_nombreFocusGained

    private void nombreFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nombreFocusLost
        if (nombre.getText().equals("")) {
            nombre.setText("Nombre del Diagnostico:");
        }
    }//GEN-LAST:event_nombreFocusLost

    private void nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreActionPerformed

    private void b_siguienteOrinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_siguienteOrinaActionPerformed
        sangre.setVisible(false);
        orina.setVisible(false);
        general.setVisible(true);
    }//GEN-LAST:event_b_siguienteOrinaActionPerformed

    private void b_siguienteOrinaMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b_siguienteOrinaMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_b_siguienteOrinaMouseReleased

    private void b_siguienteOrinaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b_siguienteOrinaMousePressed

    }//GEN-LAST:event_b_siguienteOrinaMousePressed

    private void b_volver_sangreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_volver_sangreActionPerformed
        sangre.setVisible(false);
        orina.setVisible(false);
        general.setVisible(true);
    }//GEN-LAST:event_b_volver_sangreActionPerformed

    private void listado_diagnosticosItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_listado_diagnosticosItemStateChanged

        if (evt.getStateChange() == ItemEvent.SELECTED) {

            if (listado_diagnosticos.getSelectedIndex() != 0 && listado_diagnosticos.getSelectedIndex() != -1) {

                nombre.setText(li.get(listado_diagnosticos.getSelectedIndex()).getD_nombre());
                descripcion.setText(li.get(listado_diagnosticos.getSelectedIndex()).getD_descripcion());
                ArrayList aux = li.get(listado_diagnosticos.getSelectedIndex()).getD_seleccionados();

                ck1.setSelected(string_a_boolean(aux.get(0).toString()));
                ck2.setSelected(string_a_boolean(aux.get(1).toString()));
                ck3.setSelected(string_a_boolean(aux.get(2).toString()));
                ck4.setSelected(string_a_boolean(aux.get(3).toString()));
                ck5.setSelected(string_a_boolean(aux.get(4).toString()));
                ck6.setSelected(string_a_boolean(aux.get(5).toString()));
                ck7.setSelected(string_a_boolean(aux.get(6).toString()));
                ck8.setSelected(string_a_boolean(aux.get(7).toString()));
                ck9.setSelected(string_a_boolean(aux.get(8).toString()));
                ck10.setSelected(string_a_boolean(aux.get(9).toString()));
                ck11.setSelected(string_a_boolean(aux.get(10).toString()));
                ck12.setSelected(string_a_boolean(aux.get(11).toString()));
                ck13.setSelected(string_a_boolean(aux.get(12).toString()));
                ck14.setSelected(string_a_boolean(aux.get(13).toString()));
                ck15.setSelected(string_a_boolean(aux.get(14).toString()));
                ck16.setSelected(string_a_boolean(aux.get(15).toString()));
                ck17.setSelected(string_a_boolean(aux.get(16).toString()));
                ck18.setSelected(string_a_boolean(aux.get(17).toString()));
                ck19.setSelected(string_a_boolean(aux.get(18).toString()));
                ck20.setSelected(string_a_boolean(aux.get(19).toString()));
                ck21.setSelected(string_a_boolean(aux.get(20).toString()));
                ck22.setSelected(string_a_boolean(aux.get(21).toString()));
                ck23.setSelected(string_a_boolean(aux.get(22).toString()));
                ck24.setSelected(string_a_boolean(aux.get(23).toString()));

                aux = null;
                aux = li.get(listado_diagnosticos.getSelectedIndex()).getD_valores();

                cb1.setSelectedItem(aux.get(0).toString());
                cb2.setSelectedItem(aux.get(1).toString());
                cb3.setSelectedItem(aux.get(2).toString());
                cb4.setSelectedItem(aux.get(3).toString());
                cb5.setSelectedItem(aux.get(4).toString());
                cb6.setSelectedItem(aux.get(5).toString());
                cb7.setSelectedItem(aux.get(6).toString());
                o1.setSelectedItem(aux.get(7).toString());
                o2.setSelectedItem(aux.get(8).toString());
                o3.setSelectedItem(aux.get(9).toString());
                o4.setSelectedItem(aux.get(10).toString());
                o5.setSelectedItem(aux.get(11).toString());
                o6.setSelectedItem(aux.get(12).toString());
                o7.setSelectedItem(aux.get(13).toString());
                o8.setSelectedItem(aux.get(14).toString());
                o9.setSelectedItem(aux.get(15).toString());
                o10.setSelectedItem(aux.get(16).toString());
                o11.setSelectedItem(aux.get(17).toString());
                o12.setSelectedItem(aux.get(18).toString());
                o13.setSelectedItem(aux.get(19).toString());
                o14.setSelectedItem(aux.get(20).toString());
                o15.setSelectedItem(aux.get(21).toString());
                o16.setSelectedItem(aux.get(22).toString());
                o17.setSelectedItem(aux.get(23).toString());
            }
        }

    }//GEN-LAST:event_listado_diagnosticosItemStateChanged

    public void iniciar() {
        limpiarGeneral();
        limpiarOrina();
        limpiarSangre();
        listado_diagnosticos();
        sangre.setVisible(false);
        orina.setVisible(false);
        general.setVisible(true);
    }

    public void limpiarGeneral() {
        listado_diagnosticos.setSelectedIndex(0);
        nombre.setText("Nombre del Diagnostico:");
        descripcion.setText("");
    }

    public void limpiarSangre() {
        cb1.setSelectedIndex(0);
        cb2.setSelectedIndex(0);
        cb3.setSelectedIndex(0);
        cb4.setSelectedIndex(0);
        cb5.setSelectedIndex(0);
        cb6.setSelectedIndex(0);
        cb7.setSelectedIndex(0);
        ck1.setSelected(false);
        ck2.setSelected(false);
        ck3.setSelected(false);
        ck4.setSelected(false);
        ck5.setSelected(false);
        ck6.setSelected(false);
        ck7.setSelected(false);
    }

    public void limpiarOrina() {
        ck8.setSelected(false);
        ck9.setSelected(false);
        ck10.setSelected(false);
        ck11.setSelected(false);
        ck12.setSelected(false);
        ck13.setSelected(false);
        ck14.setSelected(false);
        ck15.setSelected(false);
        ck16.setSelected(false);
        ck17.setSelected(false);
        ck18.setSelected(false);
        ck19.setSelected(false);
        ck20.setSelected(false);
        ck21.setSelected(false);
        ck22.setSelected(false);
        ck23.setSelected(false);
        ck24.setSelected(false);
        o1.setSelectedIndex(0);
        o2.setSelectedIndex(0);
        o3.setSelectedIndex(0);
        o4.setSelectedIndex(0);
        o5.setSelectedIndex(0);
        o6.setSelectedIndex(0);
        o7.setSelectedIndex(0);
        o8.setSelectedIndex(0);
        o9.setSelectedIndex(0);
        o10.setSelectedIndex(0);
        o11.setSelectedIndex(0);
        o12.setSelectedIndex(0);
        o13.setSelectedIndex(0);
        o14.setSelectedIndex(0);
        o15.setSelectedIndex(0);
        o16.setSelectedIndex(0);
        o17.setSelectedIndex(0);
    }

    public void listado_diagnosticos() {

        li = new operar_diagnosticos().diagnosticosExistentes();

        listado_diagnosticos.removeAllItems();

        if (li != null) {

            for (int i = 0; i < li.size(); i++) {
                listado_diagnosticos.addItem(li.get(i).getD_nombre());
            }
        }
    }

    ArrayList<modelo> li;

    public boolean string_a_boolean(String s) {

        if (s.equals("0")) {
            return false;
        } else {
            return true;
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b_limpiarOrina;
    private javax.swing.JButton b_limpiarSangre;
    private javax.swing.JButton b_siguienteOrina;
    private javax.swing.JButton b_siguienteSangre;
    private javax.swing.JButton b_siguiente_general;
    private javax.swing.JButton b_volver_orina;
    private javax.swing.JButton b_volver_sangre;
    private javax.swing.JButton borrar;
    private javax.swing.JComboBox<String> cb1;
    private javax.swing.JComboBox<String> cb2;
    private javax.swing.JComboBox<String> cb3;
    private javax.swing.JComboBox<String> cb4;
    private javax.swing.JComboBox<String> cb5;
    private javax.swing.JComboBox<String> cb6;
    private javax.swing.JComboBox<String> cb7;
    private javax.swing.JCheckBox ck1;
    private javax.swing.JCheckBox ck10;
    private javax.swing.JCheckBox ck11;
    private javax.swing.JCheckBox ck12;
    private javax.swing.JCheckBox ck13;
    private javax.swing.JCheckBox ck14;
    private javax.swing.JCheckBox ck15;
    private javax.swing.JCheckBox ck16;
    private javax.swing.JCheckBox ck17;
    private javax.swing.JCheckBox ck18;
    private javax.swing.JCheckBox ck19;
    private javax.swing.JCheckBox ck2;
    private javax.swing.JCheckBox ck20;
    private javax.swing.JCheckBox ck21;
    private javax.swing.JCheckBox ck22;
    private javax.swing.JCheckBox ck23;
    private javax.swing.JCheckBox ck24;
    private javax.swing.JCheckBox ck3;
    private javax.swing.JCheckBox ck4;
    private javax.swing.JCheckBox ck5;
    private javax.swing.JCheckBox ck6;
    private javax.swing.JCheckBox ck7;
    private javax.swing.JCheckBox ck8;
    private javax.swing.JCheckBox ck9;
    private javax.swing.JButton crear;
    private javax.swing.JTextArea descripcion;
    private javax.swing.JPanel general;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator14;
    private javax.swing.JSeparator jSeparator15;
    private javax.swing.JSeparator jSeparator16;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JLabel jlabel17;
    private javax.swing.JButton limpiar_general;
    private javax.swing.JComboBox<String> listado_diagnosticos;
    private javax.swing.JButton modificar;
    private javax.swing.JTextField nombre;
    private javax.swing.JComboBox<String> o1;
    private javax.swing.JComboBox<String> o10;
    private javax.swing.JComboBox<String> o11;
    private javax.swing.JComboBox<String> o12;
    private javax.swing.JComboBox<String> o13;
    private javax.swing.JComboBox<String> o14;
    private javax.swing.JComboBox<String> o15;
    private javax.swing.JComboBox<String> o16;
    private javax.swing.JComboBox<String> o17;
    private javax.swing.JComboBox<String> o2;
    private javax.swing.JComboBox<String> o3;
    private javax.swing.JComboBox<String> o4;
    private javax.swing.JComboBox<String> o5;
    private javax.swing.JComboBox<String> o6;
    private javax.swing.JComboBox<String> o7;
    private javax.swing.JComboBox<String> o8;
    private javax.swing.JComboBox<String> o9;
    private javax.swing.JPanel orina;
    private javax.swing.JPanel sangre;
    // End of variables declaration//GEN-END:variables
}
