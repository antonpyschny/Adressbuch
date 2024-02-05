import java.util.Scanner;

public class Anschrift {

    String vorname;
    String nachname;
    String strasse;
    String hausNummer;
    Integer plz;
    String ort;
    String email;

    Anschrift() {
        eingaben();
        menu();
    }

    Anschrift(String vorname, String nachname, String strasse,
              String hausNummer, Integer plz, String ort, String email) {
        this.vorname = vorname;
        this.nachname = nachname;
        this.strasse = strasse;
        this.hausNummer = hausNummer;
        this.plz = plz;
        this.ort = ort;
        this.email = email;
    }

    void eingaben() {
        Scanner eingabe = new Scanner(System.in);
        System.out.print("Bitte geben Sie Ihren Vornamen ein: ");
        vorname = eingabe.nextLine();
        System.out.print("Nachnamen: ");
        nachname = eingabe.nextLine();
        System.out.print("Straße: ");
        strasse = eingabe.nextLine();
        System.out.print("Hausnummer: ");
        hausNummer = eingabe.nextLine();
        System.out.print("PLZ: ");
        plz = eingabe.nextInt();
        eingabe.nextLine();
        System.out.print("Ort: ");
        ort = eingabe.nextLine();
        System.out.print("E-Mail: ");
        email = eingabe.nextLine();
    }

    void ausgabe() {
        System.out.println(vorname.substring(0,1).toUpperCase() + " " + nachname.toUpperCase() + "\n"
                + "Adresse: \n"
                + strasse + " " + hausNummer + "\n"
                + plz + " " + ort + "\n"
                + "Email: " + email.toLowerCase());
    }

    void menu() {
        String menu = ("Bitte wählen Sie aus:\n"
                + "1. Bearbeiten\n"
                + "2. Ausgabe\n"
                + "3. Ende\n");

        Scanner console = new Scanner(System.in);
        int selection = 0;
        do {
            System.out.println(menu);
            selection = console.nextInt();

            switch (selection) {
                case 1:
                    System.out.println("-----------------------");
                    eingaben();
                    break;
                case 2:
                    System.out.println("-----------------------");
                    ausgabe();
                    break;
                case 3:
                    System.out.println("Einen Schönen Tag!");
                    break;
            }
            System.out.println("-----------------------");

        } while (selection != 3);
        console.close();
    }

    public static void main(String[] args) {
        Anschrift person1 = new Anschrift();
    }
}