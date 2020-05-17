package src.builder;

public class Robot {
    Shape shape;
    Power power;
    Weapon weapon;

    public void setShape(Shape shape) {
        this.shape = shape;
    }

    public void setPower(Power power) {
        this.power = power;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public void displayRobotData() {
        System.out.println("Shape: " + shape);
        System.out.println("Power: " + power);
        System.out.println("Weapon: " + weapon);
    }
}
