package src.abstractfactory;

public class EquipFactoryTest {
    private EquipFactory equipFactory;

    public EquipFactoryTest() {
        this.equipFactory = new ArcherEquipFactory();
        Weapon bow = this.equipFactory.produceWeapon();
        Clothes leather = this.equipFactory.produceClothes();
        System.out.println("bow attack: " + bow.getAtk() + ", range: " + bow.getRange());
        System.out.println("leather defense: " + leather.getDef());

        this.equipFactory = new WarriorEquipFactory();
        Weapon longSword = this.equipFactory.produceWeapon();
        Clothes armor = this.equipFactory.produceClothes();
        System.out.println("long sword attack: " + longSword.getAtk() + ", range: " + longSword.getRange());
        System.out.println("armor defense: " + armor.getDef());

        System.out.println();

        TrainingCamp archerTrainingCamp = new ArcherTrainingCamp();
        Adventurer archer = archerTrainingCamp.trainAdventurer();
        archer.display();

        TrainingCamp warriorTrainingCamp = new WarriorTrainingCamp();
        Adventurer warrior = warriorTrainingCamp.trainAdventurer();
        warrior.display();
    }

    public static void main(String[] args) {
        new EquipFactoryTest();
    }
}
