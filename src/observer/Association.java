package src.observer;

public class Association extends Subject {
    @Override
    public void sendQuest(String quest) {
        list.forEach(adventurer -> {
            adventurer.getQuest(quest);
        });
    }
}
