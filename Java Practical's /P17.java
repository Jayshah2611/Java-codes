/**Create a Java class named University with a static data member totalStudents to keep track of the number of student objects created. Implement a static method 
getTotalStudents (). Also, include a static block to initialize a static variable (e.g., universityName) and an instance block to print a message when an object is 
created. Demonstrate their execution order.*/


class P17 {
    static int totalStudents;
    static String universityName;

    static {
        universityName = "Global Tech University";
        System.out.println("Static Block Executed: University Name initialized.");
    }

    {
        System.out.println("Instance Block Executed: A new student object is being created.");
        totalStudents++;
    }

    P17() {
        System.out.println("Constructor Executed: Student object created successfully.");
    }

    static int getTotalStudents() {
        return totalStudents;
    }
}

public class Practical17 {
    public static void main(String[] args) {
        System.out.println("Main Method Started.");
        P17 s1 = new P17();
        P17 s2 = new P17();
        System.out.println("Total Students: " + P17.getTotalStudents());
    }
}
