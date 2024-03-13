package dataType;

import java.util.Scanner;

public class Between1to1000_Ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter an integer between 0 and 1000: ");
		int input=sc.nextInt();
		int hundredigit = input/100;
		int tendigit= (input%100)/10;
		int onedigit = (input%100)%10;
		int total = hundredigit + tendigit + onedigit; 
		System.out.println("The sum of all digits in " + input + " is " + total + ".");
		System.out.println();
	}

}
