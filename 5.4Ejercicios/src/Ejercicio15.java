import java.util.Scanner;

public class Ejercicio15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce la base: ");
        int base = sc.nextInt();

        System.out.println("Introduce un exponente: ");
        int exponente = sc.nextInt();

        for (int i = 1; i <= exponente; i++) {
            System.out.println(base+"^"+i);
        }


    }
}
