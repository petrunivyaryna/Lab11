package ucu.edu.secondtask;

import ucu.edu.secondtask.codes.LetterStrategy;

public class MailInfo {
    private Client client;
    private LetterStrategy mailCode;

    public MailInfo(Client client, LetterStrategy mailCode) {
        this.client = client;
        this.mailCode = mailCode;
    }

    public Client getClient() {
        return client;
    }

    public LetterStrategy getMailCode() {
        return mailCode;
    }

    @Override
    public String toString() {
        return "MailInfo(client=" + client + ", mailCode=" + mailCode + ")";
    }
}
