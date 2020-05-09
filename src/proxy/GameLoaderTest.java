package src.proxy;

public class GameLoaderTest {
    public static void main(String[] args) {
        System.out.println("Without Proxy:");
        new RealGameDisplay().display();

        System.out.println("With Proxy:");
        new ProxyGameDisplay(new RealGameDisplay()).display();
    }
}
