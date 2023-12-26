package ucu.edu.task2.codes;

import ucu.edu.task2.Client;

public class BirthdayStrategy implements LetterStrategy {
    @Override
    public String generateLetter(Client client) {
        return "Happy Birthday, " + client.getName() + "!";
    }
}
