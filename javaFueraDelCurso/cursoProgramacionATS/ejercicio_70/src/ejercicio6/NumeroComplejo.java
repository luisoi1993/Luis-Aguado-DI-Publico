/*
 Contruir un programa para trabajar con 2 numeros complejos, implemente el 
siguiente menu.
1.sumar dos numeros complejos.
2.Multiplicar 2 numeros complejos.
3.Comparar 2 numeros complejos(iguales o no)
4.Multiplicar un numero complejos por un entero
 */
package ejercicio6;

public class NumeroComplejo {
    private double real;
    private double imaginaria;

    public NumeroComplejo(double real, double imaginaria) {
        this.real = real;
        this.imaginaria = imaginaria;
    }

    public double getReal() {
        return real;
    }

    public double getImaginaria() {
        return imaginaria;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public void setImaginaria(double imaginaria) {
        this.imaginaria = imaginaria;
    }

    @Override
    public String toString() {
        return real + " + " + imaginaria + "i";
    }
    public NumeroComplejo sumar(NumeroComplejo otro) {
    double nuevaReal = this.real + otro.getReal();
    double nuevaImaginaria = this.imaginaria + otro.getImaginaria();
    return new NumeroComplejo(nuevaReal, nuevaImaginaria);
    }
    public NumeroComplejo multiplicar(NumeroComplejo otro) {
    double nuevaReal = this.real * otro.getReal() - this.imaginaria * otro.getImaginaria();
    double nuevaImaginaria = this.real * otro.getImaginaria() + this.imaginaria * otro.getReal();
    return new NumeroComplejo(nuevaReal, nuevaImaginaria);
    }

    public boolean esIgual(NumeroComplejo otro) {
    return this.real == otro.getReal() && this.imaginaria == otro.getImaginaria();
    }
    
    public NumeroComplejo multiplicarPorEntero(int entero) {
    double nuevaReal = this.real * entero;
    double nuevaImaginaria = this.imaginaria * entero;
    return new NumeroComplejo(nuevaReal, nuevaImaginaria);
}


}
