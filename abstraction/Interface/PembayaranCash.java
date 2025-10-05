package abstraction.Interface;

public class PembayaranCash implements Pembayaran {
    @Override
    public void prosesPembayaran(double jumlah) {
        System.out.println("Proses pembayaran cash sebesar: " + jumlah);
    }
    
}
