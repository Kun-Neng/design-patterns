package src.command;

public class CoffeeShop {
    public static void main(String[] args) {
        Chef chef = new Chef();
        Barkeeper barkeeper = new Barkeeper();

        Waitress cuteGirl = new Waitress();

        Order snackOrder = new SnackOrder(chef);
        Order drinkOrder = new DrinkOrder(barkeeper);

        cuteGirl.setOrder(snackOrder);
        cuteGirl.setOrder(snackOrder);
        cuteGirl.setOrder(drinkOrder);
        cuteGirl.setOrder(snackOrder);
        cuteGirl.setOrder(drinkOrder);

        cuteGirl.cancelOrder(snackOrder);
        cuteGirl.cancelOrder(snackOrder);
        // cuteGirl.cancelOrder(snackOrder);
        // cuteGirl.cancelOrder(snackOrder);
        // cuteGirl.cancelOrder(snackOrder);
        // cuteGirl.cancelOrder(snackOrder);

        cuteGirl.setOrder(snackOrder);

        cuteGirl.notifyKitchen();

        cuteGirl.setOrder(snackOrder);
    }
}
