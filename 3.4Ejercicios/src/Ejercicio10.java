import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
            final int valorbite=1024;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Ingrese el numero de Mb ");
        double mb=scanner.nextInt();
        double kb=mb*valorbite;
        System.out.printf("Convertidos en %.2f%n",kb);
    }
}
