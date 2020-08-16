package lesson04a.methodparameters;

public class TagaSukli {
    public double sukli(double bayad, double presyo, double discountPercent) {
        return bayad - (presyo - (presyo * discountPercent));
    }
}
