import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner tecla=new Scanner(System.in);
        System.out.println("Ingrese dos numeros: ");
        double num1=tecla.nextInt();
        double num2=tecla.nextInt();
        System.out.printf("La suma es= %.2f%n",(num1+num2));
        System.out.printf("La resta es= %.2f%n",(num1-num2));
        System.out.printf("La multiplicacion es= %.2f%n",(num1*num2));
        System.out.printf("La division es= %.2f%n",(num1/num2));

    }
}
