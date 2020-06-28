package src.memento;

public class GameRole {
    private int hp = 100;
    private int atk = 100;
    private int def = 100;
    private String name = "Boss";

    public RoleStateMemo save() {
        return new RoleStateMemo(hp, atk, def);
    }

    public void load(RoleStateMemo memo) {
        this.hp = memo.getHp();
        this.atk = memo.getAtk();
        this.def = memo.getDef();
    }

    public void fight() {
        this.hp = 30;
        System.out.println(this.name + " uses lots of skills");
    }

    public void showState() {
        System.out.println(this.name + " state:");
        System.out.print("hp:" + this.hp);
        System.out.print(", atk:" + this.atk);
        System.out.println(", def:" + this.def);
        System.out.println();
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getAtk() {
        return atk;
    }

    public void setAtk(int atk) {
        this.atk = atk;
    }

    public int getDef() {
        return def;
    }

    public void setDef(int def) {
        this.def = def;
    }
}
