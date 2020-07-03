package FarmObjects;

public class Buildings {
    public String name;
    public Double price;
    public Double capacity;

    public Buildings(String name, double price, double capacity) {
        this.name = name;
        this.price = price;
        this.capacity = capacity;

    }


    public Double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "  name: " + this.name + "  price:  " + this.price + " capacity: " + this.capacity;
    }


}
