package src.composite;

public class HumanResource extends Department {
    public HumanResource(String name) {
        super(name);
    }

    @Override
    public void lineOfDuty() {
        System.out.println(this.name + ": try to attract adventurers to complete missions.");
    }
}
