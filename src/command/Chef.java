package src.command;

public class Chef implements KitchenWorker {
    @Override
    public void handleOrder() {
        System.out.println("Take off bread -> Put butter on -> Bake it -> Finish");
    }
}
