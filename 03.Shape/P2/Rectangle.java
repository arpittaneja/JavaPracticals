package P2;
import java.io.*;
import java.util.Scanner;

import P1.*;
public class Rectangle extends Shape {
    private double length;
    private double breadth;

     public void getData() {
         Scanner obj0 = new Scanner(System.in);
         System.out.print("Enter the length of the rectangle: ");
         length = obj0.nextDouble();

         Scanner obj1 = new Scanner(System.in);
         System.out.print("Enter the breadth of the rectangle: ");
         breadth = obj1.nextDouble();
     }

         public double area(){
             return length * breadth;
         }
    }
