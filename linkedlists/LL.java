/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package linkedlists;

/**
 *
 * @author Muhammad Saleem
 */
public class LL {
    class Node{
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
        
    } // end of node class
    
    Node head = null;
    Node tail = null;
    public void addFirst(int data){
        Node newNode = new Node(data);
        if(head==null){
            head = tail = newNode;
        }else{
            newNode.next = head;
            head = newNode;
        }
    }
    public void displayLL(){
    
        Node current = head;
        while(current!=null){
            System.out.print(current.data+" -->");
            current = current.next;
                    
        }
        System.out.println("NULL");
    }
    
    public void addLast(int data){
    
        Node newNode = new Node(data);
        if(tail == null){
            tail = head = newNode;
        }else{
            tail.next = newNode;
            tail = newNode;
        }
    }
}   
