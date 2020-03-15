package src.abstractfactory;

public class Archer extends Adventurer {
    @Override
    public void display() {
        System.out.println("I am Archer.");
        weapon.display();
        clothes.display();
        System.out.println();
    }
}
