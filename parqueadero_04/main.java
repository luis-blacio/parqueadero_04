public class Main {
    public static void main(String[] args) {
        // Crear parqueadero
        Parqueadero parqueadero = new Parqueadero("Parqueadero Central");

        // Crear pisos
        Piso piso1 = new Piso(1);
        Piso piso2 = new Piso(2);

        piso1.agregarPlaza(new PlazaEstacionamiento(1));
        piso2.agregarPlaza(new PlazaEstacionamiento(2));

        parqueadero.agregarPiso(piso1);
        parqueadero.agregarPiso(piso2);

        // Crear cliente
        Cliente cliente = new Cliente("Juan", "Pérez", "123", true, "Tarjeta");

        // Crear reserva
        Reserva reserva = new Reserva(cliente, piso1.getPlazas().get(0), "2024-11-25");
        reserva.confirmarReserva();
    }
}
