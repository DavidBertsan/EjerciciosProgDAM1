import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el primer numero: ");
        int num = sc.nextInt();
        if (num%2==0) {// Operador Modulo evalua si el resto de una division es 0
            System.out.println("El numero es par ");
        }else{
            System.out.println("El numero es impar ");
        }
        if (num%5==0  ) {
            System.out.println("Es divisible entre 5");
        }else{
            System.out.println("No es divisible entre 5");
        }
    }
}
