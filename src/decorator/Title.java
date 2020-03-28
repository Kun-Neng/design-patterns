package src.decorator;

public abstract class Title implements Adventurer {
    protected Adventurer adventurer;

    public Title(Adventurer adventurer) {
        this.adventurer = adventurer;
    }

    @Override
    public void attack() {
        this.adventurer.attack();
    }
}
