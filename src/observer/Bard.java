package src.observer;

public class Bard extends Adventurer {
    public Bard(String name) {
        super(name);
    }

    @Override
    public void getQuest(String quest) {
        if (quest.length() > 20) {
            System.out.println(this.name + ": This quest is so complicated!");
        } else {
            System.out.println(this.name + ": Sure!");
        }
    }
}
