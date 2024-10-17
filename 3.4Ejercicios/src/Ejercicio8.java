import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el numero de horas trabajadas: ");
        int horas = teclado.nextInt();
        int salario = horas * 12;
        System.out.println("La salario es: $"+salario);


    }
}

