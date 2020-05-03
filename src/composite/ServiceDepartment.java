package src.composite;

public class ServiceDepartment extends Department {
    public ServiceDepartment(String name) {
        super(name);
    }

    @Override
    public void lineOfDuty() {
        System.out.println(this.name + ": this is adventurer's duty");
    }
}
