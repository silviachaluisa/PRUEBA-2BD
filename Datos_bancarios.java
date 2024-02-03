public class Datos_bancarios {
    // Atributos
    private String clave_acceso;
    private double saldo;

    // Constructores
    public Datos_bancarios(String clave_acceso, double saldo) {
        this.clave_acceso = clave_acceso;
        this.saldo = saldo;
    }

    // Metodo Getter
    public String getClaveAcceso() {return clave_acceso;}
    public double getsaldo() {return saldo;}

    // Metodo Setter
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}