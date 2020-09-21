package exercisewedding;

import java.time.LocalDate;

public class TestWedding {
    public static void main(String[] args) {
        Person groom = new Person(
                "Russel",
                "Manalac",
                LocalDate.of(1994, 01, 01));

        Person bride = new Person(
                "Rose",
                "Marie",
                LocalDate.of(1995, 02, 02));

        Couple couple = new Couple(groom, bride);

        Wedding wedding = new Wedding(
                LocalDate.of(2020, 12, 12),
                couple,
                "Floridablanca"
                );
        System.out.print(wedding);
    }
}
