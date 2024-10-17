import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el primer numero: ");
        int num = sc.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        int num2 = sc.nextInt();
        System.out.println("Ingrese el tercer numero: ");
        int num3 = sc.nextInt();
        if (num>num2 && num2>num3 ) {
            System.out.println(num+ ">"+num2+">"+num3);
        }else if (num2>num && num>num3){
            System.out.println(num2+ ">"+num+">"+num3);
        }else if (num3>num2 && num<num2){
            System.out.println(num3+ ">"+num2+">"+num);
        }// Hay que hacerlo con 6 if mas
    }
}
