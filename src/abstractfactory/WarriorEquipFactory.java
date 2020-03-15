package src.abstractfactory;

public class WarriorEquipFactory implements EquipFactory {
    @Override
    public Weapon produceWeapon() {
        LongSword longSword = new LongSword();
        longSword.setAtk(10);
        longSword.setRange(1);
        return longSword;
    }

    @Override
    public Clothes produceClothes() {
        Armor armor = new Armor();
        armor.setDef(10);
        return armor;
    }
}
