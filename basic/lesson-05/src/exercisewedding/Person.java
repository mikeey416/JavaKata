package exercisewedding;

import java.time.LocalDate;

public class Person {
    private String firstName;
    private String lastName;
    private LocalDate birthDate;

    public Person(String firstName, String lastName, LocalDate birthDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
    }

    public String toString() {
        return "firstname=" + this.firstName +
                " lastName=" + this.lastName +
                " birthDate=" + this.birthDate;
    }

}
