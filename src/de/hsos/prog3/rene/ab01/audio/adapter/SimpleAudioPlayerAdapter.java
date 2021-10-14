package de.hsos.prog3.rene.ab01.audio.adapter;

import de.hsos.prog3.audio.SimpleAudioPlayer;
import de.hsos.prog3.rene.ab01.audio.StdAudioPlayer;

import java.io.IOException;
import java.net.URL;

public class SimpleAudioPlayerAdapter implements StdAudioPlayer {
    SimpleAudioPlayer play;

    @Override
    public void einmaligAbspielen(URL url) throws IOException {
        SimpleAudioPlayer player = new SimpleAudioPlayer(url);
        player.setDebug(false);
        player.verboseLogging(true);
        player.play(0);
    }

    @Override
    public void wiederholtAbspielen(URL url, int wiederholungen) throws IOException {
        SimpleAudioPlayer player = new SimpleAudioPlayer(url);
        player.setDebug(false);
        player.verboseLogging(true);
        player.play(wiederholungen);
    }

    @Override
    public void tonAus() throws IOException {

    }

    @Override
    public void tonAn() {

    }
}
