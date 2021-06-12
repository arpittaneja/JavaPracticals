/*6.Write a program that copies content of one file to another. Pass the names of the files through
command-line arguments.*/

package Practicals;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class FileHandling {

    public static void main(String[] args) throws IOException {

        String content = "";
        if (args.length != 2){
            System.out.println("You need to enter the names of 2 files!");
        }

        File file1 = new File(args[0]);
        Scanner sc = new Scanner(file1);
        while(sc.hasNextLine()) {
            content = content + sc.nextLine() + "\n";
        }

        FileWriter file2 = new FileWriter(args[1]);
        file2.write(content);
        file2.close();
    }
}
