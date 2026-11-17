/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 *
 * @author Muhammad Saleem
 */
public class SmartStudent {
    Queue<Student> queue = new LinkedList<>();
    Scanner sc = new Scanner(System.in);
    public void addStudent(){
    
        System.out.println("Enter ID");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter name");
        String name = sc.nextLine();
        sc.nextLine();
        System.out.println("Enter Reason/Proble");
        String reason = sc.nextLine();
        int urgency = recommendUrgency(reason);
        Student st = new Student(id, name, reason, urgency);
        
        queue.add(st);
        System.out.println("Student Added Successfully in the Queue");
        System.out.println("AI Rule based urgency is:   "+urgency);
        
    }
    public void serveStudent(){
        System.out.println("**************Serving Student **************");
        if(queue.isEmpty()){
            System.out.println("There is no any student in the Queue");
            return;
        }
        System.out.println(queue.poll());
        System.out.println("*******************************************");
    }
    public void waitingList(){
        System.out.println("**************Waiting List **************");
    if(queue.isEmpty()){
            System.out.println("There is no any student in the waiting");
            return;
    }
    while(!(queue.isEmpty()))
        System.out.println(queue.poll());
    System.out.println("*******************************************");
    }
    
    public int recommendUrgency(String reason){
    
        reason = reason.toLowerCase();
        if(reason.equals("medical")){
            return 1;
        }else if(reason.equals("job")){
            return 2;
        }else if(reason.equals("deadline")){
            return 3;
        }else if(reason.equals("submission")){
            return 4;
        }else{
            return 5;
        }
    }
}
