import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        final float divisor=10;
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese un numero para saber cuantos digitos tiene: ");
        float numero=sc.nextFloat();

        float op=0;
        float contador;
        for (contador = 1; contador>op; contador++) {
             op=numero/divisor;


        }
        System.out.println(contador);


    }
}
