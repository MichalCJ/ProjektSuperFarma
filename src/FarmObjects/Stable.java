package FarmObjects;

public class Stable extends Buildings {
    public Stable(String name, double price, double capacity) {
        super(name, price, capacity);
    }

    @Override
    public String toString() {
        return "name : " + name + "price : " + price;
    }

}
