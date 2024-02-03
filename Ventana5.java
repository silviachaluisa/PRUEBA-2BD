import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ventana5 {
    private JTextField TXF1;
    private JButton a9Button;
    private JButton a6Button;
    private JButton a3Button;
    private JButton a1Button;
    private JButton a4Button;
    private JButton a7Button;
    private JButton a2Button;
    private JButton a5Button;
    private JButton a0Button;
    private JButton a8Button;
    private JButton enterButton;
    JPanel Ventana5;
    private JButton borrarButton;
    private JButton menúButton;
    private JButton button1;

    public Ventana5() {
        a1Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String Monto = TXF1.getText(); // Obtener la cantidad ingresada
                TXF1.setText(Monto+"1"); // Setear el texto del JTextField como monto y el numero del boton seleccionado
            }
        });

        a2Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String Monto = TXF1.getText(); // Obtener la cantidad ingresada
                TXF1.setText(Monto+"2"); // Setear el texto del JTextField como monto y el numero del boton seleccionado
            }
        });

        a3Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String Monto = TXF1.getText(); // Obtener la cantidad ingresada
                TXF1.setText(Monto+"3"); // Setear el texto del JTextField como monto y el numero del boton seleccionado
            }
        });

        a4Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String Monto = TXF1.getText(); // Obtener la cantidad ingresada
                TXF1.setText(Monto+"4"); // Setear el texto del JTextField como monto y el numero del boton seleccionado
            }
        });

        a5Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String Monto = TXF1.getText(); // Obtener la cantidad ingresada
                TXF1.setText(Monto+"5"); // Setear el texto del JTextField como monto y el numero del boton seleccionado
            }
        });

        a6Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String Monto = TXF1.getText(); // Obtener la cantidad ingresada
                TXF1.setText(Monto+"6"); // Setear el texto del JTextField como monto y el numero del boton seleccionado
            }
        });

        a7Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String Monto = TXF1.getText(); // Obtener la cantidad ingresada
                TXF1.setText(Monto+"7"); // Setear el texto del JTextField como monto y el numero del boton seleccionado
            }
        });

        a8Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String Monto = TXF1.getText(); // Obtener la cantidad ingresada
                TXF1.setText(Monto+"8"); // Setear el texto del JTextField como monto y el numero del boton seleccionado
            }
        });

        a9Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String Monto = TXF1.getText(); // Obtener la cantidad ingresada
                TXF1.setText(Monto+"9"); // Setear el texto del JTextField como monto y el numero del boton seleccionado
            }
        });

        a0Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String Monto = TXF1.getText(); // Obtener la cantidad ingresada
                TXF1.setText(Monto+"0"); // Setear el texto del JTextField como monto y el numero del boton seleccionado
            }
        });

        menúButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame ventana1=new JFrame("Retiro de tu cuente");
                ventana1.setContentPane(new Ventana2().Ventana2);
                ventana1.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                ventana1.setSize(300,300);
                ventana1.setVisible(true);
            }
        });
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
