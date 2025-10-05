package overloading;

public class Main {
    public static void main(String[] args) {
        Matematika m = new Matematika();
        System.out.println("Tambah 2 int: " + m.tambah(5, 10));
        System.out.println("Tambah 3 int: " + m.tambah(1, 2, 3));
        System.out.println("Tambah 2 double: " + m.tambah(4.5, 6.3));
    }
}
