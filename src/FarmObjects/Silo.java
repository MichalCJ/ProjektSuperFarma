package FarmObjects;

public class Silo extends Buildings {

    public Silo(String name, double price, double capacity) {
        super(name, price, capacity);
    }

    @Override
    public String toString() {
        return "name : " + name + "price : " + price;
    }

}
