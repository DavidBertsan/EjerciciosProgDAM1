import java.util.Scanner;

public class EjercicioNum {
    public static void main(String[] args) {
        Scanner tecla = new Scanner(System.in);
        System.out.println("Que valor quieres en el incremento");
        int increm =tecla.nextInt();
        System.out.println("Que valor final quieres");
        int valorF =tecla.nextInt();
        for (int i = 0; i<=valorF; i=i+increm) {

            System.out.println(i);

        }
    }
}
