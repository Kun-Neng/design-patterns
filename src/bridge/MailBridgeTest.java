package src.bridge;

public class MailBridgeTest {
    public static void main(String[] args) {
        MailSender mailSender = new NormalMailSender(new NonRegisteredMail());
        mailSender.send();

        mailSender = new NormalMailSender(new RegisteredMail());
        mailSender.send();

        mailSender = new PromptMailSender(new NonRegisteredMail());
        mailSender.send();

        mailSender = new PromptMailSender(new RegisteredMail());
        mailSender.send();
    }
}
