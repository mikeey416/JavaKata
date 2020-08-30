package lesson05b;

public class Car {
    private Wheels wheels;
    private String model;
    private int year;

    public Wheels getWheels() {
        return wheels;
    }

    public void setWheels(Wheels wheels) {
        this.wheels = wheels;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String toString() {
        return "Car{"+
                "\n model=" + this.model +
                "\n year=" + this.year +
                "\n wheel=" + this.wheels.toString() +
                "\n}";
    }
}
