import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        final int valorbites=1024;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el numero de Kb : ");
        float kb = sc.nextInt();
        float mb=kb/valorbites;

        System.out.printf("Ingrese el numero de Mb : %.2f%n",mb);
    }
}
