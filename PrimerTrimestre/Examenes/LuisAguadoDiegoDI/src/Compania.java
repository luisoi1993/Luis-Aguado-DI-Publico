import java.util.ArrayList;
import java.util.List;

public class Compania {
    private List<Avion> aviones;
    private List<Tractor> tractores;
    private List<Vuelo> vuelos;
    private int idVuelo = 1;

    public Compania() {
        aviones = new ArrayList<>();
        tractores = new ArrayList<>();
        vuelos = new ArrayList<>();
    }

    public void agregarAvion(Avion avion) {
        aviones.add(avion);
    }

    public void agregarTractor(Tractor tractor) {
        tractores.add(tractor);
    }

    public void agregarVuelo(String origen, String destino, int maxPasajeros, int kilometros) {
        Avion avionDisponible = null;
        Tractor tractorDisponible = null;


        for (Avion avion : aviones) {
            if (avion.getCapacidadCombustible() >= kilometros && avion.getCapacidadPasajeros() >= maxPasajeros && avion.puedeAsignarVuelo()) {
                avionDisponible = avion;
                break;
            }
        }


        for (Tractor tractor : tractores) {
            if (tractor.getCapacidadMaletas() >= maxPasajeros) {
                tractorDisponible = tractor;
                break;
            }
        }

        if (avionDisponible != null && tractorDisponible != null) {
            Vuelo nuevoVuelo = new Vuelo(idVuelo++, origen, destino, avionDisponible, tractorDisponible, maxPasajeros, kilometros);
            vuelos.add(nuevoVuelo);
            avionDisponible.asignarVuelo();
            System.out.println("Vuelo agregado: " + nuevoVuelo);
        } else {
            System.out.println("No hay aviones o tractores disponibles para este vuelo.");
        }
    }

    public void listarAviones() {
        System.out.println("Aviones disponibles:");
        for (Avion avion : aviones) {
            System.out.println(avion);
        }
    }

    public void listarTractores() {
        System.out.println("Tractores disponibles:");
        for (Tractor tractor : tractores) {
            System.out.println(tractor);
        }
    }

    public void listarVuelos() {
        System.out.println("Vuelos programados:");
        for (Vuelo vuelo : vuelos) {
            System.out.println(vuelo);
        }
    }

    public void listarVuelosPorAvion(String matricula) {
        System.out.println("Vuelos del avión con matrícula " + matricula + ":");
        for (Vuelo vuelo : vuelos) {
            if (vuelo.getAvionAsignado().getMatricula().equals(matricula)) {
                System.out.println(vuelo);
            }
        }
    }

    public void cancelarVuelo(int idVuelo) {
        vuelos.removeIf(vuelo -> vuelo.getId() == idVuelo);
        System.out.println("Vuelo con ID " + idVuelo + " cancelado.");
    }
}


