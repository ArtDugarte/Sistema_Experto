package paneles;

import java.awt.Color;
import java.awt.Desktop;
import java.io.File;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;
import modelos.modelo;
import modelos.operar_examenes;
import modelos.operar_usuarios;

public class p_revision extends javax.swing.JPanel {

    public p_revision() {
        initComponents();
        actualizar_lista();
        principal.setVisible(true);
        orina.setVisible(false);
        sangre.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

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
        b_ModificarSangre = new javax.swing.JButton();
        b_siguienteSangre = new javax.swing.JButton();
        b_limpiarSangre = new javax.swing.JButton();
        jLabel25 = new javax.swing.JLabel();
        orina = new javax.swing.JPanel();
        jSeparator15 = new javax.swing.JSeparator();
        jLabel26 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        b_ModificarOrina = new javax.swing.JButton();
        b_volver_orina = new javax.swing.JButton();
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

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(680, 540));
        setMinimumSize(new java.awt.Dimension(680, 540));
        setName("Panel Revisión"); // NOI18N
        setLayout(new java.awt.CardLayout());

        principal.setBackground(new java.awt.Color(255, 255, 255));
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

        nombres.setEditable(false);
        nombres.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        nombres.setForeground(new java.awt.Color(102, 102, 102));
        nombres.setText("Nombres:");
        nombres.setBorder(null);
        nombres.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        nombres.setFocusable(false);
        principal.add(nombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 260, 290, 30));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/apellido_m.png"))); // NOI18N
        principal.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 330, -1, -1));

        apellidos.setEditable(false);
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
        principal.add(b_revisar, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 430, 100, 30));

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
        principal.add(b_limpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 430, 100, 30));

        add(principal, "card2");

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

        b_ModificarSangre.setBackground(new java.awt.Color(103, 174, 202));
        b_ModificarSangre.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        b_ModificarSangre.setForeground(new java.awt.Color(255, 255, 255));
        b_ModificarSangre.setText("Modificar");
        b_ModificarSangre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(103, 174, 202), 2));
        b_ModificarSangre.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b_ModificarSangre.setFocusPainted(false);
        b_ModificarSangre.setRolloverEnabled(false);
        b_ModificarSangre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                b_ModificarSangreMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                b_ModificarSangreMouseReleased(evt);
            }
        });
        b_ModificarSangre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_ModificarSangreActionPerformed(evt);
            }
        });
        sangre.add(b_ModificarSangre, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 500, 100, 30));

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
        sangre.add(b_siguienteSangre, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 500, 100, 30));

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
        sangre.add(b_limpiarSangre, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 500, 100, 30));

        jLabel25.setFont(new java.awt.Font("Arial", 3, 15)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(102, 102, 102));
        jLabel25.setText("HEMATIES O GLÓBULOS ROJOS: ");
        sangre.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, 250, -1));

        add(sangre, "card2");

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

        b_ModificarOrina.setBackground(new java.awt.Color(103, 174, 202));
        b_ModificarOrina.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        b_ModificarOrina.setForeground(new java.awt.Color(255, 255, 255));
        b_ModificarOrina.setText("Modificar");
        b_ModificarOrina.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(103, 174, 202), 2));
        b_ModificarOrina.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b_ModificarOrina.setFocusPainted(false);
        b_ModificarOrina.setRolloverEnabled(false);
        b_ModificarOrina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_ModificarOrinaActionPerformed(evt);
            }
        });
        orina.add(b_ModificarOrina, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 500, 100, 30));

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
        orina.add(b_limpiarOrina, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 500, 100, 30));

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

        jLabel28.setFont(new java.awt.Font("Arial", 3, 15)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(102, 102, 102));
        jLabel28.setText("VN: 0-2");
        orina.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 410, -1, -1));

        jLabel29.setFont(new java.awt.Font("Arial", 3, 15)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(102, 102, 102));
        jLabel29.setText("VN: 1.005-1.030");
        orina.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 200, 120, -1));

        add(orina, "card2");

        getAccessibleContext().setAccessibleName("");
    }// </editor-fold>//GEN-END:initComponents

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
            JOptionPane.showMessageDialog(null, "¡La cedula no puede estar vacia! \n        Intente Nuevamente...", "¡ERROR!", JOptionPane.ERROR_MESSAGE);
        } else {

            modelo m = null;
            m = new operar_usuarios().BuscarUsuarioConExamenPendiente(cedula.getText());
            if (m != null) {
                b_revisar.setEnabled(true);
                nombres.setText(m.getNombre());
                apellidos.setText(m.getApellido());
                cedula.setEditable(false);
                cedula.setFocusable(false);
                lupa.setEnabled(false);
                idExamen = m.getId_examen();
            } else {
                JOptionPane.showMessageDialog(null, "¡Este paciente no tiene examenes pendientes! \n        Intente Nuevamente...", "¡ERROR!", JOptionPane.ERROR_MESSAGE);
                limpiar_campos();
            }

        }
    }//GEN-LAST:event_lupaActionPerformed

    private void b_revisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_revisarActionPerformed
        
