package shoppingcart;

public class Item {
    // private fields
    private String name;
    private double price;
    private int quantity;

    //Cons for item
   public Item(String name, double price, int quantity) {
        // set fields base on parameters
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    //accessor methods
    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // to String override
    @Override
    public String toString() {
        return "Item " + this.name + "\t\tPrice " + this.price + "\tQuantity " + this.quantity;
    }
}
