/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package polishnotations;

/**
 *
 * @author Muhammad Saleem
 */
public class Precedence {
    
    public int checkPrecedence(char symbol){
    int r = 0;
        switch(symbol){
            case '+':
            case '-':
               r = 1;
            break;
            case '*':
            case '/':
               r = 2;
            break;
            case '^':
                r = 3;
                break;
            
        }
        return r;
    }
}
