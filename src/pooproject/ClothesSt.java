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
public class ClothesSt implements  Stockable ,Produit {
    
     protected String name;
    protected double price;
    protected int availableStock;
    protected String size;

    public ClothesSt(String name, double price, int availableStock, String size) throws IOException {
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
    
     @Override
    public void add_product(Object p,String path) throws IOException{
        Stockable.super.add_product(p,"stock.txt");
        Produit.super.add_product(p,path);
        
    }
}

