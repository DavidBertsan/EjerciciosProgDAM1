import java.util.Scanner;

import static java.lang.Math.sqrt;

public class Ejercicio6 {
    public static void main(String[] args) {
        final double g=9.8;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa la altura por la que cae el objeto ");
        double h = sc.nextInt();
        double formula= sqrt(2*h)/g;
        System.out.printf("Tardara %.2f segundos", formula);

    }
}
