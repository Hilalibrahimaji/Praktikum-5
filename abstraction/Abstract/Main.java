package abstraction.Abstract;

public class Main {
    public static void main(String[] args) {
        Kendaraan k1 = new Mobil();
        Kendaraan k2 = new Kapal();

        k1.info();
        k1.bergerak();

        k2.info();
        k2.bergerak();
    }
}