//Se debe descargar el examen
        operar_examenes op = new operar_examenes();
        String archivo = op.ejecutar_archivo(idExamen);
        
        try {
            Desktop.getDesktop().open(new File("C:\\Resultados\\"+archivo+""));
        } catch (Exception ex) {}
        
        modelo m = op.BuscarExamen(idExamen);
        
        if(m.isSangre() && m.isOrina()){
            
            sangre.setVisible(true);
            principal.setVisible(false);
            orina.setVisible(false);
            b_siguienteSangre.setVisible(true);
            tipo = 1;
            globulos_rojos.setText(m.getS_hematies()+"");
            hemoglobina.setText(m.getS_hemoglobina()+"");
            hematocritos.setText(m.getS_hematocritos()+"");
            plaquetas.setText(m.getS_plaquetas()+"");
            leucocitos.setText(m.getS_leucocitos()+"");
            segmentados.setText(m.getS_segmentados()+"");
            linfocitos.setText(m.getS_linfocitos()+"");
            
            aspecto.setSelectedItem(m.getO_aspecto());
            color.setSelectedItem(m.getO_color());
            reaccion.setSelectedItem(m.getO_reaccion());
            densidad.setText(m.getO_densidad()+"");
            leucocitosorina.setText(m.getO_leucocitos()+"");
            hematies.setText(m.getO_hematies()+"");
            piocitos.setSelectedItem(m.getO_piocitos());
            bacterias.setSelectedItem(m.getO_bacterias());
            eplano.setText(m.getO_eplano()+"");
            proteinas.setSelectedItem(m.getO_proteinas());
            glucosa.setSelectedItem(m.getO_glucosa());
            ccetonico.setSelectedItem(m.getO_cetonico());
            biliares.setSelectedItem(m.getO_pbiliares());
            urobilinogen.setSelectedItem(m.getO_urobilinogelen());
            bilirrubina.setSelectedItem(m.getO_bilirrubina());
            nitritos.setSelectedItem(m.getO_nitritos());
            
        }else if(m.isSangre()){
            
            sangre.setVisible(true);
            principal.setVisible(false);
            orina.setVisible(false);
            b_siguienteSangre.setVisible(false);
            tipo = 2;
            globulos_rojos.setText(m.getS_hematies()+"");
            hemoglobina.setText(m.getS_hemoglobina()+"");
            hematocritos.setText(m.getS_hematocritos()+"");
            plaquetas.setText(m.getS_plaquetas()+"");
            leucocitos.setText(m.getS_leucocitos()+"");
            segmentados.setText(m.getS_segmentados()+"");
            linfocitos.setText(m.getS_linfocitos()+"");
            
            
        }else{
            
            sangre.setVisible(false);
            principal.setVisible(false);
            orina.setVisible(true);
            tipo = 3;
            aspecto.setSelectedItem(m.getO_aspecto());
            color.setSelectedItem(m.getO_color());
            reaccion.setSelectedItem(m.getO_reaccion());
            densidad.setText(m.getO_densidad()+"");
            leucocitosorina.setText(m.getO_leucocitos()+"");
            hematies.setText(m.getO_hematies()+"");
            piocitos.setSelectedItem(m.getO_piocitos());
            bacterias.setSelectedItem(m.getO_bacterias());
            eplano.setText(m.getO_eplano()+"");
            proteinas.setSelectedItem(m.getO_proteinas());
            glucosa.setSelectedItem(m.getO_glucosa());
            ccetonico.setSelectedItem(m.getO_cetonico());
            biliares.setSelectedItem(m.getO_pbiliares());
            urobilinogen.setSelectedItem(m.getO_urobilinogelen());
            bilirrubina.setSelectedItem(m.getO_bilirrubina());
            nitritos.setSelectedItem(m.getO_nitritos());
        }
        
        //Luego deben aparecer los examenes de orina, sangre o ambos depende el caso
        //Se acepta la revision
    }//GEN-LAST:event_b_revisarActionPerformed

    private void b_siguienteSangreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_siguienteSangreActionPerformed

        principal.setVisible(false);
        orina.setVisible(true);
        sangre.setVisible(false);
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
        
    }//GEN-LAST:event_b_limpiarSangreActionPerformed

    private void b_volver_sangreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_volver_sangreActionPerformed

        principal.setVisible(true);
        orina.setVisible(false);
        sangre.setVisible(false);
    }//GEN-LAST:event_b_volver_sangreActionPerformed

    private void b_ModificarOrinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_ModificarOrinaActionPerformed
       
    }//GEN-LAST:event_b_ModificarOrinaActionPerformed

    private void b_limpiarOrinaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b_limpiarOrinaMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_b_limpiarOrinaMousePressed

    private void b_limpiarOrinaMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b_limpiarOrinaMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_b_limpiarOrinaMouseReleased

    private void b_limpiarOrinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_limpiarOrinaActionPerformed
        
    }//GEN-LAST:event_b_limpiarOrinaActionPerformed

    private void b_volver_orinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_volver_orinaActionPerformed

        if(tipo == 1){
            principal.setVisible(false);
            orina.setVisible(false);
            sangre.setVisible(true);
        }
        else{
            principal.setVisible(true);
            orina.setVisible(false);
            sangre.setVisible(false);
        }
    }//GEN-LAST:event_b_volver_orinaActionPerformed

    private void b_ModificarSangreMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b_ModificarSangreMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_b_ModificarSangreMousePressed

    private void b_ModificarSangreMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b_ModificarSangreMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_b_ModificarSangreMouseReleased

    private void b_ModificarSangreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_ModificarSangreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_b_ModificarSangreActionPerformed

    //Métodos y Variables
    public void actualizar_lista() {
        ArrayList<modelo> li = new operar_examenes().ExamenesPendientes();
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

    public void limpiar_campos() {

        cedula.setText("Cédula:");
        nombres.setText("Nombres:");
        apellidos.setText("Apellidos:");
        b_revisar.setEnabled(false);
        cedula.setEditable(true);
        cedula.setFocusable(true);
        lupa.setEnabled(true);
        idExamen = 0;
    }

    int idExamen = 0, tipo = 0;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField apellidos;
    private javax.swing.JComboBox<String> aspecto;
    private javax.swing.JButton b_ModificarOrina;
    private javax.swing.JButton b_ModificarSangre;
    private javax.swing.JButton b_limpiar;
    private javax.swing.JButton b_limpiarOrina;
    private javax.swing.JButton b_limpiarSangre;
    private javax.swing.JButton b_revisar;
    private javax.swing.JButton b_siguienteSangre;
    private javax.swing.JButton b_volver_orina;
    private javax.swing.JButton b_volver_sangre;
    private javax.swing.JComboBox<String> bacterias;
    private javax.swing.JComboBox<String> biliares;
    private javax.swing.JComboBox<String> bilirrubina;
    private javax.swing.JComboBox<String> ccetonico;
    private javax.swing.JTextField cedula;
    private javax.swing.JComboBox<String> color;
    private javax.swing.JTextField densidad;
    private javax.swing.JTextField eplano;
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
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator13;
    private javax.swing.JSeparator jSeparator14;
    private javax.swing.JSeparator jSeparator15;
    private javax.swing.JSeparator jSeparator16;
    private javax.swing.JSeparator jSeparator17;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator22;
    private javax.swing.JSeparator jSeparator23;
    private javax.swing.JSeparator jSeparator24;
    private javax.swing.JSeparator jSeparator25;
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
    private javax.swing.JPanel sangre;
    private javax.swing.JTextField segmentados;
    private javax.swing.JComboBox<String> urobilinogen;
    private javax.swing.JTextField usuario;
    private javax.swing.JTextField usuario1;
    // End of variables declaration//GEN-END:variables
}
