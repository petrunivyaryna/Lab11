package ucu.edu.task1;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.ToString;

@Builder
@AllArgsConstructor
@ToString
public class User {
    private static final int DEFAULT_AGE = 18;
    private static final double DEFAULT_HEIGHT = 170.0;
    private static final double DEFAULT_WEIGHT = 50.0;

    private String name;
    private int age;
    private Gender gender;
    private double weight;
    private double height;

    public static void main(String[] args) {
        User user = User.builder()
                .name("Yaryna")
                .age(DEFAULT_AGE)
                .gender(Gender.FEMALE)
                .height(DEFAULT_HEIGHT)
                .weight(DEFAULT_WEIGHT)
                .build();
        System.out.println(user.toString());
    }
}
