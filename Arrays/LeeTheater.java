/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arrays;

/**
 *
 * @author Muhammad Saleem
 */
public class LeeTheater {
    public static void main(String[] args) {
        int booked = 0;
        int empty = 0;
        int total=0;
        int seats[][] = {
            {1,1,0,0,0},{0,1,1,1,0},{1,1,0,0,1},{1,1,1,1,1},{0,0,1,1,1}
        };
        for (int x[]:seats) {
            for (int y:x) {
                if(y==1){
                    booked++;
                    total++;
                }else{
                    empty++;
                    total++;
                }
                
            }
        }
        System.out.println("Total Seats are:    "+total);
        System.out.println("Total Avaialable seats: "+empty);
        System.out.println("Total Reserved seats:   "+booked);
        
        double p = (double)booked / total * 100;
        System.out.println("Percentage of Occupancy:    "+p+"%");
        
        for (int x[]:seats) {
            for (int y:x) {
                if(y==1){
                    System.out.print(" X ");
                }else{
                    System.out.print(" 0 ");
                }
                
            }
            System.out.println("");
        }
    }
}
