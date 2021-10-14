package de.hsos.prog3.rene.ab01.orchester;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class Orchester {

    private String bezeichnung;
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

    public Collection<MusikerIn> getMusikerinnen() {
        return musikerinnen;
    }

    public void proben() {
        this.verhalten = new Probe();
    }

    public void spielen() {
        this.verhalten = new Konzert();
    }

    public void auftreten(Orchester or) {
        verhalten.spielen(or);
    }

    public URL getAudiodateiKonzert() throws MalformedURLException {
        return new URL(audioDateiKonzert) ;
    }



}
