package com.javarush.task.task18.task1827;

public class Product {
    private String id;
    private String productName;
    private String price;
    private String quantity;

    public Product(String id, String productName, String price, String quantity) {
        this.id = id.trim();
        this.productName = productName.trim();
        this.price = price.trim();
        this.quantity = quantity.trim();
    }

    public int getId() {
        return Integer.parseInt(id);
    }

    @Override
    public String toString() {
        return String.format("\n%-8s%-30s%-8s%-4s", id, productName, price, quantity);
    }
}
