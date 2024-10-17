import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        final int seghora=3600;
        final int segmin=60;
        final int segdia=86400;

        Scanner sc = new Scanner(System.in);
        System.out.println("Que hora es ");

        int hora = sc.nextInt();
        int minuto = sc.nextInt();
        int calcseg=segdia-((hora*seghora)+(minuto*segmin));
        System.out.println("El dia tiene "+calcseg+" segundos");
    }
}
