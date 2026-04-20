import base.produk;

public class main {
    public static void main(String[] args) {

        produk p = new produk("indomie goreng", 5000.0, 100);

        System.out.println(p.getHarga());
        System.out.println(p.getNama());

        p.setHarga(10000.0);
        p.setStok(150);

        System.out.println(p.getHarga());
        System.out.println(p.getNama());
        System.out.println(p.getStok());
    }
}