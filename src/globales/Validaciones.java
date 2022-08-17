package globales;

import java.awt.event.KeyEvent;
import javax.swing.JTextField;

public class Validaciones {

    public void validarFloatPositivo(JTextField jt, char caracter, KeyEvent e) {
        if (((caracter < '0') || (caracter > '9'))
                && (caracter != KeyEvent.VK_BACK_SPACE)
                && (caracter != '.' || jt.getText().contains("."))) {
            e.consume();
        }
    }

    public void validarNumeroEntero(char caracter, KeyEvent e) {
        if (((caracter < '0') || (caracter > '9'))
                && (caracter != KeyEvent.VK_BACK_SPACE)) {
            e.consume();
        }
    }

}
