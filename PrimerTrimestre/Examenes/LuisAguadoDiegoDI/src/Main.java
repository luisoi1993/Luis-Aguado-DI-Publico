import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Compania compania = new Compania();


        compania.agregarAvion(new Avion("Airbus A320", "EC-MXU", 186, 24210));
        compania.agregarAvion(new Avion("Boeing 737", "N737ER", 215, 26020));
        compania.agregarAvion(new Avion("Embraer E190", "PR-EHD", 114, 13000));
        compania.agregarAvion(new Avion("Airbus A350", "F-WXWB", 350, 141000));
        compania.agregarAvion(new Avion("Boeing 787 Dreamliner", "JA873A", 335, 126917));
        compania.agregarAvion(new Avion("Bombardier CRJ700", "C-FRJX", 78, 8700));


        compania.agregarTractor(new Tractor("Linde P40 C", "ES-LP40C", 80));
        compania.agregarTractor(new Tractor("Tecnacar VTA 100", "ES-VTA100", 100));
        compania.agregarTractor(new Tractor("Linde P60 C", "ES-LP60C", 120));
        compania.agregarTractor(new Tractor("Tecnacar VTA 300", "ES-VTA300", 150));
        compania.agregarTractor(new Tractor("Linde P40 C B", "ES-LP40CB", 90));
        compania.agregarTractor(new Tractor("Tecnacar VTA 400", "ES-VTA400", 200));

        Scanner entrada = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("----- Menú de Gestión de Vuelos -----");
            System.out.println("1. Agregar vuelo");
            System.out.println("2. Listar aviones disponibles");
            System.out.println("3. Listar tractores disponibles");
            System.out.println("4. Listar vuelos programados");
            System.out.println("5. Listar vuelos por avión");
            System.out.println("6. Cancelar vuelo");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = entrada.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese origen del vuelo: ");
                    String origen = entrada.next();
                    System.out.print("Ingrese destino del vuelo: ");
                    String destino = entrada.next();
                    System.out.print("Ingrese número de pasajeros: ");
                    int pasajeros = entrada.nextInt();
                    System.out.print("Ingrese número de kilómetros del vuelo: ");
                    int kilometros = entrada.nextInt();
                    compania.agregarVuelo(origen, destino, pasajeros, kilometros);
                    break;
                case 2:
                    compania.listarAviones();
                    break;
                case 3:
                    compania.listarTractores();
                    break;
                case 4:
                    compania.listarVuelos();
                    break;
                case 5:
                    System.out.print("Ingrese la matrícula del avión: ");
                    String matriculaAvion = entrada.next();
                    compania.listarVuelosPorAvion(matriculaAvion);
                    break;
                case 6:
                    System.out.print("Ingrese el ID del vuelo a cancelar: ");
                    int idVuelo = entrada.nextInt();
                    compania.cancelarVuelo(idVuelo);
                    break;
                case 0:
                    System.out.println("Saliendo del sistema...");
                    break;
                default:
                    System.out.println("Opción inválida. Intente de nuevo.");
                    break;
            }
        } while (opcion != 0);
    }
}
