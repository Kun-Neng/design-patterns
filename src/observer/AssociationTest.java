package src.observer;

public class AssociationTest {
    public static void main(String[] args) {
        Adventurer lancer = new Lancer("LC1");
        Adventurer lancer2 = new Lancer("LC2");
        Adventurer bard = new Bard("B1");
        Adventurer gunman = new Gunman("GM");

        Subject association = new Association();
        association.add(lancer);
        association.add(lancer2);
        association.add(bard);
        association.add(gunman);

        System.out.println("[Association send a beginner's quest]");
        association.sendQuest("Run Away");

        System.out.println("[Association send a quest to defeat boss]");
        association.sendQuest("Blood, blood, blood, blood, blood, ...");
        
        association.remove(lancer2);
        System.out.println("[Association send a construction quest]");
        association.sendQuest("Build a castle");
    }
}
