package ucu.edu.task2.codes;

import ucu.edu.task2.Client;

public class GiftStrategy implements LetterStrategy {
    @Override
    public String generateLetter(Client client) {
        return "Dear " + client.getName() + ", you've received a special gift!";
    }
}
