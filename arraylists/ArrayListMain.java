/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arraylists;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Muhammad Saleem
 */
public class ArrayListMain {
    public static void main(String[] args) {
        
        ArrayList list = new ArrayList();
        //ArrayList<Integer> list2= new ArrayList<>();
        list.add("Dawood");
        list.add('i');
        list.add('s');
        list.add(2025);
        list.add(true);
        list.add(false);
        list.add(5.234560);
        list.add(0,"Uni ");
        System.out.println(list);
        for (int i = 0; i < list.size(); i++) {
            //System.out.println(list.get(i));
            Object x = list.get(i);
        }
        
        System.out.println("For each");
        for (Object i:list) {
            
        }
        
//        list2.add(3);
//        list2.add(13);
//        list2.add(30);
//        list2.add(2);
//        list2.add(100);
//        list2.add(24);
//        list2.add(34);
//        list2.add(67);
//        list2.add(89);
//        System.out.println(list2);
//        list2.add(0,50);
//        System.out.println(list2);
//        System.out.println("Item available: "+list2.contains(890));
//        System.out.println(list2.indexOf(67));
//        
//        Collections.sort(list2);
//        System.out.println(list2);
        
        
    }
}
