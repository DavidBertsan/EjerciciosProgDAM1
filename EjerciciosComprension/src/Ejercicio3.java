
public class Ejercicio3 {
    public static int numGlobal=50;
    public static void main(String[] args) {
        int numLocal=10;

        mostraNumeros(numLocal);

    }
    public static void mostraNumeros(int numLocal) {

        System.out.println(numGlobal);

        System.out.println(numLocal);
    }
}

