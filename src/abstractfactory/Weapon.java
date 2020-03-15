package src.abstractfactory;

public abstract class Weapon {
    protected int atk;
    protected int range;

    public void display() {
        System.out.println(this.getClass().getSimpleName() + " atk = " + this.atk + ", range = " + this.range);
    }

    public int getAtk() {
        return atk;
    }

    public void setAtk(int atk) {
        this.atk = atk;
    }

    public int getRange() {
        return range;
    }

    public void setRange(int range) {
        this.range = range;
    }
}
