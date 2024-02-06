public class Datos_bancarios {
    // Atributos
    private String clave_acceso; //Atributp privado que almacena la clase acceso
    private double saldo;

    // Constructores
    public Datos_bancarios(String clave_acceso, double saldo) { //Constructor que inicializa la instancia de la clase
        this.clave_acceso = clave_acceso;
        this.saldo = saldo;
    }

    // Metodo Getter
    public String getClaveAcceso() {return clave_acceso;} //devuelve la clave de acceso actual
    public double getsaldo() {return saldo;}//devuelve el saldo actual

    // Metodo Setter
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    } //Metodo publico que permite modificar el saldo almacenado en la istancia de la clase
}