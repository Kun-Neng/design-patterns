package src.abstractfactory;

public abstract class Adventurer {
    Weapon weapon;
    Clothes clothes;

    public abstract void display();

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public Clothes getClothes() {
        return clothes;
    }

    public void setClothes(Clothes clothes) {
        this.clothes = clothes;
    }
}
