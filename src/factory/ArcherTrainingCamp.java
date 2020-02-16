package src.factory;

public class ArcherTrainingCamp implements TrainingCamp {
    @Override
    public Adventurer trainAdventurer() {
        System.out.println("An archer is trained.");
        return new Archer();
    }
}