package ucu.edu.task2;

import ucu.edu.task2.codes.LetterStrategy;

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
