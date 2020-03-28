package src.decorator;

public class StrongTitle extends Title {
    public StrongTitle(Adventurer adventurer) {
        super(adventurer);
    }
    
    @Override
    public void attack() {
        System.out.print("strong ");
        super.attack();
    }
}
