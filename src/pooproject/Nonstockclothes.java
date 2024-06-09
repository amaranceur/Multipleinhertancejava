/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pooproject;

import java.io.IOException;

/**
 *
 * @author elon musk
 */
public class Nonstockclothes implements Produit {
    protected String name;
    protected double price;
    protected int availableStock;
    protected String size;

    public Nonstockclothes(String name, double price, int availableStock, String size) throws IOException {
        this.name = name;
        this.price = price;
        this.availableStock = availableStock;
        this.size = size;
        add_product(this,"clothes.txt");
 
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getAvailableStock() {
        return availableStock;
    }

    public void setAvailableStock(int stock) {
        this.availableStock = stock;
    }

    public String getSize() {
        return size;
    }
    public String toString(){
        return "name: "+this.name+"price: "+price+"avilaiblestock: "+availableStock+"size: "+size;
    }

}
