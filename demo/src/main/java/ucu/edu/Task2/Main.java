package ucu.edu.Task2;

import ucu.edu.Task2.codes.BirthdayStrategy;
import ucu.edu.Task2.codes.LetterStrategy;

public class Main {
    public static void main(String[] args) {
        try {
            Client client1 = new Client("Yaryna", 18, "Female", "petruniv.pn@ucu.edu.ua");
            LetterStrategy birthdayStrategy = new BirthdayStrategy();

            MailSender mailSender = new MailjetMailSender();

            MailBox mailBox = new MailBox();
            mailBox.addMailInfo(new MailInfo(client1, birthdayStrategy));
            mailBox.sendAll(mailSender);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
