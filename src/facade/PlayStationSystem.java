package src.facade;

public class PlayStationSystem extends Electronics {
    private String game;

    public void putGame(String game) {
        this.game = game;
    }

    public String getGame() {
        return this.game;
    }

    public void play() {
        System.out.println(this.getClass().getSimpleName() + " play " + this.game);
    }

    @Override
    public void showStatus() {
        super.showStatus();

        if (isPowerOn()) {
            System.out.println(this.getClass().getSimpleName() + " with " + this.game);
        }
    }
}
