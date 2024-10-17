import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        final double pi = 3.141519;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el radio del cono: ");
        double radio = teclado.nextDouble();
        System.out.println("Ingrese la altura del cono: ");
        double altura = teclado.nextDouble();
        double area= (0.333)*pi*(radio*radio)*altura;
        System.out.printf("El area del cono es: %.2f%n",area);


    }
}
