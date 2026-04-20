
import base.elektronik;
import base.makanan;


public class main {
    public static void main(String[] args) {
        elektronik e = new elektronik("Mesin Cuci", 10000000, 1, 1);
        makanan m = new makanan("Tahu Bulat", 100000, 10, 1);
        e.setGaransi(12);
        m.setExpired(2);
        e.tampilData();
        m.tampilData();
    }
}