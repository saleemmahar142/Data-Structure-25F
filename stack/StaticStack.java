/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package stack;

import javax.swing.JOptionPane;

/**
 *
 * @author Muhammad Saleem
 */
public class StaticStack {
    char stackArr[];
    int top;

    public StaticStack(int sizeOfStack) {
        this.stackArr = new char[sizeOfStack];
        this.top = -1;
    }
    
    public void push(char data){
    
        if(top==stackArr.length-1){
            JOptionPane.showMessageDialog(null,"Stack Overflow");
        }else{
            stackArr[++top] = data;
        }
        
    }
    
    public char pop(){
        if(top==-1){
            JOptionPane.showMessageDialog(null,"Stack Underflow");
            return '-';
        }else{
            return stackArr[top--];
        }
    }
    
    public void decimalToBin(int n){
    int count=0;
        while(n>0){
            //this.push(n%2);
            n = n/2;
            count++;
        }
        System.out.println("");
        for (int i = 0; i <count ; i++) {
            System.out.print(this.pop());
        }
    }
    
    public int balanceParenthesis(String exp){
        int check = 0;
        int i;
        for (i=0;i < exp.length(); i++) {
            if(exp.charAt(i) == '[' || exp.charAt(i) == '{' || exp.charAt(i) == '('){
                this.push(exp.charAt(i));
            }
            if(exp.charAt(i) == ']' || exp.charAt(i) == '}' || exp.charAt(i) == ')'){
                if(top==-1){
                    System.out.println("Right Parenthesis are more in numbers");
                    return 0;
                }else{
                    char a = this.pop();
                    char b = exp.charAt(i);
                    check = checkBalance(a,b);
                }
                
                
                
            }
            
        }
        if(top!=-1 && i==exp.length()){
                    check =0;
                    System.out.println("Left Parenthesis are More");
                    
                }
        
        return check;
    }
    
    public int checkBalance(char a, char b){
    
        if(a=='[' && b==']')
            return 1;
        if(a=='{' && b=='}')
            return 1;
        if(a=='(' && b==')')
            return 1;
        
        return 0;
    }
    
}
