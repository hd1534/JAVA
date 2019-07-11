package org.dimigo.oop2;

public class MediaPlayer {
    private int volume;
    private static MediaPlayer instance = new MediaPlayer();

    private MediaPlayer() {}

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public static MediaPlayer getInstance() {
        return instance;
    }
}
