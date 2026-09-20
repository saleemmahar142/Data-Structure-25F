/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arrays;

/**
 *
 * @author Muhammad Saleem
 */
public class ArrayListUtilitiesTester {
    public static void main(String[] args) {
        ArrayListUtilities_Start aus = new ArrayListUtilities_Start();
        aus.buildList(10);
        System.out.println(aus);
        //aus.removeEvens();
        System.out.println(aus.getAverage());
        System.out.println(aus.getSum());
        aus.getMedian();
        aus.moveToBegining(0);
//        //aus.moveToEnd(0);
        aus.removeDuplicates();
        System.out.println(aus);
        aus.displayConsecutivePairs();
    }
}
