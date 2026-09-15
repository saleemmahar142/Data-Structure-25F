/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arrays;

/**
 *
 * @author Muhammad Saleem
 */
public class Bag {
    int myBag[];
    int count=0;
    Bag(int sizeOfBag){
        this.myBag = new int[sizeOfBag];
    }
    public void display(){
        for (int i = 0; i < count; i++) {
            System.out.print(myBag[i]+" ");
        }
        System.out.println("");
    }
    public void insert(int item){
        if(count==myBag.length){
            int newBag[] = new int[count *2];
            for (int i = 0; i < count; i++) {
                newBag[i] = myBag[i];
            }
            myBag = newBag;
        }
            
        myBag[count++] = item;
    }
    
    public void removeAt(int index){
        for (int i = index; i < count-1; i++) {
            myBag[i] = myBag[i+1];
        }
        count--;
    }
    public void removeFirst(){
        for (int i = 0; i < count-1; i++) {
            myBag[i] = myBag[i+1];
        }
        count--;
    }
    public void removeLast(){
        
        count--;
    }
    public int find(int item){
        for (int i = 0; i < count; i++) {
            if(item == myBag[i])
                return i;
        }
        
        return -1;
    }
    
    public void insertAt(int index, int value){
        for (int i =count; i > index; i--) {
            myBag[i] = myBag[i-1];
        }
        myBag[index] = value;
        count++;
    }
    
    public int occurenceOf(int value){
        int c=0;
        for (int i = 0; i < count; i++) {
            if(value == myBag[i])
                c++;
        }
        return c;
    }
}
