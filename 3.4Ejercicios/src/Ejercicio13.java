import java.util.Scanner;

import static java.lang.Math.round;

public class Ejercicio13 {
    public static void main(String[] args) {
        final double valor1Examen = 0.4;
        final double valor2Examen = 0.6;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la nota del primer examen: ");
             double nota = sc.nextFloat();
        System.out.println("¿Que nota quieres sacar en el trimestre?: ");
            double notadeseada = sc.nextFloat();
            double CalcNota =(notadeseada-(valor1Examen*nota))/valor2Examen;
            CalcNota= Math.ceil(CalcNota);

        System.out.printf("Para tener un "+notadeseada+" en el trimestre necesitas sacar un "+ CalcNota + " en el segundo examen");

    }
}
