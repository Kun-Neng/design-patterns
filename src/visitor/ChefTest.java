package src.visitor;

public class ChefTest {
    public static void main(String[] args) {
        ChefGroup chefGroup = new ChefGroup();
        chefGroup.join(new SuperChef("Super A"));
        chefGroup.join(new DarkChef("Dark B"));
        chefGroup.join(new NoodleChef("Noodle C"));

        System.out.println("=== First Round: SaoMai ===");
        Visitor round1 = new Visitor_saomai();
        chefGroup.gameTopic(round1);

        System.out.println("=== Second Round: ToFu ===");
        Visitor round2 = new Visitor_tofu();
        chefGroup.join(new DarkChef("Dark D"));
        chefGroup.gameTopic(round2);
    }
}
