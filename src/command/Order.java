package src.command;

public class Order {
    protected KitchenWorker receiver;
    protected String orderName;

    public Order(KitchenWorker receiver) {
        this.receiver = receiver;
    }

    public String getOrderName() {
        return this.orderName;
    }

    public void sendOrder() {
        receiver.handleOrder();
    }
}
