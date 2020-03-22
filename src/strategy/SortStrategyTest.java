package src.strategy;

import java.util.Comparator;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

class Village {
    int id;
    String name;
    int population;
    double area;

    public Village(int id, String name, int population, double area) {
        this.id = id;
        this.name = name;
        this.population = population;
        this.area = area;
    }

    @Override
    public String toString() {
        return this.id + "." + this.name + "(population: " + this.population + ", area: " + this.area + ")";
    }
}

class SortVillageById implements Comparator<Village> {
    @Override
    public int compare(Village v1, Village v2) {
        // village with larger id is in front of that with smaller id
        if (v1.id > v2.id) {
            return 1;
        } else if (v1.id < v2.id) {
            return -1;
        } else {
            return 0;
        }
    }
}

class SortVillageByName implements Comparator<Village> {
    @Override
    public int compare(Village v1, Village v2) {
        if (v1.name.charAt(0) > v2.name.charAt(0)) {
            return 1;
        } else if (v1.name.charAt(0) < v2.name.charAt(0)) {
            return -1;
        } else {
            return 0;
        }
    }
}

class SortVillageByArea implements Comparator<Village> {
    @Override
    public int compare(Village v1, Village v2) {
        if (v1.area > v2.area) {
            return 1;
        } else if (v1.area < v2.area) {
            return -1;
        } else {
            return 0;
        }
    }
}

public class SortStrategyTest {
    private static void showList(List<Village> villageList) {
        for (Village village : villageList) {
            System.out.println(village);
        }
    }

    public static void main(String[] args) {
        Village village1 = new Village(3, "cape valley", 32, 5.1);
        Village village2 = new Village(1, "barn field", 22, 1.7);
        Village village3 = new Village(2, "apple farm", 10, 10.2);

        List<Village> villages = new ArrayList<Village>();
        villages.add(village1);
        villages.add(village2);
        villages.add(village3);

        System.out.println("Unsorted villages:");
        showList(villages);

        System.out.println("Sort village by ID:");
        Collections.sort(villages, new SortVillageById());
        showList(villages);

        System.out.println("Sort village by name:");
        Collections.sort(villages, new SortVillageByName());
        showList(villages);

        System.out.println("Sort village by area:");
        Collections.sort(villages, new SortVillageByArea());
        showList(villages);
    }
}
