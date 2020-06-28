package src.bridge;

public class RegisteredMail extends Mail {
    @Override
    void showRegisterStatement() {
        System.out.println("This is a registered mail, needs to be signed");
    }
}
