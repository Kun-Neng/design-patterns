package src.flyweight;

public class Tree {
    private String type;
    private String owner;

    public Tree(String type) {
        this.type = type;
        System.out.println("Get a new " + this.type);
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public void display() {
        System.out.println(this.type + "'s owner is " + this.owner);
    }
}
