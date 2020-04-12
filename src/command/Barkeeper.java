package src.command;

public class Barkeeper implements KitchenWorker {
    @Override
    public void handleOrder() {
        System.out.println("Take off a cup -> Fill water -> Finish");
    }
}
