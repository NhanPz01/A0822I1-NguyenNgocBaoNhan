package ss12_arraylist_linkedlist_java_collection_framework;

public class Product {
    private int id;
    private String name;
    private double price;
    private double amount;

    public Product() {
    }

    public Product(int id, String name, double price, double amount) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.amount = amount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "id : " + this.id + " | " +
                "name : " + this.name + " | " +
                "price : " + this.price + " | " +
                "amount : " + this.amount;
    }
}
