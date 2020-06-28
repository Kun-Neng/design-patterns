package src.visitor;

public class Visitor_saomai implements Visitor {
    @Override
    public void cook(SuperChef superChef) {
        System.out.println(superChef.getName() + " cook super saomai");
    }

    @Override
    public void cook(DarkChef darkChef) {
        System.out.println(darkChef.getName() + " cook dark saomai");
    }

    @Override
    public void cook(NoodleChef noodleChef) {
        System.out.println(noodleChef.getName() + " cook noodle saomai");
    }
}
