package src.flyweight;

public class TreeTest {
    public static void main(String[] args) {
        Tree rose = TreeManager.getTree("rose");
        rose.setOwner("Rose");
        rose.display();

        Tree jRose = TreeManager.getTree("rose");
        jRose.setOwner("Jacky");
        jRose.display();

        Tree hinoki = TreeManager.getTree("hinoki");
        hinoki.setOwner("Forestry Bureau");
        hinoki.display();
    }
}
