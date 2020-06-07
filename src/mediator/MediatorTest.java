package src.mediator;

public class MediatorTest {
    public static void main(String[] args) {
        User userA = new VIPUser("User A");
        User userB = new CommonUser("User B");
        User userC = new CommonUser("User C");

        MessageMediator.joinChat(userA);
        MessageMediator.joinChat(userB);
        MessageMediator.joinChat(userC);

        userA.sendToAll("Hello, world!");
        userA.send("message test", userB);
        userC.send("nothing special", userA);
        userC.sendToAll("=== spam message ===");
    }
}
