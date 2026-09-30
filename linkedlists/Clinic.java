/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package linkedlists;

/**
 *
 * @author Muhammad Saleem
 */
public class Clinic {
    class Counter{
        int token;
        String pName;
        int age;
        String doc;
        Counter next;

        public Counter(int token, String pName, int age, String doc) {
            this.token = token;
            this.pName = pName;
            this.age = age;
            this.doc = doc;
            this.next = null;
        }
        
    } // end of counter class
    
    Counter head=null;
    public void issueToken(int tokenNo, String name, int age, String doc){
        Counter tokenIssue = new Counter(tokenNo, name, age, doc);
        if(head==null){
            head = tokenIssue;
            return;
        }
        
        Counter temp = head;
        while(temp.next!=null){
        temp = temp.next;
        }
        temp.next=tokenIssue;
            
    
    }
    
    public void displayPatients(){
       Counter temp = head;
       int pNo = 0;
       while(temp!=null){
           System.out.println("********* Patient No. "+(++pNo)+"***********");
           System.out.println("Token NO.    "+temp.token);
           System.out.println("Patient Name.    "+temp.pName);
           System.out.println("Patient Age.    "+temp.age);
           System.out.println("Doctor Appointment.    "+temp.doc);
           temp = temp.next;
       }
              
    }
}
