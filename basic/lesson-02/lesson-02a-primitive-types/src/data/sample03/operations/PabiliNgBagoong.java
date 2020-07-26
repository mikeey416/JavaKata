package data.sample03.operations;

public class PabiliNgBagoong {

    static final double BAGOONG_NI_JAN_PRICE = 32.05;

    public static void main(String[] args) {
        int ilanBagoong = 5;

        //multiply presyo at ilan piraso
        double babayaranMo = BAGOONG_NI_JAN_PRICE * ilanBagoong;

        System.out.println("Babayaran mo kay Jan: " + babayaranMo);

        double bayad = 200;
        System.out.println("Pera mo: " + bayad);

        //substract
        System.out.println("Sukli mo: " + (bayad - babayaranMo));
    }
}
