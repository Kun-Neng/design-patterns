package src.observer;

public class Lancer extends Adventurer {
    public Lancer(String name) {
        super(name);
    }

    @Override
    public void getQuest(String quest) {
        System.out.println(this.name + ": Fighting!");
    }
}
