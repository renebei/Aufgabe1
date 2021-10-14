package de.hsos.prog3.rene.ab01.orchester;

import de.hsos.prog3.rene.ab01.audio.adapter.SimpleAudioPlayerAdapter;

import java.io.IOException;
import java.net.URL;

public class Probe implements Verhalten {
    @Override
    public void spielen(Orchester orchester) {
        SimpleAudioPlayerAdapter p = new SimpleAudioPlayerAdapter();
        for (MusikerIn m : orchester.getMusikerinnen()) {
            try {
                p.einmaligAbspielen(new URL(m.instrument.getAudiodatei()));
            } catch (IOException e) {
                System.err.println("Probe wird abgebrochen");
            }
        }
    }
}
