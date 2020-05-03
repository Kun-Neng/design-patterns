package src.state;

public class UnableState implements State {
    @Override
    public void action(Warrior warrior) {
        System.out.println("HP = " + warrior.getHP() + " -> can't action");
    }
}
