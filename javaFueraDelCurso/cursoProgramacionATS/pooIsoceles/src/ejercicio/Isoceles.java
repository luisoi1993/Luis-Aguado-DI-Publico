/*
 Diseñar un programa para trabajar con triangulos isoceles.Para ello
defina los atributos necesarios que se requieren, proporcione métodos
de consulta, un metodo constructor  e implemente metodos  para calcular
el perimetro y el area de un triangulo, ademas implementar un metodo 
que a partir de un arreglo de triangulos devuelva el area del triangulo
de mayor superficie.
 */
package ejercicio;

/**
 *
 * @author luis
 */
public class Isoceles {
    private double lado;
    private double base;
    
    //constructor
    public Isoceles(double base, double lado){
        this.base = base;
        this.lado = lado;
    }
    
    
    public double obtenerArea(){
        double area = (base*Math.sqrt((lado*lado)- ((base*base)/4)))/2;
        return area;
    }
    
    public double obtenerPerimetro(){
        double perimetro = 2*lado +base;
        return perimetro;
    }
    
    public String mostrarDatos(){
        return "El lado es: "+lado+"La base es: "+base+"El perimetro es :"+obtenerPerimetro()+"El area es: "+obtenerArea();
    }
}
