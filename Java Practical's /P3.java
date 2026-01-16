/**Write a Java program that prompts the user to enter a single letter (character). Determine whether the entered character is a vowel 
(a, e, i, o, u, case-insensitive) or a consonant, and display the result. */

import java.util.Scanner;

class P3{
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);

	char value; 

	System.out.println("Enter any character : ");
	value = sc.next().charAt(0);
	value = Character.toLowerCase(value);

	if(value == 'a' || value == 'e' || value == 'i' || value == 'o' || value == 'u'){
		System.out.println("The entered character is vowel");
	} else {
		System.out.print("The entered character is consonant");
		}		
	sc.close();
	}

}
