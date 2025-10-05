package overriding;

public class Main {
    public static void main(String[] args) {
        Hewan h1 = new Kucing();
        Hewan h2 = new Anjing();

        h1.bersuara(); 
        h2.bersuara(); 
    }
}
