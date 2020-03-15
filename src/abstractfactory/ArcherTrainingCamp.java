package src.abstractfactory;

public class ArcherTrainingCamp implements TrainingCamp {
    private static EquipFactory archerEquipFactory = new ArcherEquipFactory();

    @Override
    public Adventurer trainAdventurer() {
        System.out.println("An archer is trained.");
        Archer archer = new Archer();
        archer.setWeapon(archerEquipFactory.produceWeapon());
        archer.setClothes(archerEquipFactory.produceClothes());
        return archer;
    }
}
