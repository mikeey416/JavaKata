package training.lesson03c.instancemethods;

import training.lesson03b.instancemethods.AddressJanBagoongan;
//import training.lesson03b.instancemethods.AddressRusselLoadingStation;

public class OtherMainClass {
    public static void main(String[] args) {
        AddressJanBagoongan addressJanBagoongan = new AddressJanBagoongan();
        addressJanBagoongan.displayAddress();

        //AddressRusselLoadingStation addressRusselLoadingStation = new AddressRusselLoadingStation();
        //String russelLoadingStationAddress = addressRusselLoadingStation.getAddress();
       //System.out.println(russelLoadingStationAddress);

        System.out.println("OtherMainClass  Java application");
    }
}
