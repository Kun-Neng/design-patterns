package src.memento;

import java.util.ArrayList;
import java.util.List;

public class RoleStateCareTaker {
    public List<RoleStateMemo> saves = new ArrayList<>();

    public RoleStateMemo getSavedMemo() {
        return this.saves.get(0);
    }

    public void saveMemo(RoleStateMemo memo) {
        this.saves.add(0, memo);
    }
}
