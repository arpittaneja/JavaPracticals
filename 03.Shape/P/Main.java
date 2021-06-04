package P;

import java.io.*;
import java.util.Scanner;

import P1.*;
import P2.*;
import P3.*;
public class Main {
    public static void main(String[] args) {

        boolean flag = true;
        Shape ref;

            while (flag){
                Scanner obj0 = new Scanner(System.in);
                System.out.println("Select a shape!");
                System.out.println(" (1) Rectangle\n (2) Circle");
                System.out.print("Enter Choice: ");
                int choice = obj0.nextInt();
                if (choice ==1) {
                    ref = new Rectangle();
                    ref.getData();
                    System.out.println("Area: " + ref.area() + " sq units");
                    flag = false;
                }
                else if (choice == 2) {
                    ref = new Circle();
                    ref.getData();
                    System.out.println("Area: " + ref.area() + " sq units");
                    flag = false;
                }
                else {
                    flag = true;
                    System.err.println("Invalid Option\nTry Again");
            }
        }
    }
}

