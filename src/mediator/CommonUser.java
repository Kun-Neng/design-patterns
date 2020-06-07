package src.mediator;

public class CommonUser extends User {
    public CommonUser(String name) {
        super(name);
    }
    
    @Override
    public void sendToAll(String message) {
        System.out.println("It is not allowed to common user to broadcast message!");
    }
}
