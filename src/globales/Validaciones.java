package globales;

import java.awt.event.KeyEvent;
import javax.swing.JTextField;

public class validaciones {

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

    public void limitarCaracteres(JTextField jt, KeyEvent e, int n) {

        if (jt.getText().length() >= n) {
            e.consume();
        }
    }

}
