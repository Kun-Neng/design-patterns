package src.decorator;

public class BurningTitle extends Title {
    public BurningTitle(Adventurer adventurer) {
        super(adventurer);
    }
    
    @Override
    public void attack() {
        System.out.print("burning ");
        super.attack();
    }

    public void useFireball() {
        System.out.println("use Fireball ");
    }
}
