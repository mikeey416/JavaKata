package lesson04a.methodparameters;

public class StaticMainClass {
    public static void main(String[] args) {
        double bayad = 200.00;
        double presyo = 150.00;

        System.out.println("Bayad: " + bayad);
        System.out.println("Presyo: " + presyo);
        System.out.println("Sukli: " + sukli(bayad, presyo));
    }

    public static double sukli(double bayad, double presyo) {
        return bayad - presyo;
    }

}
