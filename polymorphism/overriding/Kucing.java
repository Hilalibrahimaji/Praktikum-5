package overriding;

public  class Kucing extends Hewan {
    @Override
    void bersuara() {
        System.out.println("Meow");
    }
}
