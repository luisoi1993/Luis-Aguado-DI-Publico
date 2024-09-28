public class Persona {
    private String nombre;
    private String apellido;
    private String dni;
    private int edad;
    private double peso;
    private int altura;
    private String genero;  // nuevo atributo

    // Constructor con todos los datos, incluyendo el género
    public Persona(String nombre, String apellido, String dni, int edad, double peso, int altura, String genero) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.edad = edad;
        this.peso = peso;
        this.altura = altura;
        this.genero = genero;
    }

    // Constructor que permite crear una persona con nombre y apellidos, el resto por defecto
    public Persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = "111111111X";
        this.edad = 0;
        this.peso = 0.0;
        this.altura = 0;
        this.genero = "No definido";  // Se asigna un valor por defecto
    }

    // Constructor sin datos, con valores por defecto
    public Persona() {
        this.nombre = "Datos por defecto";
        this.apellido = "Datos por defecto";
        this.dni = "111111111X";
        this.edad = 0;
        this.peso = 0.0;
        this.altura = 0;
        this.genero = "No definido";  // Género por defecto
    }

    // Getters y Setters
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

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    // Método para incrementar la edad
    public void incrementarEdad(int incremento) {
        this.edad += incremento;
    }

    // Método para calcular el IMC
    public double calcularIMC() {
        return peso / (Math.pow(altura / 100.0, 2)); // Altura en metros
    }

    // Método para mostrar el estado físico basado en el IMC y el género
    public void mostrarEstadoFisico() {
        double imc = calcularIMC();
        String estado;

        if ("mujer".equalsIgnoreCase(genero)) {
            if (imc < 20) {
                estado = "Bajo peso";
            } else if (imc < 25) {
                estado = "Normopeso";
            } else if (imc < 30) {
                estado = "Sobrepeso";
            } else if (imc < 40) {
                estado = "Obesidad";
            } else {
                estado = "Obesidad mórbida";
            }
        } else if ("hombre".equalsIgnoreCase(genero)) {
            if (imc < 20) {
                estado = "Bajo peso";
            } else if (imc < 27) {
                estado = "Normopeso";
            } else if (imc < 30) {
                estado = "Sobrepeso";
            } else if (imc < 40) {
                estado = "Obesidad";
            } else {
                estado = "Obesidad mórbida";
            }
        } else {
            estado = "Género no definido";
        }

        System.out.println("IMC: " + imc + " - Estado físico: " + estado);
    }
}
