package src.facade;

public class VideoRoomFacadeClient {
    public static void main(String[] args) {
        VideoRoomFacade facade = new VideoRoomFacade();

        System.out.println("Play games");
        facade.readyForPlayGame("God of War");
        facade.playGame();
        facade.showAllStatus();

        facade.turnOffAll();
        facade.showAllStatus();

        System.out.println("Watch TV");
        facade.watchTV();
        facade.showTV();
        facade.switchChannel(55);
        facade.showTV();
        facade.turnOffAll();

        System.out.println("Sing a song");
        facade.readyForKTV();
        facade.selectSong("Speechless");
        facade.playSong();
        facade.showAllStatus();
    }
}
