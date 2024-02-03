import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ventana2 {
    private JLabel titulo;
    private JRadioButton verSaldoRadioButton;
    private JRadioButton retiroRadioButton;
    private JRadioButton depositoRadioButton;
    private JRadioButton SALIRRadioButton;
    JPanel Ventana2;


    public Ventana2() {
        verSaldoRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame saldo = new JFrame("Saldo de tu cuenta");
                saldo.setSize(300, 300);
                saldo.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                saldo.setContentPane(new Ventana4().Ventan4);
                saldo.setVisible(true);
            }
        });
        retiroRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame retiro = new JFrame("Retirar saldo de tu cuenta");
                retiro.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                retiro.setSize(300, 300);
                retiro.setContentPane(new Ventana5().Ventana5);
                retiro.setVisible(true);
            }
        });
    }
}
