package FarmObjects;

public class ChickenCoop extends Buildings {
    public ChickenCoop(String name, double price, double capacity) {
        super(name, price, capacity);
    }

    @Override
    public String toString() {
        return "name : " + name + "price : " + price;
    }

}
