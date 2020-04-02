package src.observer;

public class Gunman extends Adventurer {
    public Gunman(String name) {
        super(name);
    }

    @Override
    public void getQuest(String quest) {
        if (quest.length() < 10) {
            System.out.println(this.name + ": It's too easy!");
        } else {
            System.out.println(this.name + ": Go ahead!");
        }
    }
}
