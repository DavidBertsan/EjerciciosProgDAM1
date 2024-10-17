import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el primer numero: ");
        int num = sc.nextInt();
        for (int i = 0; i < 5; i++) {
            num++;
            System.out.println(num);
            int cuadrado=num*num;
            int cubo=num*num*num;

            System.out.print(cuadrado+"    "+cubo+"\n");



        }

    }
}

