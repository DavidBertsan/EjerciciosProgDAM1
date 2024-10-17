import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        boolean a=true;
        boolean b=false;
        boolean c=true;
        System.out.println(a&&b);
        System.out.println(a||b);
        System.out.println(!b);
        System.out.println((a && c) || b);
            //PRUEBA DE CLASE DE UN ARRAY
        Scanner sc = new Scanner(System.in);
        int[] num1=new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("Introduce valores para guarda en el array");
            num1[i]=sc.nextInt();
            System.out.println("Estos son los valores?: "+num1[0]+" "+num1[1]+" "+num1[2]+" "+num1[3]+" "+num1[4]);
        }
        int[] num2=new int[5];
         num2= num1;
        System.out.println("Valores: "+num2[0]+" "+num2[1]+" "+num2[2]);
    }
}
