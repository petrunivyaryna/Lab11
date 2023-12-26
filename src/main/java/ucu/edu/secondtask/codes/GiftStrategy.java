package ucu.edu.secondtask.codes;

import ucu.edu.secondtask.Client;

public class GiftStrategy implements LetterStrategy {
    @Override
    public String generateLetter(Client client) {
        return "Dear " + client.getName() + ", you've received a special gift!";
    }
}
