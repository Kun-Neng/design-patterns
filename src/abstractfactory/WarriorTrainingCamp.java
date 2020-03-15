package src.abstractfactory;

public class WarriorTrainingCamp implements TrainingCamp {
    private static EquipFactory warriorEquipFactory = new WarriorEquipFactory();

    @Override
    public Adventurer trainAdventurer() {
        System.out.println("A warrior is trained.");
        Warrior warrior = new Warrior();
        warrior.setWeapon(warriorEquipFactory.produceWeapon());
        warrior.setClothes(warriorEquipFactory.produceClothes());
        return warrior;
    }
}
