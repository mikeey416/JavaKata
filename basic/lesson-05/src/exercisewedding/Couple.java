package exercisewedding;

public class Couple {
    private Person groom;
    private Person bride;

    public Couple(Person groom, Person bride) {
        this.groom = groom;
        this.bride = bride;
    }

    public String toString() {
        return "groom=" + groom +
                ", bride=" + bride;
    }
}
