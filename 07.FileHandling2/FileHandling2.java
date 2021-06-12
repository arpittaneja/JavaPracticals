/*7. Write a program to read a file and display only those lines that have the first two characters as
'//' (Use try with resources).*/


package Practicals;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class FileHandling2 {
    public static void main(String[] args) throws IOException {

        String line;
        String content = "";

        File myFile = new File("test.txt");
        Scanner sc = new Scanner(myFile);

        while(sc.hasNextLine()){
            line = sc.nextLine();
            if (line.startsWith("//")){
                content = content + line + "\n";
            }
        }
        System.out.println(content);
    }
}
