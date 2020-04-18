package src.adapter;

public class AdapterClient {
    public static void main(String[] args) {
        IWizard iWizard = new Adapter(new Archer());
        // iWizard.shoot(); // can't call shoot()
        iWizard.throwFireball();
    }
}
