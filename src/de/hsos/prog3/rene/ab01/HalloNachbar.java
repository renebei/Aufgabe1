package de.hsos.prog3.rene.ab01;

import java.util.HashSet;
import java.util.Set;

public class HalloNachbar {

    public static void main(String[] args) {
        Nachbar a = new Nachbar("Emma", "Wegner");
        Nachbar b = new Nachbar("Lia", "Siegbert");
        Nachbar c = new Nachbar("Megan", "Diekmann");
        Nachbar d = new Nachbar("Jessica", "Pankov");

        Set<Nachbar> nachbarn = new HashSet<>();
        nachbarn.add(a);
        nachbarn.add(b);
        nachbarn.add(c);
        nachbarn.add(d);

    }

    static class Nachbar {
        private String Name;
        private String Vorname;

        Nachbar(String Vorname, String Name) {
            this.Name = Name;
            this.Vorname = Vorname;
        }
    }
}


