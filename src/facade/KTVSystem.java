package src.facade;

public class KTVSystem extends Electronics {
    private String song;

    public void selectSong(String song) {
        this.song = song;
    }

    public void playSong() {
        System.out.println(this.getClass().getSimpleName() + " play " + this.song);
    }
}
