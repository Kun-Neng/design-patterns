package src.builder;

public class GundamBuilder extends RobotBuilder {
    @Override
    public Shape buildShape() {
        return new Shape("Human Shape");
    }

    @Override
    public Power buildPower() {
        return new Power("Power A", "Power B", "Power C");
    }

    @Override
    public Weapon buildWeapon() {
        return new Weapon(new String[] {"Weapon A", "Weapon B", "Weapon C", "Weapon D"});
    }
}
