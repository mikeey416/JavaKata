package training.lesson03d.instancefields;

public class KahitSinoAddress {

    private String address;

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String inputAddress) {
        this.address = inputAddress;
    }

    public static void main(String[] args) {

        KahitSinoAddress janAddress = new KahitSinoAddress();
        janAddress.setAddress("Jan BagoongHouse Poblacion Floridablanca Pampanga");

        System.out.println("Jan's Address: " + janAddress.getAddress());

    }
}
