package ucu.edu.Task2;

import com.mailjet.client.MailjetRequest;
import com.mailjet.client.MailjetResponse;

import lombok.*;

@Data
public class Client {
    private static int idCounter = 0;

    private int id;
    private String name;
    private int age;
    private String sex;
    private String email;

    public Client(String name, int age, String sex, String email) {
        this.id = idCounter++;
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.email = email;
    }

    public MailjetResponse post(MailjetRequest request) {
        return null;
    }
}
