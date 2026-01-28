/**Define a Java class named Rectangle. It should have two double data fields: width and height,both with a default value of 1. Implement a no-argument constructor 
and a constructor that takes width and height as parameters. Include methods getArea() and getPerimeter() that return the calculated area and perimeter respectively.*/


import java.util.Scanner;
class P9{

	double width,height;
	
	P9(){
		width=1;
		height=1;
	}
	P9(double w, double h){
		width=w;
		height=h;
	}
	
	void getArea(){
		System.out.println("Area of Rectangle:"+(width*height));
	}
	
	void getPerimeter(){
		System.out.println("Perimeter of Rectangle:"+(2*(width+height)));
	}

	public static void main(String args[]){
		P9 obj1 =new P9();
		obj1.getArea();
		obj1.getPerimeter();
	
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the width of Rectangle:");
		int a=sc.nextInt();
    
		System.out.println("Enter the height of Rectangle:");
		int b=sc.nextInt();

		P9 obj2 =new P9(a,b);
		obj2.getArea();
		obj2.getPerimeter();
		
	}
}
