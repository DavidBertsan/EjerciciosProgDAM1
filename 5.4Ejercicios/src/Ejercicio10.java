import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int media;
        int suma=0;
        int i=0;// variable contador
        int num;
        System.out.println("Ingrese el primer numero: ");
        num = sc.nextInt();
        while(num>0){
            suma+=num;
            i++;
            System.out.println("Ingrese el primer numero: ");
            num = sc.nextInt();

        }
        media=suma/i;
        System.out.println(media);
    }
}
