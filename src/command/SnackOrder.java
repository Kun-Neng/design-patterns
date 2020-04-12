package src.command;

public class SnackOrder extends Order {
    public SnackOrder(KitchenWorker receiver) {
        super(receiver);
        super.orderName = "snack order";
    }
}
