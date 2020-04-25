package src.facade;

public class StereoSystem extends Electronics {
    private int sound = 50;

    public void setSound(int sound) {
        this.sound = sound;
    }

    public int getSound() {
        return this.sound;
    }

    @Override
    public void showStatus() {
        super.showStatus();

        if (isPowerOn()) {
            System.out.println(this.getClass().getSimpleName() + " sound is " + this.sound);
        }
    }
}
