package src.factory;

public class WarriorTrainingCamp implements TrainingCamp {
    @Override
    public Adventurer trainAdventurer() {
        System.out.println("A warrior is trained.");
        return new Warrior();
    }
}