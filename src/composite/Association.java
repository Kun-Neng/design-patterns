package src.composite;

import java.util.ArrayList;
import java.util.List;

public class Association extends AbstractAssociation {
    private List<AbstractAssociation> branches = new ArrayList<>();

    public Association(String name) {
        super(name);
    }
    
    @Override
    public void add(AbstractAssociation association) {
        branches.add(association);
    }

    @Override
    public void remove(AbstractAssociation association) {
        branches.remove(association);
    }

    @Override
    public void display(int depth) {
        for (int i = 0; i < depth; i++) {
            System.out.print("-");
        }
        System.out.println(this.name);

        for (AbstractAssociation association : branches) {
            association.display(depth + 2);
        }
    }

    @Override
    public void lineOfDuty() {
        for (AbstractAssociation association : branches) {
            association.lineOfDuty();
        }
    }
}
