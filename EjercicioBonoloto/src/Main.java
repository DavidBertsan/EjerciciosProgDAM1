
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Bienvenido al juego de la Bonoloto");
                                                                    //primero generamos un array para el boletin de la IA
        int[] boletoIA =new int[6];
        boolean valorRepetidoIA = false;                            //el boolean no sirve para "salir de la carcel"
        int numeroIA;                                               // para introducir los resultados filtrados al array

        for (int i = 0; i < 6; i++) {

            do {
                valorRepetidoIA = false;                            // el primer for para introducir los valores
                numeroIA = random.nextInt(49) + 1;
                for (int j = 0; j <= i; j++) {                      //el do while sirve como carcel para hacer que si el valor boolean es False, se repita el generar numeros.

                    if (numeroIA == boletoIA[j]) {                   //dentro del do while un for donde se revise con cada valor si el numeroIA generado es igual

                        valorRepetidoIA = true;
                                                                    // si es igual no sales del do ya que cambias el bolean a True
                        break;
                    }

                }
            } while(valorRepetidoIA);
            boletoIA[i] = numeroIA;
        }

                                                                      //ahora pasas al boleto del usuaio
        int[] boleto = new int[6];
        int numero;
        boolean ValorRepetido=false;                                //El boolean sirve para verificar el estado del seguro par a que no se repitan en cada valor

        for (int i = 0; i < 6; i++) {                              //Bucle para introducir las variables en la Array
            do {                                                   // el do while sirve como "carcel" al usuario hasta que meta un valor correcto
                System.out.printf("Dime el numero "+(i+1)+"º:");
                ValorRepetido = false;
                numero = sc.nextInt();
                if (numero <= 0 || numero > 49) {
                    System.out.println("Numero invalido");
                }


                for (int k = 0; k <= i; k++) {
                    if (boleto[k] == numero) {                         // aqui aseguro que no sea repetido restando la vuelta al bucle
                        System.out.println("No se puede repetir numero");
                        i--;
                        ValorRepetido = true;
                    }
                }
            } while (numero <= 0 || numero > 49);

            if(!ValorRepetido){                                 // una vez salga del do while introduciendo un valor correcto se sumara ese valor al array
                boleto[i] = numero;

            }

        }

        int acierto=0;                                              // Esta parte revisa el  numero de aciertos y si coincide se van sumando al contador(int acierto)
        for (int i = 0; i < boleto.length; i++) {
            for(int j = 0; j < boletoIA.length; j++) {

                if(boletoIA[j]==boleto[i]){
                    acierto++;
                    break;
                }
            }

        }

        System.out.println("Tu boleto: ");
        System.out.println(Arrays.toString(boleto));
        System.out.println("El boleto de la IA: ");
        System.out.println(Arrays.toString(boletoIA));
        System.out.println("Has acertado  "+acierto+" veces! Muy Bien :)");         //Mostrar los aciertos junto a los boletos de los 2


    }
}