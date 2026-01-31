/**Create a Point class representing a 2D point (x, y). Implement a default constructor that initializes both x and y to 5. Provide a parameterized constructor to 
initialize x and y with user-supplied values. Also, implement a copy constructor to create a new Point object as a copy of an existing Point object. Include a 
display() method to show the point's coordinates and write a main method to test all constructors and the display functionality.*/

import java.util.Scanner;

public class P12 {

    int x;
    int y;

    P12() {
        x = 5;
        y = 5;
    }

    P12(int x, int y) {
        this.x = x;
        this.y = y;
    }

    P12(P12 p) {
        x = p.x;
        y = p.y;
    }

    void display() {
        System.out.println("Point: (" + x + ", " + y + ")");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        P12 p1 = new P12();
        p1.display();

        System.out.print("Enter x coordinate: ");
        int x = sc.nextInt();
        System.out.print("Enter y coordinate: ");
        int y = sc.nextInt();

        P12 p2 = new P12(x, y);
        p2.display();

        P12 p3 = new P12(p2);
        p3.display();
    }
}
