package de.hsos.prog3.rene.ab01.orchester;

import de.hsos.prog3.rene.ab01.audio.adapter.SimpleAudioPlayerAdapter;

import java.io.IOException;
import java.net.URL;
import java.util.LinkedHashSet;
import java.util.Set;

public class Orchester {

    private final String bezeichnung;
    private String audioDateiKonzert;
    private Set<MusikerIn> musikerinnen = new LinkedHashSet<>();
    private DirigentIn dirigent;
    private Verhalten verhalten;

    public Orchester(String bezeichnung, String audioDateiKonzert) {
        this.bezeichnung = bezeichnung;
        this.audioDateiKonzert = audioDateiKonzert;
    }

    public void setDirigentIn(DirigentIn dirigent) {
        this.dirigent = dirigent;
    }

    public void addMusikerIn(MusikerIn musiker) {
        musikerinnen.add(musiker);
    }

    public Set<MusikerIn> getMusikerinnen() {
        return musikerinnen;
    }

    public void proben() {
        this.verhalten = new Probe();
    }

    public void auftreten() {
        this.verhalten = new Konzert();
    }

    public void spielen() {
        verhalten.spielen(this);
    }

    public URL getAudiodateiKonzert() {
        return Orchester.class.getResource(audioDateiKonzert);
    }

    /*1.5
    - Finde, dass dieser Ansatz an dieser Stelle keine gute Option ist.
    - Sehr vollgepackte Klasse. Verzweigungen von Klassen und Interface hin und her.
    - Verhalten ist erweiterbar. Bei diesem Ansatz wäre ein eigenes Package auch eine Option
     */

    private class Konzert implements Verhalten {
        @Override
        public void spielen(Orchester orchester) {
            SimpleAudioPlayerAdapter p = new SimpleAudioPlayerAdapter();
            try {
                p.einmaligAbspielen(orchester.getAudiodateiKonzert());
            } catch (IOException e) {
                System.err.println("Auftritt wird abgebrochen");
            }
        }
    }

    private class Probe implements Verhalten {
        @Override
        public void spielen(Orchester orchester) {
            SimpleAudioPlayerAdapter p = new SimpleAudioPlayerAdapter();
            p.tonAus();
            for (MusikerIn m : orchester.getMusikerinnen()) {
                try {
                    p.einmaligAbspielen(Probe.class.getResource(m.getInstrument().getAudiodatei()));
                } catch (IOException e) {
                    System.err.println("Probe wird abgebrochen");
                }
            }
        }
    }

}
