package src.visitor;

public class DarkChef extends Chef {
    public DarkChef(String name) {
        super(name);
    }

    // @Override
    // void cookTofu() {
    //     System.out.println(this.getName() + " cook dark tofu");
    // }

    // @Override
    // void cookSaoMai() {
    //     System.out.println(this.getName() + " cook dark saomai");
    // }

    @Override
    void accept(Visitor visitor) {
        visitor.cook(this);
    }
}
