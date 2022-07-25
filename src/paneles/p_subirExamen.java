package paneles;

import java.awt.Color;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.border.LineBorder;
import javax.swing.filechooser.FileNameExtensionFilter;
import vistas.principal_paciente;

public class p_subirExamen extends javax.swing.JPanel {

    public p_subirExamen(principal_paciente p) {
        initComponents();
        this.p = p;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        base = new javax.swing.JPanel();
        orina = new javax.swing.JPanel();
        jSeparator14 = new javax.swing.JSeparator();
        jLabel24 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        b_siguienteOrina = new javax.swing.JButton();
        b_limpiarOrina = new javax.swing.JButton();
        jLabel44 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        aspecto = new javax.swing.JComboBox<>();
        jLabel47 = new javax.swing.JLabel();
        color = new javax.swing.JComboBox<>();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        reaccion = new javax.swing.JComboBox<>();
        densidad = new javax.swing.JTextField();
        jSeparator22 = new javax.swing.JSeparator();
        jLabel45 = new javax.swing.JLabel();
        jSeparator15 = new javax.swing.JSeparator();
        jLabel50 = new javax.swing.JLabel();
        proteinas = new javax.swing.JComboBox<>();
        jLabel51 = new javax.swing.JLabel();
        glucosa = new javax.swing.JComboBox<>();
        jLabel52 = new javax.swing.JLabel();
        hemoglobina_orina = new javax.swing.JComboBox<>();
        jLabel53 = new javax.swing.JLabel();
        ccetonico = new javax.swing.JComboBox<>();
        jLabel54 = new javax.swing.JLabel();
        biliares = new javax.swing.JComboBox<>();
        urobilinogen = new javax.swing.JComboBox<>();
        jLabel55 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        bilirrubina = new javax.swing.JComboBox<>();
        jLabel57 = new javax.swing.JLabel();
        nitritos = new javax.swing.JComboBox<>();
        jLabel58 = new javax.swing.JLabel();
        jSeparator16 = new javax.swing.JSeparator();
        jLabel59 = new javax.swing.JLabel();
        leucocitosorina = new javax.swing.JTextField();
        jSeparator23 = new javax.swing.JSeparator();
        hematies = new javax.swing.JTextField();
        jSeparator24 = new javax.swing.JSeparator();
        jLabel61 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        piocitos = new javax.swing.JComboBox<>();
        jLabel63 = new javax.swing.JLabel();
        bacterias = new javax.swing.JComboBox<>();
        jLabel64 = new javax.swing.JLabel();
        eplano = new javax.swing.JTextField();
        jSeparator25 = new javax.swing.JSeparator();
        jLabel26 = new javax.swing.JLabel();
        b_volver_orina = new javax.swing.JButton();
        documento = new javax.swing.JPanel();
        jLabel60 = new javax.swing.JLabel();
        b_registrar_documento = new javax.swing.JButton();
        b_limpiar_documento = new javax.swing.JButton();
        b_volver_documento = new javax.swing.JButton();
        b_adjuntar_documento = new javax.swing.JButton();
        jLabel23 = new javax.swing.JLabel();
        filename = new javax.swing.JTextField();
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
        b_volver_sangre = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(680, 540));
        setMinimumSize(new java.awt.Dimension(680, 540));
        setName("Panel Examenes"); // NOI18N
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        base.setOpaque(false);
        base.setLayout(new java.awt.CardLayout());

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
        orina.add(b_siguienteOrina, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 500, 100, 30));

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
        orina.add(b_limpiarOrina, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 500, 100, 30));

        jLabel44.setFont(new java.awt.Font("Arial", 3, 15)); // NOI18N
        jLabel44.setForeground(new java.awt.Color(102, 102, 102));
        jLabel44.setText("CARACTERÍSTICAS FÍSICAS:");
        orina.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 210, 20));

        jLabel46.setFont(new java.awt.Font("Arial", 3, 15)); // NOI18N
        jLabel46.setForeground(new java.awt.Color(102, 102, 102));
        jLabel46.setText("Leucocitos: ");
        orina.add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, -1, 20));

        aspecto.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        aspecto.setForeground(new java.awt.Color(102, 102, 102));
        aspecto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "TRANSPARENTE", "LIGERAMENTE TURBIO", "TURBIO" }));
        aspecto.setSelectedItem("LIGERAMENTE TURBIO");
        aspecto.setBorder(null);
        aspecto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        aspecto.setFocusable(false);
        aspecto.setName("Desplegable"); // NOI18N
        orina.add(aspecto, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, 200, 20));

        jLabel47.setFont(new java.awt.Font("Arial", 3, 15)); // NOI18N
        jLabel47.setForeground(new java.awt.Color(102, 102, 102));
        jLabel47.setText("Color:");
        orina.add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, 20));

        color.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        color.setForeground(new java.awt.Color(102, 102, 102));
        color.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AMARILLA", "ROJIZA", "INCOLORA", "MARRÓN", "AZUL VERDOSA", "OTRO" }));
        color.setSelectedItem("AMARILLA");
        color.setBorder(null);
        color.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        color.setFocusable(false);
        color.setName("Desplegable"); // NOI18N
        orina.add(color, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, 200, 20));

        jLabel48.setFont(new java.awt.Font("Arial", 3, 15)); // NOI18N
        jLabel48.setForeground(new java.awt.Color(102, 102, 102));
        jLabel48.setText("Densidad:");
        orina.add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, -1, 20));

        jLabel49.setFont(new java.awt.Font("Arial", 3, 15)); // NOI18N
        jLabel49.setForeground(new java.awt.Color(102, 102, 102));
        jLabel49.setText("Reacción:");
        orina.add(jLabel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, -1, 20));

        reaccion.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        reaccion.setForeground(new java.awt.Color(102, 102, 102));
        reaccion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ÁCIDA", "ALCALINA", "NEUTRA" }));
        reaccion.setSelectedItem("ÁCIDA");
        reaccion.setBorder(null);
        reaccion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        reaccion.setFocusable(false);
        reaccion.setName("Desplegable"); // NOI18N
        orina.add(reaccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 170, 200, 20));

        densidad.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        densidad.setForeground(new java.awt.Color(102, 102, 102));
        densidad.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        densidad.setBorder(null);
        densidad.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        orina.add(densidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 200, 200, 20));

        jSeparator22.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator22.setForeground(new java.awt.Color(0, 0, 0));
        orina.add(jSeparator22, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 220, 200, 10));

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

        proteinas.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        proteinas.setForeground(new java.awt.Color(102, 102, 102));
        proteinas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "NEGATIVO", "POSITIVO" }));
        proteinas.setSelectedItem("LIGERAMENTE TURBIO");
        proteinas.setBorder(null);
        proteinas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        proteinas.setFocusable(false);
        proteinas.setName("Desplegable"); // NOI18N
        orina.add(proteinas, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 110, 200, 20));

        jLabel51.setFont(new java.awt.Font("Arial", 3, 15)); // NOI18N
        jLabel51.setForeground(new java.awt.Color(102, 102, 102));
        jLabel51.setText("Glucosa:");
        orina.add(jLabel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 150, -1, 20));

        glucosa.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        glucosa.setForeground(new java.awt.Color(102, 102, 102));
        glucosa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "NEGATIVO", "POSITIVO" }));
        glucosa.setSelectedItem("LIGERAMENTE TURBIO");
        glucosa.setBorder(null);
        glucosa.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        glucosa.setFocusable(false);
        glucosa.setName("Desplegable"); // NOI18N
        orina.add(glucosa, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 150, 200, 20));

        jLabel52.setFont(new java.awt.Font("Arial", 3, 15)); // NOI18N
        jLabel52.setForeground(new java.awt.Color(102, 102, 102));
        jLabel52.setText("Hemoglobina:");
        orina.add(jLabel52, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 190, -1, 20));

        hemoglobina_orina.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        hemoglobina_orina.setForeground(new java.awt.Color(102, 102, 102));
        hemoglobina_orina.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "NEGATIVO", "POSITIVO" }));
        hemoglobina_orina.setSelectedItem("LIGERAMENTE TURBIO");
        hemoglobina_orina.setBorder(null);
        hemoglobina_orina.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        hemoglobina_orina.setFocusable(false);
        hemoglobina_orina.setName("Desplegable"); // NOI18N
        orina.add(hemoglobina_orina, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 190, 180, 20));

        jLabel53.setFont(new java.awt.Font("Arial", 3, 15)); // NOI18N
        jLabel53.setForeground(new java.awt.Color(102, 102, 102));
        jLabel53.setText("C. Cetonico:");
        orina.add(jLabel53, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 230, -1, 20));

        ccetonico.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        ccetonico.setForeground(new java.awt.Color(102, 102, 102));
        ccetonico.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "NEGATIVO", "POSITIVO" }));
        ccetonico.setSelectedItem("LIGERAMENTE TURBIO");
        ccetonico.setBorder(null);
        ccetonico.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ccetonico.setFocusable(false);
        ccetonico.setName("Desplegable"); // NOI18N
        orina.add(ccetonico, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 230, 190, 20));

        jLabel54.setFont(new java.awt.Font("Arial", 3, 15)); // NOI18N
        jLabel54.setForeground(new java.awt.Color(102, 102, 102));
        jLabel54.setText("P. Biliares:");
        orina.add(jLabel54, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 270, -1, 20));

        biliares.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        biliares.setForeground(new java.awt.Color(102, 102, 102));
        biliares.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "NEGATIVO", "POSITIVO" }));
        biliares.setSelectedItem("LIGERAMENTE TURBIO");
        biliares.setBorder(null);
        biliares.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        biliares.setFocusable(false);
        biliares.setName("Desplegable"); // NOI18N
        orina.add(biliares, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 270, 200, 20));

        urobilinogen.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        urobilinogen.setForeground(new java.awt.Color(102, 102, 102));
        urobilinogen.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "NEGATIVO", "POSITIVO" }));
        urobilinogen.setSelectedItem("LIGERAMENTE TURBIO");
        urobilinogen.setBorder(null);
        urobilinogen.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        urobilinogen.setFocusable(false);
        urobilinogen.setName("Desplegable"); // NOI18N
        orina.add(urobilinogen, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 310, 180, 20));

        jLabel55.setFont(new java.awt.Font("Arial", 3, 15)); // NOI18N
        jLabel55.setForeground(new java.awt.Color(102, 102, 102));
        jLabel55.setText("Urobilinogen:");
        orina.add(jLabel55, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 310, -1, 20));

        jLabel56.setFont(new java.awt.Font("Arial", 3, 15)); // NOI18N
        jLabel56.setForeground(new java.awt.Color(102, 102, 102));
        jLabel56.setText("Bilirrubina:");
        orina.add(jLabel56, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 350, -1, 20));

        bilirrubina.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        bilirrubina.setForeground(new java.awt.Color(102, 102, 102));
        bilirrubina.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "NEGATIVO", "POSITIVO" }));
        bilirrubina.setSelectedItem("LIGERAMENTE TURBIO");
        bilirrubina.setBorder(null);
        bilirrubina.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bilirrubina.setFocusable(false);
        bilirrubina.setName("Desplegable"); // NOI18N
        orina.add(bilirrubina, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 350, 200, 20));

        jLabel57.setFont(new java.awt.Font("Arial", 3, 15)); // NOI18N
        jLabel57.setForeground(new java.awt.Color(102, 102, 102));
        jLabel57.setText("Nitritos:");
        orina.add(jLabel57, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 390, -1, 20));

        nitritos.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        nitritos.setForeground(new java.awt.Color(102, 102, 102));
        nitritos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "NEGATIVO", "POSITIVO" }));
        nitritos.setSelectedItem("LIGERAMENTE TURBIO");
        nitritos.setBorder(null);
        nitritos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        nitritos.setFocusable(false);
        nitritos.setName("Desplegable"); // NOI18N
        orina.add(nitritos, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 390, 200, 20));

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

        leucocitosorina.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        leucocitosorina.setForeground(new java.awt.Color(102, 102, 102));
        leucocitosorina.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        leucocitosorina.setBorder(null);
        leucocitosorina.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        orina.add(leucocitosorina, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 290, 140, 20));

        jSeparator23.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator23.setForeground(new java.awt.Color(0, 0, 0));
        orina.add(jSeparator23, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 310, 140, 10));

        hematies.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        hematies.setForeground(new java.awt.Color(102, 102, 102));
        hematies.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        hematies.setBorder(null);
        hematies.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        orina.add(hematies, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 320, 140, 20));

        jSeparator24.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator24.setForeground(new java.awt.Color(0, 0, 0));
        orina.add(jSeparator24, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 340, 140, 10));

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

        piocitos.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        piocitos.setForeground(new java.awt.Color(102, 102, 102));
        piocitos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "NEGATIVO", "POSITIVO" }));
        piocitos.setSelectedItem("LIGERAMENTE TURBIO");
        piocitos.setBorder(null);
        piocitos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        piocitos.setFocusable(false);
        piocitos.setName("Desplegable"); // NOI18N
        orina.add(piocitos, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 350, 190, 20));

        jLabel63.setFont(new java.awt.Font("Arial", 3, 15)); // NOI18N
        jLabel63.setForeground(new java.awt.Color(102, 102, 102));
        jLabel63.setText("Bacterias:");
        orina.add(jLabel63, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, -1, 20));

        bacterias.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        bacterias.setForeground(new java.awt.Color(102, 102, 102));
        bacterias.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ESCASAS", "MODERADAS", "ABUNDANTES" }));
        bacterias.setSelectedItem("ESCASAS");
        bacterias.setBorder(null);
        bacterias.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bacterias.setFocusable(false);
        bacterias.setName("Desplegable"); // NOI18N
        orina.add(bacterias, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 380, 190, 20));

        jLabel64.setFont(new java.awt.Font("Arial", 3, 15)); // NOI18N
        jLabel64.setForeground(new java.awt.Color(102, 102, 102));
        jLabel64.setText("E. Plano:");
        orina.add(jLabel64, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 410, -1, 20));

        eplano.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        eplano.setForeground(new java.awt.Color(102, 102, 102));
        eplano.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        eplano.setBorder(null);
        eplano.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        orina.add(eplano, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 410, 140, 20));

        jSeparator25.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator25.setForeground(new java.awt.Color(0, 0, 0));
        orina.add(jSeparator25, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 430, 140, 10));

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

        base.add(orina, "card2");

        documento.setOpaque(false);
        documento.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel60.setFont(new java.awt.Font("Arial", 3, 24)); // NOI18N
        jLabel60.setForeground(new java.awt.Color(102, 102, 102));
        jLabel60.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel60.setText("EXÁMENES DIGITALIZADOS");
        documento.add(jLabel60, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 20, 330, -1));

        b_registrar_documento.setBackground(new java.awt.Color(103, 174, 202));
        b_registrar_documento.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        b_registrar_documento.setForeground(new java.awt.Color(255, 255, 255));
        b_registrar_documento.setText("Registrar");
        b_registrar_documento.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(103, 174, 202), 2));
        b_registrar_documento.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b_registrar_documento.setFocusPainted(false);
        b_registrar_documento.setRolloverEnabled(false);
        b_registrar_documento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_registrar_documentoActionPerformed(evt);
            }
        });
        documento.add(b_registrar_documento, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 500, 100, 30));

        b_limpiar_documento.setBackground(new java.awt.Color(103, 174, 202));
        b_limpiar_documento.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        b_limpiar_documento.setForeground(new java.awt.Color(255, 255, 255));
        b_limpiar_documento.setText("Limpiar");
        b_limpiar_documento.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(103, 174, 202), 2));
        b_limpiar_documento.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b_limpiar_documento.setFocusPainted(false);
        b_limpiar_documento.setRolloverEnabled(false);
        b_limpiar_documento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_limpiar_documentoActionPerformed(evt);
            }
        });
        documento.add(b_limpiar_documento, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 500, 100, 30));

        b_volver_documento.setBackground(new java.awt.Color(103, 174, 202));
        b_volver_documento.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        b_volver_documento.setForeground(new java.awt.Color(255, 255, 255));
        b_volver_documento.setText("Volver");
        b_volver_documento.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(103, 174, 202), 2));
        b_volver_documento.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b_volver_documento.setFocusPainted(false);
        b_volver_documento.setRolloverEnabled(false);
        b_volver_documento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_volver_documentoActionPerformed(evt);
            }
        });
        documento.add(b_volver_documento, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 500, 100, 30));

        b_adjuntar_documento.setBackground(new java.awt.Color(103, 174, 202));
        b_adjuntar_documento.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        b_adjuntar_documento.setForeground(new java.awt.Color(255, 255, 255));
        b_adjuntar_documento.setText("Adjuntar");
        b_adjuntar_documento.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(103, 174, 202), 2));
        b_adjuntar_documento.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b_adjuntar_documento.setFocusPainted(false);
        b_adjuntar_documento.setRolloverEnabled(false);
        b_adjuntar_documento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_adjuntar_documentoActionPerformed(evt);
            }
        });
        documento.add(b_adjuntar_documento, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 120, 100, 30));

        jLabel23.setText("NOTA IMPORTANTE: Adjunte el exámen en formato PDF, PNG o JPG (Max. 16MB)");
        documento.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 580, -1));

        filename.setEditable(false);
        documento.add(filename, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 500, 30));

        base.add(documento, "card2");

        sangre.setOpaque(false);
        sangre.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial", 3, 15)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setText("LINFOCITOS:");
        sangre.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(195, 450, 100, -1));

        jSeparator7.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator7.setForeground(new java.awt.Color(0, 0, 0));
        sangre.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 100, 130, 10));

        globulos_rojos.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        globulos_rojos.setForeground(new java.awt.Color(102, 102, 102));
        globulos_rojos.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        globulos_rojos.setBorder(null);
        globulos_rojos.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        sangre.add(globulos_rojos, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 80, 130, 20));

        jLabel2.setFont(new java.awt.Font("Arial", 3, 15)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("VN: 3,90 - 5,40");
        sangre.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 80, -1, -1));

        jLabel3.setFont(new java.awt.Font("Arial", 3, 15)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("VN: 12,0 - 16,0");
        sangre.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 140, -1, -1));

        hemoglobina.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        hemoglobina.setForeground(new java.awt.Color(102, 102, 102));
        hemoglobina.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        hemoglobina.setBorder(null);
        hemoglobina.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        sangre.add(hemoglobina, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 140, 130, 20));

        jSeparator8.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator8.setForeground(new java.awt.Color(0, 0, 0));
        sangre.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 160, 130, 10));

        jLabel4.setFont(new java.awt.Font("Arial", 3, 15)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setText("g/dL");
        sangre.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 140, -1, -1));

        jLabel5.setFont(new java.awt.Font("Arial", 3, 15)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setText("%");
        sangre.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 200, -1, -1));

        jSeparator9.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator9.setForeground(new java.awt.Color(0, 0, 0));
        sangre.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 220, 130, 10));

        hematocritos.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        hematocritos.setForeground(new java.awt.Color(102, 102, 102));
        hematocritos.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        hematocritos.setBorder(null);
        hematocritos.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        sangre.add(hematocritos, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 200, 130, 20));

        jLabel6.setFont(new java.awt.Font("Arial", 3, 15)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 102, 102));
        jLabel6.setText("VN: 35,0 - 47,0");
        sangre.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 200, -1, -1));

        jLabel7.setFont(new java.awt.Font("Arial", 3, 15)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 102, 102));
        jLabel7.setText("VN: 140,0 - 500,0");
        sangre.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 260, -1, -1));

        plaquetas.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        plaquetas.setForeground(new java.awt.Color(102, 102, 102));
        plaquetas.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        plaquetas.setBorder(null);
        plaquetas.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        sangre.add(plaquetas, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 260, 130, 20));

        jSeparator10.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator10.setForeground(new java.awt.Color(0, 0, 0));
        sangre.add(jSeparator10, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 280, 130, 10));

        jLabel8.setFont(new java.awt.Font("Arial", 3, 15)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 102, 102));
        jLabel8.setText("10^3/uL");
        sangre.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 260, -1, -1));

        jLabel9.setFont(new java.awt.Font("Arial", 3, 15)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(102, 102, 102));
        jLabel9.setText("10^3/uL");
        sangre.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 320, -1, -1));

        jSeparator11.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator11.setForeground(new java.awt.Color(0, 0, 0));
        sangre.add(jSeparator11, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 340, 130, 10));

        leucocitos.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        leucocitos.setForeground(new java.awt.Color(102, 102, 102));
        leucocitos.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        leucocitos.setBorder(null);
        leucocitos.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        sangre.add(leucocitos, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 320, 130, 20));

        jLabel10.setFont(new java.awt.Font("Arial", 3, 15)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(102, 102, 102));
        jLabel10.setText("VN: 4,50 - 11,20");
        sangre.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 320, -1, -1));

        jLabel11.setFont(new java.awt.Font("Arial", 3, 15)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(102, 102, 102));
        jLabel11.setText("VN: 39,9 - 75,0");
        sangre.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 390, -1, -1));

        segmentados.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        segmentados.setForeground(new java.awt.Color(102, 102, 102));
        segmentados.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        segmentados.setBorder(null);
        segmentados.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        sangre.add(segmentados, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 390, 130, 20));

        jSeparator12.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator12.setForeground(new java.awt.Color(0, 0, 0));
        sangre.add(jSeparator12, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 410, 130, 10));

        jLabel12.setFont(new java.awt.Font("Arial", 3, 15)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(102, 102, 102));
        jLabel12.setText("%");
        sangre.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 390, -1, -1));

        jSeparator13.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator13.setForeground(new java.awt.Color(0, 0, 0));
        sangre.add(jSeparator13, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 470, 130, 10));

        jLabel13.setFont(new java.awt.Font("Arial", 3, 15)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(102, 102, 102));
        jLabel13.setText("%");
        sangre.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 450, -1, -1));

        jLabel14.setFont(new java.awt.Font("Arial", 3, 15)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(102, 102, 102));
        jLabel14.setText("VN: 18,8 - 50,8");
        sangre.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 450, -1, -1));

        linfocitos.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        linfocitos.setForeground(new java.awt.Color(102, 102, 102));
        linfocitos.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        linfocitos.setBorder(null);
        linfocitos.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        sangre.add(linfocitos, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 450, 130, 20));

        jLabel15.setFont(new java.awt.Font("Arial", 3, 15)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(102, 102, 102));
        jLabel15.setText("10^6/uL");
        sangre.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 80, -1, -1));

        jLabel16.setFont(new java.awt.Font("Arial", 3, 24)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(102, 102, 102));
        jLabel16.setText("EXÁMENES SANGUÍNEOS");
        sangre.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 20, -1, -1));

        jLabel17.setFont(new java.awt.Font("Arial", 3, 15)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(102, 102, 102));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel17.setText("HEMOGLOBINA O HB:");
        sangre.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 140, 170, -1));

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
        sangre.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, -1, -1));

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
        sangre.add(b_siguienteSangre, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 500, 100, 30));

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

        base.add(sangre, "card2");

        add(base, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 680, 540));

        getAccessibleContext().setAccessibleName("");
    }// </editor-fold>//GEN-END:initComponents

    private void b_siguienteSangreMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b_siguienteSangreMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_b_siguienteSangreMousePressed

    private void b_siguienteSangreMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b_siguienteSangreMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_b_siguienteSangreMouseReleased

    private void b_siguienteSangreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_siguienteSangreActionPerformed

        if (tipo == 3) {
            sangre.setVisible(false);
            orina.setVisible(true);
            documento.setVisible(false);
        } else {
            sangre.setVisible(false);
            orina.setVisible(false);
            documento.setVisible(true);
        }

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
        limpiar_sangre();
    }//GEN-LAST:event_b_limpiarSangreActionPerformed

    private void b_siguienteOrinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_siguienteOrinaActionPerformed
        sangre.setVisible(false);
        orina.setVisible(false);
        documento.setVisible(true);
    }//GEN-LAST:event_b_siguienteOrinaActionPerformed

    private void b_limpiarOrinaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b_limpiarOrinaMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_b_limpiarOrinaMousePressed

    private void b_limpiarOrinaMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b_limpiarOrinaMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_b_limpiarOrinaMouseReleased

    private void b_limpiarOrinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_limpiarOrinaActionPerformed
        limpiar_orina();
    }//GEN-LAST:event_b_limpiarOrinaActionPerformed

    private void b_registrar_documentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_registrar_documentoActionPerformed
        if (!filename.getText().equals("")) {
            try {
                byte[] pdf = new byte[(int) file.length()];
                InputStream input = new FileInputStream(file);
                input.read(pdf);
            } catch (IOException ex) {
                //System.out.println("Error al agregar archivo pdf "+ex.getMessage());
            }
        }
    }//GEN-LAST:event_b_registrar_documentoActionPerformed

    private void b_limpiar_documentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_limpiar_documentoActionPerformed
        limpiar_documento();
    }//GEN-LAST:event_b_limpiar_documentoActionPerformed

    private void b_siguienteOrinaMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b_siguienteOrinaMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_b_siguienteOrinaMouseReleased

    private void b_siguienteOrinaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b_siguienteOrinaMousePressed

    }//GEN-LAST:event_b_siguienteOrinaMousePressed

    private void b_volver_documentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_volver_documentoActionPerformed

        if (tipo == 1) {

            mostrarSangre();
        } else {
            mostrarOrina();
        }
    }//GEN-LAST:event_b_volver_documentoActionPerformed

    private void b_adjuntar_documentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_adjuntar_documentoActionPerformed
        fileChooser = new JFileChooser();
        fileChooser.setFileFilter(filter);

        int seleccion = fileChooser.showOpenDialog(this);

        if (seleccion == JFileChooser.APPROVE_OPTION) {
            if (fileChooser.getSelectedFile().length() < (16 * (1024 * 1024))) {
                file = fileChooser.getSelectedFile();
                filename.setText(file.getName());
            } else {

                JOptionPane.showMessageDialog(null, "¡Archivo superior a 16MB! \n        Intente Nuevamente...", "¡ERROR!", JOptionPane.ERROR_MESSAGE);
            }

        }
    }//GEN-LAST:event_b_adjuntar_documentoActionPerformed

    private void b_volver_sangreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_volver_sangreActionPerformed

        p.abrir_panel_examenes();

    }//GEN-LAST:event_b_volver_sangreActionPerformed

    private void b_volver_orinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_volver_orinaActionPerformed

        if (tipo == 2) {
            p.abrir_panel_examenes();
        } else {
            mostrarSangre();
        }
    }//GEN-LAST:event_b_volver_orinaActionPerformed

    //metodos y variables
    public void limpiar_sangre() {
        globulos_rojos.setText("");
        hemoglobina.setText("");
        hematocritos.setText("");
        plaquetas.setText("");
        leucocitos.setText("");
        segmentados.setText("");
        linfocitos.setText("");
    }

    public void limpiar_orina() {
        aspecto.setSelectedItem("LIGERAMENTE TURBIO");
        color.setSelectedItem("AMARILLA");
        reaccion.setSelectedItem("ÁCIDA");
        densidad.setText("");
        proteinas.setSelectedItem("NEGATIVO");
        glucosa.setSelectedItem("NEGATIVO");
        hemoglobina_orina.setSelectedItem("NEGATIVO");
        ccetonico.setSelectedItem("NEGATIVO");
        biliares.setSelectedItem("NEGATIVO");
        urobilinogen.setSelectedItem("NEGATIVO");
        bilirrubina.setSelectedItem("NEGATIVO");
        nitritos.setSelectedItem("NEGATIVO");
        leucocitosorina.setText("");
        hematies.setText("");
        eplano.setText("");
        piocitos.setSelectedItem("NEGATIVO");
        bacterias.setSelectedItem("ESCASAS");
    }

    private void limpiar_documento() {
        filename.setText("");
        fileChooser = null;
        file = null;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo; //1 sangre, 2 orina, 3 ambos
    }

    public void mostrarSangre() {
        sangre.setVisible(true);
        orina.setVisible(false);
        documento.setVisible(false);
    }

    public void mostrarOrina() {
        sangre.setVisible(false);
        orina.setVisible(true);
        documento.setVisible(false);
    }

    public void mostrarDocumento() {
        sangre.setVisible(false);
        orina.setVisible(false);
        documento.setVisible(true);
    }

    public void limpiar_campos() {
        limpiar_sangre();
        limpiar_orina();
        limpiar_documento();
    }

    private int tipo = 0;
    private principal_paciente p;
    private JFileChooser fileChooser;
    private File file;
    private FileNameExtensionFilter filter = new FileNameExtensionFilter("Archivos PDF, PNG y JPG", "pdf", "png", "jpg", "jpeg");
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> aspecto;
    private javax.swing.JButton b_adjuntar_documento;
    private javax.swing.JButton b_limpiarOrina;
    private javax.swing.JButton b_limpiarSangre;
    private javax.swing.JButton b_limpiar_documento;
    private javax.swing.JButton b_registrar_documento;
    private javax.swing.JButton b_siguienteOrina;
    private javax.swing.JButton b_siguienteSangre;
    private javax.swing.JButton b_volver_documento;
    private javax.swing.JButton b_volver_orina;
    private javax.swing.JButton b_volver_sangre;
    private javax.swing.JComboBox<String> bacterias;
    private javax.swing.JPanel base;
    private javax.swing.JComboBox<String> biliares;
    private javax.swing.JComboBox<String> bilirrubina;
    private javax.swing.JComboBox<String> ccetonico;
    private javax.swing.JComboBox<String> color;
    private javax.swing.JTextField densidad;
    private javax.swing.JPanel documento;
    private javax.swing.JTextField eplano;
    private javax.swing.JTextField filename;
    private javax.swing.JTextField globulos_rojos;
    private javax.swing.JComboBox<String> glucosa;
    private javax.swing.JTextField hematies;
    private javax.swing.JTextField hematocritos;
    private javax.swing.JTextField hemoglobina;
    private javax.swing.JComboBox<String> hemoglobina_orina;
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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
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
    private javax.swing.JSeparator jSeparator22;
    private javax.swing.JSeparator jSeparator23;
    private javax.swing.JSeparator jSeparator24;
    private javax.swing.JSeparator jSeparator25;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JTextField leucocitos;
    private javax.swing.JTextField leucocitosorina;
    private javax.swing.JTextField linfocitos;
    private javax.swing.JComboBox<String> nitritos;
    private javax.swing.JPanel orina;
    private javax.swing.JComboBox<String> piocitos;
    private javax.swing.JTextField plaquetas;
    private javax.swing.JComboBox<String> proteinas;
    private javax.swing.JComboBox<String> reaccion;
    private javax.swing.JPanel sangre;
    private javax.swing.JTextField segmentados;
    private javax.swing.JComboBox<String> urobilinogen;
    // End of variables declaration//GEN-END:variables
}
