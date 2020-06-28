package src.memento;

public class GameRoleTest {
    public static void main(String[] args) {
        GameRole boss = new GameRole();
        boss.showState();

        boss.setAtk(60);
        RoleStateCareTaker rsc = new RoleStateCareTaker();
        rsc.saveMemo(boss.save());
        boss.showState();

        boss.fight();
        boss.showState();

        boss.load(rsc.getSavedMemo());
        boss.showState();
    }
}
