package org.dimigo.oop2;

public class GameTest {
    public void play() {
        MediaPlayer mp = MediaPlayer.getInstance();
        mp.setVolume(mp.getVolume());

        new Player().play();
        System.out.println(mp.getVolume());

        new Enemy().play();
        System.out.println(mp.getVolume());

    }
}
