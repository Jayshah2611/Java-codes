/**Write a program for billing system for a shopping mall. Create a class BillGenerator that
Uses method overloading to generate bills based on customer type:
 generateBill(int itemTotal): For regular customers, apply no discount.
 generateBill (int itemTotal, int discount): For privileged customers, apply flat discount in rupees.
 generateBill(int itemTotal, double discountPercent): For festive offers, apply percentage discount.
Write a program to display the final bill amount using appropriate overloaded method based
On customer category.*/


import java.util.Scanner;

class P15 {

    int generateBill(int itemTotal) {
        return itemTotal;
    }

    int generateBill(int itemTotal, int discount) {
        return itemTotal - discount;
    }

    double generateBill(int itemTotal, double discountPercent) {
        return itemTotal - (itemTotal * discountPercent / 100);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        P15 bill = new P15();

        System.out.print("Enter item total amount: ");
        int total = sc.nextInt();

        System.out.println("1. Regular Customer");
        System.out.println("2. Privileged Customer");
        System.out.println("3. Festive Offer");
        System.out.print("Choose customer type: ");
        int choice = sc.nextInt();

        if (choice == 1) {
            System.out.println("Final Bill Amount: " + bill.generateBill(total));
        } else if (choice == 2) {
            System.out.print("Enter flat discount amount: ");
            int discount = sc.nextInt();
            System.out.println("Final Bill Amount: " + bill.generateBill(total, discount));
        } else if (choice == 3) {
            System.out.print("Enter discount percentage: ");
            double percent = sc.nextDouble();
            System.out.println("Final Bill Amount: " + bill.generateBill(total, percent));
        } else {
            System.out.println("Invalid choice");
        }
    }
}
