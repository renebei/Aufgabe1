package de.hsos.prog3.rene.ab01;

import de.hsos.prog3.rene.ab01.orchester.DirigentIn;
import de.hsos.prog3.rene.ab01.orchester.Instrument;
import de.hsos.prog3.rene.ab01.orchester.MusikerIn;
import de.hsos.prog3.rene.ab01.orchester.Orchester;

public class App {

    public static void main(String[] args) {
        String audioDatei = "/All_Together.wav";
        Orchester orchester = new Orchester("Musikmacherei", audioDatei);

        DirigentIn rené = new DirigentIn("René");
        orchester.setDirigentIn(rené);

        MusikerIn Emma = new MusikerIn("Emma", Instrument.AKKORDION);
        MusikerIn Gaby = new MusikerIn("Gaby", Instrument.SAXOPHON);
        MusikerIn Lia = new MusikerIn("Lia", Instrument.SCHLAGZEUG);

        orchester.addMusikerIn(Emma);
        orchester.addMusikerIn(Gaby);
        orchester.addMusikerIn(Lia);


        System.out.println("Proben");
        orchester.proben();
        orchester.spielen();

        System.out.println("Konzertstart");
        orchester.auftreten();
        orchester.spielen();

    }
}
