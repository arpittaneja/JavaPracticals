package P3;
import java.io.*;
import java.util.Scanner;

import P1.*;
public class Circle extends Shape {
    private double radius;
    public void getData(){
        Scanner obj0 = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        radius = obj0.nextDouble();
    }
    public double area(){
        return Math.PI * radius * radius;
    }
}