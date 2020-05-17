package src.builder;

public class RobotBuilderTest {
    public static void main(String[] args) {
        Director director = new Director(new GundamBuilder());
        Robot robot = director.buildRobot();
        robot.displayRobotData();
    }
}
