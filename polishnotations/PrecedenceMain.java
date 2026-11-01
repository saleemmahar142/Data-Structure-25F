/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package polishnotations;

import java.util.Scanner;

/**
 *
 * @author Muhammad Saleem
 */
public class PrecedenceMain {
    public static void main(String[] args) {
        char a,b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first operator");
        a = sc.next().charAt(0);
        System.out.println("Enter second operator");
        b = sc.next().charAt(0);
        Precedence p = new Precedence();
        if(p.checkPrecedence(a) >= p.checkPrecedence(b)){
            System.out.println("First Operator "+a+" has higest precedence than second operator "+b);
        }else{
            System.out.println("Second Operator "+b+" has higest precedence than first operator "+a);
        }
    }
   
}
