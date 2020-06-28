package src.visitor;

public class NoodleChef extends Chef {
    public NoodleChef(String name) {
        super(name);
    }

    // @Override
    // void cookTofu() {
    //     System.out.println(this.getName() + " cook noodle tofu");
    // }

    // @Override
    // void cookSaoMai() {
    //     System.out.println(this.getName() + " cook noodle saomai");
    // }

    @Override
    void accept(Visitor visitor) {
        visitor.cook(this);
    }
}
