import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca la base imponible: ");
        double base = sc.nextInt();
        System.out.println("Introduzca el tipo de IVA(general,reducido o superreducido): ");
        String tipoIVA = sc.next();
        System.out.println("Introduzca el codigo promocional(nopro,mitad,meno5 o 5porc):");
        String codigoProm = sc.next();


        switch (tipoIVA) {
            case "general":
                double Ivageneral = 0.21;
                double CalcIva = base * Ivageneral;
                System.out.println("IVA= " + CalcIva);
                base = CalcIva + base;
                System.out.println("Precio con IVA: " + base);
                break;
            case "reducido":
                double Ivareducido = 0.10;
                double CalcIva2 = base * Ivareducido;
                System.out.println("IVA= " + CalcIva2);
                base = CalcIva2 + base;
                System.out.println("Precio con IVA: " + base);
                break;
            case "superreducido":
                double IvaSuperreducido = 0.04;
                double CalcIva3 = base * IvaSuperreducido;
                System.out.println("IVA= " + CalcIva3);
                base = CalcIva3 + base;
                System.out.println("Precio con IVA: " + base);
                break;

        }
        switch (codigoProm) {
            case "nopro":
                System.out.println("Cod.Promo(nopro)= No tiene promocion");
                System.out.println("TOTAL= " + base);
                break;
            case "mitad":
                double PromMitad = base / 2;
                base = PromMitad - base;
                System.out.println("Cod.Promo(mitad)= " + PromMitad);
                System.out.println("TOTAL= " + base);
                break;
            case "meno5":
                int menos = 5;
                double PromMeno5 = base - menos;
                base = base + PromMeno5;
                System.out.println("Cod.Promo(meno5)= " + PromMeno5);
                System.out.println("TOTAL= " + base);
                break;
            case "5porc":
                double porcs = 0.05;
                double Prom5porc = base - porcs;
                base = Prom5porc - base;
                System.out.println("Cod.Promo(meno5)= " + Prom5porc);
                System.out.println("TOTAL= " + base);
                break;
        }

    }
}
