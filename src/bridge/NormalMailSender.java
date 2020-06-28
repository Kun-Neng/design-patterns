package src.bridge;

public class NormalMailSender extends MailSender {
    public NormalMailSender(Mail mail) {
        super(mail);
    }

    @Override
    void send() {
        System.out.println("Mail will be received in 3 to 5 days");
        super.mail.showRegisterStatement();
    }
}
