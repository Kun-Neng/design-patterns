package src.bridge;

public abstract class MailSender {
    protected Mail mail;

    public MailSender(Mail mail) {
        this.mail = mail;
    }

    abstract void send();
}
