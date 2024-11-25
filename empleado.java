public class Empleado extends Persona {
    private String cargo;

    public Empleado(String nombre, String apellido, String identificacion, String cargo) {
        super(nombre, apellido, identificacion);
        this.cargo = cargo;
    }

    public String getCargo() {
        return cargo;
    }
}
