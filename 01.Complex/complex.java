/*1. Design a class Complex having a real part (x) and an imaginary part (y). Provide methods
to perform the following on complex numbers:
1. Add two complex numbers.
2. Multiply two complex numbers.
3. toString() method to display complex numbers in the form: x + i y*/

package Practicals;

import java.util.Scanner;

public class complex {
    public static void main(String[] args){
        System.out.println();

        Scanner obj = new Scanner(System.in);
        System.out.print("Enter the real part of first number: ");
        int first_real = obj.nextInt();
        System.out.print("Enter the imaginary part of first number: ");
        int first_imag = obj.nextInt();
        System.out.print("Enter the real part of second number: ");
        int second_real = obj.nextInt();
        System.out.print("Enter the imaginary part of second number: ");
        int second_imag = obj.nextInt();

        Complex a = new Complex(first_real, first_imag);
        Complex b = new Complex(second_real, second_imag);

        System.out.println(Complex.toString(a, b));

    }

}


class Complex{
    private int real;
    private int imaginary;

    public Complex(int real, int imaginary){
        this.real = real;
        this.imaginary = imaginary;
    }

    public static String Add(Complex A, Complex B){
        String result;
        Complex C = new Complex(0, 0);
        C.real = A.real + B.real;
        C.imaginary = A.imaginary + B.imaginary;
        if (C.imaginary>0) {
            result = C.real + " + " + C.imaginary + "i";
        }
        else{
            result = C.real + "  " + C.imaginary + "i";
        }
        return result;
    }

    public static String Multiply(Complex A, Complex B){
        String result;
        Complex C = new Complex(0,0);
        C.real = A.real*B.real - A.imaginary* B.imaginary;
        C.imaginary = A.imaginary*B.real + B.imaginary* A.real;
        if (C.imaginary>0) {
            result = C.real + " + " + C.imaginary + "i";
        }
        else{
            result = C.real + "  " + C.imaginary + "i";
        }
        return result;
    }

    public static String toString(Complex A, Complex B) {
        return "The result of addition is " + Complex.Add(A, B) + "\n" + "The result of multiplication is " + Complex.Multiply(A, B);
    }
}
