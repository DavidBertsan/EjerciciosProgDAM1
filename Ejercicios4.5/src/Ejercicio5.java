import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float ecuacion;
        System.out.println("Que incognita quieres resolver de la ecuacion ax + b= 0 ");
        char incognita = sc.next().charAt(0);
        switch (incognita) {
            case 'a':
                System.out.println("Dime el valor de x y de b");
                float x = sc.nextInt();
                float b = sc.nextInt();
                ecuacion = -b/x;
                System.out.println("el resultado es: " + ecuacion);
                break;
            case 'b':
                System.out.println("Dime el valor de x y de a");
                float a = sc.nextInt();
                x= sc.nextInt();
                ecuacion = -a*x;
                System.out.println("el resultado es: " + ecuacion);
                break;
            case 'x':
                System.out.println("Dime el valor de a y de b");
                a = sc.nextInt();
                b= sc.nextInt();
                ecuacion = -b/a;
                System.out.println("el resultado es: " + ecuacion);
                break;
                default:
                    System.out.println("Los valores no son correctos");


        }


    }
}
