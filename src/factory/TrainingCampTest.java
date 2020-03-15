package src.factory;

public class TrainingCampTest {
    public static void main(String[] args) {
        TrainingCamp archerTrainingCamp = new ArcherTrainingCamp();
        Adventurer memberA = archerTrainingCamp.trainAdventurer();

        TrainingCamp warriorTrainingCamp = new WarriorTrainingCamp();
        Adventurer memberB = warriorTrainingCamp.trainAdventurer();
        
        System.out.println(memberA.getType().equals("Archer"));
        System.out.println(memberB.getType().equals("Warrior"));
    }
}
