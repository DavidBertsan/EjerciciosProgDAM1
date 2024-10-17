import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int notafinal=10;
        char opcion;
        System.out.println("Cuestionario de 10 Preguntas: ");
        System.out.println("Pregunta numero 1:Que es la RAM");
        System.out.println("Opcion A: Memoria Cache ");
        System.out.println("Opcion B: Random Acces Memory ");
        System.out.println("Opcion C: Read Only Memory  ");
        opcion = sc.next().charAt(0);
        switch (opcion) {
            case 'A':
              notafinal=notafinal-1;
                break;
            case 'B':
                break;
            case 'C':
               notafinal=notafinal-1;
                break;

        }
        System.out.println("Pregunta numero 2:Que es un SGBD");
        System.out.println("Opcion A:Es un software de gestion de base de datos ");
        System.out.println("Opcion B:Es una base de datos en orientacion a objetos");
        System.out.println("Opcion C:Es un software de paginas webs");
        opcion = sc.next().charAt(0);
        switch (opcion) {
            case 'A':
                break;
            case 'B':
                notafinal=notafinal-1;
                break;
            case 'C':
                notafinal=notafinal-1;
                break;

        }
        System.out.println("Pregunta numero 3: SQL es un lenguaje de marcas");
        System.out.println("Opcion A:Falso ");
        System.out.println("Opcion B: Verdadero");
        System.out.println("Opcion C:Falso ");
        opcion = sc.next().charAt(0);
        switch (opcion) {
            case 'A':
                notafinal=notafinal-1;
                break;
            case 'B':
                break;
            case 'C':
                notafinal=notafinal-1;
                break;

        }
        System.out.println("Pregunta numero 4:Que es la funcion if");
        System.out.println("Opcion A: Una funcion repetitiva");
        System.out.println("Opcion B: Una funcion modular");
        System.out.println("Opcion C: Una funcion secuencial");
        opcion = sc.next().charAt(0);
        switch (opcion) {
            case 'A':
                break;
            case 'B':
                notafinal=notafinal-1;
                break;
            case 'C':
                notafinal=notafinal-1;
                break;

        }
        System.out.println("Pregunta numero 5:Que comando coje un modulo privado y lo aplica a un objeto");
        System.out.println("Opcion A: getter/setter ");
        System.out.println("Opcion B: get/set ");
        System.out.println("Opcion C: apply/disban");
        opcion = sc.next().charAt(0);
        switch (opcion) {
            case 'A':
                break;
            case 'B':
                notafinal=notafinal-1;
                break;
            case 'C':
                notafinal=notafinal-1;
                break;

        }
        System.out.println("Pregunta numero 6: Que es una variable ");
        System.out.println("Opcion A:Una fuente de alamecinamiento ");
        System.out.println("Opcion B: Un registro en la memoria ");
        System.out.println("Opcion C: un huevo");
        opcion = sc.next().charAt(0);
        switch (opcion) {
            case 'A':
                notafinal=notafinal-1;
                break;
            case 'B':
                break;
            case 'C':
                notafinal=notafinal-1;
                break;

        }
        System.out.println("Pregunta numero 7:Una variable puede ser definidas varias veces?");
        System.out.println("Opcion A: Si");
        System.out.println("Opcion B: No");
        System.out.println("Opcion C: Depende del codigo");
        opcion = sc.next().charAt(0);
        switch (opcion) {
            case 'A':
                notafinal=notafinal-1;
                break;
            case 'B':
                break;
            case 'C':
                notafinal=notafinal-1;
                break;

        }
        System.out.println("Pregunta numero 8:HTML y CSS es lo mismo?");
        System.out.println("Opcion A: No uno se dedica a la estrucutura y otro al diseño, pero son los dos lenguajes de marcas");
        System.out.println("Opcion B: Si los dos son lenguajes");
        System.out.println("Opcion C: No,CSS es solo para paginas webs especificas");
        opcion = sc.next().charAt(0);
        switch (opcion) {
            case 'A':

                break;
            case 'B':
                notafinal=notafinal-1;
                break;
            case 'C':
                notafinal=notafinal-1;
                break;

        }
        System.out.println("Pregunta numero 9:Que es un dato, registro,tabla y campo?");
        System.out.println("Opcion A: Componentes de un sistema de gestion de base de datos ");
        System.out.println("Opcion B: Componentes de una base de dato");
        System.out.println("Opcion C: Formatos de la informacion guardada en umna variable ");
        opcion = sc.next().charAt(0);
        switch (opcion) {
            case 'A':
                notafinal=notafinal-1;
                break;
            case 'B':
                break;
            case 'C':
                notafinal=notafinal-1;
                break;

        }
        System.out.println("Pregunta numero 10:En los diagramas de clase como se llaman las clases que viene de otras?");
        System.out.println("Opcion A: Hijos");
        System.out.println("Opcion B: Clases Secundarias ");
        System.out.println("Opcion C: Subclases ");
        opcion = sc.next().charAt(0);
        switch (opcion) {
            case 'A':
                notafinal=notafinal-1;
                break;
            case 'B':
                notafinal=notafinal-1;
                break;
            case 'C':

                break;

        }
        System.out.println("La nota del examen es"+notafinal);
    }
}
