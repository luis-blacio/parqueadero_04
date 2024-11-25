public class Reserva {
    private Cliente cliente;
    private PlazaEstacionamiento plaza;
    private String fecha;

    public Reserva(Cliente cliente, PlazaEstacionamiento plaza, String fecha) {
        this.cliente = cliente;
        this.plaza = plaza;
        this.fecha = fecha;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public PlazaEstacionamiento getPlaza() {
        return plaza;
    }

    public String getFecha() {
        return fecha;
    }

    public void confirmarReserva() {
        plaza.ocupar(null);
    }
}
