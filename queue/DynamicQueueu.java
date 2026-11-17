/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package queue;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author Muhammad Saleem
 */
public class DynamicQueueu {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        
        queue.offer(10);
        queue.offer(20);
        queue.offer(30);
        queue.offer(40);
        queue.offer(50);
        System.out.println(queue.peek());
        System.out.println(queue.poll());
        System.out.println(queue.peek());
                
    }
}
