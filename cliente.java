public class Cliente extends Persona {
    private boolean esRegular;
    private String metodoPago;

    public Cliente(String nombre, String apellido, String identificacion, boolean esRegular, String metodoPago) {
        super(nombre, apellido, identificacion);
        this.esRegular = esRegular;
        this.metodoPago = metodoPago;
    }

    public boolean isEsRegular() {
        return esRegular;
    }

    public String getMetodoPago() {
        return metodoPago;
    }
}
