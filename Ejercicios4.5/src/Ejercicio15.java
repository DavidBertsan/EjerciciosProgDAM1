import java.util.Scanner;

public class Ejercicio15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hacia que lado quieres imprimir la piramide ?: ");
        String options=sc.nextLine();
        System.out.println("Ingrese el caracter para rellenar la piramide ");
        char caracter = sc.next().charAt(0);


        switch (options) {
            case "izquierda":
                for (int i = 1; i <=9; i++) {
                    System.out.println(" ");
                    for (int k = 1; k <= (2 * i - 1); k++) {
                        System.out.print(caracter);

                    }
                }break;
            case "derecha":
                for (int i = 9; i >=1 ; i++) {
                    for (int j = 1; j <=9; j++) {
                        System.out.println("  ");
                    }
                    for (int k = 1; k <= (2 * i - 1); k++) {
                        System.out.print(caracter);
                    }
                }break;

                }
        }


        }


