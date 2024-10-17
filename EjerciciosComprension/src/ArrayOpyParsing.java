import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayOpyParsing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();

        int[] numeros = new int[n];
        int sumador = 0;

        for (int i = 0; i < num; i++) {

            System.out.println("Ingrasa el numero " + (i + 1) + " del array:");
            String valor = sc.nextLine();

            // EL PARSING
            double valor2 = Double.parseDouble(valor);

            if (valor2 % 1 == 0) {

                int valorint = Integer.parseInt(valor);
                numeros[i] = valorint;
            } else {
                System.out.println("El numero tiene que ser entero");
                i--;
                valor = null;
            }

            // SUMADOR
            sumador+= numeros[i];



        }

        int promedio = sumador / num;
        System.out.println(promedio);

        System.out.println(Arrays.toString(numeros));
        System.out.println(sumador);
        //ORDENAR
        for (int i = 0; i < num; i++) {
            int index = i;
            for (int j = i + 1; j < num; j++) {

                if (numeros[j] < numeros[index]) {
                    index = j;
                }

            }
            //CHATGPT
            int temp=numeros[i];
            numeros[i]=numeros[index];
            numeros[index]=temp;

            //una vez creado el array ordenar estos numeros

        }
        System.out.println(Arrays.toString(numeros));
    }
}
