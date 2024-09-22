/*
 Diseñar un programa para trabajar con triangulos isoceles. Para ello defina los
atributos necesarios que se requieren, proporcione metodos de consulta, un metodo
constructor e implemente metodos para calcular el perimetro y el area de un
triangulo, ademas implementar un metodo que a partir de un arreglo de triangulos
devuelva el area del triangulo de mayor superficie

 */
package ejercicio5;

/**
 *
 * @author luis
 */
public class Triangola_Isoceles {
    private double base;
    private double lado;

    public Triangola_Isoceles(double base, double lado) {
        this.base = base;
        this.lado = lado;
    }
    
    public double obtenerPerimetro(){
        double perimetro = 2*lado+base;
        return perimetro;
    }
    
    public double obtenerArea(){
        double area = (base*Math.sqrt((lado*lado)- ((base*base)/4)))/2;
        return area;
    }
    
    public String mostrarDatos(){
        return "Base: "+base+"\nLado: "+lado+"\nPerimetro: "+obtenerPerimetro()+"\nArea: "+obtenerArea()+"\n";
    }
}
