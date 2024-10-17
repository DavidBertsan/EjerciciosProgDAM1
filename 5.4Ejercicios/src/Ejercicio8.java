import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa el numero para saber su tabla de multiplicacion");
        int numero = sc.nextInt();
        for (int i = 0; i <= 10; i++) {
            int multiplicacion= numero * i;
            System.out.println(numero+"x"+i+"="+multiplicacion);
            
        }
    }
}
