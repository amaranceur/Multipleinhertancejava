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
public interface Stockable {
    
    
    default void add_product(Object p,String path) throws IOException{
        try(BufferedWriter writer = new BufferedWriter(new FileWriter(path,true))){
            if(!exist(p,"stock.txt")){
            writer.write(p.toString());
            writer.newLine();
        }}
        }
    public static  boolean exist(Object p,String path) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.equals(p.toString())) {
                    return true;
                }
            }
        }
        return false;
    }
    
}
