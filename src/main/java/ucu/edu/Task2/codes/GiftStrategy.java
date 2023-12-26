package ucu.edu.Task2.codes;

import ucu.edu.Task2.Client;

public class GiftStrategy implements LetterStrategy {
    @Override
    public String generateLetter(Client client) {
        return "Dear " + client.getName() + ", you've received a special gift!";
    }
}
