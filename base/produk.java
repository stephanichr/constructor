package base;

public class produk {
    // Atribut
    private String nama;
    protected double harga;
    public int stok;

    // Constructor
    public produk(String nama, double harga, int stok) {
        this.nama = nama;
        this.harga = harga;
        this.stok = stok;
    }

    public String getNama() {
        return nama;
    }

    public double getHarga() {
        return harga;
    }

    public int getStok() {
        return stok;
    }

   

    // public void tampilkanInfo() {
    // System.out.println("produk: " + nama);
    // System.out.println("Harga: " + harga);
    // System.out.println("Stok: " + stok);
    // System.out.println("==========");
    // }
}