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
