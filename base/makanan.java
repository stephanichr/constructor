package base;

public class makanan extends produk{
    private int expired;

    public makanan(String nama, double harga, int stok, int expired){
        super(nama, harga, stok);
        this.expired = expired;
    }
    
    public void tampilData(){
        super.tampilkanInfo();
        System.out.println("masa expired: "+expired);
    }

    public void setExpired(int expired){
        this.expired = expired;
    }
}