import java.util.Arrays;
import java.util.Scanner;

public class EjerciciodeArraysNumEnt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[3];
        int Guardar;
        double valordouble;
        int suma=0;
        for (int i = 0; i < 3; i++) {
            System.out.println("Introduce el numero entero del array");
            String valor = sc.nextLine();
            valordouble = Double.parseDouble(valor);

            //if (valordouble % 2 == 0) {
                numeros[i] = Integer.parseInt(valor);
           // }
            for (int j = 0; j < 3; j++) {
                Guardar = 0;
              if(numeros[j] > numeros[i]) {
                  Guardar = numeros[j];


              }


            }

            for (int l = 0; l < numeros.length; l++) {
                suma =  numeros[l] ++;
                suma++;

            }



        }


        System.out.println(Arrays.toString(numeros));
        System.out.println(suma);




    }
}
