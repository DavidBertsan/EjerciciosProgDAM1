import java.util.Scanner;

public class EjercicioPruebaenClase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el primer numero: ");
        String linea=sc.nextLine();
        int x=Integer.parseInt(linea);
        if(x==0){
            System.out.println("El numero es 0");
        }else if(x>0){
            System.out.println("El numero es positivo");
        }else{
            System.out.println("El numero es negativo");
        }

    }
}
