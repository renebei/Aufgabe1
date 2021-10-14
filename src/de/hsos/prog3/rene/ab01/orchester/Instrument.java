package de.hsos.prog3.rene.ab01.orchester;

public enum Instrument { SAXOPHON, SCHLAGZEUG, AKKORDION;

    private String audiodatei;

    Instrument(String audiodatei) {
        this.audiodatei = audiodatei;
    }

    Instrument() {

    }

    public String getAudiodatei() {
        return audiodatei;
    }


}
