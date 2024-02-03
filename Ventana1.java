import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ventana1 {
    JPanel Bienvenido;
    private JButton Boton1;
    private JButton Boton3;
    private JButton Boton7;
    private JButton Boton8;
    private JButton Boton2;
    private JButton Boton4;
    private JButton Boton5;
    private JButton Boton6;
    private JButton Boton9;
    private JButton Boton10;
    private JButton Boton11;
    private JPasswordField PSW1;
    private JButton borrarButton;
    Datos_bancarios datos;

    public Ventana1() {
        datos=new Datos_bancarios("202121334", 1000);
        PSW1.setEditable(false); // Esto evita que el usuario puedda editar el campo de la contraseña por teclado
        Boton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String ingreso = new String(PSW1.getPassword()); // Obtener la contraseña y convertirla a String
                PSW1.setText(ingreso+"1"); // Setear el texto del JPasswordField como ingreso y el numero del boton seleccionada
            }
        });
        Boton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String ingreso = new String(PSW1.getPassword()); // Obtener la contraseña y convertirla a String
                PSW1.setText(ingreso+"2"); // Setear el texto del JPasswordField como ingreso y el numero del boton seleccionada
            }
        });
        Boton3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String ingreso = new String(PSW1.getPassword()); // Obtener la contraseña y convertirla a String
                PSW1.setText(ingreso+"3"); // Setear el texto del JPasswordField como ingreso y el numero del boton seleccionada
            }
        });
        Boton4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String ingreso = new String(PSW1.getPassword()); // Obtener la contraseña y convertirla a String
                PSW1.setText(ingreso+"4"); // Setear el texto del JPasswordField como ingreso y el numero del boton seleccionada
            }
        });
        Boton5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String ingreso = new String(PSW1.getPassword()); // Obtener la contraseña y convertirla a String
                PSW1.setText(ingreso+"5"); // Setear el texto del JPasswordField como ingreso y el numero del boton seleccionada
            }
        });
        Boton6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String ingreso = new String(PSW1.getPassword()); // Obtener la contraseña y convertirla a String
                PSW1.setText(ingreso+"6"); // Setear el texto del JPasswordField como ingreso y el numero del boton seleccionada
            }
        });
        Boton7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String ingreso = new String(PSW1.getPassword()); // Obtener la contraseña y convertirla a String
                PSW1.setText(ingreso+"7"); // Setear el texto del JPasswordField como ingreso y el numero del boton seleccionada
            }
        });
        Boton8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String ingreso = new String(PSW1.getPassword()); // Obtener la contraseña y convertirla a String
                PSW1.setText(ingreso+"8"); // Setear el texto del JPasswordField como ingreso y el numero del boton seleccionada
            }
        });
        Boton9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String ingreso = new String(PSW1.getPassword()); // Obtener la contraseña y convertirla a String
                PSW1.setText(ingreso+"9"); // Setear el texto del JPasswordField como ingreso y el numero del boton seleccionada
            }
        });
        Boton10.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String ingreso = new String(PSW1.getPassword()); // Obtener la contraseña y convertirla a String
                PSW1.setText(ingreso+"0"); // Setear el texto del JPasswordField como ingreso y el numero del boton seleccionada
            }
        });
        Boton11.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String credencial = new String (PSW1.getPassword());
                if (credencial.equals(datos.getClaveAcceso()))
                {
                    JOptionPane.showMessageDialog(Bienvenido, "Acceso correcto", "Credenciales Validas!", JOptionPane.INFORMATION_MESSAGE);
                    JFrame inicio = (JFrame) SwingUtilities.getWindowAncestor(Ventana1.this.Bienvenido); // Obtener el JFrame de la ventana actual
                    inicio.dispose(); // Cerrar la ventana actual con el JFrame obtenido
                    JFrame ventana=new JFrame("Menu de acciones");
                    ventana.setResizable(false); // Evitar que la ventana se pueda cambiar de tamaño
                    ventana.setSize(300, 300);
                    ventana.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE); // Para no permitir el cierre de la ventana
                    ventana.setContentPane(new Ventana2(datos).Ventana2);
                    ventana.setVisible(true);
                }
                else
                {
                    JOptionPane.showMessageDialog(Bienvenido, "Acceso denegado!", "Credenciales invalidas", JOptionPane.ERROR_MESSAGE);
                    PSW1.setText("");
                }
            }
        });
        borrarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                char[] passwordChars = PSW1.getPassword();
                if (passwordChars.length > 0) { // Verificar si hay al menos un carácter para borrar
                    char[] newPasswordChars = new char[passwordChars.length - 1]; // Crear un nuevo array sin el último carácter
                    System.arraycopy(passwordChars, 0, newPasswordChars, 0, newPasswordChars.length);
                    PSW1.setText(new String(newPasswordChars)); // Establecer el nuevo array como la nueva contraseña
                }
               //PSW1.setText(""); //Borrar toda la contraseña escrita

            }
        });
    }
}
