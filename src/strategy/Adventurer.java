package src.strategy;

public class Adventurer {
    private FightStrategy fightStrategy;

    public void action() {
        if (this.fightStrategy == null) {
            this.fightStrategy = new NormalAttack();
        }

        this.fightStrategy.execute();
    }

    public void assignStrategy(FightStrategy fightStrategy) {
        this.fightStrategy = fightStrategy;
    }
}
