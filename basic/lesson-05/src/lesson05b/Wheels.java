package lesson05b;

public class Wheels {
    private int size;
    private String brand;

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String toString() {
        return "\tWheel{" +
                "\n\tsize=" + this.size +
                "\n\tbrand=" + this.brand +
                "\n\t}";
    }
}
