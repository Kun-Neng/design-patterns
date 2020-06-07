package src.mediator;

public abstract class User {
    private String name;
    public static Mediator mediator = new MessageMediator();

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void send(String message, User to) {
        mediator.send(message, this.name, to);
    }

    public void sendToAll(String message) {
        mediator.sendToAll(this.name, message);
    }
}
