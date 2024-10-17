import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner tecla=new Scanner(System.in);
        System.out.println("Ingrese la base imponible");
        double base=tecla.nextDouble();
        double factura=base+(base*0.21);
        System.out.printf("La factura es %.2f%n",factura);
    }
}
