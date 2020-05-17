package src.builder;

public class Director {
    private RobotBuilder robotBuilder;

    public Director(RobotBuilder robotBuilder) {
        this.robotBuilder = robotBuilder;
    }

    public Robot buildRobot() {
        Robot robot = new Gundam();
        
        robot.setShape(this.robotBuilder.buildShape());
        robot.setPower(this.robotBuilder.buildPower());
        robot.setWeapon(this.robotBuilder.buildWeapon());

        return robot;
    }
}
