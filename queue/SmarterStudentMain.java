/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package queue;

import java.util.Scanner;

/**
 *
 * @author Muhammad Saleem
 */
public class SmarterStudentMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SmartStudent students = new SmartStudent();
        int choice;
        do{
            System.out.println("Student Queue Managment");
            System.out.println("1. Add Student");
            System.out.println("2. Serve Student");
            System.out.println("3. Waiting List");
            System.out.println("4. Exit");
            
            System.out.println("Enter any selection");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    students.addStudent();
                    break;
                case 2:
                    students.serveStudent();
                    break;
                case 3:
                    students.waitingList();
                break;
                default:
                    throw new AssertionError();
            }
            
        }while(choice!=4);
                
    }
}
