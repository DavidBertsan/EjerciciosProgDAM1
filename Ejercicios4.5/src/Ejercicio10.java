import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime el dia que naciste: ");
        int dia = sc.nextInt();
        sc.nextLine();// esta linea ChatGPT
        System.out.println("Dime el mes que naciste: ");
        String mes=sc.nextLine();

        if(dia>=21 && mes.equals("marzo") || dia<=19 && mes.equals("abril")) {
            System.out.println("Eres Aries");
        }else if(dia>=20 && mes.equals("abril") || dia<=21 && mes.equals("mayo")){
            System.out.println("Eres Tauro");
        }else if(dia>=21 && mes.equals("mayo") || dia<20 && mes.equals("junio")){
            System.out.println("Eres Gemins");
        }else if(dia>21 && mes.equals("junio") || dia<22 && mes.equals("julio")){
            System.out.println("Eres Cancer");
        }else if(dia>23 && mes.equals("julio") || dia<=22 && mes.equals("agosto")){
            System.out.println("Eres Leo");
        }else if(dia>23 && mes.equals("agosto") || dia<=22 && mes.equals("septiembre")){
            System.out.println("Eres Virgo");
        }else if(dia>23 && mes.equals("septiembre") || dia<=22 && mes.equals("octubre")){
            System.out.println("Eres Libra");
        }else if(dia>23 && mes.equals("octubre") || dia<=21 && mes.equals("noviembre")){
            System.out.println("Eres Escorpio");
        }else if(dia>22 && mes.equals("noviembre") || dia<=21 && mes.equals("diciembre")){
            System.out.println("Eres Sagitario");
        }else if(dia>22 && mes.equals("diciembre") || dia<=19 && mes.equals("enero")){
            System.out.println("Eres Capricornio");
        }else if(dia>20 && mes.equals("enero") || dia<=18 && mes.equals("febrero")){
            System.out.println("Eres Acuario");
        }else if(dia>19 && mes.equals("febrero") || dia<=20 && mes.equals("marzo")){
            System.out.println("Eres Piscis");
        }else{
            System.out.println("No se puede ejecutar el programa");
        }


    }
}
