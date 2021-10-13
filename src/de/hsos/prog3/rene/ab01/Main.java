package de.hsos.prog3.rene.ab01;

import de.hsos.prog3.rene.ab01.audio.adapter.SimpleAudioPlayerAdapter;

import java.io.IOException;
import java.net.URL;


public class Main {
    public static void main(String[] args) throws IOException {
        URL url = Main.class.getResource("/Baritone.wav");

        /* SimpleAudioPlayer player = new SimpleAudioPlayer(url);
        player.setDebug(false);
        player.verboseLogging(true);
        player.play(0); */

        SimpleAudioPlayerAdapter player = new SimpleAudioPlayerAdapter();
        player.einmaligAbspielen(url);
        player.wiederholtAbspielen(url, 3);


    }
}
