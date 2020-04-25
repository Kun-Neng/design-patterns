package src.template;

public class MazeTest {
    public static void main(String[] args) {
        Adventurer sabar = new Sabar();
        Adventurer gundamJustice = new GundamJustice();
        
        MazeTemplate easyMaze = new EasyMaze();
        MazeTemplate difficultMaze = new DifficultMaze();

        System.out.println("=== Difficult Maze ===");
        sabar = difficultMaze.startAdventure(sabar);
        System.err.println("=== Easy Maze ===");
        sabar = easyMaze.startAdventure(sabar);

        System.out.println("=== Difficult Maze ===");
        sabar = difficultMaze.startAdventure(sabar);
        gundamJustice = difficultMaze.startAdventure(gundamJustice);
    }
}