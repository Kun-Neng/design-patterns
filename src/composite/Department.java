package src.composite;

public abstract class Department extends AbstractAssociation {
    public Department(String name) {
        super(name);
    }

    @Override
    public void add(AbstractAssociation association) {
        System.out.println("Leaf can not add new association");
    }

    @Override
    public void remove(AbstractAssociation association) {
        System.out.println("Leaf has no association to be removed");
    }

    @Override
    public void display(int depth) {
        for (int i = 0; i < depth; i++) {
            System.out.print("-");
        }
        System.out.println(this.name);
    }

    @Override
    abstract public void lineOfDuty();
}
