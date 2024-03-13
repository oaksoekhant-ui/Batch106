package dataType;

import java.util.Scanner;

public class Fraction_format {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the first fraction : ");
		int a =sc.nextInt();
		char chr=sc.next().charAt(0);
		int b = sc.nextInt();
		
		System.out.print("Enter second fracton: ");
        int c = sc.nextInt();
        chr = sc.next().charAt(0);
        int d = sc.nextInt();
        
        System.out.println("First Fraction : " + a + chr + b);
        System.out.println("Second Fraction : " + c + chr + d);
        
        int upsum = (a*d)+(b*c);
        int botsum = b*d;
        System.out.println("Sum is " + upsum + "/" + botsum);
	}

}
