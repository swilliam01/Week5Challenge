package com.company;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        Random rand = new Random();
        String response = "";
        double subTotal = 0;
        double salesTax = 0;
        double total = 0;
        ArrayList<Item> list = new ArrayList<>();
        ArrayList<Double> taxRate = new ArrayList<>();

        taxRate.add(6.00);
        taxRate.add(5.30);
        taxRate.add(5.75);
        taxRate.add(5.00);


        do {
            System.out.println("Enter item name: ");
            String name = keyboard.next();
            System.out.println("Price: ");
            double price = keyboard.nextDouble();
            System.out.println("Quantity: ");
            int quantity = keyboard.nextInt();
            System.out.println("Taxable (true or false): ");
            boolean taxable = keyboard.nextBoolean();

            list.add(new Item(name, price, quantity, taxable));
            System.out.println("Add another item (y or n): ");
            response = keyboard.next();
        } while (!response.equalsIgnoreCase("n"));
        int index = rand.nextInt(taxRate.size() - 1);
        double tax = taxRate.get(index);
        System.out.println("My current tax rate is: " + tax);
        System.out.println("Item Name" + "\t\t\t" + "Quantity" + "\t\t\t" + "Price" + "\t\t\t" + "Cost" + "\t\t\t" + "Taxable");
        System.out.println("=================================================================================");
        for (Item list2 : list) {
            System.out.println(list2.getItemName() + "\t\t\t\t" + list2.getItemQuantity() + "\t\t\t\t" + list2.getItemPrice() + "\t\t\t\t" + list2.cost() +
                    "\t\t\t\t" + list2.isItemTaxable());
            subTotal = subTotal + list2.cost();

            if (list2.isItemTaxable() == true) {
                salesTax = salesTax + (list2.cost() * (tax / 100));
                total = subTotal + salesTax;
            }
        }
        System.out.println("\n");
        System.out.print("\nSubtotal: $");System.out.printf("%.2f", subTotal);
        System.out.print("\nTax Rate = ");System.out.printf("%.2f", tax);
        System.out.print("%");
        System.out.print("\nSales Tax: "); System.out.print("$"); System.out.printf("%.2f",salesTax);
        System.out.println("\n");
        System.out.println("--------------------------------------------------------------------------------");
        if (total > 0){
            System.out.print("Total: $");System.out.printf("%.2f", total);
        }
        else {
            System.out.println("Total:" + subTotal);
        }
    }

}