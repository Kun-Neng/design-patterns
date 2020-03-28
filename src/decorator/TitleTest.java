package src.decorator;

public class TitleTest {
    public static void main(String[] args) {
        Adventurer lancer = new Lancer("Kun");
        lancer.attack();

        StrongTitle sLancer = new StrongTitle(lancer);
        sLancer.attack();

        AgileTitle asLancer = new AgileTitle(sLancer);
        asLancer.attack();
        asLancer.useFlash();

        BurningTitle basLancer = new BurningTitle(asLancer);
        basLancer.attack();
        basLancer.useFireball();
    }
}
