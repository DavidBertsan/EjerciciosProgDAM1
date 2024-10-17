import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner tecla=new Scanner(System.in);
        System.out.println("Ingresa la base del rectangulo= ");
        Double base=tecla.nextDouble();
        System.out.println("Ingresa la altura del rectangulo= ");
        Double altura=tecla.nextDouble();
        double area=base*altura;
        System.out.printf("El area del rectangulo es: %.2f%n",area);
    }
}
