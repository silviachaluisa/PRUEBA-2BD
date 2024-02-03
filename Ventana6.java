import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ventana6 {
    JPanel Ventana6;
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
    private Datos_bancarios db;
    private double saldo_disponible;

    public Ventana6(Datos_bancarios info) {
        db=info;
        textField1.setEditable(false);
        this.saldo_disponible= info.getsaldo(); // Obtenber el saldo de la cuenta
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String Monto = textField1.getText(); // Obtener la cantidad ingresada
                textField1.setText(Monto+"."); // Setear el texto del JTextField como monto y el numero del boton seleccionado
            }
        });
        a1Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String Monto = textField1.getText(); // Obtener la cantidad ingresada
                textField1.setText(Monto+"1"); // Setear el texto del JTextField como monto y el numero del boton seleccionado
            }
        });

        a2Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String Monto = textField1.getText(); // Obtener la cantidad ingresada
                textField1.setText(Monto+"2"); // Setear el texto del JTextField como monto y el numero del boton seleccionado
            }
        });

        a3Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String Monto = textField1.getText(); // Obtener la cantidad ingresada
                textField1.setText(Monto+"3"); // Setear el texto del JTextField como monto y el numero del boton seleccionado
            }
        });

        a4Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String Monto = textField1.getText(); // Obtener la cantidad ingresada
                textField1.setText(Monto+"4"); // Setear el texto del JTextField como monto y el numero del boton seleccionado
            }
        });

        a5Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String Monto = textField1.getText(); // Obtener la cantidad ingresada
                textField1.setText(Monto+"5"); // Setear el texto del JTextField como monto y el numero del boton seleccionado
            }
        });

        a6Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String Monto = textField1.getText(); // Obtener la cantidad ingresada
                textField1.setText(Monto+"6"); // Setear el texto del JTextField como monto y el numero del boton seleccionado
            }
        });

        a7Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String Monto = textField1.getText(); // Obtener la cantidad ingresada
                textField1.setText(Monto+"7"); // Setear el texto del JTextField como monto y el numero del boton seleccionado
            }
        });

        a8Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String Monto = textField1.getText(); // Obtener la cantidad ingresada
                textField1.setText(Monto+"8"); // Setear el texto del JTextField como monto y el numero del boton seleccionado
            }
        });

        a9Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String Monto = textField1.getText(); // Obtener la cantidad ingresada
                textField1.setText(Monto+"9"); // Setear el texto del JTextField como monto y el numero del boton seleccionado
            }
        });

        a0Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String Monto = textField1.getText(); // Obtener la cantidad ingresada
                textField1.setText(Monto+"0"); // Setear el texto del JTextField como monto y el numero del boton seleccionado
            }
        });
        menuButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(Ventana6.this.Ventana6); // Obtener el JFrame de la ventana actual
                frame.dispose(); // Cerrar la ventana actual con el JFrame obtenido
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
        enterButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String Monto = textField1.getText();
                Double cantidad_ingresada;
                if (!Monto.isEmpty()) { // Verifica si hay al menos un carácter para borrar
                    try  {
                        cantidad_ingresada=Double.parseDouble(Monto);
                        if (cantidad_ingresada<=1000) //Limitar la cantidad del deposito
                        {
                            db.setSaldo(saldo_disponible+cantidad_ingresada);
                            JOptionPane.showMessageDialog(Ventana6, "El monto ingresado ha sido depositado con exito!", "Transaccion exitosa", JOptionPane.INFORMATION_MESSAGE);
                        }
                        else
                        {
                            JOptionPane.showMessageDialog(Ventana6, "La cantidad ingresada esta fuera\nde los limites parael deposito!", "Transaccion invalida", JOptionPane.ERROR_MESSAGE);
                        }
                    }
                    catch (NumberFormatException n) {
                        JOptionPane.showMessageDialog(Ventana6, "Ingrese un valor valido antes de continuar\ncon el proceso de deposito!", "Valor invalido o incompleto", JOptionPane.ERROR_MESSAGE);
                    }
                }
                else
                {
                    JOptionPane.showMessageDialog(Ventana6, "Ingrese un valor antes de realizar el deposito!", "Monto invalido", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
    }
}
