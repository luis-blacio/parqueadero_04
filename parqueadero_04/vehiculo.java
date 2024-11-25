public abstract class vehiculo {
    private final String matricula;
    private final String modelo;
    private final String color;

    public vehiculo(String matricula, String modelo, String color) {
        this.matricula = matricula;
        this.modelo = modelo;
        this.color = color;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getModelo() {
        return modelo;
    }

    public String getColor() {
        return color;
    }

    public static class automovil {
    }
}
