public class empleado extends persona {
    private String cargo;

    public empleado(String nombre, String apellido, String identificacion, String cargo) {
        super(nombre, apellido, identificacion);
        this.cargo = cargo;
    }

    public String getCargo() {
        return cargo;
    }
}
