
package paneles;

import globales.encriptacion;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.border.LineBorder;
import modelos.modelo;
import modelos.operar_usuarios;

public class p_ajustes extends javax.swing.JPanel {

    public p_ajustes(String user) {
        initComponents();
        this.user = user;
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        clave_vieja = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator1 = new javax.swing.JSeparator();
        apellidos = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        nombres = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        respuesta = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();
        cedula = new javax.swing.JTextField();
        jSeparator7 = new javax.swing.JSeparator();
        clave_nueva = new javax.swing.JTextField();
        usuario = new javax.swing.JTextField();
        pregunta = new javax.swing.JComboBox<>();
        b_limpiar = new javax.swing.JButton();
        b_modificar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(680, 540));
        setMinimumSize(new java.awt.Dimension(680, 540));
        setName("Panel Ajustes"); // NOI18N
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        clave_vieja.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        clave_vieja.setForeground(new java.awt.Color(102, 102, 102));
        clave_vieja.setText("Contrase??a Actual:");
        clave_vieja.setBorder(null);
        clave_vieja.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        clave_vieja.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                clave_viejaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                clave_viejaFocusLost(evt);
            }
        });
        add(clave_vieja, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 440, 250, 30));

        jSeparator2.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 60, 250, 10));

        jSeparator1.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 470, 250, 10));

        apellidos.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        apellidos.setForeground(new java.awt.Color(102, 102, 102));
        apellidos.setText("Apellidos:");
        apellidos.setBorder(null);
        apellidos.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        apellidos.setFocusable(false);
        add(apellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 170, 540, 30));

        jSeparator3.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));
        add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 200, 540, 10));

        jSeparator4.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator4.setForeground(new java.awt.Color(0, 0, 0));
        add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 470, 250, 10));

        nombres.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        nombres.setForeground(new java.awt.Color(102, 102, 102));
        nombres.setText("Nombres:");
        nombres.setBorder(null);
        nombres.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        nombres.setFocusable(false);
        add(nombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 100, 540, 30));

        jSeparator5.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator5.setForeground(new java.awt.Color(0, 0, 0));
        add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 130, 540, 10));

        respuesta.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        respuesta.setForeground(new java.awt.Color(102, 102, 102));
        respuesta.setText("Respuesta de seguridad");
        respuesta.setBorder(null);
        respuesta.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        respuesta.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                respuestaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                respuestaFocusLost(evt);
            }
        });
        add(respuesta, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 370, 540, 30));

        jSeparator6.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator6.setForeground(new java.awt.Color(0, 0, 0));
        add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 400, 540, 10));

        cedula.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        cedula.setForeground(new java.awt.Color(102, 102, 102));
        cedula.setText("C??dula:");
        cedula.setBorder(null);
        cedula.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        cedula.setFocusable(false);
        add(cedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 240, 250, 30));

        jSeparator7.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator7.setForeground(new java.awt.Color(0, 0, 0));
        add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 270, 250, 10));

        clave_nueva.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        clave_nueva.setForeground(new java.awt.Color(102, 102, 102));
        clave_nueva.setText("Contrase??a Nueva:");
        clave_nueva.setBorder(null);
        clave_nueva.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        clave_nueva.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                clave_nuevaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                clave_nuevaFocusLost(evt);
            }
        });
        add(clave_nueva, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 440, 250, 30));

        usuario.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        usuario.setForeground(new java.awt.Color(102, 102, 102));
        usuario.setText("Usuario:");
        usuario.setBorder(null);
        usuario.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        usuario.setFocusable(false);
        add(usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, 250, 30));

        pregunta.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        pregunta.setForeground(new java.awt.Color(102, 102, 102));
        pregunta.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "??CU??L ES TU LIBRO FAVORITO?", "??COMO SE LLAMA TU MEJOR AMIGO DE LA INFANCIA?", "??CU??L ERA EL NOMBRE DE TU PRIMERA MASCOTA?", "??EN QU?? CIUDAD SE CONOCIERON TUS PADRES?", "??CU??L ES TU EQUIPO FAVORITO?", "??CU??L FU?? TU PRIMERA PEL??CULA EN EL CINE?", "??CU??L ES TU GRUPO O CANTANTE FAVORITO?", "??CU??L ES TU COLOR FAVORITO?", "??COMO TE LLAMABAN EN TU INFANCIA?", "??C??MO SE LLAMABA TU PRIMER JEFE?" }));
        pregunta.setBorder(null);
        pregunta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pregunta.setFocusable(false);
        pregunta.setName("Desplegable"); // NOI18N
        add(pregunta, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 310, 540, 40));

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
        add(b_limpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 500, 100, 30));

        b_modificar.setBackground(new java.awt.Color(103, 174, 202));
        b_modificar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        b_modificar.setForeground(new java.awt.Color(255, 255, 255));
        b_modificar.setText("Modificar");
        b_modificar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(103, 174, 202), 2));
        b_modificar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b_modificar.setFocusPainted(false);
        b_modificar.setRolloverEnabled(false);
        b_modificar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                b_modificarMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                b_modificarMouseReleased(evt);
            }
        });
        b_modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_modificarActionPerformed(evt);
            }
        });
        add(b_modificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 500, 100, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/usuario_m.png"))); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/clave_m.png"))); // NOI18N
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 440, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/nombre_m.png"))); // NOI18N
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/apellido_m.png"))); // NOI18N
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cedula_m.png"))); // NOI18N
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/seguridad_m.png"))); // NOI18N
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/respuesta_segu.png"))); // NOI18N
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 370, -1, -1));

        getAccessibleContext().setAccessibleName("");
    }// </editor-fold>//GEN-END:initComponents

    private void clave_viejaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_clave_viejaFocusGained

        clave_vieja.setText("");
    }//GEN-LAST:event_clave_viejaFocusGained

    private void respuestaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_respuestaFocusGained
       respuesta.setText("");
    }//GEN-LAST:event_respuestaFocusGained

    private void clave_nuevaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_clave_nuevaFocusGained
        clave_nueva.setText("");
    }//GEN-LAST:event_clave_nuevaFocusGained

    private void b_limpiarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b_limpiarMousePressed

        b_limpiar.setForeground(new Color(103,174,202));
        b_limpiar.setBorder(new LineBorder(new Color(103,174,202), 2));
        b_limpiar.setBackground(Color.white);
    }//GEN-LAST:event_b_limpiarMousePressed

    private void b_limpiarMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b_limpiarMouseReleased

        b_limpiar.setForeground(Color.white);
        b_limpiar.setBorder(new LineBorder(new Color(103,174,202), 2));
        b_limpiar.setBackground(new Color(103,174,202));
    }//GEN-LAST:event_b_limpiarMouseReleased

    private void b_modificarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b_modificarMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_b_modificarMousePressed

    private void b_modificarMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b_modificarMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_b_modificarMouseReleased

    private void respuestaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_respuestaFocusLost
        if(respuesta.getText().equals("")){
            respuesta.setText("Respuesta de seguridad");
        }
    }//GEN-LAST:event_respuestaFocusLost

    private void clave_viejaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_clave_viejaFocusLost
        if(clave_vieja.getText().equals("")){
            clave_vieja.setText("Contrase??a Actual:");
        }
    }//GEN-LAST:event_clave_viejaFocusLost

    private void clave_nuevaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_clave_nuevaFocusLost
        if(clave_nueva.getText().equals("")){
            clave_nueva.setText("Contrase??a Nueva:");
        }
    }//GEN-LAST:event_clave_nuevaFocusLost

    private void b_limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_limpiarActionPerformed
        limpiar_campos(p);
    }//GEN-LAST:event_b_limpiarActionPerformed

    private void b_modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_modificarActionPerformed
        
        
        String clave = "";
        
        if(clave_nueva.getText().equals("Contrase??a Nueva:")){
            
            clave = clave_vieja.getText();
            
        }
        else{clave = clave_nueva.getText();}
        
        if(clave_vieja.getText().equals("Contrase??a Actual:")){
            
            JOptionPane.showMessageDialog(null, "??Debe ingresar su contrase??a actual en el campo indicado! "
                    + "\n                             Intente nuevamente...", "??ALERTA!", JOptionPane.WARNING_MESSAGE);
            
        }
        else{
            
            new operar_usuarios().Modificar(user, encrip.encriptar(respuesta.getText()), encrip.encriptar(clave_vieja.getText()), encrip.encriptar(clave), pregunta.getSelectedItem()+ "");
            info_usuario();
        }
    }//GEN-LAST:event_b_modificarActionPerformed

    
    //METODOS Y VARIABLES
    
    public void info_usuario(){
        
        modelo m = new operar_usuarios().Buscar(user);
        
        usuario.setText("Usuario: " + user);
        cedula.setText("C??dula: " + user);
        nombres.setText("Nombres: " + m.getNombre());
        apellidos.setText("Apellidos: " + m.getApellido());
        p = m.getPregunta();
        limpiar_campos(p);
    }
    
    public void limpiar_campos(String p){
       
        pregunta.setSelectedItem(p);
        respuesta.setText("Respuesta de seguridad"); //Aqui se debe poner la respuesta de la persona
        clave_vieja.setText("Contrase??a Actual:");
        clave_nueva.setText("Contrase??a Nueva:");
    }
    
    String user, p;
    encriptacion encrip = new encriptacion();
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField apellidos;
    private javax.swing.JButton b_limpiar;
    private javax.swing.JButton b_modificar;
    private javax.swing.JTextField cedula;
    private javax.swing.JTextField clave_nueva;
    private javax.swing.JTextField clave_vieja;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JTextField nombres;
    private javax.swing.JComboBox<String> pregunta;
    private javax.swing.JTextField respuesta;
    private javax.swing.JTextField usuario;
    // End of variables declaration//GEN-END:variables
}
