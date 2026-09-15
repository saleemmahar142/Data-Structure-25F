/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arrays;

/**
 *
 * @author Muhammad Saleem
 */
public class TwoDDemo {
    
    public static void main(String[] args) {
        int myArr[][] = {
            {1,2,3},{4,5,6},{7,8,9},{10,11,12,14}
        };
        for (int ar[]:myArr) {
            for (int i:ar) {
                System.out.print(i+" ");
            }
            System.out.println("");
        }
        
        System.out.println(myArr[3][3]);
        System.out.println(myArr[2][3]);
    }
}
