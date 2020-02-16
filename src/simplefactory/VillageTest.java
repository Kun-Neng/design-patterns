package src.simplefactory;

public class VillageTest {
    public static void main(String[] args) {
        Adventurer memberA = TrainingCamp.trainAdventurer("archer");
        Adventurer memberB = TrainingCamp.trainAdventurer("warrior");
        System.out.println(memberA.getType().equals("Archer"));
        System.out.println(memberB.getType().equals("Warrior"));
    }
}
