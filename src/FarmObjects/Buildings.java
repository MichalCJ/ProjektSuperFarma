package FarmObjects;

public abstract class Buildings {
    public String name;
    public double price;
    public double capacity;

    public Buildings(String name, double price, double capacity) {
        this.name = name;
        this.price = price;
        this.capacity = capacity;

    }


    @Override
    public String toString() {
        return " name: " + this.name + " price: " + this.price;
    }
}
