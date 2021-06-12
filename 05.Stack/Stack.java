/*Write a program to implement stack. Use exception handling to manage underflow and overflow conditions.*/

package Practicals;
import java.util.Scanner;

class StackException extends Exception{
    private final String message;

    public StackException(String message){
        this.message = message;
    }

    @Override
    public String toString() {
        return "Stack Exception";
    }

    @Override
    public String getMessage() {
        return message;
    }
}
class STK {

    private int tos;
    private final int[] stk;

    public STK(int num){
        stk = new int[num];
        tos = -1;
    }

    void push(int item) throws StackException{
        if (tos == stk.length-1) {
            throw new StackException("OVERFLOW!!!");
        }
        else {
            stk[++tos] = item;
        }
    }

    int pop() throws StackException{
        if (tos < 0){
            throw new StackException("Underflow!!!");
        }
        else{
            return stk[tos--];
        }
    }

    void displayStack(){
        for (int i = 0; i < stk.length; i++){
            System.out.println(stk[i]);
        }
    }
}

public class Stack {
    public static void main(String[] args){

        Scanner obj = new Scanner(System.in);
        System.out.print("Enter the number of elements you want in the stack: ");
        int num = obj.nextInt();

        STK stack0 = new STK(num);

        for (int i = 0; i < 20; i++){
            System.out.println("Pushing " + i + " into the stack!");
            try {
                stack0.push(i);
            } catch (StackException s){
                System.out.println(s);
                System.out.println(s.getMessage());
            }
        }

        for (int i = 0; i < 20; i++){
            try {
                System.out.println(stack0.pop());
            } catch (StackException s){
                System.out.println(s);
                System.out.println(s.getMessage());
            }
        }
        //stack0.displayStack();
    }
}