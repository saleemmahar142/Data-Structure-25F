/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package queue;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 *
 * @author Muhammad Saleem
 */
public class PQMain {
    public static void main(String[] args) {
        Queue<Integer> q = new PriorityQueue(Collections.reverseOrder());
        q.offer(10);
        q.offer(2);
        q.offer(5);
        q.offer(11);
        q.offer(6);
        q.offer(7);
        q.offer(4);
        q.offer(15);
        q.offer(13);
        
        System.out.println(q);
        while(!q.isEmpty()){
            System.out.print(q.poll()+" ");
        }
        
    }
}
