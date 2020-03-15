package src.abstractfactory;

public class ArcherEquipFactory implements EquipFactory {
    @Override
    public Weapon produceWeapon() {
        Bow bow = new Bow();
        bow.setAtk(5);
        bow.setRange(10);
        return bow;
    }

    @Override
    public Clothes produceClothes() {
        Leather leather = new Leather();
        leather.setDef(5);
        return leather;
    }
}
