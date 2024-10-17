import java.util.Scanner;

public class Ejercicio1 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un dia de la semana: ");
        String dia = sc.nextLine();
        switch (dia) {
            case "Lunes":
                System.out.println("Toca Sistemas Informaticos");
                break;
            case "Martes":
                System.out.println("Toca Sistemas Informaticos/2h");
                break;
            case "Miercoles":
                System.out.println("Toca Programacion/2h");
                break;
            case "Jueves":
                System.out.println("Toca Base de datos/2h");
                break;
            case "Viernes":
                System.out.println("Toca Programacion/2h");
                break;
            case "Sabado":
                System.out.println("No hay clase es sabado");
                break;
            case "Domingo":
                System.out.println("No hay clase es domingo");
                break;

            default:
                System.out.println("No existe ese  dia de la semana");


        }
    }
}
