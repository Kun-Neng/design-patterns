package src.template;

public abstract class MazeTemplate {
    protected int difficulty;
    protected Adventurer adventurer;
    protected boolean isDoubleMaze = false;

    public Adventurer startAdventure(Adventurer adventurer) {
        this.adventurer = adventurer;

        if (!checkLevel(adventurer.getLevel())) {
            System.out.println("The adventurer's level is low, please reach to " + this.difficulty);
        } else {
            System.out.println(adventurer.getType() + " starts " + this.difficulty + " maze.");

            createMaze();
            start();

            if (isDoubleMaze) {
                enterHiddenMaze();
            }

            showResult();
        }

        return this.adventurer;
    }

    private boolean checkLevel(int level) {
        return level >= difficulty;
    }

    abstract void createMaze();
    abstract void start();
    
    void enterHiddenMaze() {
        System.out.println("Enter hidden maze.");
    }

    Adventurer showResult() {
        this.adventurer.setLevel(this.adventurer.getLevel() + 50 * this.difficulty);
        System.out.println(this.adventurer.getType() + " overcame " + this.difficulty + " maze.");

        return this.adventurer;
    }
}