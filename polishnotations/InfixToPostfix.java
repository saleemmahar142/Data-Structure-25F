/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package polishnotations;

/**
 *
 * @author Muhammad Saleem
 */
public class InfixToPostfix {
    
    String exp = "((A+(B*C-(D/E^F)*G)*H))";
    char infix[];
    char stack[];
    int top=-1;
    char postfix[];
    public InfixToPostfix() {
        infix = exp.toCharArray();
        stack = new char[exp.length()];
        postfix = new char[exp.length()];
    }
    public void infixToPostfixConversion(){
        char input;
        char next;
        int j=0;
        for (int i = 0; i < infix.length; i++) {
            input = infix[i];
            switch (input) {
                case '(':
                case '{':
                case '[':
                    push(input);
                break;
                case ')':
                    while((next = pop())!='('){
                        postfix[j++] = next;
                    }
                break;
                case '+':
                    case '-':
                        case '*':
                            case '/':
                                case '^':
                                    while(top!=-1 && precedence(stack[top]) >= precedence(input)){
                                        postfix[j++] = pop();
                                    
                                    }
                                    push(input);
                                    break;
                default:
                    postfix[j++] = input;
                
            }
        }
        System.out.println("Infix Expression:   ");
        for (int i = 0; i < infix.length; i++) {
            System.out.print(infix[i]);
        }
        System.out.println("");
        System.out.println("Posfix Expression");
        for (int i = 0; i < postfix.length; i++) {
            System.out.print(postfix[i]);
        }
        System.out.println("");
    } // end of infix to postfix
    public int precedence(char op){
        switch (op) {
            case '+':
            case '-':
                return 1;
             case '*':
             case '/':
                 return 2;
             case '^':
                 return 3;
            default:
                return 0;
                
        }
    }
    public void push(char item){
    
        if(top == infix.length-1){
            System.out.println("Stack overflow");
            return;
        }
        stack[++top] =item;
    }
    public char pop(){
        if(top==-1){
            System.out.println("Stack underflow");
            return '-';
        }
        return stack[top--];
    }
    
}


class Box<T> {
    T value;

    Box(T value) {
        this.value = value;
    }
}


