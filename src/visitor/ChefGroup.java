package src.visitor;

import java.util.ArrayList;
import java.util.List;

public class ChefGroup {
    private List<Chef> list = new ArrayList<>();

    public void join(Chef chef) {
        this.list.add(chef);
    }

    public void leave(Chef chef) {
        this.list.remove(chef);
    }

    public void gameTopic(Visitor visitor) {
        for (Chef chef : this.list) {
            chef.accept(visitor);
        }
    }
}
