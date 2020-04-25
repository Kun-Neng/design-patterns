package src.template;

public class EasyMaze extends MazeTemplate {
    public EasyMaze() {
        super.difficulty = 1;
    }

    @Override
    void createMaze() {
        System.out.println("Prepare a 100*100 maze.");
        System.out.println("Arrange 10 monsters.");
        System.out.println("Arrange a boss with level less than 10.");
        System.out.println("Easy maze is complete.");
    }

    @Override
    void start() {
        System.out.println("Start an easy maze.");
    }
}