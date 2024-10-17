import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Ingresa una hora: ");
        int hora=sc.nextInt();
        if(hora>=6 && hora<=12){
            System.out.println("Buenos dias");
        } else if (hora>=13 && hora<=20) {
            System.out.println("Buenas Tardes");
        }else {
            System.out.println("Buenas Noches");
        }
    }
}
