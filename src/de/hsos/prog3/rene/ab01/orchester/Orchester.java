package de.hsos.prog3.rene.ab01.orchester;

import java.net.URL;
import java.util.HashSet;
import java.util.Set;

public class Orchester {

    private final String bezeichnung;
    private String audioDateiKonzert;
    private Set<MusikerIn> musikerinnen = new HashSet<>();
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
}
