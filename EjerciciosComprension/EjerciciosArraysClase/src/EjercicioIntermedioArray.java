import java.util.Arrays;
import java.util.Scanner;

public class EjercicioIntermedioArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el tamaño del array");
        int n = scanner.nextInt();
        int[] numeros = new int[n];
        int[] numerosInvertidos = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Introduce el valor " + (i+1) + " del array: ");
            numeros[i] = scanner.nextInt();

            for (int j = 0; j < n; j++){
                numerosInvertidos[j] = numeros[numeros.length-1-j];
                System.out.println("Array invertido: "+ Arrays.toString(numerosInvertidos));
            }
            }

        System.out.println("Array original: " + Arrays.toString(numeros));
        System.out.println("Array invertido: "+ Arrays.toString(numerosInvertidos));
        }

    }

