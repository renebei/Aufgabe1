package de.hsos.prog3.rene.ab01.audio.adapter;

import de.hsos.prog3.audio.SimpleAudioPlayer;
import de.hsos.prog3.rene.ab01.audio.StdAudioPlayer;

import java.io.IOException;
import java.net.URL;

public class SimpleAudioPlayerAdapter implements StdAudioPlayer {
    boolean mute;

    @Override
    public void einmaligAbspielen(URL url) throws IOException {
        SimpleAudioPlayer play = new SimpleAudioPlayer(url);
        play.setDebug(mute);
        play.verboseLogging(true);
        play.play(0);
    }

    @Override
    public void wiederholtAbspielen(URL url, int wiederholungen) throws IOException {
        SimpleAudioPlayer play = new SimpleAudioPlayer(url);
        play.setDebug(mute);
        play.verboseLogging(true);
        play.play(wiederholungen);
    }

    @Override
    public void tonAus() {
        mute = true;
    }

    @Override
    public void tonAn() {
        mute = false;
    }
}
