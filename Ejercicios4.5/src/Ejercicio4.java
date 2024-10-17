import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int salario;
        System.out.println("Cuantas horas trabajas? ");
        int horastrabajadas = sc.nextInt();
        if(horastrabajadas <= 40) {
            salario = horastrabajadas * 12;
            System.out.println("Tu salario es de: " + salario);

        }else{
           int horasmaximas= 40;
           int horasextras = horastrabajadas - horasmaximas;

           salario = (horasmaximas*12) + (horasextras *16);

            System.out.println("Tu salario es de: " + salario);



        }
    }
}
