package src.adapter;

public class Adapter implements IWizard {
    private Archer archer;

    public Adapter(Archer archer) {
        this.archer = archer;
    }

    @Override
    public void throwFireball() {
        System.out.println("Preparing...");
        archer.shoot();
        System.out.println("With Fireball!");
    }
}
