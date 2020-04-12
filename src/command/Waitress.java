package src.command;

import java.util.List;
import java.util.ArrayList;

public class Waitress {
    private final int maxSnackQuantity = 2;
    private final int maxDrinkQuantity = 4;
    private int snackQuantity = 2;
    private int drinkQuantity = 4;
    private List<Order> orderList = new ArrayList<>();

    public void setOrder(Order order) {
        if (order.getOrderName().equals("snack order")) {
            if (this.snackQuantity <= 0) {
                System.out.println("Snack sold out!");
            } else {
                this.snackQuantity--;
                this.orderList.add(order);
            }
        } else if (order.getOrderName().equals("drink order")) {
            if (this.drinkQuantity <= 0) {
                System.out.println("Drink sold out!");
            } else {
                this.drinkQuantity--;
                this.orderList.add(order);
            }
        }
    }

    public void cancelOrder(Order order) {
        if (order.getOrderName().equals("snack order")) {
            System.out.println("Cancel snack order.");
            this.snackQuantity++;
            if (this.snackQuantity >= this.maxSnackQuantity) {
                this.snackQuantity = this.maxSnackQuantity;
            }
        } else if (order.getOrderName().equals("drink order")) {
            System.out.println("Cancel drink order.");
            this.drinkQuantity++;
            if (this.drinkQuantity >= this.maxDrinkQuantity) {
                this.drinkQuantity = this.maxDrinkQuantity;
            }
        }
        this.orderList.remove(order);
    }

    public void notifyKitchen() {
        System.out.println("Total " + this.orderList.size() + " orders.");
        System.out.println("Snack " + this.snackQuantity + "; Drink " + this.drinkQuantity + " left.");

        for (Order order : this.orderList) {
            order.sendOrder();
        }
        this.orderList.clear();
    }
}
