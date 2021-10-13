package de.hsos.prog3.rene.ab01.orchester;

import java.util.Collection;

public class Orchester {
    private String bezeichnung;




    private String audioDateiKonzert;
    private Collection<MusikerIn> musikerinnen;

    Orchester() {
    }

    public void addDirigentIn(DirigentIn dirigent) {

    }
    public void addMusikerIn(MusikerIn musiker) {

    }
    public Collection<MusikerIn> getMusikerinnen () {
        return musikerinnen;
    }
}
