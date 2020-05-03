package src.state;

public class Warrior {
    private int hp;
    private State state;

    public Warrior() {
        this.hp = 100;
        this.state = new NormalState();
    }

    public void heal(int heal) {
        this.hp += heal;
        if (this.hp > 100) {
            this.hp = 100;
        }
    }

    public void getDamage(int damage) {
        this.hp -= damage;
        if (this.hp < 0) {
            this.hp = 0;
        }
    }

    public void action() {
        state.action(this);
    }

    public void setState(State state) {
        this.state = state;
    }

    public int getHP() {
        return this.hp;
    }
}
