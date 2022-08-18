package paneles;

import globales.encriptacion;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import modelos.operar_reportes;

public class p_reportes extends javax.swing.JPanel {

    public p_reportes() {
        initComponents();
        iniciar();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        d_listados = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        diagnosticos = new javax.swing.JScrollPane();
        d = new javax.swing.JTable();
        pacientes = new javax.swing.JScrollPane();
        p = new javax.swing.JTable();
        expertos = new javax.swing.JScrollPane();
        e = new javax.swing.JTable();
        asistentes = new javax.swing.JScrollPane();
        a = new javax.swing.JTable();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(680, 540));
        setMinimumSize(new java.awt.Dimension(680, 540));
        setName("Panel Historial"); // NOI18N
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        d_listados.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        d_listados.setForeground(new java.awt.Color(102, 102, 102));
        d_listados.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Listado de Expertos", "Listado de Asistentes", "Listado de Pacientes", "Listado de Diagnósticos" }));
        d_listados.setBorder(null);
        d_listados.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        d_listados.setFocusable(false);
        d_listados.setName("Desplegable"); // NOI18N
        d_listados.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                d_listadosItemStateChanged(evt);
            }
        });
        add(d_listados, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, 540, 40));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new java.awt.CardLayout());

        d.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        d.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Nombre", "Descripción "
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        d.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        d.getTableHeader().setReorderingAllowed(false);
        diagnosticos.setViewportView(d);

        jPanel1.add(diagnosticos, "card5");

        p.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        p.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Nombres", "Apellidos", "Cédula", "Edad", "Correo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        p.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        p.getTableHeader().setReorderingAllowed(false);
        pacientes.setViewportView(p);

        jPanel1.add(pacientes, "card4");

        e.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        e.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Nombres", "Apellidos", "Cedula", "Edad", "Correo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        e.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        e.getTableHeader().setReorderingAllowed(false);
        expertos.setViewportView(e);

        jPanel1.add(expertos, "card2");

        a.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        a.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Nombres", "Apellidos", "Cédula", "Clave", "Edad", "Correo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        a.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        a.getTableHeader().setReorderingAllowed(false);
        asistentes.setViewportView(a);

        jPanel1.add(asistentes, "card3");

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 680, 440));

        getAccessibleContext().setAccessibleName("");
    }// </editor-fold>//GEN-END:initComponents

    private void d_listadosItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_d_listadosItemStateChanged
        int seleccion = d_listados.getSelectedIndex();
        switch (seleccion) {
            case 0:
                expertos.setVisible(true);
                asistentes.setVisible(false);
                pacientes.setVisible(false);
                diagnosticos.setVisible(false);
                break;
            case 1:
                expertos.setVisible(false);
                asistentes.setVisible(true);
                pacientes.setVisible(false);
                diagnosticos.setVisible(false);
                break;
            case 2:
                expertos.setVisible(false);
                asistentes.setVisible(false);
                pacientes.setVisible(true);
                diagnosticos.setVisible(false);
                break;
            case 3:
                expertos.setVisible(false);
                asistentes.setVisible(false);
                pacientes.setVisible(false);
                diagnosticos.setVisible(true);
                break;
        }
    }//GEN-LAST:event_d_listadosItemStateChanged

    public void iniciar() {
        llenarExpertos();
        llenarPacientes();
        llenarAsistentes();
        llenarDiagnosticos();
        d_listados.setSelectedIndex(0);
        expertos.setVisible(true);
        asistentes.setVisible(false);
        pacientes.setVisible(false);
        diagnosticos.setVisible(false);

    }

    public void llenarExpertos() {

        ArrayList<modelos.modelo> li = new operar_reportes().reporteExpertos();
        DefaultTableModel model = (DefaultTableModel) e.getModel();
        model.setRowCount(0);

        if (li != null) {

            for (int i = 0; i < li.size(); i++) {

                model.addRow(new Object[]{
                    li.get(i).getNombre(),
                    li.get(i).getApellido(),
                    li.get(i).getCedula(),
                    li.get(i).getEdad(),
                    li.get(i).getCorreo()
                });
            }
        }
    }

    public void llenarPacientes() {

        ArrayList<modelos.modelo> li = new operar_reportes().reportePacientes();
        DefaultTableModel model = (DefaultTableModel) p.getModel();
        model.setRowCount(0);

        if (li != null) {

            for (int i = 0; i < li.size(); i++) {

                model.addRow(new Object[]{
                    li.get(i).getNombre(),
                    li.get(i).getApellido(),
                    li.get(i).getCedula(),
                    li.get(i).getEdad(),
                    li.get(i).getCorreo()
                });
            }
        }
    }
    
    public void llenarAsistentes() {

        ArrayList<modelos.modelo> li = new operar_reportes().reporteAsistentes();
        DefaultTableModel model = (DefaultTableModel) a.getModel();
        model.setRowCount(0);

        if (li != null) {

            for (int i = 0; i < li.size(); i++) {

                model.addRow(new Object[]{
                    li.get(i).getNombre(),
                    li.get(i).getApellido(),
                    li.get(i).getCedula(),
                    encrip.desencriptar(li.get(i).getClave()),
                    li.get(i).getEdad(),
                    li.get(i).getCorreo()
                });
            }
        }
    }
    
    public void llenarDiagnosticos() {

        ArrayList<modelos.modelo> li = new operar_reportes().reporteDiagnosticos();
        DefaultTableModel model = (DefaultTableModel) d.getModel();
        model.setRowCount(0);

        if (li != null) {

            for (int i = 0; i < li.size(); i++) {

                model.addRow(new Object[]{
                    li.get(i).getD_nombre(),
                    li.get(i).getD_descripcion()
                });
            }
        }
    }
    
    encriptacion encrip = new encriptacion();

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable a;
    private javax.swing.JScrollPane asistentes;
    private javax.swing.JTable d;
    private javax.swing.JComboBox<String> d_listados;
    private javax.swing.JScrollPane diagnosticos;
    private javax.swing.JTable e;
    private javax.swing.JScrollPane expertos;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTable p;
    private javax.swing.JScrollPane pacientes;
    private javax.swing.JComboBox pregunta;
    // End of variables declaration//GEN-END:variables
}
