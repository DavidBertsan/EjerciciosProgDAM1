import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            System.out.println("Ingrese la primera nota ");
            double nota = sc.nextDouble();
            System.out.println("Ingrese la segunda nota ");
            double notaseg = sc.nextDouble();
            System.out.println("Ingrese la tercera nota ");
            double notater = sc.nextDouble();
            double finalnota;
            finalnota = (nota+ notaseg+notater)/ 3;
            if (finalnota<5){
                System.out.printf("Tienes un insuficiente con un %.2f",finalnota);
            }else if(finalnota>=5 && finalnota<6){
                System.out.printf("Tienes un suficiente con un %.2f",finalnota);
            }else if(finalnota>=6 && finalnota<7){
                System.out.printf("Tienes un bien con un %.2f",finalnota);
            } else if(finalnota>=7 && finalnota<9){
                System.out.printf("Tienes un Notable con un %.2f",finalnota);
            }else if(finalnota>=9 && finalnota<10){
                System.out.printf("Tienes un Excelente con un %.2f",finalnota);
            }else{
                System.out.printf("Las notas introducidas no son correctas");
            }

        }
    }




