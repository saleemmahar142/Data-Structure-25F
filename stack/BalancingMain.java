/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package stack;

/**
 *
 * @author Muhammad Saleem
 */
public class BalancingMain {
    public static void main(String[] args) {
        String st = "[[(){a+b)}]]";
        StaticStack stack = new StaticStack(100);
        int values = stack.balanceParenthesis(st);
        if(values == 1)
            System.out.println("Expression is Balanced");
        else
            System.out.println("Expression is not balanced");
//        int op = 0;
//        int cl=0;
//        for (int i = 0; i < st.length(); i++) {
//            if(st.charAt(i) == '[' || st.charAt(i) == '{' || st.charAt(i) == '('){
//            
//                op++;
//            }
//             if(st.charAt(i) == ']' || st.charAt(i) == '}' || st.charAt(i) == ')'){
//            
//                cl++;
//            }
//        }
//        
//        if(op == cl)
//            System.out.println("Right and Left Parenthesis are equal");
//        else
//            System.out.println("Not equal");
//        
    }
}
