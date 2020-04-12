package src.command;

public class DrinkOrder extends Order {
    public DrinkOrder(KitchenWorker receiver) {
        super(receiver);
        super.orderName = "drink order";
    }
}
