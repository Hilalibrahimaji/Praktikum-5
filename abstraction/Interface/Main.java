package abstraction.Interface;

public class Main {
    public static void main(String[] args) {
        Pembayaran pembayaran1 = new PembayaranCash();
        Pembayaran pembayaran2 = new PembayaranTransfer();

        pembayaran1.prosesPembayaran(100000);
        pembayaran2.prosesPembayaran(250000);
    }
}
