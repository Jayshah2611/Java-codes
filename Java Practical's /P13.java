/**Define a Java class named Rectangle. It should have two double data fields: width and height. In your main method, create two Rectangle objects: one with width 4
and height 40, and another with width 3.5 and height 35.9. For each rectangle, display its width, height, calculated area, and perimeter. Then, compare the two 
rectangles based on their areas and print which one has a larger area.*/

class P13 {

    double width;
    double height;

    P13(double w, double h) {
        width = w;
        height = h;
    }

    double getArea() {
        return width * height;
    }

    double getPerimeter() {
        return 2 * (width + height);
    }

    void display() {
        System.out.println("Width: " + width);
        System.out.println("Height: " + height);
        System.out.println("Area: " + getArea());
        System.out.println("Perimeter: " + getPerimeter());
        System.out.println();
    }

    public static void main(String[] args) {
        P13 r1 = new P13(4, 40);
        P13 r2 = new P13(3.5, 35.9);

        r1.display();
        r2.display();

        if (r1.getArea() > r2.getArea()) {
            System.out.println("First rectangle has a larger area");
        } else if (r1.getArea() < r2.getArea()) {
            System.out.println("Second rectangle has a larger area");
        } else {
            System.out.println("Both rectangles have equal area");
        }
    }
}
