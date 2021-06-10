/*2. Create a class TwoDim which contains private members as x and y coordinates in
package P1. Define the default constructor, a parameterized constructor and override
toString() method to display the co-ordinates. Now reuse this class and in package P2
create another class ThreeDim, adding a new dimension as z as its private member.
Define the constructors for the subclass and override toString() method in the subclass
also. Write appropriate methods to show dynamic method dispatch. The main() function
should be in a package P.*/


package P;
import P1.*;
import P2.*;

public class Main {
    public static void main(String[] args) {
        TwoDim obj0 = new TwoDim(1, 2);
        System.out.println(obj0);
        ThreeDim obj1 = new ThreeDim(3, 4, 5);
        System.out.println(obj1);
    }
}
