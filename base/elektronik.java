package base;

public class elektronik extends produk{
    private int masaGaransi;

    public elektronik(String nama, double harga, int stok, int masaGaransi){
        super(nama, harga, stok);
        this.masaGaransi = masaGaransi;
    }
    
    public void tampilData(){
        super.tampilkanInfo();
        System.out.println("masa garansi: "+masaGaransi);
    }

    public void setGaransi(int masaGaransi){
        this.masaGaransi = masaGaransi;
    }
}