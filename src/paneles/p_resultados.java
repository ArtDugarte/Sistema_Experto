package paneles;

import java.awt.Desktop;
import java.io.File;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import static java.time.temporal.ChronoUnit.DAYS;
import java.util.Calendar;
import java.util.Date;
import modelos.modelo;
import modelos.operar_resultados;
import modelos.operar_usuarios;

public class p_resultados extends javax.swing.JPanel {

    public p_resultados(String usuario) {
        initComponents();
        this.id_usuario = new operar_usuarios().BuscarID(usuario);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fecha_diagnostico = new javax.swing.JTextField();
        jSeparator20 = new javax.swing.JSeparator();
        jScrollPane4 = new javax.swing.JScrollPane();
        area_diagnostico = new javax.swing.JTextArea();
        descargar = new javax.swing.JButton();
        fecha_envio = new javax.swing.JTextField();
        jSeparator21 = new javax.swing.JSeparator();
        nombre_medico = new javax.swing.JTextField();
        tiempo_descarga = new javax.swing.JTextField();
        correo = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(680, 540));
        setMinimumSize(new java.awt.Dimension(680, 540));
        setName("Panel Resultados"); // NOI18N
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        fecha_diagnostico.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        fecha_diagnostico.setForeground(new java.awt.Color(102, 102, 102));
        fecha_diagnostico.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        fecha_diagnostico.setText("Diagnósticado el día: dd/mm/yyyy ");
        fecha_diagnostico.setBorder(null);
        fecha_diagnostico.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        fecha_diagnostico.setFocusable(false);
        add(fecha_diagnostico, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, 300, 30));

        jSeparator20.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator20.setForeground(new java.awt.Color(0, 0, 0));
        add(jSeparator20, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 380, 300, 10));

        jScrollPane4.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        area_diagnostico.setEditable(false);
        area_diagnostico.setColumns(20);
        area_diagnostico.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        area_diagnostico.setLineWrap(true);
        area_diagnostico.setRows(5);
        area_diagnostico.setWrapStyleWord(true);
        area_diagnostico.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        area_diagnostico.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane4.setViewportView(area_diagnostico);

        add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 590, 260));

        descargar.setBackground(new java.awt.Color(103, 174, 202));
        descargar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        descargar.setForeground(new java.awt.Color(255, 255, 255));
        descargar.setText("Descargar documento");
        descargar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(103, 174, 202), 2));
        descargar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        descargar.setFocusPainted(false);
        descargar.setRolloverEnabled(false);
        descargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                descargarActionPerformed(evt);
            }
        });
        add(descargar, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 460, 460, 30));

        fecha_envio.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        fecha_envio.setForeground(new java.awt.Color(102, 102, 102));
        fecha_envio.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        fecha_envio.setText("Su diagnóstico para el exámen subido el dia dd/mm/yyyy es:");
        fecha_envio.setBorder(null);
        fecha_envio.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        fecha_envio.setFocusable(false);
        add(fecha_envio, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 590, 30));

        jSeparator21.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator21.setForeground(new java.awt.Color(0, 0, 0));
        add(jSeparator21, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 590, 10));

        nombre_medico.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        nombre_medico.setForeground(new java.awt.Color(102, 102, 102));
        nombre_medico.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        nombre_medico.setText("Aprobado por Nombre Apellido - Especialista Certificado/a");
        nombre_medico.setBorder(null);
        nombre_medico.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        nombre_medico.setFocusable(false);
        add(nombre_medico, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 390, 590, 30));

        tiempo_descarga.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        tiempo_descarga.setForeground(new java.awt.Color(103, 86, 130));
        tiempo_descarga.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tiempo_descarga.setText("Tiene 00 días para descargar este documento");
        tiempo_descarga.setBorder(null);
        tiempo_descarga.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tiempo_descarga.setFocusable(false);
        add(tiempo_descarga, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 500, 590, 30));

        correo.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        correo.setForeground(new java.awt.Color(102, 102, 102));
        correo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        correo.setText("N/A");
        correo.setBorder(null);
        correo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        correo.setFocusable(false);
        add(correo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 420, 590, 30));

        getAccessibleContext().setAccessibleName("");
    }// </editor-fold>//GEN-END:initComponents

    private void descargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_descargarActionPerformed

        operar_resultados op = new operar_resultados();
        File directorio = new File("C:\\SEDIPG\\");
        String archivo = null;

        if (!directorio.exists()) {

            if (directorio.mkdirs()) {
                archivo = op.ejecutar_archivo(id_resultado);
            }
        } else {
            archivo = op.ejecutar_archivo(id_resultado);
        }

        try {
            Desktop.getDesktop().open(new File("C:\\SEDIPG\\" + archivo + ""));
        } catch (Exception ex) {
        }
    }//GEN-LAST:event_descargarActionPerformed

    public void iniciar() {

        modelo m = new operar_resultados().Buscar(id_usuario);

        if (m == null) {

            nombre_medico.setText("Aprobado por N/A - Especialista Certificado/a");
            fecha_diagnostico.setText("Diagnósticado el día: dd/mm/yyyy ");
            fecha_envio.setText("Su diagnóstico para el exámen subido el dia dd/mm/yyyy es:");
            correo.setText("N/A");
            area_diagnostico.setText("");
            descargar.setEnabled(false);
            tiempo_descarga.setVisible(false);

        } else {

            nombre_medico.setText("Aprobado por " + m.getNombre() + " " + m.getApellido() + " - Especialista Certificado/a");
            fecha_diagnostico.setText("Diagnósticado el día: " + m.getFecha_diagnostico() + " ");
            fecha_envio.setText("Su diagnóstico para el exámen subido el dia " + m.getFecha_envio() + " es:");
            correo.setText("Para más información, escribir al correo del médico: " + m.getCorreo().toLowerCase());
            area_diagnostico.setText(m.getDiagnostico_final());

            if (new operar_resultados().existe_archivo(m.getId_resultado())) {

                id_resultado = m.getId_resultado();
                descargar.setEnabled(true);
                tiempo_descarga.setVisible(true);

                SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");

                try {

                    Date date = format.parse(m.getFecha_diagnostico());
                    Date fecha_borrado = sumarDiasAFecha(date, 15);
                    String s_fecha_borrado = format.format(fecha_borrado);
                    LocalDate myDate = LocalDate.parse(s_fecha_borrado);
                    LocalDate currentDate = LocalDate.now();
                    long dias = DAYS.between(currentDate, myDate);
                    
                    tiempo_descarga.setText("Tiene "+ dias +" días para descargar este documento");

                } catch (ParseException e) {
                    e.printStackTrace();
                }

            } else {

                descargar.setEnabled(false);
                tiempo_descarga.setVisible(false);

            }
        }
    }

    public static Date sumarDiasAFecha(Date fecha, int dias) {
        
        if (dias == 0) {return fecha;}
        
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(fecha);
        calendar.add(Calendar.DAY_OF_YEAR, dias);
        
        return calendar.getTime();
    }

    private int id_usuario = 0, id_resultado = 0;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea area_diagnostico;
    private javax.swing.JTextField correo;
    private javax.swing.JButton descargar;
    private javax.swing.JTextField fecha_diagnostico;
    private javax.swing.JTextField fecha_envio;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSeparator jSeparator20;
    private javax.swing.JSeparator jSeparator21;
    private javax.swing.JTextField nombre_medico;
    private javax.swing.JTextField tiempo_descarga;
    // End of variables declaration//GEN-END:variables
}
