package src.bridge;

public class NonRegisteredMail extends Mail {
    @Override
    void showRegisterStatement() {
        System.out.println("This is a non registered mail");
    }    
}
