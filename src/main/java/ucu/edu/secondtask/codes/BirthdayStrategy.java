package ucu.edu.secondtask.codes;

import ucu.edu.secondtask.Client;

public class BirthdayStrategy implements LetterStrategy {
    @Override
    public String generateLetter(Client client) {
        return "Happy Birthday, " + client.getName() + "!";
    }
}
