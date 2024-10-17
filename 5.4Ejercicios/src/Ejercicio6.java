public class Ejercicio6 {
    public static void main(String[] args) {
        final int contador = 20;
        int numerofinal = 160;
        int numero = 320;
        do {
                System.out.println(numero);
                numero = numero - contador;

        } while (numero >= numerofinal);
    }
}