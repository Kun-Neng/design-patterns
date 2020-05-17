package src.builder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Weapon {
    List<String> weaponList = new ArrayList<>();
    
    public Weapon(String[] weaponList) {
        this.weaponList.addAll(Arrays.asList(weaponList));
    }

    public String toString() {
        return this.weaponList.toString();
    }
}
