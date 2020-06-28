package src.visitor;

public interface Visitor {
    void cook(SuperChef superChef);
    void cook(DarkChef darkChef);
    void cook(NoodleChef noodleChef);
}
