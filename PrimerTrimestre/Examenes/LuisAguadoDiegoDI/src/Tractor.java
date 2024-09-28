public class Tractor {
    private String matricula;
    private String modelo;
    private int capacidadMaletas;

    public Tractor(String matricula, String modelo, int capacidadMaletas) {
        this.matricula = matricula;
        this.modelo = modelo;
        this.capacidadMaletas = capacidadMaletas;
    }

    public int getCapacidadMaletas() {
        return capacidadMaletas;
    }

    @Override
    public String toString() {
        return "Tractor [matricula=" + matricula + ", modelo=" + modelo + ", capacidadMaletas=" + capacidadMaletas + "]";
    }
}

