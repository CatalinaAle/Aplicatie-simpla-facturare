/*
Welcome to JDoodle!

You can execute code here in 88 languages. Right now you’re in the Java IDE.

  1. Click the orange Execute button ▶ to execute the sample code below and see how it works.

  2. Want help writing or debugging code? Type a query into JDroid on the right hand side ---------------->

  3.Try the menu buttons on the left. Save your file, share code with friends and open saved projects.

Want to change languages? Try the search bar up the top.
*/
import java.util.ArrayList;
import java.util.Scanner;

class Produs {
    String nume;
    int cantitate;
    double pret;

    Produs(String nume, int cantitate, double pret) {
        this.nume = nume;
        this.cantitate = cantitate;
        this.pret = pret;
    }

    double total() {
        return cantitate * pret;
    }
}

public class FacturaApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Produs> produse = new ArrayList<>();
        String raspuns;

        do {
            System.out.print("Nume produs: ");
            String nume = sc.nextLine();

            System.out.print("Cantitate: ");
            int cant = Integer.parseInt(sc.nextLine());

            System.out.print("Preț unitar: ");
            double pret = Double.parseDouble(sc.nextLine());

            produse.add(new Produs(nume, cant, pret));

            System.out.print("Adaugi alt produs? (da/nu): ");
            raspuns = sc.nextLine();
        } while (raspuns.equalsIgnoreCase("da"));

        double totalFactura = 0;
        System.out.println("\n--- FACTURA ---");
        for (Produs p : produse) {
            System.out.println(p.cantitate + "x " + p.nume + " = " + p.total() + " RON");
            totalFactura += p.total();
        }
        System.out.println("TOTAL: " + totalFactura + " RON");
    }
}
