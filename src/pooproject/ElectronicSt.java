/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pooproject;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author elon musk
 */
class ElectronicSt implements Produit, Stockable {
    private String name;
    private double price;
    private int availableStock;
    private String manufacturer;

    public ElectronicSt(String name, double price, int availableStock, String manufacturer) throws IOException {
        this.name = name;
        this.price = price;
        this.availableStock = availableStock;
        this.manufacturer = manufacturer;
        add_product(this,"electronic.txt");
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getPrice() {
        return price;
    }

    public int getAvailableStock() {
        return availableStock;
    }

    public void setAvailableStock(int stock) {
        this.availableStock = stock;
    }

    public String getManufacturer() {
        return manufacturer;
    }
    public String toString(){
          return "name: "+this.name+"price: "+price+"avilaiblestock: "+availableStock+"manufacturer: "+manufacturer;

    }
    public void add_product(Object p,String path) throws IOException{
        Stockable.super.add_product(p,"stock.txt");
        Produit.super.add_product(p,path);

    }

    
   
   
   

   
    
}