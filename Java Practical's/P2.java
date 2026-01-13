/** Write a Java program to solve a system of two linear equations with two variables (e.g., ax + by = e and cx + dy = f). Prompt the user to enter the coefficients a,
 b, c, d, e, f. Calculate and display the values of x and y using Cramer's rule. Include error handling for cases where the denominator is zero. Cramer's rule:
 D=ad−bc, Dx=ed−bf, Dy=af−ce, x=Dx/D, y=Dy/D */


import java.util.Scanner;

class P2{
	public static void main(String args[]) {
	System.out.println(" -- Java program to solve a system of two linear equations with two variables -- ");

	Scanner sc = new Scanner(System.in);

	double a, b, c, d, e, f;

	System.out.println("Enter the value of a : ");
	a = sc.nextDouble();

	System.out.println("Enter the value of b : ");
	b = sc.nextDouble();

	System.out.println("Enter the value of c : ");
	c = sc.nextDouble();

	System.out.println("Enter the value of d : ");
	d = sc.nextDouble();

	System.out.println("Enter the value of e : ");
	e = sc.nextDouble();

	System.out.println("Enter the value of f : ");
	f = sc.nextDouble();

	double D = (a * d) - (b * c);
	double Dx = (e * d) - (b * f);
	double Dy = (a * f ) - (c * e);

	if(D == 0){
		System.out.println("Inappropriate value");
	} else {
		double x = Dx / D;
		double y = Dy / D;

		System.out.printf("The value of x is : %.2f\n", x);
		System.out.printf("The value of y is : %.2f ", y);
	}
	sc.close();
	}
}