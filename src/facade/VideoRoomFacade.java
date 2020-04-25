package src.facade;

public class VideoRoomFacade {
    KTVSystem ktv = new KTVSystem();
    PlayStationSystem ps = new PlayStationSystem();
    StereoSystem stereo = new StereoSystem();
    TelevisionSystem tv = new TelevisionSystem();

    /**
     * KTV
     */
    public void readyForKTV() {
        ktv.powerOn();
        stereo.powerOn();
        tv.powerOn();
        setSound(80);
        tv.switchSource("ktv");
    }

    public void selectSong(String song) {
        if (ktv.isPowerOn()) {
            ktv.selectSong(song);
        }
    }

    public void playSong() {
        if (ktv.isPowerOn()) {
            ktv.playSong();
        }
    }

    /**
     * Play Station
     */
    public void readyForPlayGame(String cd) {
        stereo.powerOn();
        tv.powerOn();
        setSound(50);
        tv.switchSource("playstation");
        ps.powerOn();
        ps.putGame(cd);
    }

    public void playGame() {
        if (ps.isPowerOn()) {
            ps.play();
        }
    }

    /**
     * Television
     */
    public void showTV() {
        tv.showTV();
    }

    public void watchTV() {
        tv.powerOn();
        tv.switchSource("tvbox");
    }

    public void switchChannel(int channel) {
        tv.switchChannel(channel);
    }

    public void setSound(int soundLevel) {
        if (tv.isPowerOn()) {
            tv.setSound(soundLevel);
        }

        if (stereo.isPowerOn()) {
            stereo.setSound(soundLevel);
        }
    }

    public void turnOffAll() {
        ktv.powerOff();
        ps.powerOff();
        stereo.powerOff();
        tv.powerOff();
    }

    public void showAllStatus() {
        ktv.showStatus();
        ps.showStatus();
        stereo.showStatus();
        tv.showStatus();
    }
}
