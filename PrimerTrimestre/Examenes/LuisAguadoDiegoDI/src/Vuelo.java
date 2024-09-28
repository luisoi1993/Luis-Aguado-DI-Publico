public class Vuelo {
    private int id;
    private String origen;
    private String destino;
    private Avion avionAsignado;
    private Tractor tractorAsignado;
    private int maxPasajeros;
    private int kilometros;

    public Vuelo(int id, String origen, String destino, Avion avionAsignado, Tractor tractorAsignado, int maxPasajeros, int kilometros) {
        this.id = id;
        this.origen = origen;
        this.destino = destino;
        this.avionAsignado = avionAsignado;
        this.tractorAsignado = tractorAsignado;
        this.maxPasajeros = maxPasajeros;
        this.kilometros = kilometros;
    }

    public Avion getAvionAsignado() {
        return avionAsignado;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Vuelo [ID=" + id + ", origen=" + origen + ", destino=" + destino + ", avión=" + avionAsignado + ", tractor=" + tractorAsignado + ", maxPasajeros=" + maxPasajeros + ", km=" + kilometros + "]";
    }
}
