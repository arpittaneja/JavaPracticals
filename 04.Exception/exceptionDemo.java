/*4. Create an exception subclass UnderAge, which prints “Under Age” along with the age value when an
object of UnderAge class is printed in the catch statement. Write a class exceptionDemo in which the
method test() throws UnderAge exception if the variable age passed to it as argument is less than 18.
Write main() method also to show working of the program.*/

package Practicals;
import java.util.Scanner;

class UnderAge extends Exception{
    private int age;
    public UnderAge(int age){
        this.age = age;
    }

    @Override
    public String getMessage() {
        return "UnderAge Exception\n" + age + " is less than 18";
    }
}

class exceptionDemo {

    static void test(int age) throws UnderAge {
        if (age < 18) {
            throw new UnderAge(age);
        } else {
            System.out.println("Test Successful");
        }
    }

public static void main (String[] args) {
    Scanner obj = new Scanner(System.in);
    System.out.print("Enter age: ");
    int year = obj.nextInt();
    try {
        test(year);
    } catch (UnderAge u){
        System.out.println(u.getMessage());
        }
    }
}


