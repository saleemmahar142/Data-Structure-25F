/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package linkedlists;

/**
 *
 * @author Muhammad Saleem
 */
public class LLMain {
    public static void main(String[] args) {
        LL l1 = new LL();
        l1.addFirst(30);
        l1.addFirst(40);
        l1.addFirst(50);
        l1.displayLL();
        l1.addLast(100);
        l1.displayLL();
    }
}
