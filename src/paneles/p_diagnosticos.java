package paneles;

import globales.mensajes;
import globales.validaciones;
import java.awt.Color;
import java.awt.Desktop;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.border.LineBorder;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import modelos.modelo;
import modelos.operar_diagnosticos;
import modelos.operar_examenes;
import modelos.operar_resultados;
import modelos.operar_usuarios;

public class p_diagnosticos extends javax.swing.JPanel {

    public p_diagnosticos(String usuario) {
        initComponents();
        actualizar_lista();
        this.idExperto = new operar_usuarios().BuscarID(usuario);
        principal.setVisible(true);
        orina.setVisible(false);
        sangre.setVisible(false);
        resultados.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        orina = new javax.swing.JPanel();
        jSeparator15 = new javax.swing.JSeparator();
        jLabel26 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        b_siguiente_orina = new javax.swing.JButton();
        b_volver_orina = new javax.swing.JButton();
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
        jSeparator16 = new javax.swing.JSeparator();
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
        jSeparator17 = new javax.swing.JSeparator();
        jLabel59 = new javax.swing.JLabel();
        leucocitosorina = new javax.swing.JTextField();
        jSeparator23 = new javax.swing.JSeparator();
        hematies = new javax.swing.JTextField();
        jSeparator24 = new javax.swing.JSeparator();
        jLabel61 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        piocitos = new javax.swing.JComboBox<>();
        jLabel63 = new javax.swing.JLabel();
        bacterias = new javax.swing.JComboBox<>();
        jLabel64 = new javax.swing.JLabel();
        eplano = new javax.swing.JTextField();
        jSeparator25 = new javax.swing.JSeparator();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        sangre = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator8 = new javax.swing.JSeparator();
        globulos_rojos = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        hemoglobina = new javax.swing.JTextField();
        jSeparator9 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jSeparator10 = new javax.swing.JSeparator();
        hematocritos = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        plaquetas = new javax.swing.JTextField();
        jSeparator11 = new javax.swing.JSeparator();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jSeparator12 = new javax.swing.JSeparator();
        leucocitos = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        segmentados = new javax.swing.JTextField();
        jSeparator13 = new javax.swing.JSeparator();
        jLabel15 = new javax.swing.JLabel();
        jSeparator14 = new javax.swing.JSeparator();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        linfocitos = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        b_volver_sangre = new javax.swing.JButton();
        b_siguienteSangre = new javax.swing.JButton();
        jLabel25 = new javax.swing.JLabel();
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
        b_visualizarExamen = new javax.swing.JButton();
        resultados = new javax.swing.JPanel();
        b_volver_resultados = new javax.swing.JButton();
        b_guardar = new javax.swing.JButton();
        b_limpiar_resultado = new javax.swing.JButton();
        jLabel30 = new javax.swing.JLabel();
        usuario3 = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        area_diagnostico_sugerido = new javax.swing.JTextArea();
        jSeparator20 = new javax.swing.JSeparator();
        b_adjuntar_documento = new javax.swing.JButton();
        filename = new javax.swing.JTextField();
        usuario4 = new javax.swing.JTextField();
        jSeparator21 = new javax.swing.JSeparator();
        usuario5 = new javax.swing.JTextField();
        jSeparator26 = new javax.swing.JSeparator();
        jScrollPane5 = new javax.swing.JScrollPane();
        area_diagnostico_final = new javax.swing.JTextArea();
        jLabel31 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(680, 540));
        setMinimumSize(new java.awt.Dimension(680, 540));
        setName("Panel Diagnósticos"); // NOI18N
        setLayout(new java.awt.CardLayout());

