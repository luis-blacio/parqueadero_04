import java.util.ArrayList;

public class Parqueadero {
    private String nombre;
    private ArrayList<Piso> pisos;
    private ArrayList<Empleado> empleados;

    public Parqueadero(String nombre) {
        this.nombre = nombre;
        this.pisos = new ArrayList<>();
        this.empleados = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public ArrayList<Piso> getPisos() {
        return pisos;
    }

    public ArrayList<Empleado> getEmpleados() {
        return empleados;
    }

    public void agregarPiso(Piso piso) {
        pisos.add(piso);
    }

    public void agregarEmpleado(Empleado empleado) {
        empleados.add(empleado);
    }
}
