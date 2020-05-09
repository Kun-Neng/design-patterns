package src.proxy;

public class ProxyGameDisplay implements GameDisplay {
    private RealGameDisplay realGameDisplay;

    public ProxyGameDisplay(RealGameDisplay realGameDisplay) {
        this.realGameDisplay = realGameDisplay;
    }

    @Override
    public void display() {
        System.out.println("Game is loading...");
        this.realGameDisplay.display();
    }
}
