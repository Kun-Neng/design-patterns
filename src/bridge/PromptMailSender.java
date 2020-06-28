package src.bridge;

public class PromptMailSender extends MailSender {
    public PromptMailSender(Mail mail) {
        super(mail);
    }

    @Override
    void send() {
        System.out.println("Mail will be received in 24 hours");
        super.mail.showRegisterStatement();
    }
}
