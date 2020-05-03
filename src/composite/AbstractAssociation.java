package src.composite;

public abstract class AbstractAssociation {
    protected String name;

    public AbstractAssociation(String name) {
        this.name = name;
    }

    public abstract void add(AbstractAssociation association);
    public abstract void remove(AbstractAssociation association);
    public abstract void display(int depth);
    public abstract void lineOfDuty();
}
