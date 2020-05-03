package src.state;

public class DesperateState implements State {
    @Override
    public void action(Warrior warrior) {
        int hp = warrior.getHP();
        if (hp == 0) {
            warrior.setState(new UnableState());
            warrior.action();
        } else if (hp > 30) {
            warrior.setState(new FuryState());
            warrior.action();
        } else {
            System.out.println("HP = " + warrior.getHP() + " -> attack + 50%, defense + 50%");
        }
    }
}
