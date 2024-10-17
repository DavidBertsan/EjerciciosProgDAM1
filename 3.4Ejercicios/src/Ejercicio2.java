import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner tecla = new Scanner(System.in);
        final double ValorPeseta = 166.386f;
        double pesetas;
        float euros;
        for (int i = 0; i < 4; i++) {
            
        }
        
        // si usamos while tenemos que inicializar la variable para poder entrar 1 vez minimo en el bucle.
        do {

        //while(euros>0) {

            System.out.printf("Introduce el precio en euros: ");
            euros = tecla.nextFloat();
            if (euros != 0) {
                pesetas = euros * ValorPeseta;
                System.out.printf("El precio en pesetas es: %.0f%n", pesetas);
            }




            } while (euros != 0);
        }
    }
