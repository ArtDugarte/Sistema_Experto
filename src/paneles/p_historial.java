package paneles;

import globales.WordWrapRenderer;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import modelos.modelo;
import modelos.operar_examenes;
import modelos.operar_resultados;

public class p_historial extends javax.swing.JPanel {

    public p_historial(int id) {
        initComponents();
        this.id = id;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        listado = new javax.swing.JScrollPane();
        historial = new javax.swing.JTable();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(680, 540));
        setMinimumSize(new java.awt.Dimension(680, 540));
        setName("Panel Historial"); // NOI18N
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        historial.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        historial.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Médico", "Diagnóstico", "Fecha de Envío", "Fecha de Diagnóstico"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        historial.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        historial.getTableHeader().setReorderingAllowed(false);
        listado.setViewportView(historial);

        add(listado, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 620, 450));

        getAccessibleContext().setAccessibleName("");
    }// </editor-fold>//GEN-END:initComponents

    public void actualizar_historial() {

        ArrayList<modelo> li = new operar_resultados().historial(id);
        DefaultTableModel model = (DefaultTableModel) historial.getModel();
        model.setRowCount(0);

        historial.getColumnModel().getColumn(0).setCellRenderer(new WordWrapRenderer());
        historial.getColumnModel().getColumn(1).setCellRenderer(new WordWrapRenderer());
        historial.getColumnModel().getColumn(2).setCellRenderer(new WordWrapRenderer());
        historial.getColumnModel().getColumn(3).setCellRenderer(new WordWrapRenderer());

        if (li != null) {

            for (int i = 0; i < li.size(); i++) {

                model.addRow(new Object[]{
                    li.get(i).getNombre() + " " + li.get(i).getApellido() + "\n",
                    li.get(i).getDiagnostico_final()+ "\n",
                    li.get(i).getFecha_envio()+ "\n",
                    li.get(i).getFecha_diagnostico()+ "\n"
                });
            }
        }
    }

    int id;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable historial;
    private javax.swing.JScrollPane listado;
    // End of variables declaration//GEN-END:variables
}
