package dataType;

import java.util.Scanner;

public class average_Exercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter first number : ");
		int first=sc.nextInt();
		System.out.print("Second Number : ");
		int second = sc.nextInt();
		System.out.print("Third number : ");
		int third = sc.nextInt();
		int average = (first + second + third)/3 ;
		System.out.println("Average number is " + average);
		
	}

}
