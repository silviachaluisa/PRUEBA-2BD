import javax.swing.*;

public class Main {
    public static void main (String[] args){
        JFrame ventana1=new JFrame("BIENVENIDO AL BANCO DEL BUHO");
        ventana1.setContentPane(new Ventana1().Bienvenido);
        ventana1.setResizable(false); // Evitar que la ventana se pueda cambiar de tamaño
        ventana1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana1.setSize(400,400);
        ventana1.setVisible(true);
    }
}
