package src.mediator;

public interface Mediator {
    void send(String message, String from, User to);
    void sendToAll(String from, String message);
}
