package TIKET;
public abstract class tiket {
    public int jumlah,harga;
    
    public tiket (int jumlah, int harga)
    {        
        this.jumlah=jumlah;
        this.harga=harga;
    }
    
    abstract int hitungharga();
    abstract int hitungtotal();
}
