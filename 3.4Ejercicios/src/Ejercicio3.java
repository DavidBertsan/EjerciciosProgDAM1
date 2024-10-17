import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        final double Valor_Euros=166.386f;
        Scanner telca=new Scanner(System.in);
        System.out.println("Ingrese el precio en pesetas");
        double pes=telca.nextDouble();
        double euros= pes/Valor_Euros;
        System.out.printf("El precio en euros es %.2f%n",euros);
    }
}
