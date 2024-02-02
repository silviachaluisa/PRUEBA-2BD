import javax.swing.*;

public class Main {
    public static void main (String[] args){
        JFrame ventana1=new JFrame("BIENVENIDO");
        ventana1.setContentPane(new Ventana1().Bienvenido);
        ventana1.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        ventana1.setSize(400,400);
        ventana1.setVisible(true);


    }
}
