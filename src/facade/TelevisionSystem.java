package src.facade;

public class TelevisionSystem extends Electronics {
    private int sound = 50;
    private String source = "tvbox";
    private int channel = 9;

    public void setSound(int sound) {
        this.sound = sound;
    }

    public void switchSource(String source) {
        this.source = source;
    }

    public void switchChannel(int channel) {
        this.channel = channel;
    }

    public void showTV() {
        System.out.println("Now the channel is " + this.channel);
    }

    @Override
    public void showStatus() {
        super.showStatus();

        if (isPowerOn()) {
            System.out.print(this.getClass().getSimpleName() + " sound is " + this.sound);

            if (this.source.equals("tvbox")) {
                System.out.println(", channel: " + this.channel);
            }

            if (this.source.equals("ktv")) {
                System.out.println(", ktv is playing.");
            }

            if (this.source.equals("playstation")) {
                System.out.println(", playstation is ready for play.");
            }
        }
    }

    public int getSound() {
        return this.sound;
    }

    public String getSource() {
        return this.source;
    }

    public int getChannel() {
        return this.channel;
    }
}
