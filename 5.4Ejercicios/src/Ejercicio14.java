import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int calc=1;

        System.out.println("Dame la base: ");
        int base = sc.nextInt();

        System.out.println("Dame el exponente: ");
        int exponente = sc.nextInt();

        for (int i = 1; i <= exponente; i++) {
            calc=calc*base;

        }
        System.out.println(calc);

    }

}
