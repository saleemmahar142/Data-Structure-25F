/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package generics;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 *
 * @author Muhammad Saleem
 */
public class GenericsMain {
    public static void main(String[] args) {
        Stack<Student> q1 = new Stack<>();
        Student st1 = new Student(1, "Ali", "CS");
        Student st2 = new Student(2, "Ali", "CS");
        Student st3 = new Student(3, "Ali", "CS");
        Student st4 = new Student(4, "Ali", "CS");
        q1.add(st1);
        q1.add(st2);
        q1.add(st3);
        q1.add(st4);
        
       
        
        
    }
}
