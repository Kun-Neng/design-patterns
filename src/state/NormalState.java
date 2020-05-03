package src.state;

public class NormalState implements State {
    @Override
    public void action(Warrior warrior) {
        if (warrior.getHP() > 70) {
            System.out.println("HP = " + warrior.getHP() + " -> normal state");
        } else {
            warrior.setState(new FuryState());
            warrior.action();
        }
    }
}
