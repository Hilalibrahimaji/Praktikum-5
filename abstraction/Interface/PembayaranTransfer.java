package abstraction.Interface;

public class PembayaranTransfer implements Pembayaran {
    @Override
    public void prosesPembayaran(double jumlah) {
        System.out.println("Proses pembayaran transfer sebesar: " + jumlah);
    }
    
}
