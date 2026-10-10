/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arraylists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Muhammad Saleem
 */
public class UniqueElements {
    public static void main(String[] args) {
        ArrayList<String> li = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter any word");
            String word = sc.next();
            if(!li.contains(word)){
                li.add(word);
            }
        }
        
        Collections.sort(li);
        System.out.println(li);
    }
}
