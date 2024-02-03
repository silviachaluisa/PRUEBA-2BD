import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ventana4 {
    JPanel Ventan4;
    private JButton BotonMenu1;

    public Ventana4() {
        BotonMenu1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                JFrame ventana1=new JFrame("Saldo de tu cuenta");
                ventana1.setContentPane(new Ventana2().Ventana2);
                ventana1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                ventana1.setSize(300,300);
                ventana1.setVisible(true);


            }
        });
    }
}
