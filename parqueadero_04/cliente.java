public class cliente extends persona {
    private boolean esRegular;
    private String metodoPago;

    public cliente(String nombre, String apellido, String identificacion, boolean esRegular, String metodoPago) {
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