        orina.setFocusable(false);
        orina.setOpaque(false);
        orina.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSeparator15.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator15.setForeground(new java.awt.Color(0, 0, 0));
        orina.add(jSeparator15, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 280, 10));

        jLabel26.setFont(new java.awt.Font("Arial", 3, 15)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(102, 102, 102));
        jLabel26.setText("VN: 0-2");
        orina.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 290, -1, -1));

        jLabel38.setFont(new java.awt.Font("Arial", 3, 24)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(102, 102, 102));
        jLabel38.setText("EXÁMENES DE ORINA");
        orina.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 20, -1, -1));

        b_siguiente_orina.setBackground(new java.awt.Color(103, 174, 202));
        b_siguiente_orina.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        b_siguiente_orina.setForeground(new java.awt.Color(255, 255, 255));
        b_siguiente_orina.setText("Siguiente");
        b_siguiente_orina.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(103, 174, 202), 2));
        b_siguiente_orina.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b_siguiente_orina.setFocusPainted(false);
        b_siguiente_orina.setRolloverEnabled(false);
        b_siguiente_orina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_siguiente_orinaActionPerformed(evt);
            }
        });
        orina.add(b_siguiente_orina, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 500, 100, 30));

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
        orina.add(b_volver_orina, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 500, 100, 30));

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
        aspecto.setEnabled(false);
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
        color.setEnabled(false);
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
        reaccion.setEnabled(false);
        reaccion.setFocusable(false);
        reaccion.setName("Desplegable"); // NOI18N
        orina.add(reaccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 170, 200, 20));

        densidad.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        densidad.setForeground(new java.awt.Color(102, 102, 102));
        densidad.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        densidad.setBorder(null);
        densidad.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        densidad.setFocusable(false);
        orina.add(densidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 200, 100, 20));

        jSeparator22.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator22.setForeground(new java.awt.Color(0, 0, 0));
        orina.add(jSeparator22, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 220, 100, 10));

        jLabel45.setFont(new java.awt.Font("Arial", 3, 15)); // NOI18N
        jLabel45.setForeground(new java.awt.Color(102, 102, 102));
        jLabel45.setText("CARACTERÍSTICAS QUÍMICAS:");
        orina.add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 80, 250, 20));

        jSeparator16.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator16.setForeground(new java.awt.Color(0, 0, 0));
        orina.add(jSeparator16, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 100, 280, 10));

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
        proteinas.setEnabled(false);
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
        glucosa.setEnabled(false);
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
        hemoglobina_orina.setEnabled(false);
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
        ccetonico.setEnabled(false);
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
        biliares.setEnabled(false);
        biliares.setFocusable(false);
        biliares.setName("Desplegable"); // NOI18N
        orina.add(biliares, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 270, 200, 20));

        urobilinogen.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        urobilinogen.setForeground(new java.awt.Color(102, 102, 102));
        urobilinogen.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "NEGATIVO", "POSITIVO" }));
        urobilinogen.setSelectedItem("LIGERAMENTE TURBIO");
        urobilinogen.setBorder(null);
        urobilinogen.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        urobilinogen.setEnabled(false);
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
        bilirrubina.setEnabled(false);
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
        nitritos.setEnabled(false);
        nitritos.setFocusable(false);
        nitritos.setName("Desplegable"); // NOI18N
        orina.add(nitritos, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 390, 200, 20));

        jLabel58.setFont(new java.awt.Font("Arial", 3, 15)); // NOI18N
        jLabel58.setForeground(new java.awt.Color(102, 102, 102));
        jLabel58.setText("MICROSCOPIO:");
        orina.add(jLabel58, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 250, 20));

        jSeparator17.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator17.setForeground(new java.awt.Color(0, 0, 0));
        orina.add(jSeparator17, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 280, 10));

        jLabel59.setFont(new java.awt.Font("Arial", 3, 15)); // NOI18N
        jLabel59.setForeground(new java.awt.Color(102, 102, 102));
        jLabel59.setText("Aspecto:");
        orina.add(jLabel59, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, 20));

        leucocitosorina.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        leucocitosorina.setForeground(new java.awt.Color(102, 102, 102));
        leucocitosorina.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        leucocitosorina.setBorder(null);
        leucocitosorina.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        leucocitosorina.setFocusable(false);
        orina.add(leucocitosorina, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 290, 140, 20));

        jSeparator23.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator23.setForeground(new java.awt.Color(0, 0, 0));
        orina.add(jSeparator23, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 310, 140, 10));

        hematies.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        hematies.setForeground(new java.awt.Color(102, 102, 102));
        hematies.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        hematies.setBorder(null);
        hematies.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        hematies.setFocusable(false);
        orina.add(hematies, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 320, 140, 20));

        jSeparator24.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator24.setForeground(new java.awt.Color(0, 0, 0));
        orina.add(jSeparator24, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 340, 140, 10));

        jLabel61.setFont(new java.awt.Font("Arial", 3, 15)); // NOI18N
        jLabel61.setForeground(new java.awt.Color(102, 102, 102));
        jLabel61.setText("Hematies:");
        orina.add(jLabel61, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, -1, 20));

        jLabel27.setFont(new java.awt.Font("Arial", 3, 15)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(102, 102, 102));
        jLabel27.setText("VN: 0-1");
        orina.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 320, -1, -1));

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
        piocitos.setEnabled(false);
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
        bacterias.setEnabled(false);
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
        eplano.setFocusable(false);
        orina.add(eplano, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 410, 140, 20));

        jSeparator25.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator25.setForeground(new java.awt.Color(0, 0, 0));
        orina.add(jSeparator25, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 430, 140, 10));

        jLabel28.setFont(new java.awt.Font("Arial", 3, 15)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(102, 102, 102));
        jLabel28.setText("VN: 0-2");
        orina.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 410, -1, -1));

        jLabel29.setFont(new java.awt.Font("Arial", 3, 15)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(102, 102, 102));
        jLabel29.setText("VN: 1.005-1.030");
        orina.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 200, 120, -1));

        add(orina, "card2");

        sangre.setFocusable(false);
        sangre.setOpaque(false);
        sangre.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial", 3, 15)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setText("LINFOCITOS:");
        sangre.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(195, 450, 100, -1));

        jSeparator8.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator8.setForeground(new java.awt.Color(0, 0, 0));
        sangre.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 100, 130, 10));

        globulos_rojos.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        globulos_rojos.setForeground(new java.awt.Color(102, 102, 102));
        globulos_rojos.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        globulos_rojos.setBorder(null);
        globulos_rojos.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        globulos_rojos.setFocusable(false);
        sangre.add(globulos_rojos, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 80, 130, 20));

        jLabel2.setFont(new java.awt.Font("Arial", 3, 15)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("VN: 3,90 - 5,40");
        sangre.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 80, -1, -1));

        jLabel6.setFont(new java.awt.Font("Arial", 3, 15)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 102, 102));
        jLabel6.setText("VN: 12,0 - 16,0");
        sangre.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 140, -1, -1));

        hemoglobina.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        hemoglobina.setForeground(new java.awt.Color(102, 102, 102));
        hemoglobina.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        hemoglobina.setBorder(null);
        hemoglobina.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        hemoglobina.setFocusable(false);
        sangre.add(hemoglobina, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 140, 130, 20));

        jSeparator9.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator9.setForeground(new java.awt.Color(0, 0, 0));
        sangre.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 160, 130, 10));

        jLabel7.setFont(new java.awt.Font("Arial", 3, 15)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 102, 102));
        jLabel7.setText("g/dL");
        sangre.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 140, -1, -1));

        jLabel8.setFont(new java.awt.Font("Arial", 3, 15)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 102, 102));
        jLabel8.setText("%");
        sangre.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 200, -1, -1));

        jSeparator10.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator10.setForeground(new java.awt.Color(0, 0, 0));
        sangre.add(jSeparator10, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 220, 130, 10));

        hematocritos.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        hematocritos.setForeground(new java.awt.Color(102, 102, 102));
        hematocritos.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        hematocritos.setBorder(null);
        hematocritos.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        hematocritos.setFocusable(false);
        sangre.add(hematocritos, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 200, 130, 20));

        jLabel9.setFont(new java.awt.Font("Arial", 3, 15)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(102, 102, 102));
        jLabel9.setText("VN: 35,0 - 47,0");
        sangre.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 200, -1, -1));

        jLabel10.setFont(new java.awt.Font("Arial", 3, 15)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(102, 102, 102));
        jLabel10.setText("VN: 140,0 - 500,0");
        sangre.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 260, -1, -1));

        plaquetas.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        plaquetas.setForeground(new java.awt.Color(102, 102, 102));
        plaquetas.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        plaquetas.setBorder(null);
        plaquetas.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        plaquetas.setFocusable(false);
        sangre.add(plaquetas, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 260, 130, 20));

        jSeparator11.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator11.setForeground(new java.awt.Color(0, 0, 0));
        sangre.add(jSeparator11, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 280, 130, 10));

        jLabel11.setFont(new java.awt.Font("Arial", 3, 15)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(102, 102, 102));
        jLabel11.setText("10^3/uL");
        sangre.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 260, -1, -1));

        jLabel12.setFont(new java.awt.Font("Arial", 3, 15)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(102, 102, 102));
        jLabel12.setText("10^3/uL");
        sangre.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 320, -1, -1));

        jSeparator12.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator12.setForeground(new java.awt.Color(0, 0, 0));
        sangre.add(jSeparator12, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 340, 130, 10));

        leucocitos.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        leucocitos.setForeground(new java.awt.Color(102, 102, 102));
        leucocitos.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        leucocitos.setBorder(null);
        leucocitos.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        leucocitos.setFocusable(false);
        sangre.add(leucocitos, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 320, 130, 20));

        jLabel13.setFont(new java.awt.Font("Arial", 3, 15)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(102, 102, 102));
        jLabel13.setText("VN: 4,50 - 11,20");
        sangre.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 320, -1, -1));

        jLabel14.setFont(new java.awt.Font("Arial", 3, 15)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(102, 102, 102));
        jLabel14.setText("VN: 39,9 - 75,0");
        sangre.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 390, -1, -1));

        segmentados.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        segmentados.setForeground(new java.awt.Color(102, 102, 102));
        segmentados.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        segmentados.setBorder(null);
        segmentados.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        segmentados.setFocusable(false);
        sangre.add(segmentados, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 390, 130, 20));

        jSeparator13.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator13.setForeground(new java.awt.Color(0, 0, 0));
        sangre.add(jSeparator13, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 410, 130, 10));

        jLabel15.setFont(new java.awt.Font("Arial", 3, 15)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(102, 102, 102));
        jLabel15.setText("%");
        sangre.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 390, -1, -1));

        jSeparator14.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator14.setForeground(new java.awt.Color(0, 0, 0));
        sangre.add(jSeparator14, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 470, 130, 10));

        jLabel16.setFont(new java.awt.Font("Arial", 3, 15)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(102, 102, 102));
        jLabel16.setText("%");
        sangre.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 450, -1, -1));

        jLabel17.setFont(new java.awt.Font("Arial", 3, 15)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(102, 102, 102));
        jLabel17.setText("VN: 18,8 - 50,8");
        sangre.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 450, -1, -1));

        linfocitos.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        linfocitos.setForeground(new java.awt.Color(102, 102, 102));
        linfocitos.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        linfocitos.setBorder(null);
        linfocitos.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        linfocitos.setFocusable(false);
        sangre.add(linfocitos, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 450, 130, 20));

        jLabel18.setFont(new java.awt.Font("Arial", 3, 15)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(102, 102, 102));
        jLabel18.setText("10^6/uL");
        sangre.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 80, -1, -1));

        jLabel19.setFont(new java.awt.Font("Arial", 3, 24)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(102, 102, 102));
        jLabel19.setText("EXÁMENES SANGUÍNEOS");
        sangre.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 20, -1, -1));

        jLabel20.setFont(new java.awt.Font("Arial", 3, 15)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(102, 102, 102));
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel20.setText("HEMOGLOBINA O HB:");
        sangre.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 140, 170, -1));

        jLabel21.setFont(new java.awt.Font("Arial", 3, 15)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(102, 102, 102));
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel21.setText("HEMATOCRITOS O HTC:");
        sangre.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 200, 180, -1));

        jLabel22.setFont(new java.awt.Font("Arial", 3, 15)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(102, 102, 102));
        jLabel22.setText("PLAQUETAS:");
        sangre.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 260, 100, -1));

        jLabel23.setFont(new java.awt.Font("Arial", 3, 15)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(102, 102, 102));
        jLabel23.setText("LEUCOCITOS O GLÓBULOS BLANCOS:");
        sangre.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, -1, -1));

        jLabel24.setFont(new java.awt.Font("Arial", 3, 15)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(102, 102, 102));
        jLabel24.setText("SEGMENTADOS O NEUTROFILOS:");
        sangre.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 390, -1, -1));

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
        sangre.add(b_volver_sangre, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 500, 100, 30));

        b_siguienteSangre.setBackground(new java.awt.Color(103, 174, 202));
        b_siguienteSangre.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        b_siguienteSangre.setForeground(new java.awt.Color(255, 255, 255));
        b_siguienteSangre.setText("Siguiente");
        b_siguienteSangre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(103, 174, 202), 2));
        b_siguienteSangre.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b_siguienteSangre.setFocusPainted(false);
        b_siguienteSangre.setRolloverEnabled(false);
        b_siguienteSangre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_siguienteSangreActionPerformed(evt);
            }
        });
        sangre.add(b_siguienteSangre, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 500, 100, 30));

        jLabel25.setFont(new java.awt.Font("Arial", 3, 15)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(102, 102, 102));
        jLabel25.setText("HEMATIES O GLÓBULOS ROJOS: ");
        sangre.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, 250, -1));

        add(sangre, "card2");

        principal.setBackground(new java.awt.Color(255, 255, 255));
        principal.setFocusable(false);
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

        nombres.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        nombres.setForeground(new java.awt.Color(102, 102, 102));
        nombres.setText("Nombres:");
        nombres.setBorder(null);
        nombres.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        nombres.setFocusable(false);
        principal.add(nombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 260, 290, 30));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/apellido_m.png"))); // NOI18N
        principal.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 330, -1, -1));

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
        cedula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cedulaKeyTyped(evt);
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
        b_revisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_revisarActionPerformed(evt);
            }
        });
        principal.add(b_revisar, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 430, 100, 30));

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
        principal.add(b_limpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 430, 100, 30));

        b_visualizarExamen.setBackground(new java.awt.Color(103, 174, 202));
        b_visualizarExamen.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        b_visualizarExamen.setForeground(new java.awt.Color(255, 255, 255));
        b_visualizarExamen.setText("Visualizar");
        b_visualizarExamen.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(103, 174, 202), 2));
        b_visualizarExamen.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b_visualizarExamen.setEnabled(false);
        b_visualizarExamen.setFocusPainted(false);
        b_visualizarExamen.setRolloverEnabled(false);
        b_visualizarExamen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_visualizarExamenActionPerformed(evt);
            }
        });
        principal.add(b_visualizarExamen, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 430, 100, 30));

        add(principal, "card2");

        resultados.setBackground(new java.awt.Color(255, 255, 255));
        resultados.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        b_volver_resultados.setBackground(new java.awt.Color(103, 174, 202));
        b_volver_resultados.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        b_volver_resultados.setForeground(new java.awt.Color(255, 255, 255));
        b_volver_resultados.setText("Volver");
        b_volver_resultados.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(103, 174, 202), 2));
        b_volver_resultados.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b_volver_resultados.setFocusPainted(false);
        b_volver_resultados.setRolloverEnabled(false);
        b_volver_resultados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_volver_resultadosActionPerformed(evt);
            }
        });
        resultados.add(b_volver_resultados, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 490, 100, 30));

        b_guardar.setBackground(new java.awt.Color(103, 174, 202));
        b_guardar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        b_guardar.setForeground(new java.awt.Color(255, 255, 255));
        b_guardar.setText("Enviar");
        b_guardar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(103, 174, 202), 2));
        b_guardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b_guardar.setFocusPainted(false);
        b_guardar.setRolloverEnabled(false);
        b_guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_guardarActionPerformed(evt);
            }
        });
        resultados.add(b_guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 490, 100, 30));

        b_limpiar_resultado.setBackground(new java.awt.Color(103, 174, 202));
        b_limpiar_resultado.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        b_limpiar_resultado.setForeground(new java.awt.Color(255, 255, 255));
        b_limpiar_resultado.setText("Limpiar");
        b_limpiar_resultado.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(103, 174, 202), 2));
        b_limpiar_resultado.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b_limpiar_resultado.setFocusPainted(false);
        b_limpiar_resultado.setRolloverEnabled(false);
        b_limpiar_resultado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_limpiar_resultadoActionPerformed(evt);
            }
        });
        resultados.add(b_limpiar_resultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 490, 100, 30));

        jLabel30.setFont(new java.awt.Font("Arial", 3, 24)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(102, 102, 102));
        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel30.setText("DIAGNÓSTICO");
        resultados.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 20, 210, -1));

        usuario3.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        usuario3.setForeground(new java.awt.Color(102, 102, 102));
        usuario3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        usuario3.setText("Diagnóstico Sugerido");
        usuario3.setBorder(null);
        usuario3.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        usuario3.setFocusable(false);
        resultados.add(usuario3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 100, 190, 30));

        jScrollPane4.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        area_diagnostico_sugerido.setEditable(false);
        area_diagnostico_sugerido.setColumns(20);
        area_diagnostico_sugerido.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        area_diagnostico_sugerido.setLineWrap(true);
        area_diagnostico_sugerido.setRows(5);
        area_diagnostico_sugerido.setWrapStyleWord(true);
        area_diagnostico_sugerido.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        area_diagnostico_sugerido.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jScrollPane4.setViewportView(area_diagnostico_sugerido);

        resultados.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 280, 200));

        jSeparator20.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator20.setForeground(new java.awt.Color(0, 0, 0));
        resultados.add(jSeparator20, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 280, 10));

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
        resultados.add(b_adjuntar_documento, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 400, 100, 30));

        filename.setEditable(false);
        filename.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        resultados.add(filename, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 400, 500, 30));

        usuario4.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        usuario4.setForeground(new java.awt.Color(102, 102, 102));
        usuario4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        usuario4.setText("Adjuntar documento (opcional)");
        usuario4.setBorder(null);
        usuario4.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        usuario4.setFocusable(false);
        resultados.add(usuario4, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 360, 280, 30));

        jSeparator21.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator21.setForeground(new java.awt.Color(0, 0, 0));
        resultados.add(jSeparator21, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 390, 600, 10));

        usuario5.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        usuario5.setForeground(new java.awt.Color(102, 102, 102));
        usuario5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        usuario5.setText("Diagnóstico Final");
        usuario5.setBorder(null);
        usuario5.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        usuario5.setFocusable(false);
        resultados.add(usuario5, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 100, 190, 30));

        jSeparator26.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator26.setForeground(new java.awt.Color(0, 0, 0));
        resultados.add(jSeparator26, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 130, 280, 10));

        jScrollPane5.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        area_diagnostico_final.setColumns(20);
        area_diagnostico_final.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        area_diagnostico_final.setLineWrap(true);
        area_diagnostico_final.setRows(5);
        area_diagnostico_final.setWrapStyleWord(true);
        area_diagnostico_final.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        area_diagnostico_final.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jScrollPane5.setViewportView(area_diagnostico_final);

        resultados.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 140, 280, 200));

        jLabel31.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(102, 102, 102));
        jLabel31.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel31.setText("NOTA: Si desea adjuntar varios documentos, debe unirlos en un mismo archivo PDF ");
        resultados.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 440, 670, -1));

        add(resultados, "card5");

        getAccessibleContext().setAccessibleName("");
    }// </editor-fold>//GEN-END:initComponents

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
            msg.mensaje("¡La cédula no puede estar vacía!", "alerta");

        } else if (cedula.getText().equals("Cédula:")) {
            msg.mensaje("            ¡Campo vacío!", "alerta");
        } else {

            modelo m = null;
            m = new operar_usuarios().BuscarUsuarioConExamenPendienteExperto(cedula.getText());
            if (m != null) {
                b_revisar.setEnabled(true);
                b_visualizarExamen.setEnabled(true);
                nombres.setText(m.getNombre());
                apellidos.setText(m.getApellido());
                cedula.setFocusable(false);
                lupa.setEnabled(false);
                idExamen = m.getId_examen();
                idPaciente = m.getId_usuario();
                fechaVieja = m.getFecha();
                filename.setText(" Adjunte el exámen en formato PDF, PNG o JPG (Max. 16MB)");
            } else {
                msg.mensaje("¡Este paciente no tiene exámenes pendientes!", "error");

            }

        }
    }//GEN-LAST:event_lupaActionPerformed

    private void b_revisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_revisarActionPerformed

        //Se debe descargar el examen
        operar_examenes op = new operar_examenes();

        modelo m = op.BuscarExamen(idExamen);
        aux = m;

        if (m.isSangre() && m.isOrina()) {

            sangre.setVisible(true);
            principal.setVisible(false);
            orina.setVisible(false);
            resultados.setVisible(false);
            tipo = 1;
            globulos_rojos.setText(m.getS_hematies() + "");
            hemoglobina.setText(m.getS_hemoglobina() + "");
            hematocritos.setText(m.getS_hematocritos() + "");
            plaquetas.setText(m.getS_plaquetas() + "");
            leucocitos.setText(m.getS_leucocitos() + "");
            segmentados.setText(m.getS_segmentados() + "");
            linfocitos.setText(m.getS_linfocitos() + "");

            aspecto.setSelectedItem(m.getO_aspecto());
            color.setSelectedItem(m.getO_color());
            reaccion.setSelectedItem(m.getO_reaccion());
            densidad.setText(m.getO_densidad() + "");
            leucocitosorina.setText(m.getO_leucocitos() + "");
            hematies.setText(m.getO_hematies() + "");
            piocitos.setSelectedItem(m.getO_piocitos());
            bacterias.setSelectedItem(m.getO_bacterias());
            eplano.setText(m.getO_eplano() + "");
            proteinas.setSelectedItem(m.getO_proteinas());
            glucosa.setSelectedItem(m.getO_glucosa());
            ccetonico.setSelectedItem(m.getO_cetonico());
            biliares.setSelectedItem(m.getO_pbiliares());
            urobilinogen.setSelectedItem(m.getO_urobilinogelen());
            bilirrubina.setSelectedItem(m.getO_bilirrubina());
            nitritos.setSelectedItem(m.getO_nitritos());
            hemoglobina_orina.setSelectedItem(m.getO_hemoglobina());

            ArrayList<modelo> diagnosticos_ambos = new operar_diagnosticos().obtener_posibles_diagnosticos();
            area_diagnostico_sugerido.setText("");
            area_diagnostico_final.setText("");
            if (!diagnosticos_ambos.isEmpty()) {
                comparar_Ambos(diagnosticos_ambos);
            }

        } else if (m.isSangre()) {

            sangre.setVisible(true);
            principal.setVisible(false);
            orina.setVisible(false);
            resultados.setVisible(false);
            tipo = 2;
            globulos_rojos.setText(m.getS_hematies() + "");
            hemoglobina.setText(m.getS_hemoglobina() + "");
            hematocritos.setText(m.getS_hematocritos() + "");
            plaquetas.setText(m.getS_plaquetas() + "");
            leucocitos.setText(m.getS_leucocitos() + "");
            segmentados.setText(m.getS_segmentados() + "");
            linfocitos.setText(m.getS_linfocitos() + "");

            ArrayList<modelo> diagnosticos_sangre = new operar_diagnosticos().obtener_posibles_diagnosticos_sangre();
            area_diagnostico_sugerido.setText("");
            area_diagnostico_final.setText("");
            if (!diagnosticos_sangre.isEmpty()) {
                comparar_Sangre(diagnosticos_sangre);
            }

        } else {

            sangre.setVisible(false);
            principal.setVisible(false);
            orina.setVisible(true);
            resultados.setVisible(false);
            tipo = 3;
            aspecto.setSelectedItem(m.getO_aspecto());
            color.setSelectedItem(m.getO_color());
            reaccion.setSelectedItem(m.getO_reaccion());
            densidad.setText(m.getO_densidad() + "");
            leucocitosorina.setText(m.getO_leucocitos() + "");
            hematies.setText(m.getO_hematies() + "");
            piocitos.setSelectedItem(m.getO_piocitos());
            bacterias.setSelectedItem(m.getO_bacterias());
            eplano.setText(m.getO_eplano() + "");
            proteinas.setSelectedItem(m.getO_proteinas());
            glucosa.setSelectedItem(m.getO_glucosa());
            ccetonico.setSelectedItem(m.getO_cetonico());
            biliares.setSelectedItem(m.getO_pbiliares());
            urobilinogen.setSelectedItem(m.getO_urobilinogelen());
            bilirrubina.setSelectedItem(m.getO_bilirrubina());
            nitritos.setSelectedItem(m.getO_nitritos());
            hemoglobina_orina.setSelectedItem(m.getO_hemoglobina());

            ArrayList<modelo> diagnosticos_orina = new operar_diagnosticos().obtener_posibles_diagnosticos_orina();
            area_diagnostico_sugerido.setText("");
            area_diagnostico_final.setText("");
            if (!diagnosticos_orina.isEmpty()) {
                comparar_Orina(diagnosticos_orina);
            }
        }
        if (area_diagnostico_sugerido.getText().equals("")) {
            area_diagnostico_sugerido.setText("El paciente está saludable o no hay un diagnóstico asignado a sus resultados.\n\nPor favor revisar antes de enviar un diagnóstico final");
        }
    }//GEN-LAST:event_b_revisarActionPerformed

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

    private void b_siguiente_orinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_siguiente_orinaActionPerformed
        principal.setVisible(false);
        orina.setVisible(false);
        sangre.setVisible(false);
        resultados.setVisible(true);

    }//GEN-LAST:event_b_siguiente_orinaActionPerformed

    private void b_volver_orinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_volver_orinaActionPerformed

        if (tipo == 3) {
            principal.setVisible(true);
            orina.setVisible(false);
            sangre.setVisible(false);
            resultados.setVisible(false);
        } else {
            principal.setVisible(false);
            orina.setVisible(false);
            sangre.setVisible(true);
            resultados.setVisible(false);
        }


    }//GEN-LAST:event_b_volver_orinaActionPerformed

    private void b_volver_sangreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_volver_sangreActionPerformed

        principal.setVisible(true);
        orina.setVisible(false);
        sangre.setVisible(false);
        resultados.setVisible(false);
    }//GEN-LAST:event_b_volver_sangreActionPerformed

    private void b_siguienteSangreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_siguienteSangreActionPerformed

        if (tipo == 1) {
            principal.setVisible(false);
            orina.setVisible(true);
            sangre.setVisible(false);
            resultados.setVisible(false);
        } else {
            principal.setVisible(false);
            orina.setVisible(false);
            sangre.setVisible(false);
            resultados.setVisible(true);
        }

    }//GEN-LAST:event_b_siguienteSangreActionPerformed

    private void b_volver_resultadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_volver_resultadosActionPerformed
        if (tipo == 2) {
            principal.setVisible(false);
            orina.setVisible(false);
            sangre.setVisible(true);
            resultados.setVisible(false);
        } else {
            principal.setVisible(false);
            orina.setVisible(true);
            sangre.setVisible(false);
            resultados.setVisible(false);
        }
    }//GEN-LAST:event_b_volver_resultadosActionPerformed

    private void b_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_guardarActionPerformed
        if (!area_diagnostico_final.getText().equals("")) {

            operar_resultados op = new operar_resultados();
            op.Crear(idPaciente, idExperto, area_diagnostico_final.getText(), fechaVieja);

            if (!filename.getText().equals("") && !filename.getText().equals(" Adjunte el exámen en formato PDF, PNG o JPG (Max. 16MB)")) {
                try {
                    byte[] blob = new byte[(int) file.length()];
                    InputStream input = new FileInputStream(file);
                    input.read(blob);
                    int largo = filename.getText().length();
                    String ext = (filename.getText().substring(largo - 3, largo));
                    op.subirDocumentoDelExamen(blob, ext);

                } catch (IOException ex) {
                    //System.out.println("Error al agregar archivo pdf "+ex.getMessage());
                }
            }

            new operar_examenes().borrarExamen(idExamen, tipo);
            inicio();
        } else {
            msg.mensaje("¡Debe ingresar un diagnóstico final!", "alerta");

        }


    }//GEN-LAST:event_b_guardarActionPerformed

    private void b_visualizarExamenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_visualizarExamenActionPerformed
        operar_examenes op = new operar_examenes();
        File directorio = new File("C:\\SEDIPG\\");
        String archivo = null;

        if (!directorio.exists()) {
            if (directorio.mkdirs()) {
                archivo = op.ejecutar_archivo_experto(idExamen);
            }
        } else {
            archivo = op.ejecutar_archivo_experto(idExamen);
        }

        try {
            Desktop.getDesktop().open(new File("C:\\SEDIPG\\" + archivo + ""));
        } catch (Exception ex) {
        }

    }//GEN-LAST:event_b_visualizarExamenActionPerformed

    private void b_limpiar_resultadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_limpiar_resultadoActionPerformed

        if (!area_diagnostico_sugerido.getText().equals("El paciente está saludable o no hay un diagnóstico asignado a sus resultados.\n\nPor favor revisar antes de enviar un diagnóstico final")) {
            area_diagnostico_final.setText(area_diagnostico_sugerido.getText());
            filename.setText(" Adjunte el exámen en formato PDF, PNG o JPG (Max. 16MB)");
            file = null;
        }
        else{
            area_diagnostico_final.setText("");
            filename.setText(" Adjunte el exámen en formato PDF, PNG o JPG (Max. 16MB)");
            file = null;
        }
    }//GEN-LAST:event_b_limpiar_resultadoActionPerformed

    private void b_adjuntar_documentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_adjuntar_documentoActionPerformed

        fileChooser = new JFileChooser();
        fileChooser.setFileFilter(filter);

        int seleccion = fileChooser.showOpenDialog(this);

        if (seleccion == JFileChooser.APPROVE_OPTION) {
            if (fileChooser.getSelectedFile().length() < (16 * (1024 * 1024))) {
                file = fileChooser.getSelectedFile();
                filename.setText(" " + file.getName());
            } else {

                msg.mensaje("¡Archivo superior a 16MB!", "error");
            }

        }
    }//GEN-LAST:event_b_adjuntar_documentoActionPerformed

    private void cedulaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cedulaKeyTyped
        char c = evt.getKeyChar();
        validador.validarNumeroEntero(c, evt);
    }//GEN-LAST:event_cedulaKeyTyped

    public void inicio() {
        limpiar_campos();
        actualizar_lista();
        principal.setVisible(true);
        sangre.setVisible(false);
        orina.setVisible(false);
        resultados.setVisible(false);
        filename.setText(" Adjunte el exámen en formato PDF, PNG o JPG (Max. 16MB)");
    }

    public void limpiar_campos() {

        cedula.setText("Cédula:");
        nombres.setText("Nombres:");
        apellidos.setText("Apellidos:");
        filename.setText("");
        file = null;
        b_revisar.setEnabled(false);
        b_visualizarExamen.setEnabled(false);
        cedula.setFocusable(true);
        lupa.setEnabled(true);
        idExamen = 0;
        aux = null;
    }

    int idExamen = 0, tipo = 0, idPaciente = 0, idExperto = 0;
    String fechaVieja;

    modelo aux = null;

    private JFileChooser fileChooser;
    private File file;
    private final FileNameExtensionFilter filter = new FileNameExtensionFilter("Archivos PDF, PNG y JPG", "pdf", "png", "jpg", "jpeg");
    private final validaciones validador = new validaciones();
    private final mensajes msg = new mensajes();

    public void actualizar_lista() {
        ArrayList<modelo> li = new operar_examenes().ExamenesPendientesExperto();
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

    public void comparar_Sangre(ArrayList<modelo> diagnosticos) {
        for (int i = 0; i < diagnosticos.size(); i++) {
            ArrayList<String> valores = diagnosticos.get(i).getD_valores();
            ArrayList<String> seleccionados = diagnosticos.get(i).getD_seleccionados();
            boolean coincide = true;
            int j = 0;

            if (seleccionados.get(j).equals("1")) { //PARAMETRO

                switch (valores.get(j)) {
                    case "ALTOS":
                        if (Float.parseFloat(globulos_rojos.getText()) <= 5.40) {
                            coincide = false;
                        }
                        break;
                    case "BAJOS":
                        if (Float.parseFloat(globulos_rojos.getText()) >= 3.90) {
                            coincide = false;
                        }
                        break;
                    default:
                        if (Float.parseFloat(globulos_rojos.getText()) <= 5.40 && Float.parseFloat(globulos_rojos.getText()) >= 3.90) {
                            coincide = false;
                        }
                        break;
                }

            } // FIN PARAMETRO
            j++;
            if (seleccionados.get(j).equals("1") && coincide == true) { //PARAMETRO

                switch (valores.get(j)) {
                    case "ALTOS":
                        if (Float.parseFloat(hemoglobina.getText()) <= 16) {
                            coincide = false;
                        }
                        break;
                    case "BAJOS":
                        if (Float.parseFloat(hemoglobina.getText()) >= 12) {
                            coincide = false;
                        }
                        break;
                    default:
                        if (Float.parseFloat(hemoglobina.getText()) <= 16 && Float.parseFloat(hemoglobina.getText()) >= 12) {
                            coincide = false;
                        }
                        break;
                }

            } // FIN PARAMETRO
            j++;

            if (seleccionados.get(j).equals("1") && coincide == true) { //PARAMETRO

                switch (valores.get(j)) {
                    case "ALTOS":
                        if (Float.parseFloat(hematocritos.getText()) <= 47) {
                            coincide = false;
                        }
                        break;
                    case "BAJOS":
                        if (Float.parseFloat(hematocritos.getText()) >= 35) {
                            coincide = false;
                        }
                        break;
                    default:
                        if (Float.parseFloat(hematocritos.getText()) <= 47 && Float.parseFloat(hematocritos.getText()) >= 35) {
                            coincide = false;
                        }
                        break;
                }

            } // FIN PARAMETRO
            j++;

            if (seleccionados.get(j).equals("1") && coincide == true) { //PARAMETRO

                switch (valores.get(j)) {
                    case "ALTOS":
                        if (Float.parseFloat(plaquetas.getText()) <= 500) {
                            coincide = false;
                        }
                        break;
                    case "BAJOS":
                        if (Float.parseFloat(plaquetas.getText()) >= 140) {
                            coincide = false;
                        }
                        break;
                    default:
                        if (Float.parseFloat(plaquetas.getText()) <= 500 && Float.parseFloat(plaquetas.getText()) >= 140) {
                            coincide = false;
                        }
                        break;
                }

            } // FIN PARAMETRO
            j++;

            if (seleccionados.get(j).equals("1") && coincide == true) { //PARAMETRO

                switch (valores.get(j)) {
                    case "ALTOS":
                        if (Float.parseFloat(leucocitos.getText()) <= 11.20) {
                            coincide = false;
                        }
                        break;
                    case "BAJOS":
                        if (Float.parseFloat(leucocitos.getText()) >= 4.5) {
                            coincide = false;
                        }
                        break;
                    default:
                        if (Float.parseFloat(leucocitos.getText()) <= 11.20 && Float.parseFloat(leucocitos.getText()) >= 4.5) {
                            coincide = false;
                        }
                        break;
                }

            } // FIN PARAMETRO
            j++;

            if (seleccionados.get(j).equals("1") && coincide == true) { //PARAMETRO

                switch (valores.get(j)) {
                    case "ALTOS":
                        if (Float.parseFloat(segmentados.getText()) <= 75) {
                            coincide = false;
                        }
                        break;
                    case "BAJOS":
                        if (Float.parseFloat(segmentados.getText()) >= 39.9) {
                            coincide = false;
                        }
                        break;
                    default:
                        if (Float.parseFloat(segmentados.getText()) <= 75 && Float.parseFloat(segmentados.getText()) >= 39.9) {
                            coincide = false;
                        }
                        break;
                }

            } // FIN PARAMETRO
            j++;

            if (seleccionados.get(j).equals("1") && coincide == true) { //PARAMETRO

                switch (valores.get(j)) {
                    case "ALTOS":
                        if (Float.parseFloat(linfocitos.getText()) <= 50.8) {
                            coincide = false;
                        }
                        break;
                    case "BAJOS":
                        if (Float.parseFloat(linfocitos.getText()) >= 18.8) {
                            coincide = false;
                        }
                        break;
                    default:
                        if (Float.parseFloat(linfocitos.getText()) <= 50.8 && Float.parseFloat(linfocitos.getText()) >= 18.8) {
                            coincide = false;
                        }
                        break;
                }
            } // FIN PARAMETRO

            if (coincide == true) {
                String texto = area_diagnostico_sugerido.getText();
                if (texto.equals("")) {
                    area_diagnostico_sugerido.setText(diagnosticos.get(i).getD_nombre() + ": " + diagnosticos.get(i).getD_descripcion());
                    area_diagnostico_final.setText(diagnosticos.get(i).getD_nombre() + ": " + diagnosticos.get(i).getD_descripcion());
                } else {
                    texto = texto + "\n\n" + diagnosticos.get(i).getD_nombre() + ": " + diagnosticos.get(i).getD_descripcion();
                    area_diagnostico_sugerido.setText(texto);
                    area_diagnostico_final.setText(texto);
                }
            }

        }
    }

    public void comparar_Orina(ArrayList<modelo> diagnosticos) {
        for (int i = 0; i < diagnosticos.size(); i++) {
            ArrayList<String> valores = diagnosticos.get(i).getD_valores();
            ArrayList<String> seleccionados = diagnosticos.get(i).getD_seleccionados();
            boolean coincide = true;
            int j = 0;

            if (seleccionados.get(j).equals("1")) { //PARAMETRO
                if (!aspecto.getSelectedItem().equals(valores.get(j))) {
                    coincide = false;
                }
            } // FIN PARAMETRO
            j++;
            if (seleccionados.get(j).equals("1") && coincide == true) { //PARAMETRO
                if (!color.getSelectedItem().equals(valores.get(j))) {
                    coincide = false;
                }
            } // FIN PARAMETRO
            j++;
            if (seleccionados.get(j).equals("1") && coincide == true) { //PARAMETRO
                if (!reaccion.getSelectedItem().equals(valores.get(j))) {
                    coincide = false;
                }
            } // FIN PARAMETRO
            j++;

            if (seleccionados.get(j).equals("1") && coincide == true) { //PARAMETRO
                switch (valores.get(j)) {
                    case "ALTOS":
                        if (Float.parseFloat(densidad.getText()) <= 1.030) {
                            coincide = false;
                        }
                        break;
                    case "BAJOS":
                        if (Float.parseFloat(densidad.getText()) >= 1.005) {
                            coincide = false;
                        }
                        break;
                    default:
                        if (Float.parseFloat(densidad.getText()) <= 1.030 && Float.parseFloat(densidad.getText()) >= 1.005) {
                            coincide = false;
                        }
                        break;
                }
            } // FIN PARAMETRO
            j++;
            if (seleccionados.get(j).equals("1") && coincide == true) { //PARAMETRO
                switch (valores.get(j)) {
                    case "ALTOS":
                        if (Float.parseFloat(leucocitosorina.getText()) <= 2) {
                            coincide = false;
                        }
                        break;
                    case "BAJOS":
                        if (Float.parseFloat(leucocitosorina.getText()) >= 0) {
                            coincide = false;
                        }
                        break;
                    default:
                        if (Float.parseFloat(leucocitosorina.getText()) <= 2 && Float.parseFloat(leucocitosorina.getText()) >= 0) {
                            coincide = false;
                        }
                        break;
                }
            } // FIN PARAMETRO
            j++;
            if (seleccionados.get(j).equals("1") && coincide == true) { //PARAMETRO
                switch (valores.get(j)) {
                    case "ALTOS":
                        if (Float.parseFloat(hematies.getText()) <= 1) {
                            coincide = false;
                        }
                        break;
                    case "BAJOS":
                        if (Float.parseFloat(hematies.getText()) >= 0) {
                            coincide = false;
                        }
                        break;
                    default:
                        if (Float.parseFloat(hematies.getText()) <= 1 && Float.parseFloat(hematies.getText()) >= 0) {
                            coincide = false;
                        }
                        break;
                }
            } // FIN PARAMETRO
            j++;

            if (seleccionados.get(j).equals("1") && coincide == true) { //PARAMETRO
                if (!piocitos.getSelectedItem().equals(valores.get(j))) {
                    coincide = false;
                }
            } // FIN PARAMETRO
            j++;
            if (seleccionados.get(j).equals("1") && coincide == true) { //PARAMETRO
                if (!bacterias.getSelectedItem().equals(valores.get(j))) {
                    coincide = false;
                }
            } // FIN PARAMETRO
            j++;
            if (seleccionados.get(j).equals("1") && coincide == true) { //PARAMETRO
                switch (valores.get(j)) {
                    case "ALTOS":
                        if (Float.parseFloat(eplano.getText()) <= 2) {
                            coincide = false;
                        }
                        break;
                    case "BAJOS":
                        if (Float.parseFloat(eplano.getText()) >= 0) {
                            coincide = false;
                        }
                        break;
                    default:
                        if (Float.parseFloat(eplano.getText()) <= 2 && Float.parseFloat(eplano.getText()) >= 0) {
                            coincide = false;
                        }
                        break;
                }
            } // FIN PARAMETRO
            j++;
            if (seleccionados.get(j).equals("1") && coincide == true) { //PARAMETRO
                if (!proteinas.getSelectedItem().equals(valores.get(j))) {
                    coincide = false;
                }
            } // FIN PARAMETRO
            j++;
            if (seleccionados.get(j).equals("1") && coincide == true) { //PARAMETRO
                if (!glucosa.getSelectedItem().equals(valores.get(j))) {
                    coincide = false;
                }
            } // FIN PARAMETRO
            j++;
            if (seleccionados.get(j).equals("1") && coincide == true) { //PARAMETRO
                if (!hemoglobina_orina.getSelectedItem().equals(valores.get(j))) {
                    coincide = false;
                }
            } // FIN PARAMETRO
            j++;
            if (seleccionados.get(j).equals("1") && coincide == true) { //PARAMETRO
                if (!ccetonico.getSelectedItem().equals(valores.get(j))) {
                    coincide = false;
                }
            } // FIN PARAMETRO
            j++;
            if (seleccionados.get(j).equals("1") && coincide == true) { //PARAMETRO
                if (!biliares.getSelectedItem().equals(valores.get(j))) {
                    coincide = false;
                }
            } // FIN PARAMETRO
            j++;
            if (seleccionados.get(j).equals("1") && coincide == true) { //PARAMETRO
                if (!urobilinogen.getSelectedItem().equals(valores.get(j))) {
                    coincide = false;
                }
            } // FIN PARAMETRO
            j++;
            if (seleccionados.get(j).equals("1") && coincide == true) { //PARAMETRO
                if (!bilirrubina.getSelectedItem().equals(valores.get(j))) {
                    coincide = false;
                }
            } // FIN PARAMETRO
            j++;
            if (seleccionados.get(j).equals("1") && coincide == true) { //PARAMETRO
                if (!nitritos.getSelectedItem().equals(valores.get(j))) {
                    coincide = false;
                }
            } // FIN PARAMETRO
            j++;

            if (coincide == true) {
                String texto = area_diagnostico_sugerido.getText();
                if (texto.equals("")) {
                    area_diagnostico_sugerido.setText(diagnosticos.get(i).getD_nombre() + ": " + diagnosticos.get(i).getD_descripcion());
                    area_diagnostico_final.setText(diagnosticos.get(i).getD_nombre() + ": " + diagnosticos.get(i).getD_descripcion());
                } else {
                    texto = texto + "\n\n" + diagnosticos.get(i).getD_nombre() + ": " + diagnosticos.get(i).getD_descripcion();
                    area_diagnostico_sugerido.setText(texto);
                    area_diagnostico_final.setText(texto);
                }
            }

        }
    }

    public void comparar_Ambos(ArrayList<modelo> diagnosticos) {
        
        for (int i = 0; i < diagnosticos.size(); i++) {
            ArrayList<String> valores = diagnosticos.get(i).getD_valores();
            ArrayList<String> seleccionados = diagnosticos.get(i).getD_seleccionados();
            boolean coincide = true;
            int j = 0;

            //COINCIDIR CON SANGRE
            if (seleccionados.get(j).equals("1")) { //PARAMETRO
                switch (valores.get(j)) {
                    case "ALTOS":
                        if (Float.parseFloat(globulos_rojos.getText()) <= 5.40) {
                            coincide = false;
                        }
                        break;
                    case "BAJOS":
                        if (Float.parseFloat(globulos_rojos.getText()) >= 3.90) {
                            coincide = false;
                        }
                        break;
                    default:
                        if (Float.parseFloat(globulos_rojos.getText()) <= 5.40 && Float.parseFloat(globulos_rojos.getText()) >= 3.90) {
                            coincide = false;
                        }
                        break;
                }
            } // FIN PARAMETRO
            j++;
            if (seleccionados.get(j).equals("1") && coincide == true) { //PARAMETRO
                switch (valores.get(j)) {
                    case "ALTOS":
                        if (Float.parseFloat(hemoglobina.getText()) <= 16) {
                            coincide = false;
                        }
                        break;
                    case "BAJOS":
                        if (Float.parseFloat(hemoglobina.getText()) >= 12) {
                            coincide = false;
                        }
                        break;
                    default:
                        if (Float.parseFloat(hemoglobina.getText()) <= 16 && Float.parseFloat(hemoglobina.getText()) >= 12) {
                            coincide = false;
                        }
                        break;
                }
            } // FIN PARAMETRO
            j++;

            if (seleccionados.get(j).equals("1") && coincide == true) { //PARAMETRO
                switch (valores.get(j)) {
                    case "ALTOS":
                        if (Float.parseFloat(hematocritos.getText()) <= 47) {
                            coincide = false;
                        }
                        break;
                    case "BAJOS":
                        if (Float.parseFloat(hematocritos.getText()) >= 35) {
                            coincide = false;
                        }
                        break;
                    default:
                        if (Float.parseFloat(hematocritos.getText()) <= 47 && Float.parseFloat(hematocritos.getText()) >= 35) {
                            coincide = false;
                        }
                        break;
                }
            } // FIN PARAMETRO
            j++;

            if (seleccionados.get(j).equals("1") && coincide == true) { //PARAMETRO
                switch (valores.get(j)) {
                    case "ALTOS":
                        if (Float.parseFloat(plaquetas.getText()) <= 500) {
                            coincide = false;
                        }
                        break;
                    case "BAJOS":
                        if (Float.parseFloat(plaquetas.getText()) >= 140) {
                            coincide = false;
                        }
                        break;
                    default:
                        if (Float.parseFloat(plaquetas.getText()) <= 500 && Float.parseFloat(plaquetas.getText()) >= 140) {
                            coincide = false;
                        }
                        break;
                }
            } // FIN PARAMETRO
            j++;

            if (seleccionados.get(j).equals("1") && coincide == true) { //PARAMETRO
                switch (valores.get(j)) {
                    case "ALTOS":
                        if (Float.parseFloat(leucocitos.getText()) <= 11.20) {
                            coincide = false;
                        }
                        break;
                    case "BAJOS":
                        if (Float.parseFloat(leucocitos.getText()) >= 4.5) {
                            coincide = false;
                        }
                        break;
                    default:
                        if (Float.parseFloat(leucocitos.getText()) <= 11.20 && Float.parseFloat(leucocitos.getText()) >= 4.5) {
                            coincide = false;
                        }
                        break;
                }
            } // FIN PARAMETRO
            j++;

            if (seleccionados.get(j).equals("1") && coincide == true) { //PARAMETRO
                switch (valores.get(j)) {
                    case "ALTOS":
                        if (Float.parseFloat(segmentados.getText()) <= 75) {
                            coincide = false;
                        }
                        break;
                    case "BAJOS":
                        if (Float.parseFloat(segmentados.getText()) >= 39.9) {
                            coincide = false;
                        }
                        break;
                    default:
                        if (Float.parseFloat(segmentados.getText()) <= 75 && Float.parseFloat(segmentados.getText()) >= 39.9) {
                            coincide = false;
                        }
                        break;
                }
            } // FIN PARAMETRO
            j++;

            if (seleccionados.get(j).equals("1") && coincide == true) { //PARAMETRO
                switch (valores.get(j)) {
                    case "ALTOS":
                        if (Float.parseFloat(linfocitos.getText()) <= 50.8) {
                            coincide = false;
                        }
                        break;
                    case "BAJOS":
                        if (Float.parseFloat(linfocitos.getText()) >= 18.8) {
                            coincide = false;
                        }
                        break;
                    default:
                        if (Float.parseFloat(linfocitos.getText()) <= 50.8 && Float.parseFloat(linfocitos.getText()) >= 18.8) {
                            coincide = false;
                        }
                        break;
                }
            } // FIN PARAMETRO
            //*****************************************************************//

            //COINCIDIR CON ORINA
            if (seleccionados.get(j).equals("1") && coincide == true) { //PARAMETRO
                switch (valores.get(j)) {
                    case "ALTOS":
                        if (Float.parseFloat(linfocitos.getText()) <= 50.8) {
                            coincide = false;
                        }
                        break;
                    case "BAJOS":
                        if (Float.parseFloat(linfocitos.getText()) >= 18.8) {
                            coincide = false;
                        }
                        break;
                    default:
                        if (Float.parseFloat(linfocitos.getText()) <= 50.8 && Float.parseFloat(linfocitos.getText()) >= 18.8) {
                            coincide = false;
                        }
                        break;
                }
            } // FIN PARAMETRO
            j++;
            if (seleccionados.get(j).equals("1") && coincide == true) { //PARAMETRO
                if (!aspecto.getSelectedItem().equals(valores.get(j))) {
                    coincide = false;
                }
            } // FIN PARAMETRO
            j++;
            if (seleccionados.get(j).equals("1") && coincide == true) { //PARAMETRO
                if (!color.getSelectedItem().equals(valores.get(j))) {
                    coincide = false;
                }
            } // FIN PARAMETRO
            j++;
            if (seleccionados.get(j).equals("1") && coincide == true) {
                if (!reaccion.getSelectedItem().equals(valores.get(j))) {
                    coincide = false;
                }
            }
            j++;

            if (seleccionados.get(j).equals("1") && coincide == true) {
                switch (valores.get(j)) {
                    case "ALTOS":
                        if (Float.parseFloat(densidad.getText()) <= 1.030) {
                            coincide = false;
                        }
                        break;
                    case "BAJOS":
                        if (Float.parseFloat(densidad.getText()) >= 1.005) {
                            coincide = false;
                        }
                        break;
                    default:
                        if (Float.parseFloat(densidad.getText()) <= 1.030 && Float.parseFloat(densidad.getText()) >= 1.005) {
                            coincide = false;
                        }
                        break;
                }
            }
            j++;
            if (seleccionados.get(j).equals("1") && coincide == true) { //PARAMETRO
                switch (valores.get(j)) {
                    case "ALTOS":
                        if (Float.parseFloat(leucocitosorina.getText()) <= 2) {
                            coincide = false;
                        }
                        break;
                    case "BAJOS":
                        if (Float.parseFloat(leucocitosorina.getText()) >= 0) {
                            coincide = false;
                        }
                        break;
                    default:
                        if (Float.parseFloat(leucocitosorina.getText()) <= 2 && Float.parseFloat(leucocitosorina.getText()) >= 0) {
                            coincide = false;
                        }
                        break;
                }
            } // FIN PARAMETRO
            j++;
            if (seleccionados.get(j).equals("1") && coincide == true) { //PARAMETRO
                switch (valores.get(j)) {
                    case "ALTOS":
                        if (Float.parseFloat(hematies.getText()) <= 1) {
                            coincide = false;
                        }
                        break;
                    case "BAJOS":
                        if (Float.parseFloat(hematies.getText()) >= 0) {
                            coincide = false;
                        }
                        break;
                    default:
                        if (Float.parseFloat(hematies.getText()) <= 1 && Float.parseFloat(hematies.getText()) >= 0) {
                            coincide = false;
                        }
                        break;
                }
            } // FIN PARAMETRO
            j++;

            if (seleccionados.get(j).equals("1") && coincide == true) { //PARAMETRO
                if (!piocitos.getSelectedItem().equals(valores.get(j))) {
                    coincide = false;
                }
            } // FIN PARAMETRO
            j++;
            if (seleccionados.get(j).equals("1") && coincide == true) { //PARAMETRO
                if (!bacterias.getSelectedItem().equals(valores.get(j))) {
                    coincide = false;
                }
            } // FIN PARAMETRO
            j++;
            if (seleccionados.get(j).equals("1") && coincide == true) { //PARAMETRO
                switch (valores.get(j)) {
                    case "ALTOS":
                        if (Float.parseFloat(eplano.getText()) <= 2) {
                            coincide = false;
                        }
                        break;
                    case "BAJOS":
                        if (Float.parseFloat(eplano.getText()) >= 0) {
                            coincide = false;
                        }
                        break;
                    default:
                        if (Float.parseFloat(eplano.getText()) <= 2 && Float.parseFloat(eplano.getText()) >= 0) {
                            coincide = false;
                        }
                        break;
                }
            } // FIN PARAMETRO
            j++;
            if (seleccionados.get(j).equals("1") && coincide == true) { //PARAMETRO
                if (!proteinas.getSelectedItem().equals(valores.get(j))) {
                    coincide = false;
                }
            } // FIN PARAMETRO
            j++;
            if (seleccionados.get(j).equals("1") && coincide == true) { //PARAMETRO
                if (!glucosa.getSelectedItem().equals(valores.get(j))) {
                    coincide = false;
                }
            } // FIN PARAMETRO
            j++;
            if (seleccionados.get(j).equals("1") && coincide == true) { //PARAMETRO
                if (!hemoglobina_orina.getSelectedItem().equals(valores.get(j))) {
                    coincide = false;
                }
            } // FIN PARAMETRO
            j++;
            if (seleccionados.get(j).equals("1") && coincide == true) { //PARAMETRO
                if (!ccetonico.getSelectedItem().equals(valores.get(j))) {
                    coincide = false;
                }
            } // FIN PARAMETRO
            j++;
            if (seleccionados.get(j).equals("1") && coincide == true) { //PARAMETRO
                if (!biliares.getSelectedItem().equals(valores.get(j))) {
                    coincide = false;
                }
            } // FIN PARAMETRO
            j++;
            if (seleccionados.get(j).equals("1") && coincide == true) { //PARAMETRO
                if (!urobilinogen.getSelectedItem().equals(valores.get(j))) {
                    coincide = false;
                }
            } // FIN PARAMETRO
            j++;
            if (seleccionados.get(j).equals("1") && coincide == true) { //PARAMETRO
                if (!bilirrubina.getSelectedItem().equals(valores.get(j))) {
                    coincide = false;
                }
            } // FIN PARAMETRO
            j++;
            if (seleccionados.get(j).equals("1") && coincide == true) { //PARAMETRO
                if (!nitritos.getSelectedItem().equals(valores.get(j))) {
                    coincide = false;
                }
            } // FIN PARAMETRO
            j++;

            if (coincide == true) {
                String texto = area_diagnostico_sugerido.getText();
                if (texto.equals("")) {
                    area_diagnostico_sugerido.setText(diagnosticos.get(i).getD_nombre() + ": " + diagnosticos.get(i).getD_descripcion());
                    area_diagnostico_final.setText(diagnosticos.get(i).getD_nombre() + ": " + diagnosticos.get(i).getD_descripcion());
                } else {
                    texto = texto + "\n\n" + diagnosticos.get(i).getD_nombre() + ": " + diagnosticos.get(i).getD_descripcion();
                    area_diagnostico_sugerido.setText(texto);
                    area_diagnostico_final.setText(texto);
                }
            }

        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField apellidos;
    private javax.swing.JTextArea area_diagnostico_final;
    private javax.swing.JTextArea area_diagnostico_sugerido;
    private javax.swing.JComboBox<String> aspecto;
    private javax.swing.JButton b_adjuntar_documento;
    private javax.swing.JButton b_guardar;
    private javax.swing.JButton b_limpiar;
    private javax.swing.JButton b_limpiar_resultado;
    private javax.swing.JButton b_revisar;
    private javax.swing.JButton b_siguienteSangre;
    private javax.swing.JButton b_siguiente_orina;
    private javax.swing.JButton b_visualizarExamen;
    private javax.swing.JButton b_volver_orina;
    private javax.swing.JButton b_volver_resultados;
    private javax.swing.JButton b_volver_sangre;
    private javax.swing.JComboBox<String> bacterias;
    private javax.swing.JComboBox<String> biliares;
    private javax.swing.JComboBox<String> bilirrubina;
    private javax.swing.JComboBox<String> ccetonico;
    private javax.swing.JTextField cedula;
    private javax.swing.JComboBox<String> color;
    private javax.swing.JTextField densidad;
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
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
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
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator13;
    private javax.swing.JSeparator jSeparator14;
    private javax.swing.JSeparator jSeparator15;
    private javax.swing.JSeparator jSeparator16;
    private javax.swing.JSeparator jSeparator17;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator20;
    private javax.swing.JSeparator jSeparator21;
    private javax.swing.JSeparator jSeparator22;
    private javax.swing.JSeparator jSeparator23;
    private javax.swing.JSeparator jSeparator24;
    private javax.swing.JSeparator jSeparator25;
    private javax.swing.JSeparator jSeparator26;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JTextField leucocitos;
    private javax.swing.JTextField leucocitosorina;
    private javax.swing.JTextField linfocitos;
    private javax.swing.JTable lista;
    private javax.swing.JButton lupa;
    private javax.swing.JComboBox<String> nitritos;
    private javax.swing.JTextField nombres;
    private javax.swing.JPanel orina;
    private javax.swing.JComboBox<String> piocitos;
    private javax.swing.JTextField plaquetas;
    private javax.swing.JPanel principal;
    private javax.swing.JComboBox<String> proteinas;
    private javax.swing.JComboBox<String> reaccion;
    private javax.swing.JPanel resultados;
    private javax.swing.JPanel sangre;
    private javax.swing.JTextField segmentados;
    private javax.swing.JComboBox<String> urobilinogen;
    private javax.swing.JTextField usuario;
    private javax.swing.JTextField usuario1;
    private javax.swing.JTextField usuario3;
    private javax.swing.JTextField usuario4;
    private javax.swing.JTextField usuario5;
    // End of variables declaration//GEN-END:variables
}
