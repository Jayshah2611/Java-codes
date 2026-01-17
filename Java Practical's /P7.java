/** Write a program that takes the lengths of three sides of a triangle as input. Calculate and print the area of the triangle. Ensure 
that the program validates if the given side lengths can actually form a triangle (sum of any two sides must be greater than the third 
side) before calculating the area (use Heron's formula: Area = sqrt(s*(s-a)*(s-b)*(s-c)) where s = (a+b+c)/2). */


import java.util.Scanner;

class P7{
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);

	double a, b, c;

	System.out.println("Enter 1st side or triangle a : ");
	a = sc.nextDouble();	

	System.out.println("Enter 2nd side or triangle b : ");
	b = sc.nextDouble();

	System.out.println("Enter 3rd side or triangle c : ");
	c = sc.nextDouble();

	double s = ( (a + b + c) / 2);	

	if(a + b > c && b + c > a && a + c > b){

		System.out.println("It's forms triangle");
		
		double Area = Math.sqrt(s * (s - a) * (s - b) * (s - c));

		System.out.println("The Area of triangle is : " + Area);

	} else {
    System.out.println("The sides are not forming a triangle and for that reason the formula can not be used");
    }
    
	sc.close();
	} 
}
