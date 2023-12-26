package ucu.edu.secondtask;

import com.mailjet.client.errors.MailjetException;
import com.mailjet.client.errors.MailjetSocketTimeoutException;

import ucu.edu.secondtask.codes.BirthdayStrategy;
import ucu.edu.secondtask.codes.LetterStrategy;

public class Main {
    private static final int DEFAULT_AGE = 18;
    public static void main(String[] args)
            throws MailjetException, MailjetSocketTimeoutException {

            Client client = new Client("Yaryna", DEFAULT_AGE,
                    "Female", "petruniv.pn@ucu.edu.ua");
            LetterStrategy birthdayStrategy = new BirthdayStrategy();

            MailSender mailSender = new MailjetMailSender();

            MailBox mailBox = new MailBox();
            mailBox.addMailInfo(new MailInfo(client, birthdayStrategy));
            mailBox.sendAll(mailSender);
       
    }
}
