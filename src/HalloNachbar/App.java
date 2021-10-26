package HalloNachbar;

import java.util.HashSet;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        String answer = "y";
        HashSet<Nachbar> nachbarn = new HashSet<Nachbar>();
        Scanner scan = new Scanner(System.in);

        while (answer.equals("y") || nachbarn.size() < 4) {
            System.out.println("Wen wollen sie als ihren Nachbar hinzufügen?");
            System.out.println("Vorname: ");
            String vorname = scan.nextLine();
            System.out.println("Nachname: ");
            String nachname = scan.nextLine();
            nachbarn.add(new Nachbar(vorname, nachname));
            System.out.println("weiter Nachbarn? y/n");
            answer = scan.nextLine();
            if (nachbarn.size() == 8) break;
        }

        for (Nachbar n : nachbarn) {
            System.out.println("Hallo " + n);
        }
    }
}
