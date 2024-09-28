import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int dia, mes, anio;
        boolean fechaCorrecta = false;

        System.out.println("Digite el día: ");
        dia = entrada.nextInt();
        System.out.println("Digite el número del mes: ");
        mes = entrada.nextInt();
        System.out.println("Digite el año: ");
        anio = entrada.nextInt();

        if (anio < 0 || anio > 2024) {
            System.out.println("El año es incorrecto.");
        } else if (mes < 1 || mes > 12) {
            System.out.println("El mes es incorrecto.");
        } else if ((mes == 4 || mes == 6 || mes == 9 || mes == 11) && (dia < 1 || dia > 30)) {
            System.out.println("Este mes no puede tener más de 30 días.");
        } else if (mes == 2 && (dia < 1 || dia > 28)) {
            System.out.println("Febrero no puede tener más de 28 días.");
        } else if ((mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) && (dia < 1 || dia > 31)) {
            System.out.println("Este mes no puede tener más de 31 días.");
        } else {
            fechaCorrecta = true;
        }

        if (fechaCorrecta) {
            if (mes == 2 && dia == 28) {
                mes = 3;
                dia = 1;
            } else if ((mes == 4 || mes == 6 || mes == 9 || mes == 11) && dia == 30) {
                mes++;
                dia = 1;
            } else if ((mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10) && dia == 31) {
                mes++;
                dia = 1;
            } else if (mes == 12 && dia == 31) {
                anio++;
                mes = 1;
                dia = 1;
            } else {
                dia++;
            }

            System.out.println("La fecha del día siguiente es: " + dia + "/" + mes + "/" + anio);
        }
    }
}
