package src.decorator;

public class AgileTitle extends Title {
    public AgileTitle(Adventurer adventurer) {
        super(adventurer);
    }
    
    @Override
    public void attack() {
        System.out.print("agile ");
        super.attack();
    }

    public void useFlash() {
        System.out.println("use Flash ");
    }
}
