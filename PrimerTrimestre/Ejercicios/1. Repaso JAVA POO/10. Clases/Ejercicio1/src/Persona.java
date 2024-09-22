/* +nombre
 * +apellido
 * +dni
 * +teléfono
 * +edad
 * ----------------------------------------
 * +mostrarDatos()
 * +setAtributo()
 * +getAtributo()
 * */

public class Persona {
    private String nombre;
    private String apellido;
    private String dni;
    private int telefono;
    private int edad;

    public void mostrarDatos(){
        System.out.println("El nombre es: " + nombre);
        System.out.println("El apeliido es:" + apellido );
        System.out.println("El dni es: "+dni);
        System.out.println("El telefono es: "+telefono);
        System.out.println("La edad es: " + edad);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
