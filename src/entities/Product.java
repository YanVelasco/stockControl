package entities;

public class Product {
    private String name;
    private double price;
    private int quantity;

    public Product(String name, double price, int quantity){
        this.name = name;
        this.price = price;
        this.quantity = quantity; 
    }

    public Product(String name, double price){
        this.name = name;
        this.price = price;
    }
        
    public double tatalValueInStock(){
        return price * quantity;
    }

    public void AddProducts(int quantity){
        this.quantity += quantity;
    }

    public void RemoveProducts(int quantity){
        this.quantity -= quantity;
    }

    public String toString(){
        return  name +", $ "+
        String.format("%.2f", price) + ", units " + String.format("%d", quantity) + ", Total: " + String.format("%.2f", tatalValueInStock());
    }
}