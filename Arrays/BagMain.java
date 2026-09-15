/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arrays;
public class BagMain {
    public static void main(String[] args) {
        Bag bag = new Bag(5);
        bag.insert(20);
        bag.insert(10);
        bag.insert(13);
        bag.insert(18);
        bag.insert(33);
        bag.insert(100);
        bag.insert(20);
        bag.insert(10);
        bag.insert(13);
        bag.insert(18);
        bag.insert(33);
        bag.insert(100);
        bag.display();
//        bag.removeAt(1);
//        System.out.println("After removing an element");
//        bag.display();
//        bag.removeAt(1);
//        System.out.println("After removing an element");
//        bag.display();
//        bag.removeAt(1);
//        System.out.println("After removing an element");
//        bag.display();
//        bag.removeAt(1);
        System.out.println("After removing an element");
        bag.display();
        int x = bag.find(18);
        if(x != -1)
            System.out.println("element found at " + x);
        else
            System.out.println("element not found ");
            
        bag.removeFirst();
        bag.display();
        bag.removeLast();
        bag.display();
        bag.insertAt(2,51515);
        bag.display();
        bag.insertAt(0,303030);
        bag.display();
        int n = 10;
        int occ = bag.occurenceOf(n);
        System.out.println(n+" occurs "+occ+" times in the list");
    }
}
