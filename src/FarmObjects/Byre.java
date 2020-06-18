package FarmObjects;


public class Byre extends Buildings {

    public Byre(String name, Double price, Double capacity) {
        super(name, price, capacity);
    }

    @Override
    public String toString() {
        return "name" + name + "price" + price;
    }
}
