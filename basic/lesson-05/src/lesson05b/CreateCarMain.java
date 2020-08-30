package lesson05b;

public class CreateCarMain {
    public static void main(String[] args) {
        Car car = new Car();
        car.setModel("Honda");
        car.setYear(2003);

        Wheels wheels = new Wheels();
        wheels.setBrand("Yokohama");
        wheels.setSize(16);

        car.setWheels(wheels);

        System.out.println("My car is \n" + car);
    }
}
