/*Crea un programa que permita al usuario ingresar un código de
producto (como una cadena de caracteres) y, utilizando una sentencia switch,
muestre el nombre del producto y su precio correspondiente*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // Solicitar al usuario que ingrese el código del producto
        System.out.println("Ingrese el código del producto:");
        String codigo = entrada.nextLine();

        // Variable para almacenar el nombre y precio del producto
        String nombreProducto;
        double precioProducto;

        // Utilizar switch para determinar el nombre y precio del producto
        switch (codigo) {
            case "P001":
                nombreProducto = "Laptop";
                precioProducto = 1200.00;
                break;
            case "P002":
                nombreProducto = "Smartphone";
                precioProducto = 800.00;
                break;
            case "P003":
                nombreProducto = "Tableta";
                precioProducto = 400.00;
                break;
            case "P004":
                nombreProducto = "Auriculares";
                precioProducto = 150.00;
                break;
            case "P005":
                nombreProducto = "Reloj Inteligente";
                precioProducto = 250.00;
                break;
            default:
                nombreProducto = "Producto no encontrado";
                precioProducto = 0.00;
        }

        // Mostrar el resultado
        if (precioProducto > 0) {
            System.out.println("Nombre del producto: " + nombreProducto);
            System.out.println("Precio del producto: $" + precioProducto);
        } else {
            System.out.println(nombreProducto);
        }

        entrada.close(); // Cerrar el escáner
    }
}