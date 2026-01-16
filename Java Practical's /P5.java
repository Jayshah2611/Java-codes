/** Simulate a simple ATM or cashier. Given an integer amount to be dispensed (e.g., 787), Calculate and display the minimum number of 
currency notes of denominations 100, 50, 10,5, 2, and 1 that would be given to the user. */


import java.util.Scanner;

class P5{
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);

	int num;

	System.out.println("Enter the number for dispensed : ");
	num = sc.nextInt();

	int hundred, fifty, ten, five, two, one;

	hundred = num / 100;
	num = num % 100;

	fifty = num / 50;
	num = num % 50;

	ten = num / 10;
	num = num % 10;

	five = num / 5;
	num = num % 5;

	two = num / 2;
	num = num % 2;

	one = num / 1;
	
	System.out.println("Currency notes to be given:");

	System.out.println("100 : " + hundred);
	System.out.println("50  : " + fifty);
	System.out.println("10  : " + ten);
	System.out.println("5   : " + five);
	System.out.println("2   : " + two);
	System.out.println("1   : " + one);

        sc.close();
	}
}
