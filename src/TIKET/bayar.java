package TIKET;

public class bayar extends tiket {
    public bayar(int jumlah, int harga)
    {
        super(jumlah,harga);
    }

    @Override
    int hitungharga() {
        return jumlah*harga;
    }

    @Override
    int hitungtotal() {
        return hitungharga();
    }
}
