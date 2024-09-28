public class Avion {
    private String matricula;
    private String modelo;
    private int capacidadCombustible; // en litros
    private int capacidadPasajeros;
    private int vuelosAsignados = 0;

    public Avion(String matricula, String modelo, int capacidadCombustible, int capacidadPasajeros) {
        this.matricula = matricula;
        this.modelo = modelo;
        this.capacidadCombustible = capacidadCombustible;
        this.capacidadPasajeros = capacidadPasajeros;
    }

    public String getMatricula() {
        return matricula;
    }

    public int getCapacidadCombustible() {
        return capacidadCombustible;
    }

    public int getCapacidadPasajeros() {
        return capacidadPasajeros;
    }

    public boolean puedeAsignarVuelo() {
        return vuelosAsignados < 3;
    }

    public void asignarVuelo() {
        vuelosAsignados++;
    }

    @Override
    public String toString() {
        return "Avion [matricula=" + matricula + ", modelo=" + modelo + ", capacidadCombustible=" + capacidadCombustible + ", capacidadPasajeros=" + capacidadPasajeros + "]";
    }
}
