package ucu.edu.Task1;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.ToString;

enum Gender {
    MALE, FEMALE
}

@Builder
@AllArgsConstructor
@ToString
public class User {
    private String name;
    private int age;
    private Gender gender;
    private double weight;
    private double height;
    

    public static void main(String[] args) {
        User user = User.builder().
                name("Yaryna").
                age(18).
                gender(Gender.FEMALE).
                height(170).
                weight(50).build();
        System.out.println(user.toString());
    }
}