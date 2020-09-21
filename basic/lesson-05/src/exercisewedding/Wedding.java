package exercisewedding;

import java.time.LocalDate;

public class Wedding {
    private LocalDate weddingDate;
    private Couple couple;
    private String venue;

    public Wedding(LocalDate weddingDate, Couple couple, String venue) {
        this.weddingDate = weddingDate;
        this.couple = couple;
        this.venue = venue;
    }

    public String toString() {
        return "weddingDate=" + weddingDate +
                "\n, couple=" + couple +
                "\n, venue=" + venue;
    }
}
