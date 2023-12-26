package ucu.edu.Task2.codes;

import ucu.edu.Task2.Client;

public class BirthdayStrategy implements LetterStrategy {
    @Override
    public String generateLetter(Client client) {
        return "Happy Birthday, " + client.getName() + "!";
    }
}
