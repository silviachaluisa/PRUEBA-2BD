import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ventana4 {
    JPanel Ventana4;
    private JLabel titulo;
    private JButton BotonMenu1;
    private JLabel mostrarsaldo;


    public Ventana4(Datos_bancarios info) {
        mostrarsaldo.setText("Saldo disponible: "+info.getsaldo());
        BotonMenu1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(Ventana4.this.Ventana4); // Obtener el JFrame de la ventana actual
                frame.dispose(); // Cerrar la ventana actual con el JFrame obtenido
            }
        });
    }
}
