package src.abstractfactory;

public class Warrior extends Adventurer {
    @Override
    public void display() {
        System.out.println("I am Warrior.");
        weapon.display();
        clothes.display();
        System.out.println();
    }
}
