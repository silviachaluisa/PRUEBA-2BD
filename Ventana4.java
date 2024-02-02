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
                JFrame ventana4=new JFrame("Menu");
                ventana4.setContentPane(new Ventana4().Ventan4);
                ventana4.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                ventana4.setSize(300,300);
                ventana4.setVisible(true);

            }
        });
    }
}
