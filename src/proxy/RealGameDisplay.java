package src.proxy;

public class RealGameDisplay implements GameDisplay {
    @Override
    public void display() {
        System.out.println("Display Game");
    }
}
