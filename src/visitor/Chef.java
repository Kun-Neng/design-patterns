package src.visitor;

public abstract class Chef {
    private String name;
    
    public Chef(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    // abstract void cookTofu();
    // abstract void cookSaoMai();
    abstract void accept(Visitor visitor);
}
