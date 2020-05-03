package src.state;

public class WarriorTest {
    public static void main(String[] args) {
        Warrior warrior = new Warrior();
        warrior.action();

        warrior.getDamage(30);
        warrior.action();

        warrior.getDamage(50);
        warrior.action();

        warrior.heal(120);
        warrior.action();

        warrior.getDamage(120);
        warrior.action();
        warrior.heal(100);
        warrior.action();
    }
}
