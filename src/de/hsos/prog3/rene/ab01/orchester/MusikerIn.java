package de.hsos.prog3.rene.ab01.orchester;

public class MusikerIn extends Mitglied {

    private Instrument instrument;

    public MusikerIn(String name, Instrument ins) {
        super(name);
        this.instrument = ins;
    }

    Instrument getInstrument() {
        return instrument;
    }
}
