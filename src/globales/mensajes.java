package globales;

import javax.swing.JOptionPane;

public class mensajes {

    public void mensaje(String mensaje, String tipo) {

        switch (tipo) {
            case "error":
                JOptionPane.showMessageDialog(null, mensaje, "¡ERROR!", JOptionPane.ERROR_MESSAGE);
                break;
            case "alerta":
                JOptionPane.showMessageDialog(null, mensaje, "¡ALERTA!", JOptionPane.WARNING_MESSAGE);
                break;
            default:
                JOptionPane.showMessageDialog(null, mensaje, "¡OPERACIÓN EXITOSA!", JOptionPane.INFORMATION_MESSAGE);
                break;
        }

    }

}
