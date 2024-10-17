import java.util.Scanner;

import static java.lang.Math.sqrt;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Ingresa el valor de a");
        int a=sc.nextInt();
        System.out.println("Ingresa el valor de b");
        int b=sc.nextInt();
        System.out.println("Ingresa el valor de c");
        int c=sc.nextInt();
        double x;
        x=(-b*(sqrt(b*b+4*a*c)))/(2*a);
        System.out.println("El valor de x es: "+x);

    }
}
