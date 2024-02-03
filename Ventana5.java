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
    private Datos_bancarios db;
    private double saldo_disponible;

    public Ventana5(Datos_bancarios info) {
        db=info;
        TXF1.setEditable(false);
        this.saldo_disponible=info.getsaldo();
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String Monto = TXF1.getText(); // Obtener la cantidad ingresada
                TXF1.setText(Monto+"."); // Setear el texto del JTextField como monto y el numero del boton seleccionado
            }
        });
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
                JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(Ventana5.this.Ventana5); // Obtener el JFrame de la ventana actual
                frame.dispose(); // Cerrar la ventana actual con el JFrame obtenido
            }
        });
        borrarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String currentText = TXF1.getText();
                if (!currentText.isEmpty()) { // Verifica si hay al menos un carácter para borrar
                    String newText = currentText.substring(0, currentText.length() - 1); // Obtiene una subcadena sin el último carácter
                    TXF1.setText(newText); // Establece la nueva cadena como el nuevo texto
                }
            }
        });
        enterButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String Monto = TXF1.getText();
                Double monto_ingresado;
                if (!Monto.isEmpty()) { // Verifica si hay al menos un carácter para borrar
                    try  {
                        monto_ingresado=Double.parseDouble(Monto);
                        if (monto_ingresado<=saldo_disponible)
                        {
                            db.setSaldo(saldo_disponible-monto_ingresado);
                            JOptionPane.showMessageDialog(Ventana5, "El monto ingresado ha sido retirado con exito!", "Transaccion exitosa", JOptionPane.INFORMATION_MESSAGE);
                        }
                        else
                        {
                            JOptionPane.showMessageDialog(Ventana5, "El saldo de tu cuenta es menor al que\ndeseas retirar!", "Saldo insuficiente", JOptionPane.ERROR_MESSAGE);
                        }
                    }
                    catch (NumberFormatException n) {
                        JOptionPane.showMessageDialog(Ventana5, "Ingrese un valor valido antes de continuar\ncon el proceso de retiro!", "Valor invalido o incompleto", JOptionPane.ERROR_MESSAGE);
                    }
                }
                else
                {
                    JOptionPane.showMessageDialog(Ventana5, "Ingrese un valor antes de realizar el retiro!", "Monto invalido", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
