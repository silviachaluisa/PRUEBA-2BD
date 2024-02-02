import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLOutput;

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

    public Ventana1() {
        Boton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String ingreso = new String(PSW1.getPassword()); // Obtener la contraseña y convertirla a String
                PSW1.setText(ingreso+"1"); // Setear el texto del JPasswordField como ingreso y el numero del boton seleccionada
                System.out.println("Ingreso: "+ ingreso);
            }
        });
        Boton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String ingreso = new String(PSW1.getPassword()); // Obtener la contraseña y convertirla a String
                PSW1.setText(ingreso+"2"); // Setear el texto del JPasswordField como ingreso y el numero del boton seleccionada
                System.out.println("Ingreso: "+ ingreso);
            }
        });
        Boton3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String ingreso = new String(PSW1.getPassword()); // Obtener la contraseña y convertirla a String
                PSW1.setText(ingreso+"3"); // Setear el texto del JPasswordField como ingreso y el numero del boton seleccionada
                System.out.println("Ingreso: "+ ingreso);
            }
        });
        Boton4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String ingreso = new String(PSW1.getPassword()); // Obtener la contraseña y convertirla a String
                PSW1.setText(ingreso+"4"); // Setear el texto del JPasswordField como ingreso y el numero del boton seleccionada
                System.out.println("Ingreso: "+ ingreso);
            }
        });
        Boton5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String ingreso = new String(PSW1.getPassword()); // Obtener la contraseña y convertirla a String
                PSW1.setText(ingreso+"5"); // Setear el texto del JPasswordField como ingreso y el numero del boton seleccionada
                System.out.println("Ingreso: "+ ingreso);
            }
        });
        Boton6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String ingreso = new String(PSW1.getPassword()); // Obtener la contraseña y convertirla a String
                PSW1.setText(ingreso+"6"); // Setear el texto del JPasswordField como ingreso y el numero del boton seleccionada
                System.out.println("Ingreso: "+ ingreso);
            }
        });
        Boton7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String ingreso = new String(PSW1.getPassword()); // Obtener la contraseña y convertirla a String
                PSW1.setText(ingreso+"7"); // Setear el texto del JPasswordField como ingreso y el numero del boton seleccionada
                System.out.println("Ingreso: "+ ingreso);
            }
        });
        Boton8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String ingreso = new String(PSW1.getPassword()); // Obtener la contraseña y convertirla a String
                PSW1.setText(ingreso+"8"); // Setear el texto del JPasswordField como ingreso y el numero del boton seleccionada
                System.out.println("Ingreso: "+ ingreso);
            }
        });
        Boton9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String ingreso = new String(PSW1.getPassword()); // Obtener la contraseña y convertirla a String
                PSW1.setText(ingreso+"9"); // Setear el texto del JPasswordField como ingreso y el numero del boton seleccionada
                System.out.println("Ingreso: "+ ingreso);
            }
        });
        Boton10.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String ingreso = new String(PSW1.getPassword()); // Obtener la contraseña y convertirla a String
                PSW1.setText(ingreso+"0"); // Setear el texto del JPasswordField como ingreso y el numero del boton seleccionada
                System.out.println("Ingreso: "+ ingreso);
            }
        });
        Boton11.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String credencial = new String (PSW1.getPassword());
                if (credencial.equals("202121334"))
                {
                    JOptionPane.showMessageDialog(Bienvenido, "Acceso correcto", "Credenciales Validas!", JOptionPane.INFORMATION_MESSAGE);
                    JFrame ventana=new JFrame("Transacciones!");
                    ventana.setSize(300, 300);
                    ventana.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                    ventana.setContentPane(new Ventana2().Ventana2);
                    ventana.setVisible(true);
                }
                else
                {
                    JOptionPane.showMessageDialog(Bienvenido, "Acceso denegado!", "Credenciales invalidas", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
    }
}
