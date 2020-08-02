package training.lesson03d.instancefields;

class AddressFieldRusselLoadingStation {

    private String address =  "Russel Loading Station"
            + "\nTalang"
            + "\nFloridablanca Pampanga";

    public String getAddress() {
        return this.address;
    }

    public static void main(String[] args) {

        AddressFieldRusselLoadingStation addressFieldRusselLoadingStation = new AddressFieldRusselLoadingStation();
        String russelLoadingStationAddress = addressFieldRusselLoadingStation.getAddress();

        System.out.println("Address ni Russel: " + russelLoadingStationAddress);

    }

}
