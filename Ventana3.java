import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ventana3 {
    JPanel Ventana3;
    private JButton BotonOk;

    public Ventana3() {//Constructor de la clase ventana
        BotonOk.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame ventanaf = (JFrame) SwingUtilities.getWindowAncestor(Ventana3.this.Ventana3); // Obtener el JFrame de la ventana actual
                ventanaf.dispose(); // Cerrar la ventana actual con el JFrame obtenido
            }
        });
    }
}
