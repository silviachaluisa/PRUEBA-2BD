import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ventana2 {
    private JLabel titulo;
    private JRadioButton verSaldoRadioButton;
    private JRadioButton retiroRadioButton;
    private JRadioButton depositoRadioButton;
    private JRadioButton salirRadioButton;
    JPanel Ventana2;
    private Datos_bancarios db;


    public Ventana2(Datos_bancarios info) { //Constructo de la clase:Ventana2, que recibe un objeto Datos_bancarios llamado info como parametro
        db=info; //se asigna el objeto info al campo db de la clase Ventana2
        verSaldoRadioButton.addActionListener(new ActionListener() { //Se da Funcionalidad al boton
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame saldo = new JFrame("Saldo de tu cuenta"); //Se crea una nueva instancia
                saldo.setResizable(false); // Evitar que la ventana se pueda cambiar de tamaño
                saldo.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE); // Para no permitir el cierre de la ventana
                saldo.setSize(300, 300);
                saldo.setContentPane(new Ventana4(db).Ventana4);//Se establece el contenido de la ventana como una nueva instancia de Ventana 4
                saldo.setVisible(true);
            }
        });
        retiroRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame retiro = new JFrame("Retirar saldo de tu cuenta");
                retiro.setResizable(false); // Evitar que la ventana se pueda cambiar de tamaño
                retiro.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE); // Para no permitir el cierre de la ventana
                retiro.setSize(300, 300);
                retiro.setContentPane(new Ventana5(info).Ventana5);
                retiro.setVisible(true);
            }
        });

        depositoRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame deposito = new JFrame("Retirar saldo de tu cuenta");
                deposito.setResizable(false); // Evitar que la ventana se pueda cambiar de tamaño
                deposito.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE); // Para no permitir el cierre de la ventana
                deposito.setSize(300, 300);
                deposito.setContentPane(new Ventana6(info).Ventana6);
                deposito.setVisible(true);
            }
        });
        salirRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame ventana = (JFrame) SwingUtilities.getWindowAncestor(Ventana2.this.Ventana2); // Obtener el JFrame de la ventana actual
                ventana.dispose(); // Cerrar la ventana actual con el JFrame obtenido
                JFrame ventana1=new JFrame("Saliendo");
                ventana1.setContentPane(new Ventana3().Ventana3);
                ventana1.setResizable(false); // Evitar que la ventana se pueda cambiar de tamaño
                ventana1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                ventana1.setSize(400,400);
                ventana1.setVisible(true);
            }
        });
    }
}
