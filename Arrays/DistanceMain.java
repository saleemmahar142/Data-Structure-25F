/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arrays;

/**
 *
 * @author Muhammad Saleem
 */
public class DistanceMain {
    public static void main(String[] args) {
        int A[] = {85,90,78,92};
        int B[] = {82,88,80,90};
        int N[]={83,85,82,88};
        int sum=0;
        for (int i = 0; i < A.length; i++) {
            int diff = A[i] - B[i];
            
            sum = sum+ (diff*diff);
        }
        
        double d = Math.sqrt(sum);
        System.out.println("Distance betweeen two points {85,90,78,92}, {82,88,80,90} is:   "+d);
     }
}
