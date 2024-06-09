/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pooproject;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author elon musk
 */
public interface Produit {
     String getName();
    double getPrice();
    String toString();
    default void add_product( Object p,String path) throws IOException{
        try(BufferedWriter writer = new BufferedWriter(new FileWriter(path,true))){
            if(!Stockable.exist(this,path)){
            writer.write(this.toString());
            writer.newLine();
        }}  
        
     };
    
    
}
