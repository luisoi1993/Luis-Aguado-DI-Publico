/*Crea una clase con la siguiente definición UML
* Persona
* +nombre
* +apellido
* +dni
* +teléfono
* +edad
* ----------------------------------------
* +mostrarDatos()
* +setAtributo()
* +getAtributo()
*
* Por defecto todos los métodos sin tratamiento tienen un retorno de void, es decir que no retornan nada,
* tan solo realizan las ejecuciones que tienen marcadas dentro del método.*/

public class Main {
    public static void main(String[] args) {
        Persona persona = new Persona();

        persona.setNombre("Juan");
        persona.setApellido("Pérez");
        persona.setDni("12345678A");
        persona.setTelefono(123456789);
        persona.setEdad(30);

        persona.mostrarDatos();
    }
}