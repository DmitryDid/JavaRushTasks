package com.javarush.task.task18.task1828;

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
        return Integer.parseInt(id.trim());
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return String.format("%-8s%-30s%-8s%-4s\n", id, productName, price, quantity);
    }
}
