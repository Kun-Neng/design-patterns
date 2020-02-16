package src.simplefactory;

public class TrainingCamp {
    public static Adventurer trainAdventurer(String type) {
        switch (type) {
            case "archer": {
                System.out.println("An archer is trained.");
                return new Archer();
            }
            case "warrior": {
                System.out.println("A warrior is trained.");
                return new Warrior();
            }
            default: return null;
        }
    }
}
