import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ventana6 {
    private JPanel Ventana6;
    private JTextField textField1;
    private JButton a1Button;
    private JButton a4Button;
    private JButton a7Button;
    private JButton a0Button;
    private JButton a3Button;
    private JButton a6Button;
    private JButton a9Button;
    private JButton enterButton;
    private JButton a2Button;
    private JButton a5Button;
    private JButton a8Button;
    private JButton button1;
    private JButton menuButton;
    private JButton borrarButton;

    public Ventana6() {

        menuButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame ventana1=new JFrame("Retiro de tu cuenta");
                ventana1.setContentPane(new Ventana2().Ventana2);
                ventana1.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                ventana1.setSize(300,300);
                ventana1.setVisible(true);
            }
        });
        borrarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String currentText = textField1.getText();
                if (!currentText.isEmpty()) { // Verifica si hay al menos un carácter para borrar
                    String newText = currentText.substring(0, currentText.length() - 1); // Obtiene una subcadena sin el último carácter
                    textField1.setText(newText); // Establece la nueva cadena como el nuevo texto
                }
            }
        });
    }
}
