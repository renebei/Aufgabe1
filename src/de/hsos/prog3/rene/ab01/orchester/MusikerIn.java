package de.hsos.prog3.rene.ab01.orchester;

public class MusikerIn extends Mitglied {

    Instrument instrument;

    MusikerIn(String name, Instrument ins) {
        super(name);
        this.instrument = ins;
    }
}
