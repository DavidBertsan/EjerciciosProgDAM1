import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static int n;
    public static void Creararray(int[][] array) {



         n=array.length;
        for (int i = 0; i < n; i++) {
            System.out.print(i+1);
            for (int j = 0; j < n; j++) {

                System.out.print("[ ]");
            }
            System.out.println();
        }


    }

    public static void Disparar(int[][] array) {
         n=array.length;
        int repetir;
        do {
            repetir=1;
            System.out.print("Valor X ");
            int x = sc.nextInt();
            System.out.print("Valor y ");
            int y = sc.nextInt();
            if (x < n && y < n) {
                array[y][x] = 1;
            } else {
                return;
            }

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (array[i][j] == 1) {
                        System.out.print("[x]");
                    } else {
                        System.out.print("[ ]");
                    }
                }
                System.out.println();
            }
            System.out.println("Quieres volver a disparar?Presiona el 0 ");
             repetir = sc.nextInt();
        }while (repetir==0);


    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa el tamaño del array");
        n = sc.nextInt();
        int[][] array = new int[n][n];

        Creararray(array);
        Disparar(array);
        System.out.println("Adios.");
    }
}