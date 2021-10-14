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

    Orchester(String bezeichnung, String audioDateiKonzert) {
        this.bezeichnung = bezeichnung;
        this.audioDateiKonzert = audioDateiKonzert;
    }

    public void addDirigentIn(DirigentIn dirigent) {
        this.dirigent = dirigent;
    }

    public void addMusikerIn(MusikerIn musiker) {
        musikerinnen.add(musiker);
    }

    public Collection<MusikerIn> getMusikerinnen() {
        return musikerinnen;
    }

    public void proben() {}

    public void spielen() {}

    public void auftreten() {}

    public URL getAudiodateiKonzert() throws MalformedURLException {
        return new URL(audioDateiKonzert) ;
    }



}
