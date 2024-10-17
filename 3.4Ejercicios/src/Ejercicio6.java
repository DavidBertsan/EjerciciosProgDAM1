import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner tecla=new Scanner(System.in);
        System.out.println("Ingrese la base del triangulo");
        double base=tecla.nextInt();
        System.out.println("Ingrese la altura del triangulo");
        double altura=tecla.nextInt();
        double area=(base*altura)/2;
        System.out.printf("El area del triangulo es: %.2f%n",area);
    }
}
