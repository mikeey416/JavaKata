package lesson04a.methodparameters;

public class TagaSukliMainClass {
    public static void main(String[] args) {
        double bayad = 200.00;
        double presyo = 150.00;
        double discountPercent = 0.10;

        System.out.println("Bayad: " + bayad);
        System.out.println("Presyo: " + presyo);
        System.out.println("Discounted: " + presyo * discountPercent);

        TagaSukli tagaSukli = new TagaSukli();
        System.out.println("Sukli: " + tagaSukli.sukli(bayad, presyo, discountPercent));
    }
}
