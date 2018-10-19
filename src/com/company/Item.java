package com.company;

public class Item {
    private String itemName;
    private double itemPrice;
    private int itemQuantity;
    private boolean itemTaxable;

    public Item() {
    }

    public Item(String itemName, double itemPrice, int itemQuantity, boolean itemTaxable) {
        this.itemName = itemName;
        this.itemPrice = itemPrice;
        this.itemQuantity = itemQuantity;
        this.itemTaxable = itemTaxable;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public double getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(double itemPrice) {
        this.itemPrice = itemPrice;
    }

    public int getItemQuantity() {
        return itemQuantity;
    }

    public void setItemQuantity(int itemQuantity) {
        this.itemQuantity = itemQuantity;
    }

    public boolean isItemTaxable() {
        return itemTaxable;
    }

    public void setItemTaxable(boolean itemTaxable) {
        this.itemTaxable = itemTaxable;
    }
    public double cost(){
        double cost = itemPrice * itemQuantity;
        return cost;
    }
}