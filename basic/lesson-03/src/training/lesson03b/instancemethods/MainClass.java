package training.lesson03b.instancemethods;

public class MainClass {

    public static void main(String[] args) {
        AddressJanBagoongan addressJanBagoongan = new AddressJanBagoongan();
        addressJanBagoongan.displayAddress();

        AddressRusselLoadingStation addressRusselLoadingStation = new AddressRusselLoadingStation();
        String russelLoadingStationAddress = addressRusselLoadingStation.getAddress();
        System.out.println(russelLoadingStationAddress);

        System.out.println("Instance Method Java application");
    }
}
