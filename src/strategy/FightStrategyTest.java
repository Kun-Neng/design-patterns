package src.strategy;

public class FightStrategyTest {
    public static void main(String[] args) {
        Adventurer adventurer = new Adventurer();
        
        System.out.println("A monster appears!");
        adventurer.action();

        System.out.println("=== Warning ===");
        System.out.println("A boss is coming!");
        adventurer.assignStrategy(new UseSkill());
        adventurer.action();

        System.out.println("After the combat, your life points are low.");
        adventurer.assignStrategy(new UseItem());
        adventurer.action();
    }
}
