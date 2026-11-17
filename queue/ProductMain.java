/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package queue;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 *
 * @author Muhammad Saleem
 */
public class ProductMain {
    public static void main(String[] args) {
        PriorityQueue<Product> q = new PriorityQueue<>();
        Product p1 = new Product(11, "iPhone X", 50000, 5);
        Product p2 = new Product(1, "Samsung S2", 5000, 4);
        Product p3 = new Product(5, "Infinix", 10000, 2);
        Product p4 = new Product(4, "iPhone 16", 5200000, 10);
        Product p5 = new Product(6, "Note 13 pro", 70000, 8);
        
        q.offer(p1);
        q.offer(p2);
        q.offer(p3);
        q.offer(p4);
        q.offer(p5);
        
        int coun=1;
        while(!q.isEmpty()){
            System.out.println("******* Product Count:  "+coun);
            System.out.println(q.poll().prices);
            coun++;
        }
        
    }
}
