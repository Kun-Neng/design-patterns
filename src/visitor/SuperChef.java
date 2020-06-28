package src.visitor;

public class SuperChef extends Chef {
    public SuperChef(String name) {
        super(name);
    }

    // @Override
    // void cookTofu() {
    //     System.out.println(this.getName() + " cook super tofu");
    // }

    // @Override
    // void cookSaoMai() {
    //     System.out.println(this.getName() + " cook super saomai");
    // }

    @Override
    void accept(Visitor visitor) {
        visitor.cook(this);
    }
}
