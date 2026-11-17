/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package queue;

/**
 *
 * @author Muhammad Saleem
 */
public class Product implements Comparable<Product>{
    int pID;
    String pName;
    int prices;
    int quantity;

    public Product(int pID, String pName, int prices, int quantity) {
        this.pID = pID;
        this.pName = pName;
        this.prices = prices;
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Product{" + "pID=" + pID + ", pName=" + pName + ", prices=" + prices + ", quantity=" + quantity + '}';
    }

    @Override
    public int compareTo(Product o) {
        return this.prices > o.prices ? 1:-1;
    }
    
    
}
