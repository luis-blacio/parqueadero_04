public class PlazaEstacionamiento {
    private final int numero;
    private boolean ocupada;
    private Vehiculo vehiculo;

    public PlazaEstacionamiento(int numero) {
        this.numero = numero;
        this.ocupada = false;
        this.vehiculo = null;
    }

    public int getNumero() {
        return numero;
    }

    public boolean isOcupada() {
        return ocupada;
    }

    public void ocupar(Vehiculo vehiculo) {
        if (!ocupada) {
            this.vehiculo = vehiculo;
            ocupada = true;
        } else {
            System.out.println("Plaza ya ocupada.");
        }
    }

    public void liberar() {
        if (ocupada) {
            vehiculo = null;
            ocupada = false;
        } else {
            System.out.println("Plaza ya libre.");
        }
    }
}
