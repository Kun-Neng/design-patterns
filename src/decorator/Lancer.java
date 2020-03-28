package src.decorator;

public class Lancer implements Adventurer {
    private String name;

    public Lancer(String name) {
        this.name = name;
    }

    @Override
    public void attack() {
        System.out.println("attack by " + this.name);
    }
}
