package src.state;

public class FuryState implements State {
    @Override
    public void action(Warrior warrior) {
        int hp = warrior.getHP();
        if (hp > 70) {
            warrior.setState(new NormalState());
            warrior.action();
        } else if (hp <= 30) {
            warrior.setState(new DesperateState());
            warrior.action();
        } else {
            System.out.println("HP = " + warrior.getHP() + " -> fury state, attack + 50%");
        }
    }
}
