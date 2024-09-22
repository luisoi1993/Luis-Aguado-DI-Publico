/*Crea un método que se llame saludarPerso el cual admita un
parámetro de tipo string y muestre por consola el mensaje
"Hola NombreIntroducido".*/

public class Main {
    public static void main(String[] args) {
        saludarPersona("Luis");
    }

    public static void saludarPersona(String nombre){
        System.out.println("Hola "+nombre);
    }
}