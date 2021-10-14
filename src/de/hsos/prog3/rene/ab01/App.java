package de.hsos.prog3.rene.ab01;

import de.hsos.prog3.rene.ab01.orchester.DirigentIn;
import de.hsos.prog3.rene.ab01.orchester.Instrument;
import de.hsos.prog3.rene.ab01.orchester.MusikerIn;
import de.hsos.prog3.rene.ab01.orchester.Orchester;

import java.io.IOException;

public class App {

    public static void main(String[] args) {
        String audioDatei = "All_Together.wav";
        Orchester orchester = new Orchester("Titty Twister", audioDatei);

        DirigentIn rené = new DirigentIn("René");
        orchester.setDirigentIn(rené);

        MusikerIn Emma = new MusikerIn("Emma", Instrument.AKKORDION);
        MusikerIn Gaby = new MusikerIn("Gaby", Instrument.SAXOPHON);
        MusikerIn Lia = new MusikerIn("Lia", Instrument.SCHLAGZEUG);

        orchester.addMusikerIn(Emma);
        orchester.addMusikerIn(Gaby);
        orchester.addMusikerIn(Lia);

        orchester.proben();

        orchester.auftreten(orchester);

    }
}
