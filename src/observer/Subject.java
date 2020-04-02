package src.observer;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject {
    protected List<Adventurer> list = new ArrayList<>();

    public void add(Adventurer observer) {
        this.list.add(observer);
    }

    public void remove(Adventurer observer) {
        this.list.remove(observer);
    }

    public abstract void sendQuest(String quest);
}
