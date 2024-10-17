import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros=new int[10];

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Ingrese un numero/hasta 10: ");
            numeros[i] = sc.nextInt();
            if(numeros[i]>0){
                System.out.println("Los numeros positivos son: "+numeros[i]);
            }else{
                System.out.println("Los numeros negativos son: "+numeros[i]);
            }
        }


    }
}
