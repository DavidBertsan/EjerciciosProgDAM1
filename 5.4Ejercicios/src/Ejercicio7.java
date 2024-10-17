import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int NumCorrect=1234;
        for (int i = 0; i < 3; i++) {
            System.out.println("Introduce la combinacion de la caja fuerte");
            int combi=sc.nextInt();
             //podrias hacer un condicional para asegurar que el usuario haga 4 cifras
            if(combi==NumCorrect){
                System.out.println("La caja fuerte se ha abierto satisfactoriamente");
                break;
            } else{
                System.out.println("Lo siento, no es la combinacion");
            }

        }
    }
}
