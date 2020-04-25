package src.template;

public class DifficultMaze extends MazeTemplate {
    public DifficultMaze() {
        super.difficulty = 50;
        super.isDoubleMaze = true;
    }

    @Override
    void createMaze() {
        System.out.println("Prepare a 1000*1000 maze.");
        System.out.println("Arrange more than 100 monsters.");
        System.out.println("Arrange a boss with level of 100.");
        System.out.println("Difficult maze is complete.");
    }

    @Override
    void start() {
        System.out.println("Start a difficult maze.");
    }
    
}